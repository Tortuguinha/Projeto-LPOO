package com.app.domain.entities.employee;

public class EmployeeAddressEntity {
   private Integer Number;
   private String Street;
   private String District;
   private String City;
   
   public EmployeeAddressEntity(int number, String street, String district, String city) {
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
