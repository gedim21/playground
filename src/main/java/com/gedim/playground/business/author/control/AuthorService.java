package com.gedim.playground.business.author.control;

import com.gedim.playground.business.author.entity.Author;
import com.gedim.playground.business.base.control.BaseService;
import com.gedim.playground.utility.TracingInterceptor;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

@Interceptors(TracingInterceptor.class)
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class AuthorService extends BaseService {

    public Author getAuthorById(Long id) {
        return getEntityManager().find(Author.class, id);
    }
}
