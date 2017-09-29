package de.wgu.marky.stammdaten.subject.dao;

import de.wgu.marky.model.Subject;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class SubjectDaoImpl implements SubjectDao {
    private EntityManager entityManager;

    public SubjectDaoImpl() {
    }

    @Inject
    public SubjectDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(Transactional.TxType.MANDATORY)
    public List<Subject> getSubjects() {

        // Prepare query
        String statement = "SELECT s FROM Subject AS s";

        // Retrieve from DB
        TypedQuery<Subject> query = entityManager.createQuery(statement, Subject.class );

        // Perform query
        return query.getResultList();
    }
}
