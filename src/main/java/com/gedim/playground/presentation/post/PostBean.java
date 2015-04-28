package com.gedim.playground.presentation.post;

import com.gedim.playground.business.post.boundary.PostFacade;
import com.gedim.playground.business.post.entity.Post;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Named
@ViewScoped
@Path("/posts")
public class PostBean implements Serializable {
    
    @Inject
    PostFacade postFacade;

    private List<Post> posts;
    private Post post = new Post();

    public void loadPost() {
        post = postFacade.getPostById(post.getId());
    }
    
    public void loadPosts() {
        getPosts();
    }

    @GET
    public List<Post> getPosts() {
        if (posts == null) {
            posts = postFacade.getAllPostsWithAuthors();
        }
        return posts;
    }

    @GET
    @Path("{id}")
    public Post getPost(@PathParam("id") Long id) {
        return postFacade.getPostById(id);
    }

    public Post getPost() {
        return post;
    }
}
