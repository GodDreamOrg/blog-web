package com.hgssld.blog.web.model;

import java.io.Serializable;

/**
 * @author monkeyking
 * @create 2018-01-20 12:40
 */
public class ConfigMO implements Serializable {
    private static final long serialVersionUID = -1743052282219791650L;
    private Long id;
    private Long parentId;
    private String code;
    private String value;
    private Integer sort;
    private Integer flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
