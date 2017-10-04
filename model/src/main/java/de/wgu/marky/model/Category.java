package de.wgu.marky.model;

import javax.persistence.*;
import java.util.List;

@Entity
//@SequenceGenerator(
//        name="SEQ_STORE",
//        sequenceName="category_sequence"
//)
public class Category {
    private Long id;
    private String name;
    private String color;
    private String sortingrank;
    private int faktor;
    private List<Test> tests;

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

    @Column(nullable = false)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(nullable = false)
    public String getSortingrank() {
        return sortingrank;
    }

    public void setSortingrank(String sortingrank) {
        this.sortingrank = sortingrank;
    }

    @Column(nullable = false)
    public int getFaktor() {
        return faktor;
    }

    public void setFaktor(int faktor) {
        this.faktor = faktor;
    }

    @OneToMany(mappedBy = "category")
    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}

