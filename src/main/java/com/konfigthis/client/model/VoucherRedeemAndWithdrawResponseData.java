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
 * VoucherRedeemAndWithdrawResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VoucherRedeemAndWithdrawResponseData {
  public static final String SERIALIZED_NAME_CONVERTED_VOUCHER_FEE = "convertedVoucherFee";
  @SerializedName(SERIALIZED_NAME_CONVERTED_VOUCHER_FEE)
  private Double convertedVoucherFee;

  public static final String SERIALIZED_NAME_CONVERTED_VOUCHER_FEE_CURRENCY = "convertedVoucherFeeCurrency";
  @SerializedName(SERIALIZED_NAME_CONVERTED_VOUCHER_FEE_CURRENCY)
  private String convertedVoucherFeeCurrency;

  public static final String SERIALIZED_NAME_CREDIT_CURRENCY = "creditCurrency";
  @SerializedName(SERIALIZED_NAME_CREDIT_CURRENCY)
  private String creditCurrency;

  public static final String SERIALIZED_NAME_CURRENT_BALANCE = "currentBalance";
  @SerializedName(SERIALIZED_NAME_CURRENT_BALANCE)
  private Double currentBalance;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  /**
   * The bearer of voucher fee
   */
  @JsonAdapter(FeeBearerEnum.Adapter.class)
 public enum FeeBearerEnum {
    MERCHANT("merchant"),
    
    CLIENT("client");

    private String value;

    FeeBearerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeeBearerEnum fromValue(String value) {
      for (FeeBearerEnum b : FeeBearerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeeBearerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeBearerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeBearerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeBearerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_BEARER = "feeBearer";
  @SerializedName(SERIALIZED_NAME_FEE_BEARER)
  private FeeBearerEnum feeBearer;

  public static final String SERIALIZED_NAME_FROM_AMOUNT = "fromAmount";
  @SerializedName(SERIALIZED_NAME_FROM_AMOUNT)
  private Double fromAmount;

  public static final String SERIALIZED_NAME_FROM_CURRENCY = "fromCurrency";
  @SerializedName(SERIALIZED_NAME_FROM_CURRENCY)
  private String fromCurrency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_MERCHANT_FEE = "merchantFee";
  @SerializedName(SERIALIZED_NAME_MERCHANT_FEE)
  private Double merchantFee;

  public static final String SERIALIZED_NAME_PREVIOUS_BALANCE = "previousBalance";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BALANCE)
  private Double previousBalance;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "toAccount";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private String toAccount;

  public static final String SERIALIZED_NAME_TO_AMOUNT = "toAmount";
  @SerializedName(SERIALIZED_NAME_TO_AMOUNT)
  private Double toAmount;

  public static final String SERIALIZED_NAME_TO_CURRENCY = "toCurrency";
  @SerializedName(SERIALIZED_NAME_TO_CURRENCY)
  private String toCurrency;

  public static final String SERIALIZED_NAME_VOUCHER_CODE = "voucherCode";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODE)
  private String voucherCode;

  public static final String SERIALIZED_NAME_VOUCHER_FEE = "voucherFee";
  @SerializedName(SERIALIZED_NAME_VOUCHER_FEE)
  private Double voucherFee;

  public static final String SERIALIZED_NAME_WITHDRAWAL_FEE = "withdrawalFee";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL_FEE)
  private Double withdrawalFee;

  public VoucherRedeemAndWithdrawResponseData() {
  }

  public VoucherRedeemAndWithdrawResponseData convertedVoucherFee(Double convertedVoucherFee) {
    
    
    
    
    this.convertedVoucherFee = convertedVoucherFee;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData convertedVoucherFee(Integer convertedVoucherFee) {
    
    
    
    
    this.convertedVoucherFee = convertedVoucherFee.doubleValue();
    return this;
  }

   /**
   * Voucher fee in the outgoing currency
   * @return convertedVoucherFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Voucher fee in the outgoing currency")

  public Double getConvertedVoucherFee() {
    return convertedVoucherFee;
  }


  public void setConvertedVoucherFee(Double convertedVoucherFee) {
    
    
    
    this.convertedVoucherFee = convertedVoucherFee;
  }


  public VoucherRedeemAndWithdrawResponseData convertedVoucherFeeCurrency(String convertedVoucherFeeCurrency) {
    
    
    
    
    this.convertedVoucherFeeCurrency = convertedVoucherFeeCurrency;
    return this;
  }

   /**
   * The same as toCurrency
   * @return convertedVoucherFeeCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The same as toCurrency")

  public String getConvertedVoucherFeeCurrency() {
    return convertedVoucherFeeCurrency;
  }


  public void setConvertedVoucherFeeCurrency(String convertedVoucherFeeCurrency) {
    
    
    
    this.convertedVoucherFeeCurrency = convertedVoucherFeeCurrency;
  }


  public VoucherRedeemAndWithdrawResponseData creditCurrency(String creditCurrency) {
    
    
    
    
    this.creditCurrency = creditCurrency;
    return this;
  }

   /**
   * Merchant&#39;s balance currency
   * @return creditCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant's balance currency")

  public String getCreditCurrency() {
    return creditCurrency;
  }


  public void setCreditCurrency(String creditCurrency) {
    
    
    
    this.creditCurrency = creditCurrency;
  }


  public VoucherRedeemAndWithdrawResponseData currentBalance(Double currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData currentBalance(Integer currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance.doubleValue();
    return this;
  }

   /**
   * Merchant&#39;s balance after redeeming voucher
   * @return currentBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant's balance after redeeming voucher")

  public Double getCurrentBalance() {
    return currentBalance;
  }


  public void setCurrentBalance(Double currentBalance) {
    
    
    
    this.currentBalance = currentBalance;
  }


  public VoucherRedeemAndWithdrawResponseData email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Email that aws used to create the voucher
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email that aws used to create the voucher")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public VoucherRedeemAndWithdrawResponseData feeBearer(FeeBearerEnum feeBearer) {
    
    
    
    
    this.feeBearer = feeBearer;
    return this;
  }

   /**
   * The bearer of voucher fee
   * @return feeBearer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bearer of voucher fee")

  public FeeBearerEnum getFeeBearer() {
    return feeBearer;
  }


  public void setFeeBearer(FeeBearerEnum feeBearer) {
    
    
    
    this.feeBearer = feeBearer;
  }


  public VoucherRedeemAndWithdrawResponseData fromAmount(Double fromAmount) {
    
    
    
    
    this.fromAmount = fromAmount;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData fromAmount(Integer fromAmount) {
    
    
    
    
    this.fromAmount = fromAmount.doubleValue();
    return this;
  }

   /**
   * Voucher payment amount.
   * @return fromAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Voucher payment amount.")

  public Double getFromAmount() {
    return fromAmount;
  }


  public void setFromAmount(Double fromAmount) {
    
    
    
    this.fromAmount = fromAmount;
  }


  public VoucherRedeemAndWithdrawResponseData fromCurrency(String fromCurrency) {
    
    
    
    
    this.fromCurrency = fromCurrency;
    return this;
  }

   /**
   * voucher payment currency
   * @return fromCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "voucher payment currency")

  public String getFromCurrency() {
    return fromCurrency;
  }


  public void setFromCurrency(String fromCurrency) {
    
    
    
    this.fromCurrency = fromCurrency;
  }


  public VoucherRedeemAndWithdrawResponseData id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Voucher ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Voucher ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public VoucherRedeemAndWithdrawResponseData merchant(String merchant) {
    
    
    
    
    this.merchant = merchant;
    return this;
  }

   /**
   * username of the merchant that created the voucher
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "username of the merchant that created the voucher")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    
    
    
    this.merchant = merchant;
  }


  public VoucherRedeemAndWithdrawResponseData merchantFee(Double merchantFee) {
    
    
    
    
    this.merchantFee = merchantFee;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData merchantFee(Integer merchantFee) {
    
    
    
    
    this.merchantFee = merchantFee.doubleValue();
    return this;
  }

   /**
   * This can be optionally provided by the merchant in the request if they want some of the received amount to be added to their Ventogram balance.
   * @return merchantFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This can be optionally provided by the merchant in the request if they want some of the received amount to be added to their Ventogram balance.")

  public Double getMerchantFee() {
    return merchantFee;
  }


  public void setMerchantFee(Double merchantFee) {
    
    
    
    this.merchantFee = merchantFee;
  }


  public VoucherRedeemAndWithdrawResponseData previousBalance(Double previousBalance) {
    
    
    
    
    this.previousBalance = previousBalance;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData previousBalance(Integer previousBalance) {
    
    
    
    
    this.previousBalance = previousBalance.doubleValue();
    return this;
  }

   /**
   * Merchant&#39;s balance before redeeming voucher
   * @return previousBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant's balance before redeeming voucher")

  public Double getPreviousBalance() {
    return previousBalance;
  }


  public void setPreviousBalance(Double previousBalance) {
    
    
    
    this.previousBalance = previousBalance;
  }


  public VoucherRedeemAndWithdrawResponseData rate(Double rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData rate(Integer rate) {
    
    
    
    
    this.rate = rate.doubleValue();
    return this;
  }

   /**
   * The exchange rate that was used for conversion (if applicable) at the time of redeeming the voucher. If there&#39;s no conversion, the value is 1.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The exchange rate that was used for conversion (if applicable) at the time of redeeming the voucher. If there's no conversion, the value is 1.")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    
    
    
    this.rate = rate;
  }


  public VoucherRedeemAndWithdrawResponseData reference(String reference) {
    
    
    
    
    this.reference = reference;
    return this;
  }

   /**
   * This is basically a unique id
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is basically a unique id")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    
    
    
    this.reference = reference;
  }


  public VoucherRedeemAndWithdrawResponseData toAccount(String toAccount) {
    
    
    
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * The crypto wallet address to which asset was transferred
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The crypto wallet address to which asset was transferred")

  public String getToAccount() {
    return toAccount;
  }


  public void setToAccount(String toAccount) {
    
    
    
    this.toAccount = toAccount;
  }


  public VoucherRedeemAndWithdrawResponseData toAmount(Double toAmount) {
    
    
    
    
    this.toAmount = toAmount;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData toAmount(Integer toAmount) {
    
    
    
    
    this.toAmount = toAmount.doubleValue();
    return this;
  }

   /**
   * The amount that was sent to user wallet address.
   * @return toAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount that was sent to user wallet address.")

  public Double getToAmount() {
    return toAmount;
  }


  public void setToAmount(Double toAmount) {
    
    
    
    this.toAmount = toAmount;
  }


  public VoucherRedeemAndWithdrawResponseData toCurrency(String toCurrency) {
    
    
    
    
    this.toCurrency = toCurrency;
    return this;
  }

   /**
   * The currency that was sent to user wallet.
   * @return toCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency that was sent to user wallet.")

  public String getToCurrency() {
    return toCurrency;
  }


  public void setToCurrency(String toCurrency) {
    
    
    
    this.toCurrency = toCurrency;
  }


  public VoucherRedeemAndWithdrawResponseData voucherCode(String voucherCode) {
    
    
    
    
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * Voucher code to be redeemed
   * @return voucherCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Voucher code to be redeemed")

  public String getVoucherCode() {
    return voucherCode;
  }


  public void setVoucherCode(String voucherCode) {
    
    
    
    this.voucherCode = voucherCode;
  }


  public VoucherRedeemAndWithdrawResponseData voucherFee(Double voucherFee) {
    
    
    
    
    this.voucherFee = voucherFee;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData voucherFee(Integer voucherFee) {
    
    
    
    
    this.voucherFee = voucherFee.doubleValue();
    return this;
  }

   /**
   * The fee associated with voucher in the payment currency. This will be deducted from merchant&#39;s balance if merchant is the fee bearer.
   * @return voucherFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fee associated with voucher in the payment currency. This will be deducted from merchant's balance if merchant is the fee bearer.")

  public Double getVoucherFee() {
    return voucherFee;
  }


  public void setVoucherFee(Double voucherFee) {
    
    
    
    this.voucherFee = voucherFee;
  }


  public VoucherRedeemAndWithdrawResponseData withdrawalFee(Double withdrawalFee) {
    
    
    
    
    this.withdrawalFee = withdrawalFee;
    return this;
  }

  public VoucherRedeemAndWithdrawResponseData withdrawalFee(Integer withdrawalFee) {
    
    
    
    
    this.withdrawalFee = withdrawalFee.doubleValue();
    return this;
  }

   /**
   * The processing fee for the crypto transfer that will be deducted from the merchant&#39;s account. Merchants must maintain a sufficient balance to utilize the redeem-and-withdraw endpoint.
   * @return withdrawalFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processing fee for the crypto transfer that will be deducted from the merchant's account. Merchants must maintain a sufficient balance to utilize the redeem-and-withdraw endpoint.")

  public Double getWithdrawalFee() {
    return withdrawalFee;
  }


  public void setWithdrawalFee(Double withdrawalFee) {
    
    
    
    this.withdrawalFee = withdrawalFee;
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
   * @return the VoucherRedeemAndWithdrawResponseData instance itself
   */
  public VoucherRedeemAndWithdrawResponseData putAdditionalProperty(String key, Object value) {
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
    VoucherRedeemAndWithdrawResponseData voucherRedeemAndWithdrawResponseData = (VoucherRedeemAndWithdrawResponseData) o;
    return Objects.equals(this.convertedVoucherFee, voucherRedeemAndWithdrawResponseData.convertedVoucherFee) &&
        Objects.equals(this.convertedVoucherFeeCurrency, voucherRedeemAndWithdrawResponseData.convertedVoucherFeeCurrency) &&
        Objects.equals(this.creditCurrency, voucherRedeemAndWithdrawResponseData.creditCurrency) &&
        Objects.equals(this.currentBalance, voucherRedeemAndWithdrawResponseData.currentBalance) &&
        Objects.equals(this.email, voucherRedeemAndWithdrawResponseData.email) &&
        Objects.equals(this.feeBearer, voucherRedeemAndWithdrawResponseData.feeBearer) &&
        Objects.equals(this.fromAmount, voucherRedeemAndWithdrawResponseData.fromAmount) &&
        Objects.equals(this.fromCurrency, voucherRedeemAndWithdrawResponseData.fromCurrency) &&
        Objects.equals(this.id, voucherRedeemAndWithdrawResponseData.id) &&
        Objects.equals(this.merchant, voucherRedeemAndWithdrawResponseData.merchant) &&
        Objects.equals(this.merchantFee, voucherRedeemAndWithdrawResponseData.merchantFee) &&
        Objects.equals(this.previousBalance, voucherRedeemAndWithdrawResponseData.previousBalance) &&
        Objects.equals(this.rate, voucherRedeemAndWithdrawResponseData.rate) &&
        Objects.equals(this.reference, voucherRedeemAndWithdrawResponseData.reference) &&
        Objects.equals(this.toAccount, voucherRedeemAndWithdrawResponseData.toAccount) &&
        Objects.equals(this.toAmount, voucherRedeemAndWithdrawResponseData.toAmount) &&
        Objects.equals(this.toCurrency, voucherRedeemAndWithdrawResponseData.toCurrency) &&
        Objects.equals(this.voucherCode, voucherRedeemAndWithdrawResponseData.voucherCode) &&
        Objects.equals(this.voucherFee, voucherRedeemAndWithdrawResponseData.voucherFee) &&
        Objects.equals(this.withdrawalFee, voucherRedeemAndWithdrawResponseData.withdrawalFee)&&
        Objects.equals(this.additionalProperties, voucherRedeemAndWithdrawResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertedVoucherFee, convertedVoucherFeeCurrency, creditCurrency, currentBalance, email, feeBearer, fromAmount, fromCurrency, id, merchant, merchantFee, previousBalance, rate, reference, toAccount, toAmount, toCurrency, voucherCode, voucherFee, withdrawalFee, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherRedeemAndWithdrawResponseData {\n");
    sb.append("    convertedVoucherFee: ").append(toIndentedString(convertedVoucherFee)).append("\n");
    sb.append("    convertedVoucherFeeCurrency: ").append(toIndentedString(convertedVoucherFeeCurrency)).append("\n");
    sb.append("    creditCurrency: ").append(toIndentedString(creditCurrency)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    feeBearer: ").append(toIndentedString(feeBearer)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    fromCurrency: ").append(toIndentedString(fromCurrency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantFee: ").append(toIndentedString(merchantFee)).append("\n");
    sb.append("    previousBalance: ").append(toIndentedString(previousBalance)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    toCurrency: ").append(toIndentedString(toCurrency)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    voucherFee: ").append(toIndentedString(voucherFee)).append("\n");
    sb.append("    withdrawalFee: ").append(toIndentedString(withdrawalFee)).append("\n");
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
    openapiFields.add("convertedVoucherFee");
    openapiFields.add("convertedVoucherFeeCurrency");
    openapiFields.add("creditCurrency");
    openapiFields.add("currentBalance");
    openapiFields.add("email");
    openapiFields.add("feeBearer");
    openapiFields.add("fromAmount");
    openapiFields.add("fromCurrency");
    openapiFields.add("id");
    openapiFields.add("merchant");
    openapiFields.add("merchantFee");
    openapiFields.add("previousBalance");
    openapiFields.add("rate");
    openapiFields.add("reference");
    openapiFields.add("toAccount");
    openapiFields.add("toAmount");
    openapiFields.add("toCurrency");
    openapiFields.add("voucherCode");
    openapiFields.add("voucherFee");
    openapiFields.add("withdrawalFee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherRedeemAndWithdrawResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VoucherRedeemAndWithdrawResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherRedeemAndWithdrawResponseData is not found in the empty JSON string", VoucherRedeemAndWithdrawResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("convertedVoucherFeeCurrency") != null && !jsonObj.get("convertedVoucherFeeCurrency").isJsonNull()) && !jsonObj.get("convertedVoucherFeeCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `convertedVoucherFeeCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("convertedVoucherFeeCurrency").toString()));
      }
      if ((jsonObj.get("creditCurrency") != null && !jsonObj.get("creditCurrency").isJsonNull()) && !jsonObj.get("creditCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creditCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creditCurrency").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("feeBearer") != null && !jsonObj.get("feeBearer").isJsonNull()) && !jsonObj.get("feeBearer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feeBearer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feeBearer").toString()));
      }
      if ((jsonObj.get("fromCurrency") != null && !jsonObj.get("fromCurrency").isJsonNull()) && !jsonObj.get("fromCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromCurrency").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()) && !jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("toAccount") != null && !jsonObj.get("toAccount").isJsonNull()) && !jsonObj.get("toAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toAccount").toString()));
      }
      if ((jsonObj.get("toCurrency") != null && !jsonObj.get("toCurrency").isJsonNull()) && !jsonObj.get("toCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toCurrency").toString()));
      }
      if ((jsonObj.get("voucherCode") != null && !jsonObj.get("voucherCode").isJsonNull()) && !jsonObj.get("voucherCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucherCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucherCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherRedeemAndWithdrawResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherRedeemAndWithdrawResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherRedeemAndWithdrawResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherRedeemAndWithdrawResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherRedeemAndWithdrawResponseData>() {
           @Override
           public void write(JsonWriter out, VoucherRedeemAndWithdrawResponseData value) throws IOException {
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
           public VoucherRedeemAndWithdrawResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherRedeemAndWithdrawResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherRedeemAndWithdrawResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherRedeemAndWithdrawResponseData
  * @throws IOException if the JSON string is invalid with respect to VoucherRedeemAndWithdrawResponseData
  */
  public static VoucherRedeemAndWithdrawResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherRedeemAndWithdrawResponseData.class);
  }

 /**
  * Convert an instance of VoucherRedeemAndWithdrawResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

