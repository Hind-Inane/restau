package com.gestion.restau.services;

import com.gestion.restau.entities.Categorie;
import com.gestion.restau.entities.Product;

import java.util.List;

public interface CategorieService {
    List<Categorie> getAllCategories();

    Categorie saveCategorie(Categorie categorie);

    void deleteCategoryById(Long id);

    Categorie getCategorieById(Long id);

    Categorie updateCategorie(Categorie categorie);
}