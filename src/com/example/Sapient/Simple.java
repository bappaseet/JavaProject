package com.example.Sapient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import com.example.Sapient.dao.FlightReader;
import com.example.Sapient.entity.FlightDetails;
import com.example.Sapient.entity.Student;
import com.example.Sapient.flightservice.FlightService;
import com.example.Sapient.flightservice.FlightServiceImpl;


public class Simple {
	public static void main(String args[]) {

		List<String> list = null;
		//FLIGHT_NUM|DEP_LOC|ARR_LOC|VALID_TILL|FLIGHT_TIME|FLIGHT_DURN|FARE
		String[] stringAR = {  "GF299|FRA|LHR|20-11-2010|0600|4.10|480",
				               "AA118|DUB|MUC|21-12-2010|1410|5.40|580",
				               "AF371|AMS|MAD|30-11-2010|1210|3.45|320" 
				            };
	
		List<FlightDetails> flightDetailsList = new LinkedList<FlightDetails>();
		
		try {
			File file = new File("G://File//new2.txt");
			FlightReader.readFlightDetails(flightDetailsList, file);
			File file1 = new File("new2.txt");

			FlightReader.readFlightDetails(flightDetailsList, file1);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		}
*/
		FlightService flightService = new  FlightServiceImpl();
		List<FlightDetails> flightDetails = flightService.searchFlight(flightDetailsList, "Delhi", "RFanchi","12:30");
		  // Collections.sort(flightDetailsList, new FlightNumberCom());
		  for (FlightDetails fli : flightDetailsList)
			{System.out.println(fli);
			
			}
   }
	
}
