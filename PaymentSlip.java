package inlämningEtt;

public class PaymentSlip {
	private String name;
	private int hourlyRate;
	private int hours;
	private static final double tax=0.7;

	public PaymentSlip() {
	}
	
	public PaymentSlip(String name, int hourlyRate, int hours) {
		this.name=name;
		this.hourlyRate=hourlyRate;
		this.hours=hours;
	}
	 
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	} 
	
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate=hourlyRate;
	}
	
	public int gethours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours=hours;
	}
	
	public int calculateSalary() {
		return hours*hourlyRate;
	}
	
	public double calculateNetSalary() {
		return calculateSalary()*tax;
	}
	
}
