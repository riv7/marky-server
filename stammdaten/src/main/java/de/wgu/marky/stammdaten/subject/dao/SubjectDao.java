package de.wgu.marky.stammdaten.subject.dao;

import de.wgu.marky.model.Subject;
import java.util.List;

public interface SubjectDao {

    /**
     * get all subjects
     *
     * @return all subjects
     */
    List<Subject> getSubjects();
}
