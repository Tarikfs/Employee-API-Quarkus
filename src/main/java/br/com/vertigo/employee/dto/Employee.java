package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("Employee")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class Employee implements Serializable {

  private @Valid Long id;
  private @Valid String firstName;
  private @Valid String lastName;
  private @Valid String department;
  private @Valid String jobTitle;
  private @Valid String employeeType;
  private @Valid String status;
  private @Valid LocalDate startDate;
  private @Valid String email;

  /** minimum: 11 maximum: 14 */
  public Employee id(Long id) {
    this.id = id;
    return this;
  }

  @JsonProperty("id")
  @NotNull
  @Min(11)
  @Max(14)
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /** */
  public Employee firstName(String firstName) {
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
  public Employee lastName(String lastName) {
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
  public Employee department(String department) {
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
  public Employee jobTitle(String jobTitle) {
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
  public Employee employeeType(String employeeType) {
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
  public Employee status(String status) {
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
  public Employee startDate(LocalDate startDate) {
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
  public Employee email(String email) {
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
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id)
        && Objects.equals(this.firstName, employee.firstName)
        && Objects.equals(this.lastName, employee.lastName)
        && Objects.equals(this.department, employee.department)
        && Objects.equals(this.jobTitle, employee.jobTitle)
        && Objects.equals(this.employeeType, employee.employeeType)
        && Objects.equals(this.status, employee.status)
        && Objects.equals(this.startDate, employee.startDate)
        && Objects.equals(this.email, employee.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id, firstName, lastName, department, jobTitle, employeeType, status, startDate, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
