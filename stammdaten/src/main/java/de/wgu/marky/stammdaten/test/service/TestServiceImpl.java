package de.wgu.marky.stammdaten.test.service;

import de.wgu.marky.model.Test;
import de.wgu.marky.stammdaten.test.dao.TestDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class TestServiceImpl implements TestService {
    private TestDao testDao;

    public TestServiceImpl() {
    }

    @Inject
    public TestServiceImpl(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Test> getTests() {
        return testDao.getTests();
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public Test persistTest(Test test) {
        return testDao.persistTest(test);
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public Test findTest(Long testId) {
        return testDao.findTest(testId);
    }
}
