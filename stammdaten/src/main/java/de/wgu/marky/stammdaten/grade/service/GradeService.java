package de.wgu.marky.stammdaten.grade.service;

import de.wgu.marky.model.Grade;
import de.wgu.marky.model.Subject;

import java.util.List;

public interface GradeService {

    /**
     * get all grades
     *
     * @return all grades
     */
    List<Grade> getGrades();

}
