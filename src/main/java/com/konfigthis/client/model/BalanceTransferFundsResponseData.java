/*
 * Coinprofile business API
 * Coinprofile business API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

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
import java.time.LocalDate;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * BalanceTransferFundsResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BalanceTransferFundsResponseData {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  /**
   * Gets or Sets fromCurrency
   */
  @JsonAdapter(FromCurrencyEnum.Adapter.class)
 public enum FromCurrencyEnum {
    NGN("NGN"),
    
    USD("USD");

    private String value;

    FromCurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FromCurrencyEnum fromValue(String value) {
      for (FromCurrencyEnum b : FromCurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FromCurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FromCurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FromCurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FromCurrencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FROM_CURRENCY = "fromCurrency";
  @SerializedName(SERIALIZED_NAME_FROM_CURRENCY)
  private FromCurrencyEnum fromCurrency;

  public static final String SERIALIZED_NAME_RECEIVE_AMOUNT = "receiveAmount";
  @SerializedName(SERIALIZED_NAME_RECEIVE_AMOUNT)
  private String receiveAmount;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_SENDER_PREVBALANCE = "senderPrevbalance";
  @SerializedName(SERIALIZED_NAME_SENDER_PREVBALANCE)
  private String senderPrevbalance;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    FULLFILED("fullfiled"),
    
    PROCESSING("processing"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * Gets or Sets toCurrency
   */
  @JsonAdapter(ToCurrencyEnum.Adapter.class)
 public enum ToCurrencyEnum {
    NGN("NGN"),
    
    USD("USD");

    private String value;

    ToCurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ToCurrencyEnum fromValue(String value) {
      for (ToCurrencyEnum b : ToCurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ToCurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ToCurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ToCurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ToCurrencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TO_CURRENCY = "toCurrency";
  @SerializedName(SERIALIZED_NAME_TO_CURRENCY)
  private ToCurrencyEnum toCurrency;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public BalanceTransferFundsResponseData() {
  }

  public BalanceTransferFundsResponseData amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public BalanceTransferFundsResponseData date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public BalanceTransferFundsResponseData fromCurrency(FromCurrencyEnum fromCurrency) {
    
    
    
    
    this.fromCurrency = fromCurrency;
    return this;
  }

   /**
   * Get fromCurrency
   * @return fromCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FromCurrencyEnum getFromCurrency() {
    return fromCurrency;
  }


  public void setFromCurrency(FromCurrencyEnum fromCurrency) {
    
    
    
    this.fromCurrency = fromCurrency;
  }


  public BalanceTransferFundsResponseData receiveAmount(String receiveAmount) {
    
    
    
    
    this.receiveAmount = receiveAmount;
    return this;
  }

   /**
   * Get receiveAmount
   * @return receiveAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReceiveAmount() {
    return receiveAmount;
  }


  public void setReceiveAmount(String receiveAmount) {
    
    
    
    this.receiveAmount = receiveAmount;
  }


  public BalanceTransferFundsResponseData sender(String sender) {
    
    
    
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    
    
    
    this.sender = sender;
  }


  public BalanceTransferFundsResponseData senderPrevbalance(String senderPrevbalance) {
    
    
    
    
    this.senderPrevbalance = senderPrevbalance;
    return this;
  }

   /**
   * Get senderPrevbalance
   * @return senderPrevbalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSenderPrevbalance() {
    return senderPrevbalance;
  }


  public void setSenderPrevbalance(String senderPrevbalance) {
    
    
    
    this.senderPrevbalance = senderPrevbalance;
  }


  public BalanceTransferFundsResponseData status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public BalanceTransferFundsResponseData toCurrency(ToCurrencyEnum toCurrency) {
    
    
    
    
    this.toCurrency = toCurrency;
    return this;
  }

   /**
   * Get toCurrency
   * @return toCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ToCurrencyEnum getToCurrency() {
    return toCurrency;
  }


  public void setToCurrency(ToCurrencyEnum toCurrency) {
    
    
    
    this.toCurrency = toCurrency;
  }


  public BalanceTransferFundsResponseData transactionId(String transactionId) {
    
    
    
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    
    
    
    this.transactionId = transactionId;
  }


  public BalanceTransferFundsResponseData username(String username) {
    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    
    
    this.username = username;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BalanceTransferFundsResponseData instance itself
   */
  public BalanceTransferFundsResponseData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceTransferFundsResponseData balanceTransferFundsResponseData = (BalanceTransferFundsResponseData) o;
    return Objects.equals(this.amount, balanceTransferFundsResponseData.amount) &&
        Objects.equals(this.date, balanceTransferFundsResponseData.date) &&
        Objects.equals(this.fromCurrency, balanceTransferFundsResponseData.fromCurrency) &&
        Objects.equals(this.receiveAmount, balanceTransferFundsResponseData.receiveAmount) &&
        Objects.equals(this.sender, balanceTransferFundsResponseData.sender) &&
        Objects.equals(this.senderPrevbalance, balanceTransferFundsResponseData.senderPrevbalance) &&
        Objects.equals(this.status, balanceTransferFundsResponseData.status) &&
        Objects.equals(this.toCurrency, balanceTransferFundsResponseData.toCurrency) &&
        Objects.equals(this.transactionId, balanceTransferFundsResponseData.transactionId) &&
        Objects.equals(this.username, balanceTransferFundsResponseData.username)&&
        Objects.equals(this.additionalProperties, balanceTransferFundsResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, date, fromCurrency, receiveAmount, sender, senderPrevbalance, status, toCurrency, transactionId, username, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceTransferFundsResponseData {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fromCurrency: ").append(toIndentedString(fromCurrency)).append("\n");
    sb.append("    receiveAmount: ").append(toIndentedString(receiveAmount)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    senderPrevbalance: ").append(toIndentedString(senderPrevbalance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    toCurrency: ").append(toIndentedString(toCurrency)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("date");
    openapiFields.add("fromCurrency");
    openapiFields.add("receiveAmount");
    openapiFields.add("sender");
    openapiFields.add("senderPrevbalance");
    openapiFields.add("status");
    openapiFields.add("toCurrency");
    openapiFields.add("transactionId");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BalanceTransferFundsResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BalanceTransferFundsResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceTransferFundsResponseData is not found in the empty JSON string", BalanceTransferFundsResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("fromCurrency") != null && !jsonObj.get("fromCurrency").isJsonNull()) && !jsonObj.get("fromCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromCurrency").toString()));
      }
      if ((jsonObj.get("receiveAmount") != null && !jsonObj.get("receiveAmount").isJsonNull()) && !jsonObj.get("receiveAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiveAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiveAmount").toString()));
      }
      if ((jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
      if ((jsonObj.get("senderPrevbalance") != null && !jsonObj.get("senderPrevbalance").isJsonNull()) && !jsonObj.get("senderPrevbalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderPrevbalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderPrevbalance").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("toCurrency") != null && !jsonObj.get("toCurrency").isJsonNull()) && !jsonObj.get("toCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toCurrency").toString()));
      }
      if ((jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonNull()) && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceTransferFundsResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceTransferFundsResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceTransferFundsResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceTransferFundsResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceTransferFundsResponseData>() {
           @Override
           public void write(JsonWriter out, BalanceTransferFundsResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceTransferFundsResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BalanceTransferFundsResponseData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BalanceTransferFundsResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalanceTransferFundsResponseData
  * @throws IOException if the JSON string is invalid with respect to BalanceTransferFundsResponseData
  */
  public static BalanceTransferFundsResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceTransferFundsResponseData.class);
  }

 /**
  * Convert an instance of BalanceTransferFundsResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

