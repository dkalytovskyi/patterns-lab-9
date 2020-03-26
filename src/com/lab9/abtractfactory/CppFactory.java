package com.lab9.abtractfactory;

public class CppFactory implements ToolFactory {

	@Override
	public Validator createValidator() {
		return new CppValidator();
	}

	@Override
	public Compiler createCompiler() {
		return new CppCompiler();
	}

	@Override
	public Debugger createDebugger() {
		return new CppDebugger();
	}

}
