package com.example.Sapient;

import java.util.Comparator;

import com.example.Sapient.entity.FlightDetails;

public class FlightPriceCom implements Comparator<FlightDetails> {

	@Override
	public int compare(FlightDetails o1, FlightDetails o2) {
		// TODO Auto-generated method stub
		Integer fare1 = (Integer)o1.getFare();
		Integer fare2 = (Integer)o2.getFare();
		return -fare1.compareTo(fare2);
	}

}
