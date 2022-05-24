package br.com.vertigo.employee.exceptionhandler;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.com.vertigo.employee.dto.ErrorModel;

@Provider
public class EmployeeNotFoundExceptionHandlerDois implements ExceptionMapper<EmployeeNotFoundException> {

    @Override
    public Response toResponse(EmployeeNotFoundException exception) {
        ErrorModel error = new ErrorModel(exception.getMessage(), "API", "404", LocalDateTime.now(), "ERROR");
        return Response.status(Status.NOT_FOUND).entity(error).build();
    }

}
