package de.wgu.marky.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
//@SequenceGenerator(
//        name="SEQ_STORE",
//        sequenceName="test_sequence"
//)
public class Test {
    private Long id;
    private String name;
    private LocalDateTime written;
    private Subject subject;
    private Category category;
    private List<Mark> marks;

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

    @Column(nullable = false)
    public LocalDateTime getWritten() {
        return written;
    }

    public void setWritten(LocalDateTime writtenAt) {
        this.written = writtenAt;
    }

    @ManyToOne
    //TODO wgu: add join column for bidirect?
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @ManyToOne
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @OneToMany(mappedBy = "test")
    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}
