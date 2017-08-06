package org.cpm.zerowastelife.debugger;

class App {
	
    public static void main( String[] args ) {
    	
    	Employee em25 = new Employee(25, "Joy", 80000);
    	System.out.println(em25.getId());
    	System.out.println(em25.getName());
    	System.out.println(em25.getSalary());
    	em25.promote(5000);
    	System.out.println(em25.getSalary());
    	
    	
    }
}
