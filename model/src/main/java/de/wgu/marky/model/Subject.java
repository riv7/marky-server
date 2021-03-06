package de.wgu.marky.model;

import javax.persistence.*;
import java.util.List;

@Entity
//@SequenceGenerator(
//        name="SEQ_STORE",
//        sequenceName="subject_sequence"
//)
public class Subject {
    private Long id;
    private String name;
    private String scope;
    private List<Student> students;
    private List<Test> tests;

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @ManyToMany(mappedBy = "subjects")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @OneToMany(mappedBy = "subject")
    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
