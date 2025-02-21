package com.app.domain.entities.employee;

public class EmployeeAddressEntity {
   private Integer Number;
   private String Street;
   private String District;
   private String City;
   
   public EmployeeAddressEntity(int number, String street, String district, String city) {
       if (number < 0) {
           throw new IllegalArgumentException("Number cannot be negative");
       }
       if (street == null || street.isEmpty()) {
           throw new IllegalArgumentException("Street cannot be null or empty");
       }
       if (district == null || district.isEmpty()) {
           throw new IllegalArgumentException("District cannot be null or empty");
       }
       if (city == null || city.isEmpty()) {
           throw new IllegalArgumentException("City cannot be null or empty");
       }
       this.Number = number;
       this.Street = street;
       this.District = district;
       this.City = city;
   }
   
   public Integer getNumber() {
	   return this.Number;
   }
   
   public String getStreet() {
	   return this.Street;
   }
   
   public String getDistrict() {
	   return this.District;
   }
   
   public String getCity() {
	   return this.City;
   }

}
