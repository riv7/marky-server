package de.wgu.marky.stammdaten.student.service;

import de.wgu.marky.model.Student;
import de.wgu.marky.stammdaten.student.dao.StudentDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl() {
    }

    @Inject
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }
}
