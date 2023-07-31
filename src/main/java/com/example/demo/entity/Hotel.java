package com.example.demo.entity;




import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hotel_id")
	private int hotelId;
	@Column(name="hotel_name")
	private String hotelName;
	@Column(name="hotel_address")
	private String hotelAddress;
	@Column(name="hotel_img")
	private String hotelImg;
	@Column(name="hotel_price")
	private int hotelPrice;
	@Column(name="no_of_rooms")
	private int noOfRooms;
	@Column(name="location_id")
	private int locationId;
	@Column(name="hotel_details")
	private String HotelDetails;
	@Column(name="hotel_img1")
	private String hotelImg1;
	@Column(name="hotel_img2")
	private String hotelImg2;
	
	
	@ManyToOne(targetEntity=Location.class,fetch=FetchType.EAGER)
	@JoinColumn(name="location_id",insertable=false,updatable=false)
	private Location location;
	
	@OneToMany(mappedBy="hotel")
	private Set<Booking> booking;
	
	public Hotel() {
		
	}

	

	public Hotel(int hotelId, String hotelName, String hotelAddress, String hotelImg, int hotelPrice, int noOfRooms,
			int locationId, String hotelDetails, String hotelImg1, String hotelImg2, Location location,
			Set<Booking> booking) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.hotelImg = hotelImg;
		this.hotelPrice = hotelPrice;
		this.noOfRooms = noOfRooms;
		this.locationId = locationId;
		HotelDetails = hotelDetails;
		this.hotelImg1 = hotelImg1;
		this.hotelImg2 = hotelImg2;
		this.location = location;
		this.booking = booking;
	}


	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getHotelImg() {
		return hotelImg;
	}

	public void setHotelImg(String hotelImg) {
		this.hotelImg = hotelImg;
	}

	public int getHotelPrice() {
		return hotelPrice;
	}

	public void setHotelPrice(int hotelPrice) {
		this.hotelPrice = hotelPrice;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getHotelDetails() {
		return HotelDetails;
	}

	public void setHotelDetails(String hotelDetails) {
		HotelDetails = hotelDetails;
	}

	public String getHotelImg1() {
		return hotelImg1;
	}

	public void setHotelImg1(String hotelImg1) {
		this.hotelImg1 = hotelImg1;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Set<Booking> getBooking() {
		return booking;
	}

	public void setBooking(Set<Booking> booking) {
		this.booking = booking;
	}
	

	public String getHotelImg2() {
		return hotelImg2;
	}



	public void setHotelImg2(String hotelImg2) {
		this.hotelImg2 = hotelImg2;
	}



	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress
				+ ", hotelPrice=" + hotelPrice + ", noOfRooms=" + noOfRooms + ", locationId=" + locationId
				+ ", location=" + location + ", booking=" + booking + "]";
	}
	

}
