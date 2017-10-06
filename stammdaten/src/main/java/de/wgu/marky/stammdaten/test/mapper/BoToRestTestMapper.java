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
    de.wgu.marky.stammdaten.year.model.Test boTestToRestTestMapper(Test test);

    @Mappings({
            @Mapping(source = "student.id", target = "studentId")
    })
    de.wgu.marky.stammdaten.year.model.Mark boMarkToRestMarkMapper(Mark mark);
}
