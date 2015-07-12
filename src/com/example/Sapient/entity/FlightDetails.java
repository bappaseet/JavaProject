package com.example.Sapient.entity;

//  Giving Flight Details 

public class FlightDetails {
	//FLIGHT_NUM|DEP_LOC|ARR_LOC|VALID_TILL|FLIGHT_TIME|FLIGHT_DURN|FARE
		            
	                private String flightNumber;
			        private String departureLocation;
			        private String arrivalLocation;
			        private String dateValidity;
			        private String flightTime;
			        private String flightDurn;
			        private int fare;
			        
			        
					public FlightDetails() {
						super();
					}
					public FlightDetails(String flightNumber,
							String departureLocation, String arrivalLocation,
							String dateValidity, String flightTime,
							String flightDurn, int fare) {
						super();
						this.flightNumber = flightNumber;
						this.departureLocation = departureLocation;
						this.arrivalLocation = arrivalLocation;
						this.dateValidity = dateValidity;
						this.flightTime = flightTime;
						this.flightDurn = flightDurn;
						this.fare = fare;
					}
					@Override
					public int hashCode() {
						final int prime = 31;
						int result = 1;
						result = prime * result + fare;
						result = prime
								* result
								+ ((flightNumber == null) ? 0 : flightNumber
										.hashCode());
						return result;
					}
					@Override
					public boolean equals(Object obj) {
						if (this == obj)
							return true;
						if (obj == null)
							return false;
						if (getClass() != obj.getClass())
							return false;
						FlightDetails other = (FlightDetails) obj;
						if (fare != other.fare)
							return false;
						if (flightNumber == null) {
							if (other.flightNumber != null)
								return false;
						} else if (!flightNumber.equals(other.flightNumber))
							return false;
						return true;
					}
					public String getFlightNumber() {
						return flightNumber;
					}
					public String getDepartureLocation() {
						return departureLocation;
					}
					public String getArrivalLocation() {
						return arrivalLocation;
					}
					public String getDateValidity() {
						return dateValidity;
					}
					public String getFlightTime() {
						return flightTime;
					}
					public String getFlightDurn() {
						return flightDurn;
					}
					public int getFare() {
						return fare;
					}
					public void setFlightNumber(String flightNumber) {
						this.flightNumber = flightNumber;
					}
					public void setDepartureLocation(String departureLocation) {
						this.departureLocation = departureLocation;
					}
					public void setArrivalLocation(String arrivalLocation) {
						this.arrivalLocation = arrivalLocation;
					}
					public void setDateValidity(String dateValidity) {
						this.dateValidity = dateValidity;
					}
					public void setFlightTime(String flightTime) {
						this.flightTime = flightTime;
					}
					public void setFlightDurn(String flightDurn) {
						this.flightDurn = flightDurn;
					}
					public void setFare(int fare) {
						this.fare = fare;
					}
					@Override
					public String toString() {
						return "FlightDetails [flightNumber=" + flightNumber
								+ ", departureLocation=" + departureLocation
								+ ", arrivalLocation=" + arrivalLocation
								+ ", dateValidity=" + dateValidity
								+ ", flightTime=" + flightTime
								+ ", flightDurn=" + flightDurn + ", fare="
								+ fare + "]";
					}
			    
			        
			}
