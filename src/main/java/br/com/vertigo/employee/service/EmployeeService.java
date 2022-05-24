package br.com.vertigo.employee.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.vertigo.employee.dto.EmployeeRegistration;
import br.com.vertigo.employee.exceptionhandler.EmployeeNotFoundException;
import br.com.vertigo.employee.model.EmployeeModel;
import br.com.vertigo.employee.repository.EmployeeRepository;

@ApplicationScoped
public class EmployeeService {

  @Inject
  EmployeeRepository employeeRepository;

  public List<EmployeeModel> employeeGet() {
    return employeeRepository.listAll();
  }

  @Transactional
  public void employeeIdDelete(Long id) {
    if (employeeRepository.findById(id) != null) {
      employeeRepository.deleteById(id);
    } else {
      throw new EmployeeNotFoundException();
    }
  }

  public EmployeeModel employeeIdGet(Long id) {
    EmployeeModel employee = employeeRepository.findById(id);
    if (employee != null) {
      return employee;
    } else {
      throw new EmployeeNotFoundException();
    }
  }

  public EmployeeModel employeeIdPut(Long id, EmployeeRegistration employeeRegistration) {
    EmployeeModel employee = employeeRepository.findById(id);
    if (employee != null) {
      employee.setFirstName(employeeRegistration.getFirstName());
      employee.setLastName(employeeRegistration.getLastName());
      employee.setJobTitle(employeeRegistration.getJobTitle());
      employee.setDepartment(employeeRegistration.getDepartment());
      employee.setEmail(employeeRegistration.getEmail());
      employee.setEmployeeType(employeeRegistration.getEmployeeType());
      employee.setStartDate(employeeRegistration.getStartDate());
      employee.setStatus(employeeRegistration.getStatus());
      employee.setEmployeeType(employeeRegistration.getEmployeeType());
      employeeRepository.persist(employee);
      return employee;
    } else {
      throw new Error("not found");
    }
  }

  @Transactional
  public EmployeeModel employeePost(EmployeeRegistration employee) {
    EmployeeModel model = new EmployeeModel();
    model.setFirstName(employee.getFirstName());
    model.setLastName(employee.getLastName());
    model.setJobTitle(employee.getJobTitle());
    model.setDepartment(employee.getDepartment());
    model.setEmail(employee.getEmail());
    model.setEmployeeType(employee.getEmployeeType());
    model.setStartDate(employee.getStartDate());
    model.setStatus(employee.getStatus());
    model.setEmployeeType(employee.getEmployeeType());
    employeeRepository.persist(model);
    return model;
  }

}
