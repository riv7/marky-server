/*
 * Copyright (c) eXXcellent solutions GmbH 2017.
 * All rights reserved.
 *
 * This file is made available under the terms of the license
 * agreement that accompanies this distribution.
 */

package de.wgu.marky.stammdaten.test.mapper;

import de.wgu.marky.model.Category;
import de.wgu.marky.model.Mark;
import de.wgu.marky.model.Test;
import de.wgu.marky.stammdaten.year.model.TestData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "cdi" )
public interface BoToRestTestMapper {

    /**
     * Map Bo Tests to Rest Tests
     *
     * @param test
     * @return
     */
    @Mappings({
            @Mapping(source = "category.id", target = "category"),
            @Mapping(source = "subject.id", target = "subject")
    })
    de.wgu.marky.stammdaten.year.model.Test boTestToRestTestMapper(Test test);

    /**
     * Map marks
     *
     * @param mark
     * @return
     */
    @Mappings({
            @Mapping(source = "student.id", target = "studentId")
    })
    de.wgu.marky.stammdaten.year.model.Mark boMarkToRestMarkMapper(Mark mark);

    @Mappings({
            @Mapping(source = "category", target = "category.id"),
            @Mapping(source = "subject", target = "subject.id")
    })
    Test restTestToBoTest(TestData testData);

    @Mappings({
            @Mapping(source = "studentId", target = "student.id")
    })
    Mark restMarkToBoMark(de.wgu.marky.stammdaten.year.model.Mark mark);
}
