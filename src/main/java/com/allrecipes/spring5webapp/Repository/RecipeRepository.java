package com.allrecipes.spring5webapp.Repository;

import com.allrecipes.spring5webapp.Entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Integer> {
}