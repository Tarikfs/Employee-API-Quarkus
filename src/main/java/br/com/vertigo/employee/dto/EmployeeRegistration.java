package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("EmployeeRegistration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class EmployeeRegistration implements Serializable {

  private @Valid String firstName;
  private @Valid String lastName;
  private @Valid String department;
  private @Valid String jobTitle;
  private @Valid String employeeType;
  private @Valid String status;
  private @Valid LocalDate startDate;
  private @Valid String email;

  /** */
  public EmployeeRegistration firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  @JsonProperty("first_name")
  @NotNull
  @Size(min = 1, max = 45)
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("first_name")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /** */
  public EmployeeRegistration lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  @JsonProperty("last_name")
  @NotNull
  @Size(min = 1, max = 45)
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("last_name")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /** */
  public EmployeeRegistration department(String department) {
    this.department = department;
    return this;
  }

  @JsonProperty("department")
  @NotNull
  @Size(min = 1, max = 45)
  public String getDepartment() {
    return department;
  }

  @JsonProperty("department")
  public void setDepartment(String department) {
    this.department = department;
  }

  /** */
  public EmployeeRegistration jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  @JsonProperty("job_title")
  @NotNull
  @Size(min = 1, max = 45)
  public String getJobTitle() {
    return jobTitle;
  }

  @JsonProperty("job_title")
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  /** */
  public EmployeeRegistration employeeType(String employeeType) {
    this.employeeType = employeeType;
    return this;
  }

  @JsonProperty("employee_type")
  @NotNull
  @Size(min = 1, max = 45)
  public String getEmployeeType() {
    return employeeType;
  }

  @JsonProperty("employee_type")
  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  /** */
  public EmployeeRegistration status(String status) {
    this.status = status;
    return this;
  }

  @JsonProperty("status")
  @NotNull
  @Size(min = 1, max = 45)
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  /** */
  public EmployeeRegistration startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  @JsonProperty("start_date")
  @NotNull
  public LocalDate getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /** */
  public EmployeeRegistration email(String email) {
    this.email = email;
    return this;
  }

  @JsonProperty("email")
  @NotNull
  @Size(min = 1, max = 45)
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeRegistration employeeRegistration = (EmployeeRegistration) o;
    return Objects.equals(this.firstName, employeeRegistration.firstName)
        && Objects.equals(this.lastName, employeeRegistration.lastName)
        && Objects.equals(this.department, employeeRegistration.department)
        && Objects.equals(this.jobTitle, employeeRegistration.jobTitle)
        && Objects.equals(this.employeeType, employeeRegistration.employeeType)
        && Objects.equals(this.status, employeeRegistration.status)
        && Objects.equals(this.startDate, employeeRegistration.startDate)
        && Objects.equals(this.email, employeeRegistration.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstName, lastName, department, jobTitle, employeeType, status, startDate, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeRegistration {\n");

    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
