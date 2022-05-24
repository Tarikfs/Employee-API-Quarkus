package br.com.vertigo.employee.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import br.com.vertigo.employee.api.EmployeeApi;
import br.com.vertigo.employee.dto.EmployeeRegistration;
import br.com.vertigo.employee.model.EmployeeModel;
import br.com.vertigo.employee.service.EmployeeService;

@Path("/employee")
public class EmployeeController implements EmployeeApi {

    @Inject
    EmployeeService employeeService;

    // transformar employeemodel em employeedto
    @Override
    public Response employeeIdGet(Long id) {
        EmployeeModel employee = employeeService.employeeIdGet(id);
        return Response.status(200).entity(employee).build();
    }

    @Override
    public Response employeeIdPut(Long id, @Valid EmployeeRegistration employeeRegistration) {
        EmployeeModel employee = employeeService.employeeIdPut(id, employeeRegistration);
        return Response.status(201).entity(employee).build();
    }

    @Override
    public Response employeePost(@Valid @NotNull EmployeeRegistration employeeRegistration) {
        return Response.status(201).entity(employeeService.employeePost(employeeRegistration)).build();
    }

    @Override
    public Response employeeGet() {
        List<EmployeeModel> list = employeeService.employeeGet();
        return Response.status(200).entity(list).build();
    }

    @Override
    public Response employeeIdDelete(Long id) {
        employeeService.employeeIdDelete(id);
        return Response.noContent().build();
    }

}
