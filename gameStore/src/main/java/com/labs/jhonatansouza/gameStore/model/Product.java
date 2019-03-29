package com.labs.jhonatansouza.gameStore.model;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(allocationSize = 1, name = "seq_p",initialValue = 1, sequenceName = "m_seq")
@Table(name = "product")
public class Product {

    private Long id;
    private String name;
    private int launchYear;
    private List<Detail>  details;

    public Product() {
    }

    @Id
    @GeneratedValue(generator="seq_p", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "productName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "yearLaunch")
    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    @OneToMany
    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }
}
