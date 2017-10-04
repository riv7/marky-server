package de.wgu.marky.model;

import javax.persistence.*;
import java.util.List;

@Entity
//@SequenceGenerator(
//        name="SEQ_STORE",
//        sequenceName="grade_sequence"
//)
public class Grade {
    private Long id;
    private String name;
    private List<Student> students;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "grade")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
