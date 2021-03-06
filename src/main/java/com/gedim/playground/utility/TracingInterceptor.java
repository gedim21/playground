package com.gedim.playground.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TracingInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(TracingInterceptor.class);

    @AroundInvoke
    public Object logCall(InvocationContext context) throws Exception {
        long start = System.currentTimeMillis();
        try {
            LOGGER.debug("Invoking method: {}", context.getMethod());
            return context.proceed();
        } catch (Exception e) {
            throw e;
        } finally {
            LOGGER.debug("Returning from method: {} after {} ms",
                         context.getMethod(),
                         System.currentTimeMillis() - start);
        }
    }
}
