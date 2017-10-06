package de.wgu.marky.stammdaten.grade.mapper;

import de.wgu.marky.model.Grade;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class GradeConverterImpl implements GradeConverter {
    BoToRestGradeMapper boToRestGradeMapper;

    public GradeConverterImpl() {
    }

    @Inject
    public GradeConverterImpl(BoToRestGradeMapper boToRestGradeMapper) {
        this.boToRestGradeMapper = boToRestGradeMapper;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<de.wgu.marky.stammdaten.year.model.Grade> convert(List<Grade> from) {

        return from
                .stream()
                .map(boToRestGradeMapper::boGradeToRestGrade)
                .collect(Collectors.toList());
    }
}