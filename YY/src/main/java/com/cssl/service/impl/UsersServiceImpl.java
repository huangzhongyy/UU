package com.cssl.service.impl;

import com.cssl.dao.userdao;
import com.cssl.pojo.Users;
import com.cssl.service.UserSe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ZProj
 * @Date: 2019/5/23 10:10
 * @Author: Mr.Deng
 * @Description:
 */
@Service
public class UsersServiceImpl implements UserSe {

 //注入
 @Autowired
 private userdao udao;


 @Override
 public int userinsert(Users uu) {

    return udao.userinsert(uu);
 }


}
