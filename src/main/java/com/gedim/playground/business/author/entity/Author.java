package com.gedim.playground.business.author.entity;

import com.gedim.playground.business.base.entity.BaseEntity;
import com.gedim.playground.business.post.entity.Post;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class Author extends BaseEntity {

    @Column(length = 255, nullable = false)
    private String name;
    
    @Column(length = 255, nullable = false)
    private String email;
    
    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

}
