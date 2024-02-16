package com.tobeto.bootcampProject.dataAccess.abstracts;

import com.tobeto.bootcampProject.entities.concretes.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantDao extends JpaRepository<Applicant,Integer> {
}
