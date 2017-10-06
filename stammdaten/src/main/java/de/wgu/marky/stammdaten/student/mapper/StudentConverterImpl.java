package de.wgu.marky.stammdaten.student.mapper;

import de.wgu.marky.model.Grade;
import de.wgu.marky.model.Student;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class StudentConverterImpl implements StudentConverter {
    BoToRestStudentMapper boToRestStudentMapper;

    public StudentConverterImpl() {
    }

    @Inject
    public StudentConverterImpl(BoToRestStudentMapper boToRestStudentMapper) {
        this.boToRestStudentMapper = boToRestStudentMapper;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<de.wgu.marky.stammdaten.year.model.Student> convert(List<Student> from) {

        return from
                .stream()
                .map(boToRestStudentMapper::boStudentToRestStudent)
                .collect(Collectors.toList());
    }
}