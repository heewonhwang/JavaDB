/*******************************************************************************************
* @filename  Dto.java
* @date      2022.12.20
* @comment   데이터 교환을 위한 순수한 데이터 객체 클래스 (getter, setter)
********************************************************************************************/
package db_java;

public class Dto {
	private int index;
	private String lib_name;
	private String code;
	private String ad_name;
	private String address;
	private String phone; 
	private String url;
	private String time;
	private String holiday;
	private String devision;
	private String dev_name;
	private String lat;
	private String longitude;
	
	public Dto() {
		super();
	}
	
	public Dto(int index,String lib_name, String code, String ad_name,
			String address, String phone, String url, String time,
			String holiday, String devision, String dev_name,
			String lat, String longitude) {
		
		super();
		this.index = index;
		this.lib_name = lib_name;
		this.code = code;
		this.ad_name = ad_name;
		this.address = address;
		this.phone = phone;
		this.url = url;
		this.time = time;
		this.holiday = holiday;
		this.devision = devision;
		this.dev_name = dev_name;
		this.lat = lat;
		this.longitude = longitude;
		
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getLib_name() {
		return lib_name;
	}

	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAd_name() {
		return ad_name;
	}

	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getDevision() {
		return devision;
	}

	public void setDevision(String devision) {
		this.devision = devision;
	}

	public String getDev_name() {
		return dev_name;
	}

	public void setDev_name(String dev_name) {
		this.dev_name = dev_name;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
}
