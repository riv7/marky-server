package de.wgu.marky.stammdaten.subject.mapper;

import de.wgu.marky.stammdaten.year.model.Subject;
import de.wgu.marky.stammdaten.year.model.Subject2student;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class SubjectConverterImpl implements SubjectConverter {
    BoToRestSubjectMapper boToRestSubjectMapper;

    public SubjectConverterImpl() {
    }

    @Inject
    public SubjectConverterImpl(BoToRestSubjectMapper boToRestSubjectMapper) {
        this.boToRestSubjectMapper = boToRestSubjectMapper;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Subject> convert(List<de.wgu.marky.model.Subject> subjects) {
        return subjects
                .stream()
                .map(boToRestSubjectMapper::boSubjectToRestSubject)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<Subject2student> convertSubjects2Students(List<de.wgu.marky.model.Subject> subjects) {
        return subjects
                .stream()
                .flatMap(subject ->
                        subject.getStudents()
                                .stream()
                                .map(student -> {
                                    final Subject2student subject2student = new Subject2student();
                                    subject2student.setSubjectId(BigDecimal.valueOf(subject.getId()));
                                    subject2student.setStudentId(BigDecimal.valueOf(student.getId()));
                                    return subject2student;
                                })
                                .collect(Collectors.toList())
                                .stream()

                ).collect(Collectors.toList());
    }
}
