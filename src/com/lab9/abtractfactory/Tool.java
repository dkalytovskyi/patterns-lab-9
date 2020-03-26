package com.lab9.abtractfactory;

public class Tool {
	private ToolFactory factory;
	private Validator validator;
	private Compiler compiler;
	private Debugger debugger;
	
	public Tool(String tool) {
		if (tool == "Java") {
			factory = new JavaFactory();
		} else if (tool == "C++") {
			factory = new CppFactory();
		} else if (tool == "ObjectPascal"){
			factory = new ObjectPascalFactory();
		}
	}
	
	public void createTools() {
		compiler = factory.createCompiler();
		validator = factory.createValidator();
		debugger = factory.createDebugger();
	}
	
	public void compile() {
		compiler.compile();
	}
	
	public void debug() {
		debugger.debug();
	}
	
	public void validate() {
		validator.validate();
	}
}
