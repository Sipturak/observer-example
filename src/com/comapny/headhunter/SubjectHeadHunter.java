package com.comapny.headhunter;


public interface SubjectHeadHunter {
	
	public void registerObserver(ObserverSoftwareEngenier ob);
	public void removeObserver(ObserverSoftwareEngenier ob);
	public void notifyForChange();
	
}
