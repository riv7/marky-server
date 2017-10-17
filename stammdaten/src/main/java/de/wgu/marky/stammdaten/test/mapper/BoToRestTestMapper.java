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
import org.mapstruct.*;

@Mapper( componentModel = "cdi", collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
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

    /**
     * create new BO from Rest
     *
     * @param testData
     * @return
     */
    @Mappings({
            @Mapping(source = "category", target = "category.id"),
            @Mapping(source = "subject", target = "subject.id")
    })
    Test restTestToBoTest(TestData testData);

    /**
     * create new Mark BO from Rest
     *
     * @param mark
     * @return
     */
    @Mappings({
            @Mapping(source = "studentId", target = "student.id")
    })
    Mark restMarkToBoMark(de.wgu.marky.stammdaten.year.model.Mark mark);

    /**
     * update existing Test
     *
     * @param testData
     * @param test
     */
    @Mappings({
            @Mapping(source = "category", target = "category.id"),
            @Mapping(source = "subject", target = "subject.id")
    })
    Test updateTestBoFromRestBo(TestData testData, @MappingTarget Test test);

//    /**
//     * update existing Marks
//     *
//     * @param mark
//     * @return
//     */
//    @Mappings({
//            @Mapping(source = "studentId", target = "student.id")
//    })
//    Mark updateMarkBoFromRestMark(de.wgu.marky.stammdaten.year.model.Mark restMark, @MappingTarget Mark mark);
}
