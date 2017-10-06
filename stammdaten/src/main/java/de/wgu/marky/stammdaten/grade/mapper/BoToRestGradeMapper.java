/*
 * Copyright (c) eXXcellent solutions GmbH 2017.
 * All rights reserved.
 *
 * This file is made available under the terms of the license
 * agreement that accompanies this distribution.
 */

package de.wgu.marky.stammdaten.grade.mapper;

import de.wgu.marky.model.Grade;
import org.mapstruct.Mapper;

@Mapper( componentModel = "cdi" )
public interface BoToRestGradeMapper {

    /**
     * Map Bo Grades to Rest Grades
     *
     * @param grade
     * @return
     */
    de.wgu.marky.stammdaten.year.model.Grade boGradeToRestGrade(Grade grade);
}
