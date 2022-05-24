package br.com.vertigo.employee.exceptionhandler;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import br.com.vertigo.employee.dto.ErrorModel;

@Provider
public class GenericExceptionMapper extends ExceptionHandler<Exception> {

  @Override
  public Response toResponse(Exception exception) {
    log.error("GenericExceptionMapper handle: ", exception);
    return super.createResponseError(
        Status.INTERNAL_SERVER_ERROR, new ResponseError(new ErrorModel(exception.getMessage(), "From Employee API", "Status", LocalDateTime.now(), "mensagem")));
  }
}
