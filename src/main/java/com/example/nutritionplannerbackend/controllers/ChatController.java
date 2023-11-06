package com.example.nutritionplannerbackend.controllers;


import com.example.nutritionplannerbackend.entities.ChatResponse;
import com.example.nutritionplannerbackend.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }


    @GetMapping
    public Mono<List<ChatResponse>> getStudents() {
        Mono<List<ChatResponse>> res = chatService.fetchChatGPT();
        return res;
    }








}
