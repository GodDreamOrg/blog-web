package com.hgssld.blog.web.model;

import java.io.Serializable;

/**
 * 笔记存储列表mo
 *
 * @author monkeyking
 * @create 2018-01-20 15:22
 */
public class NoteSaveMO implements Serializable {
    private static final long serialVersionUID = 4671289095706805549L;

    private Long id;
    private String noteDes;
    private Integer noteLable;
    private String noteName;
    private String noteTitle;
    private String saveUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoteDes() {
        return noteDes;
    }

    public void setNoteDes(String noteDes) {
        this.noteDes = noteDes;
    }

    public Integer getNoteLable() {
        return noteLable;
    }

    public void setNoteLable(Integer noteLable) {
        this.noteLable = noteLable;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getSaveUrl() {
        return saveUrl;
    }

    public void setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl;
    }
}
