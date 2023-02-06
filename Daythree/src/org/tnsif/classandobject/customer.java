package org.tnsif.classandobject;
public class customer {
  private int id;
 private String customer;
 private String city;
 public customer() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomer() {
	return customer;
}
public void setCustomer(String customer) {
	this.customer = customer;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
 public customer(int id,String customer,String city)
 {
	 this.id=id;
	 this.customer=customer;
	 this.city=city;
 }
 void display() {
	 System.out.println(id+" "+customer+" "+city);
	
 }


}