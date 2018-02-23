package com.hgssld.blog.web.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author monkeyking
 * @create 2018-01-20 12:40
 */
@Entity
@Table(name = "t_note_save", schema = "blog_web_dev", catalog = "")
public class NoteSaveEntity implements Serializable {
    private static final long serialVersionUID = -6193809886314053859L;
    private Long id;
    private String saveUrl;
    private String noteName;
    private String noteTitle;
    private Integer noteLable;
    private String noteDes;

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
    @Column(name = "save_url", nullable = true, length = 255)
    public String getSaveUrl() {
        return saveUrl;
    }

    public void setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl;
    }

    @Basic
    @Column(name = "note_name", nullable = true, length = 255)
    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    @Basic
    @Column(name = "note_title", nullable = true, length = 50)
    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    @Basic
    @Column(name = "note_lable", nullable = true)
    public Integer getNoteLable() {
        return noteLable;
    }

    public void setNoteLable(Integer noteLable) {
        this.noteLable = noteLable;
    }

    @Basic
    @Column(name = "note_des", nullable = true, length = 255)
    public String getNoteDes() {
        return noteDes;
    }

    public void setNoteDes(String noteDes) {
        this.noteDes = noteDes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteSaveEntity that = (NoteSaveEntity) o;

        if (id != that.id) return false;
        if (saveUrl != null ? !saveUrl.equals(that.saveUrl) : that.saveUrl != null) return false;
        if (noteName != null ? !noteName.equals(that.noteName) : that.noteName != null) return false;
        if (noteTitle != null ? !noteTitle.equals(that.noteTitle) : that.noteTitle != null) return false;
        if (noteLable != null ? !noteLable.equals(that.noteLable) : that.noteLable != null) return false;
        if (noteDes != null ? !noteDes.equals(that.noteDes) : that.noteDes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (saveUrl != null ? saveUrl.hashCode() : 0);
        result = 31 * result + (noteName != null ? noteName.hashCode() : 0);
        result = 31 * result + (noteTitle != null ? noteTitle.hashCode() : 0);
        result = 31 * result + (noteLable != null ? noteLable.hashCode() : 0);
        result = 31 * result + (noteDes != null ? noteDes.hashCode() : 0);
        return result;
    }
}
