package com.shrbank;

import com.shrbank.dao.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@EnableAutoConfiguration
@ComponentScan
@ServletComponentScan
@RestController
public class Application{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private StudentMapper studentDao;

    @RequestMapping("/hello")
    public void hello() {
//        logger.info("ttttttttttttttttttttt");
//        StudentEntity studentEntity = new StudentEntity();
//        studentEntity = studentDao.getStudent("123456");
//        System.out.println(studentEntity.getStudentName());


    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }




}
