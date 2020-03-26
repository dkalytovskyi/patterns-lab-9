package com.lab9.abtractfactory;

/*
 *  №2
 *  Визначити специфікації класів для подання сімейства інструментів універсального інтерактивного 
 *  середовища розробки (Validator, Compiler, Debugger) з їх реалізацією для різних мов (Java, C++). 
 *  Забезпечити можливість прозорого для клієнта розширення реалізацією для мов (ObjectPascal). 
 */

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Java:");
		Tool tool1 = new Tool("Java"); 
		tool1.createTools();
		tool1.validate();
		tool1.compile();
		tool1.debug();
		
		System.out.println();
		
		System.out.println("C++:");
		Tool tool2 = new Tool("C++"); 
		tool2.createTools();
		tool2.validate();
		tool2.compile();
		tool2.debug();
		
		System.out.println();
		
		System.out.println("ObjectPascal:");
		Tool tool3 = new Tool("ObjectPascal"); 
		tool3.createTools();
		tool3.validate();
		tool3.compile();
		tool3.debug();
	}

}
