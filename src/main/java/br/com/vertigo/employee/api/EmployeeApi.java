package br.com.vertigo.employee.api;

import br.com.vertigo.employee.dto.EmployeeRegistration;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/employee")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface EmployeeApi {

  @GET
  @Produces({"application/json", "aplication/json"})
  Response employeeGet();

  @DELETE
  @Path("/{id}")
  @Produces({"aplication/json"})
  Response employeeIdDelete(@PathParam("id") Long id);

  @GET
  @Path("/{id}")
  @Produces({"application/json", "aplication/json"})
  Response employeeIdGet(@PathParam("id") Long id);

  @PUT
  @Path("/{id}")
  @Consumes({"application/json"})
  @Produces({"application/json", "aplication/json"})
  Response employeeIdPut(
      @PathParam("id") Long id, @Valid EmployeeRegistration employeeRegistration);

  @POST
  @Consumes({"application/json"})
  @Produces({"application/json", "aplication/json"})
  Response employeePost(@Valid @NotNull EmployeeRegistration employeeRegistration);
}
