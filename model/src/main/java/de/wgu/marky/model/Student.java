package de.wgu.marky.model;

import javax.persistence.*;
import java.util.List;

@Entity
//@SequenceGenerator(
//        name="SEQ_STORE",
//        sequenceName="student_sequence"
//)
public class Student {
    private Long id;
    private String name;
    private List<Subject> subjects;
    private List<Mark> marks;
    private Grade grade;

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

    @ManyToOne
    //TODO wgu: Join column necessary for bidirectional?
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @OneToMany(mappedBy = "student")
    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}
