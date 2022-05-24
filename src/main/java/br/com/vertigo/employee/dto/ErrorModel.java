package br.com.vertigo.employee.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("errorModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ErrorModel implements Serializable {

  private static final long serialVersionUID = 1L;
  private @Valid String error;
  private @Valid String from;
  private @Valid String status;
  private @Valid LocalDateTime timeStamp;
  private @Valid String message;

  public ErrorModel(@Valid String error, @Valid String from, @Valid String status, @Valid LocalDateTime timeStamp,
      @Valid String message) {
    this.error = error;
    this.from = from;
    this.status = status;
    this.timeStamp = timeStamp;
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LocalDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(LocalDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /** */
  public ErrorModel error(String error) {
    this.error = error;
    return this;
  }

  @JsonProperty("error")
  public String getError() {
    return error;
  }

  @JsonProperty("error")
  public void setError(String error) {
    this.error = error;
  }

  /** */
  public ErrorModel from(String from) {
    this.from = from;
    return this;
  }

  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  @JsonProperty("from")
  public void setFrom(String from) {
    this.from = from;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.error, errorModel.error)
        && Objects.equals(this.from, errorModel.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, from);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");

    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");

  }
}
