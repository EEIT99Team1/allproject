package model;

import java.sql.Time;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Flight")
public class FlightBean {
	@Id
	private String FlightNumber; // -- 班次
	private Date DepartureDateTime; // --出發日期
	private Time OriginLocation; // --出發時間
	private String DepartureAirport; // --出發地
	private String DestinationLocation; // --抵達時間
	private String DestinationAirport;// --抵達地
	private int FlightHour; // 飛行時間
	private int AircraftType; // --機型
	private String ClassOfService; // -艙等

	@Override
	public String toString() {
		return "FlightBean [FlightNumber=" + FlightNumber + ", DepartureDateTime=" + DepartureDateTime
				+ ", OriginLocation=" + OriginLocation + ", DepartureAirport=" + DepartureAirport
				+ ", DestinationLocation=" + DestinationLocation + ", DestinationAirport=" + DestinationAirport
				+ ", FlightHour=" + FlightHour + ", AircraftType=" + AircraftType + ", ClassOfService=" + ClassOfService
				+ "]";
	}

	public String getFlightNumber() {
		return FlightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}

	public Date getDepartureDateTime() {
		return DepartureDateTime;
	}

	public void setDepartureDateTime(Date departureDateTime) {
		DepartureDateTime = departureDateTime;
	}

	public Time getOriginLocation() {
		return OriginLocation;
	}

	public void setOriginLocation(Time originLocation) {
		OriginLocation = originLocation;
	}

	public String getDepartureAirport() {
		return DepartureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		DepartureAirport = departureAirport;
	}

	public String getDestinationLocation() {
		return DestinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		DestinationLocation = destinationLocation;
	}

	public String getDestinationAirport() {
		return DestinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		DestinationAirport = destinationAirport;
	}

	public int getFlightHour() {
		return FlightHour;
	}

	public void setFlightHour(int flightHour) {
		FlightHour = flightHour;
	}

	public int getAircraftType() {
		return AircraftType;
	}

	public void setAircraftType(int aircraftType) {
		AircraftType = aircraftType;
	}

	public String getClassOfService() {
		return ClassOfService;
	}

	public void setClassOfService(String classOfService) {
		ClassOfService = classOfService;
	}

}
