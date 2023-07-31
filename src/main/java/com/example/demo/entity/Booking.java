package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="booking_id")
	private int bookingid;
	@Column(name="user_id")
	private int userId; 
	@Column(name="hotel_id")
	private int hotelId;
	@Column(name="no_of_rooms")
	private int noOfRooms;
	@Column(name="no_of_days")
	private int noOfDays;
	
	
	
	@ManyToOne(targetEntity=Hotel.class,fetch=FetchType.EAGER)
	@JoinColumn(name="hotel_id",insertable=false,updatable=false)
	private Hotel hotel;
	
	@ManyToOne(targetEntity=User.class,fetch=FetchType.EAGER)
	@JoinColumn(name="user_id",insertable=false,updatable=false)
	private User user;
	
	
	public Booking() {
		
	}

	
	public Booking(int bookingid, int userId, int hotelId, int noOfRooms, int noOfDays) {
		
		this.bookingid = bookingid;
		this.userId = userId;
		this.hotelId = hotelId;
		this.noOfRooms = noOfRooms;
		this.noOfDays = noOfDays;
	}


	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	

	public int getNoOfRooms() {
		return noOfRooms;
	}



	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}



	public int getNoOfDays() {
		return noOfDays;
	}



	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}


	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", userId=" + userId + ", hotelId=" + hotelId + ", noOfRooms="
				+ noOfRooms + ", noOfDays=" + noOfDays + "]";
	}

	
}
