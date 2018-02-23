package com.hgssld.blog.web.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author monkeyking
 * @create 2018-01-20 12:40
 */
@Entity
@Table(name = "t_blog_resouce", schema = "blog_web_dev", catalog = "")
public class BlogResouceEntity implements Serializable {
    private static final long serialVersionUID = 9140344127770338488L;
    private Long id;
    private Long categoryId;
    private Long blogId;
    private Integer flag;
    private Integer status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "category_id", nullable = true)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "blog_id", nullable = true)
    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    @Basic
    @Column(name = "flag", nullable = true)
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogResouceEntity that = (BlogResouceEntity) o;

        if (id != that.id) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (blogId != null ? !blogId.equals(that.blogId) : that.blogId != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (blogId != null ? blogId.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
