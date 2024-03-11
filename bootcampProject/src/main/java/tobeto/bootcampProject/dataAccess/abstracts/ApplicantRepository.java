package tobeto.bootcampProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import tobeto.bootcampProject.entities.concretes.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {


}
