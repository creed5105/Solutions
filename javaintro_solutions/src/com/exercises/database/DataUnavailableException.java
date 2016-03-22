package com.exercises.database;

@SuppressWarnings("serial")
public class DataUnavailableException extends RuntimeException {
	public DataUnavailableException(Exception reason){
		super(reason);
	}
	public DataUnavailableException(String reason){
		super(reason);
	}
	public DataUnavailableException(){
		this("Could not connect to data store");
	}
	@Override
	public String getMessage(){
		return "DataUnavailableException: " + super.getMessage();
	}
}
