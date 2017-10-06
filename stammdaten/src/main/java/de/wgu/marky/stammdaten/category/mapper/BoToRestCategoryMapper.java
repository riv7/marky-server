/*
 * Copyright (c) eXXcellent solutions GmbH 2017.
 * All rights reserved.
 *
 * This file is made available under the terms of the license
 * agreement that accompanies this distribution.
 */

package de.wgu.marky.stammdaten.category.mapper;

import de.wgu.marky.model.Category;
import de.wgu.marky.model.Grade;
import org.mapstruct.Mapper;

@Mapper( componentModel = "cdi" )
public interface BoToRestCategoryMapper {

    /**
     * Map Bo Categories to Rest Categories
     *
     * @param category
     * @return
     */
    de.wgu.marky.stammdaten.year.model.Category boCategoryToRestCategory(Category category);
}
