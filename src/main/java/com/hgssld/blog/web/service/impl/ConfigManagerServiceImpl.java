package com.hgssld.blog.web.service.impl;

import com.hgssld.blog.web.handler.ConfigManagerHandler;
import com.hgssld.blog.web.model.ConfigMO;
import com.hgssld.blog.web.service.ConfigManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 配置管理服务实现类
 *
 * @author monkeyking
 * @create 2018-01-20 13:23
 */
@Service("configManagerService")
public class ConfigManagerServiceImpl implements ConfigManagerService {
    @Autowired
    private ConfigManagerHandler configManagerHandler;

    @Override
    public ConfigMO findByParentCodeAndCode(String parentCode, String code) {
        return configManagerHandler.findByParentCodeAndCode(parentCode, code);
    }

    @Override
    public List<ConfigMO> findAllByParentCodeAndCode(String parentCode, String code) {
        return configManagerHandler.findAllByParentCodeAndCode(parentCode, code);
    }
}
