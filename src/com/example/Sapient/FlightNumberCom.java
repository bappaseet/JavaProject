package com.example.Sapient;

import java.util.Comparator;

import com.example.Sapient.entity.FlightDetails;

public class FlightNumberCom implements Comparator<FlightDetails> {



	@Override
	public int compare(FlightDetails o1, FlightDetails o2) {
		// TODO Auto-generated method stub
		   String flightNumber1 = o1.getFlightNumber();
		   String flightNumber2 = o2.getFlightNumber();
		    return flightNumber1.compareTo(flightNumber2);
	}

}
