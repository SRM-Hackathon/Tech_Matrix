package com.la.bean;

public class TenantBean {
//	dateOfEnterTen fullnameTen mobileNumTen aadharCardNumten tenantAddress PhotoTen FingerPrintTen pincode
	 
	private String dateOfEnterTen;
	private String fullnameTen;
	private String mobileNumTen;
	private String aadharCardNumten; 
	private String tenantAddress; 
	private String profilePath;
	private String fingerPPath;
	private String pincode;
	public String getDateOfEnterTen() {
		return dateOfEnterTen;
	}
	public void setDateOfEnterTen(String dateOfEnterTen) {
		this.dateOfEnterTen = dateOfEnterTen;
	}
	public String getFullnameTen() {
		return fullnameTen;
	}
	public void setFullnameTen(String fullnameTen) {
		this.fullnameTen = fullnameTen;
	}
	public String getMobileNumTen() {
		return mobileNumTen;
	}
	public void setMobileNumTen(String mobileNumTen) {
		this.mobileNumTen = mobileNumTen;
	}
	public String getAadharCardNumten() {
		return aadharCardNumten;
	}
	public void setAadharCardNumten(String aadharCardNumten) {
		this.aadharCardNumten = aadharCardNumten;
	}
	public String getTenantAddress() {
		return tenantAddress;
	}
	public void setTenantAddress(String tenantAddress) {
		this.tenantAddress = tenantAddress;
	}
	public String getProfilePath() {
		return profilePath;
	}
	public void setProfilePath(String profilePath) {
		this.profilePath = profilePath;
	}
	public String getFingerPPath() {
		return fingerPPath;
	}
	public void setFingerPPath(String fingerPPath) {
		this.fingerPPath = fingerPPath;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "TenantBean [dateOfEnterTen=" + dateOfEnterTen + ", fullnameTen=" + fullnameTen + ", mobileNumTen="
				+ mobileNumTen + ", aadharCardNumten=" + aadharCardNumten + ", tenantAddress=" + tenantAddress
				+ ", profilePath=" + profilePath + ", fingerPPath=" + fingerPPath + ", pincode=" + pincode + "]";
	}
	
	
	
 
    
    
    

}
