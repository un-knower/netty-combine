package com.myself.nettychat.controller;

import com.myself.nettychat.constont.CookieConstant;
import com.myself.nettychat.constont.H5Constant;
import com.myself.nettychat.dataobject.User;
import com.myself.nettychat.dataobject.UserMsg;
import com.myself.nettychat.repository.UserMsgRepository;
import com.myself.nettychat.service.UserService;
import com.myself.nettychat.store.TokenStore;
import com.myself.nettychat.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:32 2018\8\14 0014
 */
@Controller
@RequestMapping("/chat")
public class NcChatController {

    @Autowired
    private UserMsgRepository userMsgRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/netty")
    public ModelAndView netty(@RequestParam(value = "page",defaultValue = "1") Integer page,
                              @RequestParam(value = "size",defaultValue = "10") Integer size,
                              Map<String,Object> map){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);
        if (cookie == null){
            map.put("msg","cookie中不存在token");
            return new ModelAndView(H5Constant.LOGIN,map);
        }
        Integer userId = (Integer) TokenStore.get(cookie.getValue());
        if (userId == null){
            map.put("msg","用户信息不存在");
            return new ModelAndView(H5Constant.LOGIN,map);
        }
        User user = userService.findOne(userId);
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(page-1,size,sort);
        Page<UserMsg> userMsgPage = userMsgRepository.findAll(pageable);
        //日期颠倒
        List<UserMsg> userMsgList = new ArrayList<>();
        for (int i = 0,j = userMsgPage.getContent().size()-1; i < userMsgPage.getContent().size();i++,j--){
            userMsgList.add(userMsgPage.getContent().get(j));
        }
        map.put("userName",user.getUserName());
        map.put("userMsgList",userMsgList);
        return new ModelAndView(H5Constant.ALLCHAT,map);
    }

}
