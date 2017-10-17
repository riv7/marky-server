package de.wgu.marky.stammdaten.test.dao;

import de.wgu.marky.model.Test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class TestDaoImpl implements TestDao {
    private EntityManager entityManager;

    public TestDaoImpl() {
    }

    @Inject
    public TestDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Test> getTests() {

        // Prepare query
        String statement = "SELECT t FROM Test AS t";

        // Retrieve from DB
        TypedQuery<Test> query = entityManager.createQuery(statement, Test.class);

        // Perform query
        return query.getResultList();
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public Test persistTest(Test test) {
        entityManager.persist(test);
        return test;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public Test findTest(Long testId) {

        // Prepare query
        String statement = "SELECT t FROM Test AS t WHERE t.id = :testId";

        // Retrieve from DB
        TypedQuery<Test> query = entityManager.createQuery(statement, Test.class);

        // Perform query
        return query.setParameter("testId", testId).getSingleResult();
    }
}
