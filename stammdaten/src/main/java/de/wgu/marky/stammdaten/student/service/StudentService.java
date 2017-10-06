package de.wgu.marky.stammdaten.student.service;

import de.wgu.marky.model.Student;
import java.util.List;

public interface StudentService {

    /**
     * get students
     *
     * @return
     */
    List<Student> getStudents();
}
