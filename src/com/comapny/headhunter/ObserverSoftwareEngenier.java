package com.comapny.headhunter;

import java.util.List;

import com.comapny.Company;
import com.model.SoftwareEngenieer;

public interface ObserverSoftwareEngenier {

	public void update(List<String []> req, List<SoftwareEngenieer> list);

	
}
