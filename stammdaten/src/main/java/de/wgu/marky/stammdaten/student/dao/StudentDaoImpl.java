package de.wgu.marky.stammdaten.student.dao;

import de.wgu.marky.model.Student;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class StudentDaoImpl implements StudentDao {
    private EntityManager entityManager;

    public StudentDaoImpl() {
    }

    @Inject
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Student> getStudents() {

        // Prepare query
        String statement = "SELECT s FROM Student AS s";

        // Retrieve from DB
        TypedQuery<Student> query = entityManager.createQuery(statement, Student.class);

        // Perform query
        return query.getResultList();
    }
}
