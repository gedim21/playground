package com.gedim.playground.business.author.boundary;

import com.gedim.playground.business.author.control.AuthorService;
import com.gedim.playground.business.author.entity.Author;
import com.gedim.playground.business.base.boundary.BaseFacade;
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
public class AuthorFacade extends BaseFacade {

    @EJB
    AuthorService authorService;

    public List<Author> getAllAuthors() {
        return authorService.getAll(AuthorService.class);
    }
}
