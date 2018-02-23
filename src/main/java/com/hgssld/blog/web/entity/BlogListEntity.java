package com.hgssld.blog.web.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author monkeyking
 * @create 2018-01-20 12:40
 */
@Entity
@Table(name = "t_blog_list", schema = "blog_web_dev", catalog = "")
public class BlogListEntity implements Serializable{
    private static final long serialVersionUID = 1780788765821332337L;
    private Long id;
    private String blogTilte;
    private String blogUrlName;
    private Long htmlId;
    private Integer status;
    private String blogName;
    private String blogUrl;

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
    @Column(name = "blog_tilte", nullable = true, length = 50)
    public String getBlogTilte() {
        return blogTilte;
    }

    public void setBlogTilte(String blogTilte) {
        this.blogTilte = blogTilte;
    }

    @Basic
    @Column(name = "blog_url_name", nullable = true, length = 50)
    public String getBlogUrlName() {
        return blogUrlName;
    }

    public void setBlogUrlName(String blogUrlName) {
        this.blogUrlName = blogUrlName;
    }

    @Basic
    @Column(name = "html_id", nullable = true)
    public Long getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(Long htmlId) {
        this.htmlId = htmlId;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "blog_name", nullable = true, length = 255)
    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    @Basic
    @Column(name = "blog_url", nullable = true, length = 255)
    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogListEntity that = (BlogListEntity) o;

        if (id != that.id) return false;
        if (blogTilte != null ? !blogTilte.equals(that.blogTilte) : that.blogTilte != null) return false;
        if (blogUrlName != null ? !blogUrlName.equals(that.blogUrlName) : that.blogUrlName != null) return false;
        if (htmlId != null ? !htmlId.equals(that.htmlId) : that.htmlId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (blogName != null ? !blogName.equals(that.blogName) : that.blogName != null) return false;
        if (blogUrl != null ? !blogUrl.equals(that.blogUrl) : that.blogUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (blogTilte != null ? blogTilte.hashCode() : 0);
        result = 31 * result + (blogUrlName != null ? blogUrlName.hashCode() : 0);
        result = 31 * result + (htmlId != null ? htmlId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (blogName != null ? blogName.hashCode() : 0);
        result = 31 * result + (blogUrl != null ? blogUrl.hashCode() : 0);
        return result;
    }
}
