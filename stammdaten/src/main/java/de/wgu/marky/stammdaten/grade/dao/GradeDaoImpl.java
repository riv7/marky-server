package de.wgu.marky.stammdaten.grade.dao;

import de.wgu.marky.model.Grade;
import de.wgu.marky.model.Subject;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class GradeDaoImpl implements GradeDao {
    private EntityManager entityManager;

    public GradeDaoImpl() {
    }

    @Inject
    public GradeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Grade> getGrades() {

        // Prepare query
        String statement = "SELECT g FROM Grade AS g";

        // Retrieve from DB
        TypedQuery<Grade> query = entityManager.createQuery(statement, Grade.class);

        // Perform query
        return query.getResultList();
    }
}
