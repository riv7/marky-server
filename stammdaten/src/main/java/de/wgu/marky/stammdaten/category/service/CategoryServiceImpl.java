package de.wgu.marky.stammdaten.category.service;

import de.wgu.marky.model.Category;
import de.wgu.marky.stammdaten.category.dao.CategoryDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class CategoryServiceImpl implements CategoryService {
    private CategoryDao categoryDao;

    public CategoryServiceImpl() {
    }

    @Inject
    public CategoryServiceImpl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Category> getCategories() {
        return categoryDao.getCategories();
    }
}
