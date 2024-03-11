package tobeto.bootcampProject.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tobeto.bootcampProject.entities.base.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "users")
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class User extends BaseEntity<Integer> {
    @Column(name = "username")
    private String userName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "national_identity")
    private String nationalIdentity;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}
