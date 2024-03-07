/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * CA configures this issuer to sign certificates using a signing CA keypair stored in a Secret resource. This is used to build internal PKIs that are managed by cert-manager.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ClusterIssuerSpecCa {
  public static final String SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS = "crlDistributionPoints";
  @SerializedName(SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS)
  private List<String> crlDistributionPoints;

  public static final String SERIALIZED_NAME_OCSP_SERVERS = "ocspServers";
  @SerializedName(SERIALIZED_NAME_OCSP_SERVERS)
  private List<String> ocspServers;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public V1ClusterIssuerSpecCa() {
  }

  public V1ClusterIssuerSpecCa crlDistributionPoints(List<String> crlDistributionPoints) {
    
    this.crlDistributionPoints = crlDistributionPoints;
    return this;
  }

  public V1ClusterIssuerSpecCa addCrlDistributionPointsItem(String crlDistributionPointsItem) {
    if (this.crlDistributionPoints == null) {
      this.crlDistributionPoints = new ArrayList<>();
    }
    this.crlDistributionPoints.add(crlDistributionPointsItem);
    return this;
  }

   /**
   * The CRL distribution points is an X.509 v3 certificate extension which identifies the location of the CRL from which the revocation of this certificate can be checked. If not set, certificates will be issued without distribution points set.
   * @return crlDistributionPoints
  **/
  @jakarta.annotation.Nullable
  public List<String> getCrlDistributionPoints() {
    return crlDistributionPoints;
  }


  public void setCrlDistributionPoints(List<String> crlDistributionPoints) {
    this.crlDistributionPoints = crlDistributionPoints;
  }


  public V1ClusterIssuerSpecCa ocspServers(List<String> ocspServers) {
    
    this.ocspServers = ocspServers;
    return this;
  }

  public V1ClusterIssuerSpecCa addOcspServersItem(String ocspServersItem) {
    if (this.ocspServers == null) {
      this.ocspServers = new ArrayList<>();
    }
    this.ocspServers.add(ocspServersItem);
    return this;
  }

   /**
   * The OCSP server list is an X.509 v3 extension that defines a list of URLs of OCSP responders. The OCSP responders can be queried for the revocation status of an issued certificate. If not set, the certificate will be issued with no OCSP servers set. For example, an OCSP server URL could be \&quot;http://ocsp.int-x3.letsencrypt.org\&quot;.
   * @return ocspServers
  **/
  @jakarta.annotation.Nullable
  public List<String> getOcspServers() {
    return ocspServers;
  }


  public void setOcspServers(List<String> ocspServers) {
    this.ocspServers = ocspServers;
  }


  public V1ClusterIssuerSpecCa secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * SecretName is the name of the secret used to sign Certificates issued by this Issuer.
   * @return secretName
  **/
  @jakarta.annotation.Nonnull
  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterIssuerSpecCa v1ClusterIssuerSpecCa = (V1ClusterIssuerSpecCa) o;
    return Objects.equals(this.crlDistributionPoints, v1ClusterIssuerSpecCa.crlDistributionPoints) &&
        Objects.equals(this.ocspServers, v1ClusterIssuerSpecCa.ocspServers) &&
        Objects.equals(this.secretName, v1ClusterIssuerSpecCa.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crlDistributionPoints, ocspServers, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterIssuerSpecCa {\n");
    sb.append("    crlDistributionPoints: ").append(toIndentedString(crlDistributionPoints)).append("\n");
    sb.append("    ocspServers: ").append(toIndentedString(ocspServers)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("crlDistributionPoints");
    openapiFields.add("ocspServers");
    openapiFields.add("secretName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("secretName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ClusterIssuerSpecCa
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ClusterIssuerSpecCa.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ClusterIssuerSpecCa is not found in the empty JSON string", V1ClusterIssuerSpecCa.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ClusterIssuerSpecCa.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ClusterIssuerSpecCa` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ClusterIssuerSpecCa.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("crlDistributionPoints") != null && !jsonObj.get("crlDistributionPoints").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `crlDistributionPoints` to be an array in the JSON string but got `%s`", jsonObj.get("crlDistributionPoints").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ocspServers") != null && !jsonObj.get("ocspServers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ocspServers` to be an array in the JSON string but got `%s`", jsonObj.get("ocspServers").toString()));
      }
      if (!jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ClusterIssuerSpecCa.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ClusterIssuerSpecCa' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ClusterIssuerSpecCa> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ClusterIssuerSpecCa.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ClusterIssuerSpecCa>() {
           @Override
           public void write(JsonWriter out, V1ClusterIssuerSpecCa value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ClusterIssuerSpecCa read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ClusterIssuerSpecCa given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ClusterIssuerSpecCa
  * @throws IOException if the JSON string is invalid with respect to V1ClusterIssuerSpecCa
  */
  public static V1ClusterIssuerSpecCa fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ClusterIssuerSpecCa.class);
  }

 /**
  * Convert an instance of V1ClusterIssuerSpecCa to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
