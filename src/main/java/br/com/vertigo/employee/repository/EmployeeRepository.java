package br.com.vertigo.employee.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.vertigo.employee.model.EmployeeModel;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepositoryBase<EmployeeModel, Long> {

}
