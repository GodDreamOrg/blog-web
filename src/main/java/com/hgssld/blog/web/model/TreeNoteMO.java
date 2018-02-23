package com.hgssld.blog.web.model;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单栏树形节点MO
 *
 * @author monkeyking
 * @create 2018-01-24 18:44
 */
public class TreeNoteMO implements Serializable {
    private static final long serialVersionUID = -7273574481211915175L;

    private Long id;
    private String name;
    private Integer type;
    private String url;
    private Integer sort;
    private Long parentId;
    private List<TreeNoteMO> childList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<TreeNoteMO> getChildList() {
        return childList;
    }

    public void setChildList(List<TreeNoteMO> childList) {
        this.childList = childList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
