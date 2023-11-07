package com.example.nutritionplannerbackend.service;

import com.example.nutritionplannerbackend.enums.ActivityLevel;
import com.example.nutritionplannerbackend.enums.Gender;
import com.example.nutritionplannerbackend.enums.NutritionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnumService {

    public List<String> getAllGenders() {
        return Arrays.stream(Gender.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    public List<String> getAllNutritionTypes() {
        return Arrays.stream(NutritionType.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    public List<String> getAllActivityLevels() {
        return Arrays.stream(ActivityLevel.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

}
