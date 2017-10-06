package de.wgu.marky.stammdaten.grade.service;

import de.wgu.marky.model.Grade;
import de.wgu.marky.model.Subject;
import de.wgu.marky.stammdaten.grade.dao.GradeDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class GradeServiceImpl implements GradeService {

    private GradeDao gradeDao;

    public GradeServiceImpl() {
    }

    @Inject
    public GradeServiceImpl(GradeDao gradeDao) {
        this.gradeDao = gradeDao;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Grade> getGrades() {
        return gradeDao.getGrades();
    }
}
