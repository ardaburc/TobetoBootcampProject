package tobeto.bootcampProject.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tobeto.bootcampProject.business.abstracts.InstructorService;
import tobeto.bootcampProject.business.requests.CreateInstructorRequest;
import tobeto.bootcampProject.business.requests.UpdateInstructorRequest;
import tobeto.bootcampProject.business.responses.GetAllInstructorResponse;
import tobeto.bootcampProject.business.responses.GetByIdInstructorResponse;
import tobeto.bootcampProject.core.utulities.mappers.ModelMapperService;
import tobeto.bootcampProject.dataAccess.abstracts.InstructorRepository;
import tobeto.bootcampProject.entities.concretes.Instructor;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class InstructorManager implements InstructorService {

    private InstructorRepository instructorRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllInstructorResponse> getAll() {
        List<Instructor> instructors = instructorRepository.findAll();

        List<GetAllInstructorResponse> instructorResponse = instructors.stream()
                .map(instructor -> this.modelMapperService.forResponse()
                        .map(instructor, GetAllInstructorResponse.class)).collect(Collectors.toList());

        return instructorResponse;
    }

    @Override
    public GetByIdInstructorResponse getById(int id) {
        return null;
    }

    @Override
    public void add(CreateInstructorRequest createInstructorRequest) {
        Instructor instructor = this.modelMapperService.forRequest().map(createInstructorRequest, Instructor.class);
        this.instructorRepository.save(instructor);

    }

    @Override
    public void update(UpdateInstructorRequest updateInstructorRequest) {
        Instructor instructor = this.modelMapperService.forRequest().map(updateInstructorRequest, Instructor.class);
        this.instructorRepository.save(instructor);

    }

    @Override
    public void delete(int id) {
        this.instructorRepository.deleteById(id);

    }
}
