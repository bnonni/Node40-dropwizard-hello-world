package com.example.helloworld.api;

// import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {
    // private long id;

    public String content;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(String content) {
        this.content = content;
    }

    // @JsonProperty
    public String getContent() {
        return content;
    }
}