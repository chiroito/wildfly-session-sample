package com.chiroito.session;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class Counter implements Serializable {

    private static final long serialVersionUID = 1L;

    private int value;

    public int getValue() {
        return value;
    }

    public void countUp() {
        this.value++;
    }
}
