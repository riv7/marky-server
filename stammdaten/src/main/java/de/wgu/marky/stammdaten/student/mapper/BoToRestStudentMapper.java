/*
 * Copyright (c) eXXcellent solutions GmbH 2017.
 * All rights reserved.
 *
 * This file is made available under the terms of the license
 * agreement that accompanies this distribution.
 */

package de.wgu.marky.stammdaten.student.mapper;

import de.wgu.marky.model.Grade;
import de.wgu.marky.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "cdi" )
public interface BoToRestStudentMapper {

    /**
     * Map Bo Students to Rest Students
     *
     * @param student
     * @return
     */
    @Mappings({
            @Mapping(source = "grade.id", target = "gradeId")
    })
    de.wgu.marky.stammdaten.year.model.Student boStudentToRestStudent(Student student);
}
