package com.cssl.controller;

import com.cssl.pojo.Users;
import com.cssl.service.UserSe;
import com.cssl.vo.uservo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: ZProj
 * @Date: 2019/5/23 10:34
 * @Author: Mr.Deng
 * @Description:
 */
@Controller //控制器
public class UsersController {

 @Autowired //注入业务层
 private UserSe usersservice;


 @PostMapping("Rea")
  public ModelAndView reges(uservo uv,ModelAndView mla){
  Users uu=new Users();
  BeanUtils.copyProperties(uv,uu);
  if(usersservice.userinsert(uu)>0){
  mla.setViewName("index");
  }else{
   mla.setViewName("login");
  }
   return  mla;
  }

}
