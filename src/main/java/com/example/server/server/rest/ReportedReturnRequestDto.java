package com.example.server.server.rest;

public class ReportedReturnRequestDto {
  private Double returnAmount;
  private String paymentId;
  private String reasonCode;

  public Double getReturnAmount() {
    return returnAmount;
  }

  public void setReturnAmount(Double returnAmount) {
    this.returnAmount = returnAmount;
  }

  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  @Override
  public String toString() {
    return "ReportedReturnRequestDto{" +
            "returnAmount=" + returnAmount +
            ", paymentId='" + paymentId + '\'' +
            ", reasonCode='" + reasonCode + '\'' +
            '}';
  }
}
