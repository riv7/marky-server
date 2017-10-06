package de.wgu.marky.stammdaten.grade.mapper;

import de.wgu.marky.model.Grade;
import java.util.List;

public interface GradeConverter {

    /**
     * converts grades
     *
     * @param from
     * @return
     */
    List<de.wgu.marky.stammdaten.year.model.Grade> convert(List<Grade> from);
}
