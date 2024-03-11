package tobeto.bootcampProject.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Table(name = "applicants")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public class Applicant extends User {
    @Column(name = "about")
    private String about;
}
