package com.example.nutritionplannerbackend.controllers;


import com.example.nutritionplannerbackend.entities.ChatRequestFromUser;
import com.example.nutritionplannerbackend.entities.ChatResponse;
import com.example.nutritionplannerbackend.service.ChatService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/chat")
public class ChatController {

    final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }


    @PostMapping
    public Mono<List<ChatResponse>> getChatResponse(@RequestBody ChatRequestFromUser chatRequestFromUser) {
        // Nu kan du bruge hele chatRequest i din logik.
        Mono<List<ChatResponse>> res = chatService.fetchChatGPT(chatRequestFromUser);
        return res;
    }








}
