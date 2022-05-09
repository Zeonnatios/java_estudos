package model;

public class OutsourcedEmployee extends Employee{

  private Double additionalCharge;

  public OutsourcedEmployee() {
    super();
  }

  public OutsourcedEmployee(String name, Integer hours, Double valuePorHour,
      Double additionalCharge) {
    super(name, hours, valuePorHour);
    this.additionalCharge = additionalCharge;
  }

  public Double getAdditionalCharge() {
    return additionalCharge;
  }

  public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }

  @Override
  public double payment() {
    return super.payment() + this.additionalCharge * 1.1;
  }
}
