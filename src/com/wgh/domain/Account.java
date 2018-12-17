package com.wgh.domain;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Account {
    private Integer id ;
    private String name ;
    private  Double money ;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
