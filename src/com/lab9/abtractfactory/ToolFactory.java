package com.lab9.abtractfactory;

public interface ToolFactory {
	Validator createValidator();
	Compiler createCompiler();
	Debugger createDebugger();
}
