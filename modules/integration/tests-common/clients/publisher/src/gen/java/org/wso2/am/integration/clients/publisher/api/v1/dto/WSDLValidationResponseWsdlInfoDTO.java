/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.publisher.api.v1.dto.WSDLValidationResponseWsdlInfoEndpointsDTO;

/**
 * Summary of the WSDL including the basic information
 */
@ApiModel(description = "Summary of the WSDL including the basic information")

public class WSDLValidationResponseWsdlInfoDTO {
  @SerializedName("version")
  private String version = null;

  @SerializedName("endpoints")
  private List<WSDLValidationResponseWsdlInfoEndpointsDTO> endpoints = null;

  public WSDLValidationResponseWsdlInfoDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * WSDL version 
   * @return version
  **/
  @ApiModelProperty(example = "1.1", value = "WSDL version ")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public WSDLValidationResponseWsdlInfoDTO endpoints(List<WSDLValidationResponseWsdlInfoEndpointsDTO> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public WSDLValidationResponseWsdlInfoDTO addEndpointsItem(WSDLValidationResponseWsdlInfoEndpointsDTO endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * A list of endpoints the service exposes 
   * @return endpoints
  **/
  @ApiModelProperty(value = "A list of endpoints the service exposes ")
  public List<WSDLValidationResponseWsdlInfoEndpointsDTO> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<WSDLValidationResponseWsdlInfoEndpointsDTO> endpoints) {
    this.endpoints = endpoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WSDLValidationResponseWsdlInfoDTO wsDLValidationResponseWsdlInfo = (WSDLValidationResponseWsdlInfoDTO) o;
    return Objects.equals(this.version, wsDLValidationResponseWsdlInfo.version) &&
        Objects.equals(this.endpoints, wsDLValidationResponseWsdlInfo.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, endpoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WSDLValidationResponseWsdlInfoDTO {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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

