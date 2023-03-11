package com.kayak.pay;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class People {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
