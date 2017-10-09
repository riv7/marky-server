package de.wgu.marky.stammdaten.test.dao;

import de.wgu.marky.model.Category;
import de.wgu.marky.model.Test;

import java.util.List;

public interface TestDao {

    /**
     * get tests
     *
     * @return tests
     */
    List<Test> getTests();

    /**
     * persists given test
     *
     * @param test
     * @return
     */
    Test persistTest(Test test);
}
