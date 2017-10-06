package de.wgu.marky.stammdaten.student.dao;

import de.wgu.marky.model.Student;

import java.util.List;

public interface StudentDao {

    /**
     * get students
     *
     * @return
     */
    List<Student> getStudents();
}
