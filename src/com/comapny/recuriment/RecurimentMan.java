package com.comapny.recuriment;

import java.util.ArrayList;
import java.util.List;

import com.comapny.Company;
import com.comapny.headhunter.HeadHunter;

public class RecurimentMan implements SubjectRecurimentMan{
	
	private List<ObserverRecurimentMan> obList;
	private Company company;
	private HeadHunter headHunter;
	
	public RecurimentMan() {
		// TODO Auto-generated constructor stub
		obList = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(ObserverRecurimentMan ob) {
		// TODO Auto-generated method stub
		obList.add(ob);
	}

	@Override
	public void removeObserver(ObserverRecurimentMan ob) {
		// TODO Auto-generated method stub
		if(obList.size() >= 0) {
			obList.remove(ob);
		}
	}

	@Override
	public void notifyForChange() {
		// TODO Auto-generated method stub
		for(ObserverRecurimentMan item : obList) {
			item.update(company, headHunter);
		}
	}
	
	public void set(Company company, HeadHunter headHunter) {
		this.company = company;
		this.headHunter = headHunter;
		notifyForChange();
	}

	public List<ObserverRecurimentMan> getObList() {
		return obList;
	}
	
	
	

}
