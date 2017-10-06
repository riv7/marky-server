package de.wgu.marky.stammdaten.category.dao;

import de.wgu.marky.model.Category;

import java.util.List;

public interface CategoryDao {

    /**
     * get categories
     *
     * @return
     */
    List<Category> getCategories();
}
