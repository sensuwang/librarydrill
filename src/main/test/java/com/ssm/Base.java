package com.ssm;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @ClassName Base
 * @Author sensu
 * @Date 2019/9/4 19:03
 **/
//使用SpringJUnit4ClassRunner这个类来跑test
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class Base {
}
