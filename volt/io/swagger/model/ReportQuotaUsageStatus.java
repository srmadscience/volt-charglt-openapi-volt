/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ReportQuotaUsageStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-13T22:26:01.216867Z[Europe/Dublin]")
public class ReportQuotaUsageStatus   {
  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("balance")
  private Long balance = null;

  @JsonProperty("sessionId")
  private Long sessionId = null;

  @JsonProperty("currentlyAllocated")
  private Long currentlyAllocated = null;

  public ReportQuotaUsageStatus statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
   **/
  @JsonProperty("statusCode")
  @Schema(description = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ReportQuotaUsageStatus balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   **/
  @JsonProperty("balance")
  @Schema(description = "")
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public ReportQuotaUsageStatus sessionId(Long sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
   **/
  @JsonProperty("sessionId")
  @Schema(description = "")
  public Long getSessionId() {
    return sessionId;
  }

  public void setSessionId(Long sessionId) {
    this.sessionId = sessionId;
  }

  public ReportQuotaUsageStatus currentlyAllocated(Long currentlyAllocated) {
    this.currentlyAllocated = currentlyAllocated;
    return this;
  }

  /**
   * Get currentlyAllocated
   * @return currentlyAllocated
   **/
  @JsonProperty("currentlyAllocated")
  @Schema(description = "")
  public Long getCurrentlyAllocated() {
    return currentlyAllocated;
  }

  public void setCurrentlyAllocated(Long currentlyAllocated) {
    this.currentlyAllocated = currentlyAllocated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportQuotaUsageStatus reportQuotaUsageStatus = (ReportQuotaUsageStatus) o;
    return Objects.equals(this.statusCode, reportQuotaUsageStatus.statusCode) &&
        Objects.equals(this.balance, reportQuotaUsageStatus.balance) &&
        Objects.equals(this.sessionId, reportQuotaUsageStatus.sessionId) &&
        Objects.equals(this.currentlyAllocated, reportQuotaUsageStatus.currentlyAllocated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, balance, sessionId, currentlyAllocated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportQuotaUsageStatus {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    currentlyAllocated: ").append(toIndentedString(currentlyAllocated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
