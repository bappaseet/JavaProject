package com.example.Sapient.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import com.example.Sapient.entity.FlightDetails;

public class FlightReader {

	public  static void readFlightDetails(List<FlightDetails> flightDetailsList, File file)
			throws FileNotFoundException, IOException {
		List<String> list;
		//File file = new File("G://File//new2.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line ;
		while((line = buffer.readLine())!=null){
			
		
		
			list = new LinkedList<String>();
			FlightDetails flightdetail = new FlightDetails();
			// System.out.println(stringStr);
			StringTokenizer st = new StringTokenizer(line, "|");

			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				if (token != null) {
					list.add(token);
				}

			}
			flightdetail.setFlightNumber(list.get(0));
			flightdetail.setDepartureLocation(list.get(1));
			flightdetail.setArrivalLocation(list.get(2));
			flightdetail.setDateValidity(list.get(3));
			flightdetail.setFlightTime(list.get(4));
		    flightdetail.setFlightDurn(list.get(5));
		    flightdetail.setFare(Integer.parseInt(list.get(6)));
		    // System.out.println(stu.getFirstName());
		    flightDetailsList.add(flightdetail);

		}
	}
}
