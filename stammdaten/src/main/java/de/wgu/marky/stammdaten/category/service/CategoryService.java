package de.wgu.marky.stammdaten.category.service;

import de.wgu.marky.model.Category;

import java.util.List;

public interface CategoryService {

    /**
     * get categories
     *
     * @return
     */
    List<Category> getCategories();
}
