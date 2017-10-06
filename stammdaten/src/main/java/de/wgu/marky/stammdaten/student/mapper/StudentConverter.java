package de.wgu.marky.stammdaten.student.mapper;

import de.wgu.marky.model.Grade;
import de.wgu.marky.model.Student;

import java.util.List;

public interface StudentConverter {

    /**
     * converts students
     *
     * @param from
     * @return
     */
    List<de.wgu.marky.stammdaten.year.model.Student> convert(List<Student> from);
}
