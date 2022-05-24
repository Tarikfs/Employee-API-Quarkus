package br.com.vertigo.employee.exceptionhandler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.JsonMappingException;

@Provider
public class JsonMappingExceptionMapper extends ExceptionHandler<JsonMappingException> {

  @Override
  public Response toResponse(JsonMappingException exception) {
    log.error("JsonMappingExceptionMapper handle: ", exception);
    return super.createResponseError(Status.BAD_REQUEST, new ResponseError(exception.getMessage()));
  }
}
