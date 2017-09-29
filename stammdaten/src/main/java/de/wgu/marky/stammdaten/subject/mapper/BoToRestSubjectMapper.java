/*
 * Copyright (c) eXXcellent solutions GmbH 2017.
 * All rights reserved.
 *
 * This file is made available under the terms of the license
 * agreement that accompanies this distribution.
 */

package de.wgu.marky.stammdaten.subject.mapper;

import de.wgu.marky.model.Subject;
import org.mapstruct.Mapper;

@Mapper( componentModel = "cdi" )
public interface BoToRestSubjectMapper {

    /**
     * Map Bo Subjects to Rest Subjects
     *
     * @param subject
     * @return
     */
    de.wgu.marky.stammdaten.rest.model.Subject boSubjectToRestSubject(Subject subject);
}
