package com.comapny.recuriment;

public interface SubjectRecurimentMan {
	
	public void registerObserver(ObserverRecurimentMan ob);
	public void removeObserver(ObserverRecurimentMan ob);
	public void notifyForChange();
	
}
