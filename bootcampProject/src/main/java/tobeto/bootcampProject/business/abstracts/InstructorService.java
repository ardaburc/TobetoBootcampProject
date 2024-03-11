package tobeto.bootcampProject.business.abstracts;

import tobeto.bootcampProject.business.requests.CreateInstructorRequest;
import tobeto.bootcampProject.business.requests.UpdateInstructorRequest;
import tobeto.bootcampProject.business.responses.GetAllInstructorResponse;
import tobeto.bootcampProject.business.responses.GetByIdInstructorResponse;

import java.util.List;

public interface InstructorService {
    List<GetAllInstructorResponse> getAll();

    GetByIdInstructorResponse getById(int id);

    void add(CreateInstructorRequest createInstructorRequest);

    void update(UpdateInstructorRequest updateInstructorRequest);

    void delete(int id);
}
