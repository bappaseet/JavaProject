package com.example.Sapient.flightservice;

import java.util.List;

import com.example.Sapient.entity.FlightDetails;

public interface FlightService {
	
	public List<FlightDetails> searchFlight(List<FlightDetails> flightDetails, String departureLocation, String arrivalLocation, String flightTime);

}
