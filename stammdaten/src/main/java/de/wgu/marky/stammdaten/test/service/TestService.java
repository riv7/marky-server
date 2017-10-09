package de.wgu.marky.stammdaten.test.service;

import de.wgu.marky.model.Test;

import java.util.List;

public interface TestService {

    /**
     * get tests
     *
     * @return
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
