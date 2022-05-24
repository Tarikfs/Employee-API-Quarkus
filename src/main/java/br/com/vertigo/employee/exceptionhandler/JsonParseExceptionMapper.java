package br.com.vertigo.employee.exceptionhandler;

import com.fasterxml.jackson.core.JsonParseException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

@Provider
public class JsonParseExceptionMapper extends ExceptionHandler<JsonParseException> {

  @Override
  public Response toResponse(JsonParseException exception) {
    log.error("JsonParseException handle: ", exception);
    return super.createResponseError(Status.BAD_REQUEST, new ResponseError(exception.getMessage()));
  }
}
