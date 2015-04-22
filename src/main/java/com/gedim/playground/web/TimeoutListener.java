package com.gedim.playground.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class TimeoutListener implements HttpSessionListener {


    @Override
    public void sessionCreated(HttpSessionEvent arg0) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {

    }

}
