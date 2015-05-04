package com.gedim.playground.util.presentation;

import java.io.Serializable;
import java.util.Date;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class TimeBean implements Serializable {

    public Date getNow() {
        return new Date();
    }
}
