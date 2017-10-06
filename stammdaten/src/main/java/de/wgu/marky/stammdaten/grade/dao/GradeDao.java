package de.wgu.marky.stammdaten.grade.dao;

import de.wgu.marky.model.Grade;
import de.wgu.marky.model.Subject;

import java.util.List;

public interface GradeDao {

    /**
     * get all grades
     *
     * @return all grades
     */
    List<Grade> getGrades();
}
