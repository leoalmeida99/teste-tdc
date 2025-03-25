package org.leoalmeida.form;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Formulario extends PanacheEntity {
    private String title;
    private String resumeTalk;
    private String authorName;
    private String authorEmail;
    private Long speakerId;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getResumeTalk() {
        return resumeTalk;
    }
    public void setResumeTalk(String resumeTalk) {
        this.resumeTalk = resumeTalk;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorEmail() {
        return authorEmail;
    }
    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }
    public Long getSpeakerId() {
        return speakerId;
    }
    public void setSpeakerId(Long speakerId) {
        this.speakerId = speakerId;
    }
}
