package com.lab9.abtractfactory;

public class JavaFactory implements ToolFactory {

	@Override
	public Validator createValidator() {
		return new JavaValidator();
	}

	@Override
	public Compiler createCompiler() {
		return new JavaCompiler();
	}

	@Override
	public Debugger createDebugger() {
		return new JavaDebugger();
	}

}
