package com.gedim.playground.business.base.bounday;

import com.gedim.playground.utility.TracingInterceptor;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

@Interceptors(TracingInterceptor.class)
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class BaseFacade {

}
