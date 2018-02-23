package com.hgssld.blog.web.service;

import com.hgssld.blog.web.model.ConfigMO;

import java.util.List;

/**
 * 配置管理服务
 *
 * @author monkeyking
 * @create 2018-01-20 13:22
 */
public interface ConfigManagerService {

    ConfigMO findByParentCodeAndCode(String parentCode, String code);

    List<ConfigMO> findAllByParentCodeAndCode(String parentCode, String code);
}
