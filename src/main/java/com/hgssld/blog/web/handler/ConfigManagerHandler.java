package com.hgssld.blog.web.handler;

import com.hgssld.blog.web.dao.ConfigDao;
import com.hgssld.blog.web.model.ConfigMO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 配置管理执行
 *
 * @author monkeyking
 * @create 2018-01-20 13:25
 */
@Component
public class ConfigManagerHandler {
    @Autowired
    private ConfigDao configDao;

    public ConfigMO findByParentCodeAndCode(String parentCode, String code){
        return null;
    }


    public List<ConfigMO> findAllByParentCodeAndCode(String parentCode, String code){
        return null;
    }
}
