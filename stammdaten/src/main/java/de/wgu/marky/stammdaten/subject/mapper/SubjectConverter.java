package de.wgu.marky.stammdaten.subject.mapper;

import de.wgu.marky.model.Subject;
import de.wgu.marky.stammdaten.year.model.Subject2student;

import java.util.List;

public interface SubjectConverter {

    /**
     * converts subjects
     *
     * @param subjects
     * @return
     */
    List<de.wgu.marky.stammdaten.year.model.Subject> convert(List<Subject> subjects);

    /**
     * gets and converts subjects 2 students
     *
     * @param subjects
     * @return
     */
    List<Subject2student> convertSubjects2Students(List<de.wgu.marky.model.Subject> subjects);
}
