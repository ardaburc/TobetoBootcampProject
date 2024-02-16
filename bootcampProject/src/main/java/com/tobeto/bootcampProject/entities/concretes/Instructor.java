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
@Table (name = "instructors")
@EqualsAndHashCode(callSuper = true)

public class Instructor extends User<Integer> {

    @Column (name = "companyname")
    private String companyName;

}
