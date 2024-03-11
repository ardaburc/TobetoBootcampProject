package tobeto.bootcampProject.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tobeto.bootcampProject.business.abstracts.ApplicantService;
import tobeto.bootcampProject.business.requests.CreateApplicantRequest;
import tobeto.bootcampProject.business.requests.UpdateApplicantRequest;
import tobeto.bootcampProject.business.responses.GetAllApplicantResponse;
import tobeto.bootcampProject.business.responses.GetByIdApplicantResponse;
import tobeto.bootcampProject.core.utulities.mappers.ModelMapperService;
import tobeto.bootcampProject.dataAccess.abstracts.ApplicantRepository;
import tobeto.bootcampProject.entities.concretes.Applicant;

import java.util.List;
import java.util.stream.Collectors;

@Service //Bu sınıf bir business nesnesidir
@AllArgsConstructor
public class ApplicantManager implements ApplicantService {
    private ApplicantRepository applicantRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllApplicantResponse> getAll() {

        List<Applicant> applicants = applicantRepository.findAll();

        List<GetAllApplicantResponse> applicantsResponse = applicants.stream()
                .map(applicant -> this.modelMapperService.forResponse()
                        .map(applicant, GetAllApplicantResponse.class)).collect(Collectors.toList());

        return applicantsResponse;
    }

    @Override
    public GetByIdApplicantResponse getById(int id) {
        Applicant applicant = this.applicantRepository.findById(id).orElseThrow();

        GetByIdApplicantResponse response = this.modelMapperService.forResponse().map(applicant, GetByIdApplicantResponse.class);
        return response;
    }

    @Override
    public void add(CreateApplicantRequest createApplicantRequest) {
        Applicant applicant = this.modelMapperService.forRequest().map(createApplicantRequest, Applicant.class);
        this.applicantRepository.save(applicant);
    }

    @Override
    public void update(UpdateApplicantRequest updateApplicantRequest) {
        Applicant applicant = this.modelMapperService.forRequest().map(updateApplicantRequest, Applicant.class);
        this.applicantRepository.save(applicant);


    }

    @Override
    public void delete(int id) {
        this.applicantRepository.deleteById(id);

    }
}
