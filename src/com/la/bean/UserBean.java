package com.la.bean;

public class UserBean {
	private String id;
	private String fullname;
	private String aadhar;
	private String mobile;
	private String email;
	private String state;
	private String city;
	private String hou_ap_no;
	private String street;
	private String pincode;
	private String near_police;
	private String password;
	private String email_verify_status;
	private String mobile_verify_status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHou_ap_no() {
		return hou_ap_no;
	}
	public void setHou_ap_no(String hou_ap_no) {
		this.hou_ap_no = hou_ap_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getNear_police() {
		return near_police;
	}
	public void setNear_police(String near_police) {
		this.near_police = near_police;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_verify_status() {
		return email_verify_status;
	}
	public void setEmail_verify_status(String email_verify_status) {
		this.email_verify_status = email_verify_status;
	}
	public String getMobile_verify_status() {
		return mobile_verify_status;
	}
	public void setMobile_verify_status(String mobile_verify_status) {
		this.mobile_verify_status = mobile_verify_status;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", fullname=" + fullname + ", aadhar=" + aadhar + ", mobile=" + mobile
				+ ", email=" + email + ", state=" + state + ", city=" + city + ", hou_ap_no=" + hou_ap_no + ", street="
				+ street + ", pincode=" + pincode + ", near_police=" + near_police + ", password=" + password
				+ ", email_verify_status=" + email_verify_status + ", mobile_verify_status=" + mobile_verify_status
				+ "]";
	}
	
	
	
	

}
