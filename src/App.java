import com.comapny.Company;
import com.comapny.EnumTitle;
import com.comapny.JobCSharpDev;
import com.comapny.JobJavaDev;
import com.comapny.headhunter.HeadHunter;
import com.comapny.recuriment.RecurimentMan;
import com.model.JavaDeveloper;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();

		JobJavaDev javaDev = new JobJavaDev(company);
		JobCSharpDev jobCSharpDev = new JobCSharpDev(company);
		
		company.setComapnyJobs(new String[] {"Java Developer", "C developer"}, EnumTitle.Junior);
		
		System.out.println("Get jobs in company: " + company.getAll());
		
		HeadHunter headHunter = new HeadHunter();
		JavaDeveloper javaDeveloper = new JavaDeveloper(headHunter);
		javaDeveloper.setRequirments(new String[] {"One year of exeprince" ,"Knowledge of JavaSE,JavaEE"});
		headHunter.notifyForChange();
		System.out.println("Software engenieer: " + headHunter.getListOfEngenieer().size());
		
		RecurimentMan recurimentMan = new RecurimentMan();
		headHunter.setSubjectRecurimentMan(recurimentMan);
		
		recurimentMan.set(company, headHunter);
		
		System.out.println("After: " + company.getAll());
		
	}

}
