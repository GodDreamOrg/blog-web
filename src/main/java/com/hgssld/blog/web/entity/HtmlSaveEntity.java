package com.hgssld.blog.web.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author monkeyking
 * @create 2018-01-20 12:40
 */
@Entity
@Table(name = "t_html_save", schema = "blog_web_dev", catalog = "")
public class HtmlSaveEntity implements Serializable {
    private static final long serialVersionUID = 6360874615711299091L;
    private Long id;
    private Long noteId;
    private String htmlUrl;
    private String htmlName;
    private String htmlTitle;
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
    @Column(name = "note_id", nullable = true)
    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    @Basic
    @Column(name = "html_url", nullable = true, length = 255)
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Basic
    @Column(name = "html_name", nullable = true, length = 255)
    public String getHtmlName() {
        return htmlName;
    }

    public void setHtmlName(String htmlName) {
        this.htmlName = htmlName;
    }

    @Basic
    @Column(name = "html_title", nullable = true, length = 255)
    public String getHtmlTitle() {
        return htmlTitle;
    }

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
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

        HtmlSaveEntity that = (HtmlSaveEntity) o;

        if (id != that.id) return false;
        if (noteId != null ? !noteId.equals(that.noteId) : that.noteId != null) return false;
        if (htmlUrl != null ? !htmlUrl.equals(that.htmlUrl) : that.htmlUrl != null) return false;
        if (htmlName != null ? !htmlName.equals(that.htmlName) : that.htmlName != null) return false;
        if (htmlTitle != null ? !htmlTitle.equals(that.htmlTitle) : that.htmlTitle != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (noteId != null ? noteId.hashCode() : 0);
        result = 31 * result + (htmlUrl != null ? htmlUrl.hashCode() : 0);
        result = 31 * result + (htmlName != null ? htmlName.hashCode() : 0);
        result = 31 * result + (htmlTitle != null ? htmlTitle.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
