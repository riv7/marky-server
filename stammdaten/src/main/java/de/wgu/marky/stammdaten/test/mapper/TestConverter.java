package de.wgu.marky.stammdaten.test.mapper;

import de.wgu.marky.model.Test;
import de.wgu.marky.stammdaten.year.model.TestData;

import java.util.List;

public interface TestConverter {

    /**
     * converts tests
     *
     * @param from
     * @return
     */
    List<de.wgu.marky.stammdaten.year.model.Test> convert(List<Test> from);

    /**
     * convert test
     *
     * @param from
     * @return
     */
    de.wgu.marky.stammdaten.year.model.Test convert(Test from);

    /**
     * converts Testdata from post to movie Object (which needs to be persisted seperately)
     *
     * @param testData
     * @return
     */
    Test convert(TestData testData);

    /**
     * updates Test with given Testdata
     *
     * @param testData
     * @param test
     * @return
     */
    Test update(TestData testData, Test test);
}
