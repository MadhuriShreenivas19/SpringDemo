package com.lnt.core.services;

public class Address {

private String flatAndWing;
private String society;
private String area;
 private String city;
public String getFlatAndWing() {
	return flatAndWing;
}
public void setFlatAndWing(String flatAndWing) {
	this.flatAndWing = flatAndWing;
}
public String getSociety() {
	return society;
}
public void setSociety(String society) {
	this.society = society;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [flatAndWing=" + flatAndWing + ", society=" + society + ", area=" + area + ", city=" + city + "]";
}
 

}
