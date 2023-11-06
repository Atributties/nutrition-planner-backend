package com.example.nutritionplannerbackend.entities;


import com.example.nutritionplannerbackend.enums.NutritionType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class ChatRequestFromUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private NutritionType nutritionType;
    private int numberOfDays;
    @OneToOne
    private UserInformation userInformation;



}
