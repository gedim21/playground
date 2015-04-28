package com.gedim.playground.business.post.entity;

import com.gedim.playground.business.author.entity.Author;
import com.gedim.playground.business.base.entity.BaseEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@NamedQueries(value = {
    @NamedQuery(name = "getAllPostsWithAuthors", query = "select post from Post post left join fetch post.author"),
    @NamedQuery(name = "getPostById", query = "select post from Post post left join fetch post.author where post.id =:postId")
})
@XmlRootElement
public class Post extends BaseEntity {

    @Column(length = 255, nullable = false)
    private String title;
    
    @Column(length = 4000, nullable = false)
    private String content;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date posted;
    
    @ManyToOne
    @XmlTransient
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
