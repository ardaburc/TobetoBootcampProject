package tobeto.bootcampProject.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tobeto.bootcampProject.business.abstracts.ApplicantService;
import tobeto.bootcampProject.business.requests.CreateApplicantRequest;
import tobeto.bootcampProject.business.requests.UpdateApplicantRequest;
import tobeto.bootcampProject.business.responses.GetAllApplicantResponse;
import tobeto.bootcampProject.business.responses.GetByIdApplicantResponse;

import java.util.List;

@RestController
@RequestMapping("api/applicants")
@AllArgsConstructor
public class ApplicantController {
    private ApplicantService applicantService;

    @GetMapping()
    public List<GetAllApplicantResponse> getAll() {
        return applicantService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdApplicantResponse getById(@PathVariable int id) {

        return applicantService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateApplicantRequest createApplicantRequest) {
        this.applicantService.add(createApplicantRequest);

    }

    @PutMapping
    public void update(@RequestBody() UpdateApplicantRequest updateApplicantRequest) {

        applicantService.update(updateApplicantRequest);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.applicantService.delete(id);

    }


}
