package tobeto.bootcampProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import tobeto.bootcampProject.entities.concretes.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
}
