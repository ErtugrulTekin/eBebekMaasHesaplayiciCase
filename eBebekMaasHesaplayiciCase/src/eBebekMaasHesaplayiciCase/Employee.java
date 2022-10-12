package eBebekMaasHesaplayiciCase;

public class Employee {
	public String name; //Calisanin Adi ve Soyadi
	public double salary; //Calisanin Maasi
	public double workHours; //Calisanin haftalik calisma saati
	public int hireYear; // Calisanin ise baslangic tarihi
	
	public Employee(String name, double salary, double workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	//Proje'yi calistiracak metot
	public void run() {
		finalStep();
		System.out.println("-------------------");	
	}
	
	//Maasa uygulanan vergiyi hesaplayacaktir.
	public double tax() {
		double taxRate = 0.03;
		if(salary > 1000) {
			return salary * taxRate;
		}else {
			return 0;
		}	
	}
	
	//Calisanin fazla calisma ile ucretini hesaplayacaktir.
	public double bonus() {
		double bonusSalary = 0;
		
		if (workHours > 40) {
			bonusSalary = 30 * (workHours - 40);
			return bonusSalary;
		} else {
			return 0;

		}
	}
	
	//Calisanin calistigi yila gore zam oranini hesaplayacaktir.
	public double raiseSalary() {
		double raiseRate1 = 0.05; //10 yildan az suredir calisanin maasina zam orani
		double raiseRate2 = 0.10; //9 yildan fazla ve 20 yildan az calisanin maasina zam orani
		double raiseRate3 = 0.15; //19 yildan fazla calisanin maasina zam orani
		double newSalary = salary + bonus() - tax();
		
		if((2021 - hireYear)<10) {
			return newSalary * raiseRate1;
		}else if((2021 - hireYear) >9 && (2021 - hireYear)<20) {
			return newSalary * raiseRate2;
		}else if((2021 - hireYear) > 19) {
			return newSalary * raiseRate3;
		}else {
			return 0;
		}
	}
	
	//Calisanin yeni maasini bize gosterecektir.
	public double newSalary() {
		return salary + bonus() + raiseSalary() -tax();
	}
	//Calisanin bilgilerini ekrana yazdiracak metot
	public void finalStep() {
		System.out.println("Name Surname : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Work Hours : " + workHours);
		System.out.println("Hire Year : " + hireYear);
		System.out.println("Tax : " + tax() + " TL");
		System.out.println("Bonus : " + bonus() + " TL");
		System.out.println("Raise Salary : " + raiseSalary() + " TL");
		System.out.println("Total Salary : " + newSalary() + " TL"); 
	}
	
	
}
