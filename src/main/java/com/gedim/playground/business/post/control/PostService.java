package com.gedim.playground.business.post.control;

import com.gedim.playground.business.base.control.BaseService;
import com.gedim.playground.business.post.entity.Post;
import com.gedim.playground.utility.TracingInterceptor;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

@Interceptors(TracingInterceptor.class)
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PostService extends BaseService {

    public List<Post> getAllPostsWithAuthors() {
        return getEntityManager().createNamedQuery("getAllPostsWithAuthors", Post.class).getResultList();
    }

    public Post getPostById(Long id) {
        return getEntityManager().find(Post.class, id);
    }
}
