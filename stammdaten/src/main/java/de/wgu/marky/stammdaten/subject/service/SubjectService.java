package de.wgu.marky.stammdaten.subject.service;

import de.wgu.marky.model.Subject;

import java.util.List;

public interface SubjectService {

    /**
     * get all subjects
     *
     * @return all subjects
     */
    List<Subject> getSubjects();

}
