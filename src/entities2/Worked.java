package entities2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities2enum.WorkedLevel;

public class Worked {
	
	private String workedName;
	private WorkedLevel level;
	private Double baseSalary;
	private String name;	
	private Departament departament;
	
	private List<HoursContract> contracts = new ArrayList<>();
	
	public Worked() {
		
	}
	public Worked(String name, String workedName, WorkedLevel level, Double baseSalary, Departament departament) {
		
		this.name = name;
		this.workedName = workedName;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
		
	}

	public Worked(String workedName, WorkedLevel level, Double baseSalary, Departament departament) {
		
		
		this.workedName = workedName;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getworkedName() {
		return workedName;
	}
	public void setworkedName(String workedName) {
		this.workedName = workedName;
	}
	public WorkedLevel getLevel() {
		return level;
	}
	public void setLevel(WorkedLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Departament getDepartament() {
		return departament;
	}
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	public List<HoursContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HoursContract contract) {
		
		contracts.add(contract);
}
	
	
	public void removeContract(HoursContract contract) {
		
		contracts.remove(contract);
	}
		
	public double income(int year, int month) {
	
		double sum = baseSalary;
	
		Calendar cal = Calendar.getInstance();
	
		for(HoursContract c : contracts) {
	
			cal.setTime(c.getDate());
	
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); 
		
			if(year == c_year &&  month == c_month) {
				
				sum += c.totalValue();
			}
			
		}
		return sum;
	}

	
	


}
	
	

