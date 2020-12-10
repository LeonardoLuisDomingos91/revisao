package br.com.invillia.lyon.userevents.domain;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String id;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
