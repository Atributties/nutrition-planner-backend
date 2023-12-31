package com.example.nutritionplannerbackend.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class ChatMessage {
    @JsonProperty("role")
    private String role;

    @JsonProperty("content")
    private String content;

}
