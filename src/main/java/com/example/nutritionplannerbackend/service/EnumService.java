package com.example.nutritionplannerbackend.service;

import com.example.nutritionplannerbackend.enums.Gender;
import com.example.nutritionplannerbackend.enums.NutritionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnumService {

    private final Gender[] genders;
    private final NutritionType[] nutritionTypes;
    @Autowired
    public EnumService(Gender[] genders, NutritionType[] nutritionTypes) {
        this.genders = genders;
        this.nutritionTypes = nutritionTypes;
    }

    public List<String> getAllGenders(){
        return Arrays.stream(genders)
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    public List<String> getAllNutritionTypes(){
        return Arrays.stream(nutritionTypes)
                .map(Enum::name)
                .collect(Collectors.toList());
    }

}
