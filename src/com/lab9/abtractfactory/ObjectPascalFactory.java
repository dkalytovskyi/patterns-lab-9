package com.lab9.abtractfactory;

public class ObjectPascalFactory implements ToolFactory {

	@Override
	public Validator createValidator() {
		return new ObjectPascalValidator();
	}

	@Override
	public Compiler createCompiler() {
		return new ObjectPascalCompiler();
	}

	@Override
	public Debugger createDebugger() {
		return new ObjectPascalDebugger();
	}

}
