package com.hgssld.blog.web.model;

import java.io.Serializable;

/**
 * 分页对象MO
 *
 * @author monkeyking
 * @create 2018-01-20 15:58
 */
public class PageResultMO<T> implements Serializable {

    private static final long serialVersionUID = 4632081678527016425L;
    private Integer total;

    private T rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public T getRows() {
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }
}
