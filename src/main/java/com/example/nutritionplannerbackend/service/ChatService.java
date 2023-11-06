package com.example.nutritionplannerbackend.service;

import com.example.nutritionplannerbackend.entities.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ChatService {


    private final WebClient webClient;

    @Autowired
    public ChatService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081").build();
    }

    public Mono<List<ChatResponse>> fetchChatGPT() {
        return webClient
                .get()
                .uri("/chat")
                .accept(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<ChatResponse>>() {});
    }

}
