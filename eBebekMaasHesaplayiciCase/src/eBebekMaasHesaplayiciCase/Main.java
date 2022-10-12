package eBebekMaasHesaplayiciCase;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Ertuğrul TEKİN", 10000, 50, 2001);
		Employee employee2 = new Employee("Samira TEKİN", 7000, 40, 2012);
		Employee employee3 = new Employee("Erkan TEKİN", 8000, 45, 2006);
		
		employee1.run();
		employee2.run();
		employee3.run();

	}
}
