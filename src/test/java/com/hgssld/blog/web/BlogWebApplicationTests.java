package com.hgssld.blog.web;

import com.alibaba.fastjson.JSON;
import com.hgssld.blog.web.dao.ConfigDao;
import com.hgssld.blog.web.entity.ConfigEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogWebApplicationTests {

    @Autowired
    private ConfigDao configDao;

    @Test
    public void contextLoads() {
//        ConfigEntity configEntity = new ConfigEntity();
//        configEntity.setCode("1");
//        ConfigEntity save = configDao.save(configEntity);
//        System.out.println(JSON.toJSONString(save));
        List<ConfigEntity> entityList = configDao.findAllByCode("code");
        System.out.println(JSON.toJSONString(entityList));

    }

}
