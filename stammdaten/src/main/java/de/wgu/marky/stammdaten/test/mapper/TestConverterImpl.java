package de.wgu.marky.stammdaten.test.mapper;

import de.wgu.marky.model.Test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class TestConverterImpl implements TestConverter {
    BoToRestTestMapper boToRestTestMapper;

    public TestConverterImpl() {
    }

    @Inject
    public TestConverterImpl(BoToRestTestMapper boToRestTestMapper) {
        this.boToRestTestMapper = boToRestTestMapper;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<de.wgu.marky.stammdaten.year.model.Test> convert(List<Test> from) {

        return from
                .stream()
                .map(boToRestTestMapper::boTestToRestTestMapper)
                .collect(Collectors.toList());
    }
}