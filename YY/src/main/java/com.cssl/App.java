package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: ZProj
 * @Date: 2019/5/23 9:07
 * @Author: Mr.Deng
 * @Description:
 */
@MapperScan("com.cssl.dao")
@SpringBootApplication //入口
public class App {
 public static void main(String[] args) {
  SpringApplication.run(App.class,args);

 }

}
