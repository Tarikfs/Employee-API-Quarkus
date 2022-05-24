package br.com.vertigo.employee.exceptionhandler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

// @Provider
public class EmployeeNotFoundExceptionHandler extends ExceptionHandler<EmployeeNotFoundException> {

    @Override
    public Response toResponse(EmployeeNotFoundException exception) {
        log.error("employeeNotFoundException handle: ", exception);
        return super.createResponseError(Status.NOT_FOUND, new ResponseError(exception.getMessage()));
    }

}
