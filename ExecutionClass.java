package org.learninterface;

public class ExecutionClass implements Language,TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("testing tool is Selenium");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Language is Java");
	}
	public static void main(String[] args) {
 ExecutionClass executionclass = new ExecutionClass();
 executionclass.Java();
 executionclass.Selenium();
	}
 
}
