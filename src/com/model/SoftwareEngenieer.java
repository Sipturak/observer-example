package com.model;

import com.comapny.headhunter.ObserverSoftwareEngenier;

public abstract class SoftwareEngenieer implements ObserverSoftwareEngenier{
	
	private String [] requirments;
	
	public String[] getRequirments() {
		return requirments;
	}

	public void setRequirments(String[] requirments) {
		this.requirments = requirments;
	}
	
}
