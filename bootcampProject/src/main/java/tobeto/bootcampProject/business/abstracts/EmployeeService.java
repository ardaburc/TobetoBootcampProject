package tobeto.bootcampProject.business.abstracts;



import tobeto.bootcampProject.business.requests.CreateEmployeeRequest;
import tobeto.bootcampProject.business.requests.UpdateEmployeeRequest;
import tobeto.bootcampProject.business.responses.GetAllEmployeeResponse;
import tobeto.bootcampProject.business.responses.GetByIdEmployeeResponse;


import java.util.List;

public interface EmployeeService {

    List<GetAllEmployeeResponse> getAll();

    GetByIdEmployeeResponse getById(int id);

    void add(CreateEmployeeRequest createEmployeeRequest);

    void update(UpdateEmployeeRequest updateEmployeeRequest);

    void delete(int id);
}
