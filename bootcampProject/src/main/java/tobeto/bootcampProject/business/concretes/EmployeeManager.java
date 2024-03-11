package tobeto.bootcampProject.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tobeto.bootcampProject.business.abstracts.EmployeeService;
import tobeto.bootcampProject.business.requests.CreateEmployeeRequest;
import tobeto.bootcampProject.business.requests.UpdateEmployeeRequest;
import tobeto.bootcampProject.business.responses.GetAllEmployeeResponse;
import tobeto.bootcampProject.business.responses.GetByIdEmployeeResponse;
import tobeto.bootcampProject.core.utulities.mappers.ModelMapperService;
import tobeto.bootcampProject.dataAccess.abstracts.EmployeeRepository;
import tobeto.bootcampProject.entities.concretes.Employee;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllEmployeeResponse> getAll() {
        List<Employee> employees = employeeRepository.findAll();

        List<GetAllEmployeeResponse> employeesResponse = employees.stream()
                .map(employee -> this.modelMapperService.forResponse()
                        .map(employee, GetAllEmployeeResponse.class)).collect(Collectors.toList());

        return employeesResponse;

    }

    @Override
    public GetByIdEmployeeResponse getById(int id) {
        Employee employee = this.employeeRepository.findById(id).orElseThrow();

        GetByIdEmployeeResponse response = this.modelMapperService.forResponse().map(employee, GetByIdEmployeeResponse.class);
        return response;
    }

    @Override
    public void add(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = this.modelMapperService.forRequest().map(createEmployeeRequest, Employee.class);
        this.employeeRepository.save(employee);

    }

    @Override
    public void update(UpdateEmployeeRequest updateEmployeeRequest) {
        Employee employee = this.modelMapperService.forRequest().map(updateEmployeeRequest, Employee.class);
        this.employeeRepository.save(employee);

    }

    @Override
    public void delete(int id) {
        this.employeeRepository.deleteById(id);

    }
}
