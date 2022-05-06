package model;

public class Employee {

  private String name;
  private Integer hours;
  private Double valuePorHour;

  public Employee() {
  }

  public Employee(String name, Integer hours, Double valuePorHour) {
    this.name = name;
    this.hours = hours;
    this.valuePorHour = valuePorHour;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public Double valuePorHour() {
    return valuePorHour;
  }

  public void valuePorHour(Double value) {
    this.valuePorHour = value;
  }

  public double payment() {
    return hours * valuePorHour;
  }

}
