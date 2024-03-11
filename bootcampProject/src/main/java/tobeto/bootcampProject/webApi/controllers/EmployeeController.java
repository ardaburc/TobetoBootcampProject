package tobeto.bootcampProject.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tobeto.bootcampProject.business.abstracts.EmployeeService;
import tobeto.bootcampProject.business.requests.CreateEmployeeRequest;
import tobeto.bootcampProject.business.requests.UpdateEmployeeRequest;
import tobeto.bootcampProject.business.responses.GetAllEmployeeResponse;
import tobeto.bootcampProject.business.responses.GetByIdEmployeeResponse;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping()
    public List<GetAllEmployeeResponse> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdEmployeeResponse getById(@PathVariable int id) {

        return employeeService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreateEmployeeRequest createEmployeeRequest) {
        this.employeeService.add(createEmployeeRequest);

    }

    @PutMapping
    public void update(UpdateEmployeeRequest updateEmployeeRequest) {

        this.employeeService.update(updateEmployeeRequest);

    }

    @DeleteMapping("/{id}")
    public void delete(int id) {
        this.employeeService.delete(id);

    }

}
