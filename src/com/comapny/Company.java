package com.comapny;

import java.util.ArrayList;
import java.util.List;

public class Company implements Subject {
	
	private List<Observer> obList;
	private EnumTitle title;
	private String [] positions;
	
	public Company() {
		// TODO Auto-generated constructor stub
		obList = new ArrayList<>();
		
	}
	
	@Override
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		obList.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		// TODO Auto-generated method stub
		if(obList.size() >= 0) {
			obList.remove(ob);
		}
	}

	@Override
	public void notifyForChange() {
		// TODO Auto-generated method stub
		for(Observer item : obList) {
			item.update(positions, title);
		}
	}
	
	public void setComapnyJobs(String [] positions,EnumTitle title) {
		this.positions = positions;
		this.title = title;
		notifyForChange();
	}
	
	public List<Observer> getAll(){
		return obList;
	}
	
	 

}
