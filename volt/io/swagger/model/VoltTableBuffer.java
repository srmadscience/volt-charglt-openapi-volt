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
 * VoltTableBuffer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-12T21:04:18.009216Z[Europe/Dublin]")
public class VoltTableBuffer {
    @JsonProperty("short")
    private Integer _short = null;

    @JsonProperty("char")
    private String _char = null;

    @JsonProperty("int")
    private Integer _int = null;

    @JsonProperty("long")
    private Long _long = null;

    @JsonProperty("float")
    private Float _float = null;

    @JsonProperty("double")
    private Double _double = null;

    @JsonProperty("direct")
    private Boolean direct = null;

    @JsonProperty("readOnly")
    private Boolean readOnly = null;

    public VoltTableBuffer _short(Integer _short) {
        this._short = _short;
        return this;
    }

    /**
     * Get _short
     *
     * @return _short
     **/
    @JsonProperty("short")
    @Schema(description = "")
    public Integer getShort() {
        return _short;
    }

    public void setShort(Integer _short) {
        this._short = _short;
    }

    public VoltTableBuffer _char(String _char) {
        this._char = _char;
        return this;
    }

    /**
     * Get _char
     *
     * @return _char
     **/
    @JsonProperty("char")
    @Schema(description = "")
    public String getChar() {
        return _char;
    }

    public void setChar(String _char) {
        this._char = _char;
    }

    public VoltTableBuffer _int(Integer _int) {
        this._int = _int;
        return this;
    }

    /**
     * Get _int
     *
     * @return _int
     **/
    @JsonProperty("int")
    @Schema(description = "")
    public Integer getInt() {
        return _int;
    }

    public void setInt(Integer _int) {
        this._int = _int;
    }

    public VoltTableBuffer _long(Long _long) {
        this._long = _long;
        return this;
    }

    /**
     * Get _long
     *
     * @return _long
     **/
    @JsonProperty("long")
    @Schema(description = "")
    public Long getLong() {
        return _long;
    }

    public void setLong(Long _long) {
        this._long = _long;
    }

    public VoltTableBuffer _float(Float _float) {
        this._float = _float;
        return this;
    }

    /**
     * Get _float
     *
     * @return _float
     **/
    @JsonProperty("float")
    @Schema(description = "")
    public Float getFloat() {
        return _float;
    }

    public void setFloat(Float _float) {
        this._float = _float;
    }

    public VoltTableBuffer _double(Double _double) {
        this._double = _double;
        return this;
    }

    /**
     * Get _double
     *
     * @return _double
     **/
    @JsonProperty("double")
    @Schema(description = "")
    public Double getDouble() {
        return _double;
    }

    public void setDouble(Double _double) {
        this._double = _double;
    }

    public VoltTableBuffer direct(Boolean direct) {
        this.direct = direct;
        return this;
    }

    /**
     * Get direct
     *
     * @return direct
     **/
    @JsonProperty("direct")
    @Schema(description = "")
    public Boolean isDirect() {
        return direct;
    }

    public void setDirect(Boolean direct) {
        this.direct = direct;
    }

    public VoltTableBuffer readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get readOnly
     *
     * @return readOnly
     **/
    @JsonProperty("readOnly")
    @Schema(description = "")
    public Boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VoltTableBuffer voltTableBuffer = (VoltTableBuffer) o;
        return Objects.equals(this._short, voltTableBuffer._short) && Objects.equals(this._char, voltTableBuffer._char)
                && Objects.equals(this._int, voltTableBuffer._int) && Objects.equals(this._long, voltTableBuffer._long)
                && Objects.equals(this._float, voltTableBuffer._float)
                && Objects.equals(this._double, voltTableBuffer._double)
                && Objects.equals(this.direct, voltTableBuffer.direct)
                && Objects.equals(this.readOnly, voltTableBuffer.readOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_short, _char, _int, _long, _float, _double, direct, readOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoltTableBuffer {\n");

        sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
        sb.append("    _char: ").append(toIndentedString(_char)).append("\n");
        sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
        sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
        sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
        sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
        sb.append("    direct: ").append(toIndentedString(direct)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
