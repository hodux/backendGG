package com.example.backend.repositories;

import com.example.backend.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecetteRepository extends JpaRepository<Recipe, Integer> {

    public List<Recipe> findByCaloriesAndIsVeganAndIsVegetarianAndPreparationTime(Integer calories, Boolean isvegan, Boolean isvegetarian, String preparationTime);


}
