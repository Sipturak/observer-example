package com.comapny;

public class JobJavaDev implements Observer{

	private Subject subject;
	private String requirments[];

	public JobJavaDev(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(String[] positions, EnumTitle title) {
		// TODO Auto-generated method stub
		for (String position : positions) {
			if (position.equals("Java Developer")) {
				switch (title) {
				case Junior:
					requirments = IRequirments.Junior_Req;
					break;
				case Medior:
					requirments = IRequirments.Medior_Req;
					break;
				case Senior:
					requirments = IRequirments.Senior_Req;
					break;
				default:
				}
				break;
			}
			break;
		}

	}

	public String[] getRequirments() {
		return requirments;
	}

}
