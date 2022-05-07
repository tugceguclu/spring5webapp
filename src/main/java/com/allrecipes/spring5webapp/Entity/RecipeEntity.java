package com.allrecipes.spring5webapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Recipe")
@Table(name = "recipe")
public class RecipeEntity extends BaseEntity {

    @Column(name = "food_name", nullable = false, columnDefinition = "TEXT")
    private String foodName;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "instructions", nullable = false, columnDefinition = "TEXT")
    private String instructions;

    public RecipeEntity(String foodName, String description, String instructions) {
        this.foodName = foodName;
        this.description = description;
        this.instructions = instructions;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "foodName='" + foodName + '\'' +
                ", description='" + description + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}