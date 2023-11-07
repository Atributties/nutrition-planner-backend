package com.example.nutritionplannerbackend.controllers;

import com.example.nutritionplannerbackend.service.EnumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EnumController {

    @Autowired
    private EnumService enumService;

    @GetMapping("/genders")
    public ResponseEntity<List<String>> getAllGenders(){
        List<String> genders = enumService.getAllGenders();
        return new ResponseEntity<>(genders, HttpStatus.OK);
    }

    @GetMapping("/nutritionTypes")
    public ResponseEntity<List<String>> getAllNutritionTypes(){
        List<String> nutritionTypes = enumService.getAllNutritionTypes();
        return new ResponseEntity<>(nutritionTypes, HttpStatus.OK);
    }
}
