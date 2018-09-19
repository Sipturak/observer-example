package com.comapny;

public class JobCSharpDev implements Observer{
	
	private Subject subject;
	private String requirments [];
	
	public JobCSharpDev(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void update(String[] positions, EnumTitle title) {
		// TODO Auto-generated method stub
		for(String position : positions) {
			if(position.equals("C Developer")) {
				switch (title) {
				case Junior:
					requirments = IRequirmentsCSharp.Junior_Req;
					break;
				case Medior:
					requirments = IRequirmentsCSharp.Medior_Req;
					break;
				case Senior:
					requirments = IRequirmentsCSharp.Senior_Req;
					break;
				}
				break;
			}
		}
	}

	@Override
	public String[] getRequirments() {
		// TODO Auto-generated method stub
		return requirments;
	}

}
