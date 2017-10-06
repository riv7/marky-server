package de.wgu.marky.stammdaten.category.mapper;

import de.wgu.marky.model.Category;
import de.wgu.marky.model.Grade;
import de.wgu.marky.stammdaten.grade.mapper.BoToRestGradeMapper;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class CategoryConverterImpl implements CategoryConverter {
    BoToRestCategoryMapper boToRestCategoryMapper;

    public CategoryConverterImpl() {
    }

    @Inject
    public CategoryConverterImpl(BoToRestCategoryMapper boToRestCategoryMapper) {
        this.boToRestCategoryMapper = boToRestCategoryMapper;
    }

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public List<de.wgu.marky.stammdaten.year.model.Category> convert(List<Category> from) {

        return from
                .stream()
                .map(boToRestCategoryMapper::boCategoryToRestCategory)
                .collect(Collectors.toList());
    }
}