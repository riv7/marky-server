package de.wgu.marky.stammdaten.subject.service;

import de.wgu.marky.model.Subject;
import de.wgu.marky.stammdaten.subject.dao.SubjectDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class SubjectServiceImpl implements SubjectService {

    private SubjectDao subjectDao;

    public SubjectServiceImpl() {
    }

    @Inject
    public SubjectServiceImpl(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public List<Subject> getSubjects() {
        return subjectDao.getSubjects();
    }
}
