package de.wgu.marky.stammdaten.test.mapper;

import de.wgu.marky.model.Test;

import java.util.List;

public interface TestConverter {

    /**
     * converts tests
     *
     * @param from
     * @return
     */
    List<de.wgu.marky.stammdaten.year.model.Test> convert(List<Test> from);
}
