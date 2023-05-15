package com.dedalus.covidtracker.exception;

public class PatientAlreadyExistsException extends RuntimeException{
	private String message;
    public PatientAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
    public PatientAlreadyExistsException() {
    	super("Patient already exists!!");
    }
}
