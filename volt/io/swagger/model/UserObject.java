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

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-12T21:04:18.009216Z[Europe/Dublin]")
public class UserObject {
    @JsonProperty("userId")
    private Long userId = null;

    @JsonProperty("statusCode")
    private byte[] statusCode = null;

    public UserObject userId(Long userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     **/
    @JsonProperty("userId")
    @Schema(description = "")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserObject statusCode(byte[] statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get statusCode
     *
     * @return statusCode
     **/
    @JsonProperty("statusCode")
    @Schema(description = "")
    public byte[] getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(byte[] statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserObject userObject = (UserObject) o;
        return Objects.equals(this.userId, userObject.userId) && Objects.equals(this.statusCode, userObject.statusCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, statusCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserObject {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
