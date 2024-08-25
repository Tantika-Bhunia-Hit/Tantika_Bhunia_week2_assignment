package Assignment2;

public class Main 
{
	
	    public static void main(String[] args) {
	        
	        Person person = new Person("Tantika", 23);
	        person.displayDetails();  

	       
	        BankAccount account = new BankAccount();
	        account.displayBalance(); 

	       
	        account.deposit(200); 
	        account.withdraw(100); 
	        account.displayBalance(); 

	       
	        System.out.println("Demonstrating method overloading:");
	        MethodOverloadingDemo demo = new MethodOverloadingDemo();
	        demo.add(5, 10);          
	        demo.add(5.5, 10.5);      
	        demo.add("week ", "Two"); 
	    }
	}

	
	class MethodOverloadingDemo {
	   
	    public void add(int a, int b) {
	        System.out.println("Sum of integers: " + (a + b));
	    }

	
	    public void add(double a, double b) {
	        System.out.println("Sum of doubles: " + (a + b));
	    }

	   
	    public void add(String a, String b) {
	        System.out.println("Concatenated string: " + a + " " + b);
	    }
	}



