package com.example.Sapient.flightservice;

import java.util.ArrayList;
import java.util.List;

import com.example.Sapient.entity.FlightDetails;

public class FlightServiceImpl implements FlightService{



	@Override
	public List<FlightDetails> searchFlight(List<FlightDetails> flightDetails,
			String departureLocation, String arrivalLocation, String flightTime) {
		List<FlightDetails> matchingFlights = new ArrayList<FlightDetails>();
		if(flightDetails != null){
			for(FlightDetails flightDetail : flightDetails){
				if(flightDetail.getDepartureLocation().equals(departureLocation) ){
					matchingFlights.add(flightDetail);
				}
			}
		}
		return matchingFlights;
	}

}
