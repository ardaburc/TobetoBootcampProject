package tobeto.bootcampProject.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tobeto.bootcampProject.business.abstracts.InstructorService;
import tobeto.bootcampProject.business.requests.CreateInstructorRequest;
import tobeto.bootcampProject.business.requests.UpdateInstructorRequest;
import tobeto.bootcampProject.business.responses.GetAllInstructorResponse;
import tobeto.bootcampProject.business.responses.GetByIdInstructorResponse;

import java.util.List;

@RestController
@RequestMapping("api/instructors")
@AllArgsConstructor
public class InstructorController {

    private InstructorService instructorService;

    @GetMapping()
    public List<GetAllInstructorResponse> getAll() {
        return instructorService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdInstructorResponse getById(@PathVariable int id) {

        return instructorService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreateInstructorRequest createInstructorRequest) {
        this.instructorService.add(createInstructorRequest);

    }

    @PutMapping
    public void update(UpdateInstructorRequest updateInstructorRequest) {

        this.instructorService.update(updateInstructorRequest);

    }

    @DeleteMapping("/{id}")
    public void delete(int id) {
        this.instructorService.delete(id);

    }
}
