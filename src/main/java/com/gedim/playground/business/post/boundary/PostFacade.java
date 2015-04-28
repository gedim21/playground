package com.gedim.playground.business.post.boundary;

import com.gedim.playground.business.base.boundary.BaseFacade;
import com.gedim.playground.business.post.control.PostService;
import com.gedim.playground.business.post.entity.Post;
import com.gedim.playground.utility.TracingInterceptor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

@Interceptors(TracingInterceptor.class)
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PostFacade extends BaseFacade {

    @EJB
    PostService postService;

    public Post getPostById(Long postId) {
        return postService.getPostById(postId);
    }

    public List<Post> getAllPostsWithAuthors() {
        return postService.getAllPostsWithAuthors();
    }
}
