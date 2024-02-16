package com.tobeto.bootcampProject.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "applicants")
@EqualsAndHashCode(callSuper = true)

public class Applicant extends User<Integer> {


    @Column (name = "about")
    private String about;

}
