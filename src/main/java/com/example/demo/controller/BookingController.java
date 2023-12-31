package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Booking;
import com.example.demo.service.BookingServiceImplementation;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/bookings")
public class BookingController {
	
	private BookingServiceImplementation bookingSer;
    
	@Autowired
	public BookingController(BookingServiceImplementation bookingSer) {
		this.bookingSer = bookingSer;
	}
	
	@GetMapping ("/list")
	public List<Booking> getAllBookingsData() {     
		List<Booking> booking =bookingSer.displayAll();
		return booking;
	}
	@GetMapping ("/list/{bookingId}")
	public Booking getBookingsData(@PathVariable ("bookingId") int bookingId) {      
		Booking booking =bookingSer.getById(bookingId);
		if (booking==null) { 
			throw new RuntimeException("Booking not found with the given booking id");
		}
		return booking;
	}
	
//	@GetMapping ("/list/{userId}")
//	public Booking getBookingsUserData(@PathVariable ("userId") int bookingId) {      
//		Booking booking =bookingSer.getByUserId(bookingId);
//		if (booking==null) { 
//			throw new RuntimeException("Booking not found with the given user id");
//		}
//		return booking;
//	}
	@PostMapping ("/list")
	public void insertBooking(@RequestBody Booking booking ) {
		booking.setBookingid(0);
		bookingSer.insertOrUpdate(booking);
	}
	@PutMapping ("/list")
	public void updateBooking(@RequestBody Booking booking ) {
		bookingSer.insertOrUpdate(booking);
	}
	
	@DeleteMapping ("/list/{bookingId}")
	public String deleteBookingsData(@PathVariable ("bookingId")int bookingId) {      
		Booking booking =bookingSer.getById(bookingId);
		if (booking==null) { 
			throw new RuntimeException("Booking not found with the given booking id");
		}
		bookingSer.removeById(bookingId);
	return "Deleted booking id =" +bookingId;
	}
	
}