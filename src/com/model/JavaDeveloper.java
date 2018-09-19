package com.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.comapny.headhunter.ObserverSoftwareEngenier;
import com.comapny.headhunter.SubjectHeadHunter;

public class JavaDeveloper extends SoftwareEngenieer {
	
	private SubjectHeadHunter subject;
	private boolean hasExperience;
	
	public JavaDeveloper(SubjectHeadHunter subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void update(List<String []> req, List<SoftwareEngenieer> list) {
		// TODO Auto-generated method stub
		for(String [] item : req) {
			if(Arrays.toString(item).equals(Arrays.toString(getRequirments()))) {
				list.add(this);
				hasExperience = true;
				break;
			}
		}
		
	}


}
