package com.dedalus.covidtracker.exception;

public class PatientNotFoundException extends RuntimeException{
	private String message;
    public PatientNotFoundException(String message) {
        super(message);
        this.message = message;
    }
    public PatientNotFoundException() {
    	super("Patient Not Found!!");
    }
}
