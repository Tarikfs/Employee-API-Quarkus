package br.com.vertigo.employee.exceptionhandler;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException() {
        super("Employee not found");
    }

}
