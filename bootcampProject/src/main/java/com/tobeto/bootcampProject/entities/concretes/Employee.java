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
@Table(name = "employees")
@EqualsAndHashCode(callSuper = true)

public class Employee extends User<Integer> {

    @Column (name = "position")
    private String position;

}
