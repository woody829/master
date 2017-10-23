package com.shrbank;

import com.shrbank.dao.StudentMapper;
import com.shrbank.dao.UserMapper;
import com.shrbank.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by woody on 2017/8/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class SqlTest {
    @Autowired
    private UserMapper mapper;
    @Autowired
    private StudentMapper studentDao;

    @Test
    public void getUser() throws Exception {
//        UserEntity ue = new UserEntity();
//        ue = mapper.getUserNew("1");
//        System.out.println("sssssss:"+ue.getName());
//        DeptEntity de = ue.getDept();
//        System.out.println(de);

//        UserEntity ue = new UserEntity();
//        ue = mapper.getUser("123456");
//        System.out.println("sssssss:"+ue.getName());
//        DeptEntity de = ue.getDept();
//        System.out.println("kkkkkk:"+de.getDeptId()+":"+de.getName());

        List<UserEntity> list = mapper.getUserNew();
        for(UserEntity userEntity:list) {
//            System.out.println(userEntity.getDept().getName());
            System.out.println(userEntity.getAge());
            if(20==(userEntity.getAge())){
                System.out.println(userEntity.getDept());
            }
        }
    }
}
