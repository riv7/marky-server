package de.wgu.marky.stammdaten.year.rest;

import de.wgu.marky.model.*;
import de.wgu.marky.stammdaten.category.mapper.CategoryConverter;
import de.wgu.marky.stammdaten.category.service.CategoryService;
import de.wgu.marky.stammdaten.grade.mapper.GradeConverter;
import de.wgu.marky.stammdaten.grade.service.GradeService;
import de.wgu.marky.stammdaten.student.mapper.StudentConverter;
import de.wgu.marky.stammdaten.student.service.StudentService;
import de.wgu.marky.stammdaten.test.mapper.TestConverter;
import de.wgu.marky.stammdaten.test.service.TestService;
import de.wgu.marky.stammdaten.year.api.NotFoundException;
import de.wgu.marky.stammdaten.year.api.YearsApi;
import de.wgu.marky.stammdaten.year.model.Year;
import de.wgu.marky.stammdaten.subject.mapper.SubjectConverter;
import de.wgu.marky.stammdaten.subject.service.SubjectService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.List;

@RequestScoped
public class YearApiImpl implements YearsApi {

    private GradeService gradeService;
    private SubjectService subjectService;
    private StudentService studentService;
    private CategoryService categoryService;
    private TestService testService;
    private GradeConverter gradeConverter;
    private SubjectConverter subjectConverter;
    private StudentConverter studentConverter;
    private CategoryConverter categoryConverter;
    private TestConverter testConverter;

    public YearApiImpl() {
    }

    @Inject
    public YearApiImpl(GradeService gradeService,
                       SubjectService subjectService,
                       StudentService studentService,
                       CategoryService categoryService,
                       TestService testService,
                       GradeConverter gradeConverter,
                       SubjectConverter subjectConverter,
                       StudentConverter studentConverter,
                       CategoryConverter categoryConverter,
                       TestConverter testConverter) {
        this.gradeService = gradeService;
        this.subjectService = subjectService;
        this.studentService = studentService;
        this.categoryService = categoryService;
        this.testService = testService;
        this.gradeConverter = gradeConverter;
        this.subjectConverter = subjectConverter;
        this.studentConverter = studentConverter;
        this.categoryConverter = categoryConverter;
        this.testConverter = testConverter;
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Response getCategories() throws NotFoundException {
        final List<Category> categories = categoryService.getCategories();
        return Response.ok(categoryConverter.convert(categories)).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Response getGrades() throws NotFoundException {
        final List<Grade> grades = gradeService.getGrades();
        return Response.ok(gradeConverter.convert(grades)).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Response getStudents() throws NotFoundException {
        final List<Student> students = studentService.getStudents();
        return Response.ok(studentConverter.convert(students)).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Response getSubjects() throws NotFoundException {
        final List<Subject> subjects = subjectService.getSubjects();
        return Response.ok(subjectConverter.convert(subjects)).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Response getSubjects2Students() throws NotFoundException {
        final List<Subject> subjects = subjectService.getSubjects();
        return Response.ok(subjectConverter.convertSubjects2Students(subjects)).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Response getTests() throws NotFoundException {
        final List<Test> tests = testService.getTests();
        return Response.ok(testConverter.convert(tests)).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public Response getYear() throws NotFoundException {
        final List<Grade> grades = gradeService.getGrades();
        final List<Subject> subjects = subjectService.getSubjects();
        final List<Student> students = studentService.getStudents();
        final List<Category> categories = categoryService.getCategories();
        final List<Test> tests = testService.getTests();

        final List<de.wgu.marky.stammdaten.year.model.Grade> restGrades = gradeConverter.convert(grades);
        final List<de.wgu.marky.stammdaten.year.model.Subject> restSubjects = subjectConverter.convert(subjects);
        final List<de.wgu.marky.stammdaten.year.model.Student> restStudents = studentConverter.convert(students);
        final List<de.wgu.marky.stammdaten.year.model.Category> restCategories = categoryConverter.convert(categories);
        final List<de.wgu.marky.stammdaten.year.model.Subject2student> restSubjects2students =
                subjectConverter.convertSubjects2Students(subjects);
        final List<de.wgu.marky.stammdaten.year.model.Test> restTests = testConverter.convert(tests);

        Year year = new Year();
        year.setGrades(restGrades);
        year.setSubjects(restSubjects);
        year.setStudents(restStudents);
        year.setCategories(restCategories);
        year.setSubjects2students(restSubjects2students);
        year.setTests(restTests);

        return Response.ok(year).build();
    }
}
