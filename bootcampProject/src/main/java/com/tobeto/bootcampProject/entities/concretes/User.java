package com.tobeto.bootcampProject.entities.concretes;

//Spring ile import edilen, javayı daha kolay hale getiren, anotasyonlar ile çağırılabilen paketler

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name ="username")
    private String userName;

    @Column (name ="firstname")
    private String firstName;

    @Column (name ="lastname")
    private String lastName;

    @Column (name ="dateofbirth")
    private String dateOfBirth;

    @Column (name ="nationalidentity")
    private String nationalIdentity;

    @Column (name ="email")
    private String email;

    @Column (name ="password")
    private String password;



}
