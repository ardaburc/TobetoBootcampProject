package tobeto.bootcampProject.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllApplicantResponse {

    private int id;

    private String about;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private LocalDateTime deletedDate;

}
