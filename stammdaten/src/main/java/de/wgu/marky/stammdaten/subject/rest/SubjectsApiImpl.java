package de.wgu.marky.stammdaten.subject.rest;

import de.wgu.marky.model.Subject;
import de.wgu.marky.stammdaten.rest.api.NotFoundException;
import de.wgu.marky.stammdaten.rest.api.SubjectsApi;
import de.wgu.marky.stammdaten.subject.mapper.BoToRestSubjectMapper;
import de.wgu.marky.stammdaten.subject.service.SubjectService;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class SubjectsApiImpl implements SubjectsApi {

    private SubjectService subjectService;
    private BoToRestSubjectMapper boToRestSubjectMapper;

    public SubjectsApiImpl() {
    }

    @Inject
    public SubjectsApiImpl(SubjectService subjectService, BoToRestSubjectMapper boToRestSubjectMapper) {
        this.subjectService = subjectService;
        this.boToRestSubjectMapper = boToRestSubjectMapper;
    }

    public Response getSubjects() throws NotFoundException {
        final List<Subject> subjects = subjectService.getSubjects();

        return Response.ok(
                subjects
                        .stream()
                        .map(boToRestSubjectMapper::boSubjectToRestSubject)
                        .collect(Collectors.toList())
        ).build();
    }
}
