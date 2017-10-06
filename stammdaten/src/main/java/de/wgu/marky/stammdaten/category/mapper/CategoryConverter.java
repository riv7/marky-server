package de.wgu.marky.stammdaten.category.mapper;

import de.wgu.marky.model.Category;
import de.wgu.marky.model.Grade;

import java.util.List;

public interface CategoryConverter {

    /**
     * converts categories
     *
     * @param from
     * @return
     */
    List<de.wgu.marky.stammdaten.year.model.Category> convert(List<Category> from);
}
