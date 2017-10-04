package de.wgu.marky.model;

import javax.persistence.*;
import java.util.List;

@Entity
//@SequenceGenerator(
//        name="SEQ_STORE",
//        sequenceName="mark_sequence"
//)
public class Mark {
    private Long id;
    private Double mark;
    private Test test;
    private Student student;

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @ManyToOne
    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @ManyToOne
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
