package inlämningEtt;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Assignment {
public static void main(String[] args) throws InterruptedException {
	Scanner myScanner=new Scanner (System.in);
	PaymentSlip myPaymentSlip=new PaymentSlip();
	
	String name;
	int hourlyRate;
	int hours; 
	
	System.out.println("What is the employee’s name?");
		name=myScanner.nextLine();
		myPaymentSlip.setName(name);
	
	System.out.println("What is their hourly rate?");
		hourlyRate=myScanner.nextInt();
		myPaymentSlip.setHourlyRate(hourlyRate);
		
	System.out.println("How many hours did they work this month?");
		hours=myScanner.nextInt();
		myPaymentSlip.setHours(hours);
		
	System.out.print("\nCalculating");
	
	for(int i=0;i<3;i++) {
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
	}
	
	System.out.println("\n--------------------");
	System.out.println("\n## PAYMENT SLIP ##\n");
	
	System.out.println("Name: \t\t\t" + myPaymentSlip.getName());
	System.out.println("Hourly rate: \t\t$"+myPaymentSlip.getHourlyRate()+"/h");
	System.out.println("Hours worked: \t\t"+myPaymentSlip.gethours()+" hours\n");
	System.out.println("Salary before tax: \t$"+myPaymentSlip.calculateSalary());
	System.out.println("Salary after tax: \t$"+myPaymentSlip.calculateNetSalary());
	System.out.println("\nIf you have any questions regarding your salary, contact Bob.\n");
	System.out.println("--------------------");	
	}
}