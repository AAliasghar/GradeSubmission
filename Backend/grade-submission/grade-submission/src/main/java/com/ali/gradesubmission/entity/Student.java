package com.ali.gradesubmission.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NonNull
    @Column(name = "name", nullable = false)
    private String name;

    @NonNull
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @JsonIgnore
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Grade> grades;

    // public Long getId() {
    // return this.id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    // public String getName() {
    // return this.name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public LocalDate getBirthDate() {
    // return this.birthDate;
    // }

    // public void setBirthDate(LocalDate birthDate) {
    // this.birthDate = birthDate;
    // }

}
