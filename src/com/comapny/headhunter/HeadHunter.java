package com.comapny.headhunter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.comapny.Company;
import com.comapny.IRequirments;
import com.comapny.IRequirmentsCSharp;
import com.comapny.Observer;
import com.comapny.recuriment.ObserverRecurimentMan;
import com.comapny.recuriment.SubjectRecurimentMan;
import com.model.SoftwareEngenieer;

public class HeadHunter implements SubjectHeadHunter, ObserverRecurimentMan {

	private List<String[]> listOfRequirments; // set in method
	private List<ObserverSoftwareEngenier> obList;
	private List<SoftwareEngenieer> listOfEngenieer;
	private SubjectRecurimentMan subjectRecurimentMan;

	public HeadHunter() {
		// TODO Auto-generated constructor stub
		obList = new ArrayList<>();
		listOfEngenieer = new ArrayList<>();
		listOfRequirments = new ArrayList<>();
		listOfRequirments.add(IRequirments.Junior_Req);
		listOfRequirments.add(IRequirmentsCSharp.Junior_Req);
		listOfRequirments.add(IRequirmentsCSharp.Medior_Req);
		listOfRequirments.add(IRequirments.Senior_Req);
		listOfRequirments.add(IRequirmentsCSharp.Senior_Req);
		listOfRequirments.add(IRequirments.Medior_Req);
	}

	@Override
	public void registerObserver(ObserverSoftwareEngenier ob) {
		// TODO Auto-generated method stub
		obList.add(ob);
	}

	@Override
	public void removeObserver(ObserverSoftwareEngenier ob) {
		// TODO Auto-generated method stub
		if (obList.size() >= 0) {
			obList.remove(ob);
		}
	}

	@Override
	public void notifyForChange() {
		// TODO Auto-generated method stub
		for (ObserverSoftwareEngenier item : obList) {
			item.update(listOfRequirments, listOfEngenieer);
		}
	}

	@Override
	public void update(Company company, HeadHunter headHunter) {
		// TODO Auto-generated method stub
		List<Observer> list = company.getAll();
		List<SoftwareEngenieer> list1 = headHunter.getListOfEngenieer();
		for (int i = 0; i < list.size(); i++) {
			if (Arrays.toString(list.get(i).getRequirments()).equals(Arrays.toString(list1.get(i).getRequirments()))) {
				company.removeObserver(list.get(i));
				list1.remove(i);
			}
		}

	}

	public void setSubjectRecurimentMan(SubjectRecurimentMan subjectRecurimentMan) {
		this.subjectRecurimentMan = subjectRecurimentMan;
		subjectRecurimentMan.registerObserver(this);
	}

	public List<ObserverSoftwareEngenier> getObList() {
		return obList;
	}

	public List<SoftwareEngenieer> getListOfEngenieer() {
		return listOfEngenieer;
	}
}
