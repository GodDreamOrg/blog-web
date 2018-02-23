package com.hgssld.blog.web.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author monkeyking
 * @create 2018-01-20 12:40
 */
@Entity
@Table(name = "t_note_result", schema = "blog_web_dev", catalog = "")
public class NoteResultEntity implements Serializable {
    private static final long serialVersionUID = 4874718405152711043L;
    private Long id;
    private Long noteId;
    private String noteTitle;
    private String noteName;
    private String noteUrl;
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
    @Column(name = "note_title", nullable = true, length = 50)
    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
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
    @Column(name = "note_url", nullable = true, length = 255)
    public String getNoteUrl() {
        return noteUrl;
    }

    public void setNoteUrl(String noteUrl) {
        this.noteUrl = noteUrl;
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

        NoteResultEntity that = (NoteResultEntity) o;

        if (id != that.id) return false;
        if (noteId != null ? !noteId.equals(that.noteId) : that.noteId != null) return false;
        if (noteTitle != null ? !noteTitle.equals(that.noteTitle) : that.noteTitle != null) return false;
        if (noteName != null ? !noteName.equals(that.noteName) : that.noteName != null) return false;
        if (noteUrl != null ? !noteUrl.equals(that.noteUrl) : that.noteUrl != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (noteId != null ? noteId.hashCode() : 0);
        result = 31 * result + (noteTitle != null ? noteTitle.hashCode() : 0);
        result = 31 * result + (noteName != null ? noteName.hashCode() : 0);
        result = 31 * result + (noteUrl != null ? noteUrl.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
