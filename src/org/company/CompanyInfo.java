package org.company;

public class CompanyInfo {
	   public void companyName(String name) {
		      System.out.println(name); 
		   
	  
	   }
	   public void companyName(String email, long phone) {
		      System.out.println(email + "\n" +phone);
	   }
	   
	   public void companyName(int Id, String gender, double Salary) {
		      System.out.println(Id + "\n" + gender+ "\n" + Salary);
	   }
	   
	   public static void main(String[] args) {
		      CompanyInfo c= new CompanyInfo();
		      c.companyName("CTS");
		      c.companyName("harshini.jayachandran@gmail.com", 9884843213l);
		      c.companyName(1230,"Female", 42000);
	}
	   
}
