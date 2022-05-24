package br.com.vertigo.employee.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("NotFoundModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class NotFoundModel implements Serializable {

  private @Valid String error;
  private @Valid String from;

  /** */
  public NotFoundModel error(String error) {
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
  public NotFoundModel from(String from) {
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
    NotFoundModel notFoundModel = (NotFoundModel) o;
    return Objects.equals(this.error, notFoundModel.error)
        && Objects.equals(this.from, notFoundModel.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, from);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFoundModel {\n");

    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
