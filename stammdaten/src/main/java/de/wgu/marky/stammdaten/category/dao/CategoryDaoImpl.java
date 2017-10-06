package de.wgu.marky.stammdaten.category.dao;

import de.wgu.marky.model.Category;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class CategoryDaoImpl implements CategoryDao {
    private EntityManager entityManager;

    public CategoryDaoImpl() {
    }

    @Inject
    public CategoryDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Category> getCategories() {

        // Prepare query
        String statement = "SELECT c FROM Category AS c";

        // Retrieve from DB
        TypedQuery<Category> query = entityManager.createQuery(statement, Category.class);

        // Perform query
        return query.getResultList();
    }
}
