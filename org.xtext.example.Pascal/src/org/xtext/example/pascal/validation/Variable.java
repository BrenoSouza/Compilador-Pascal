package org.xtext.example.pascal.validation;

import org.xtext.example.pascal.pascal.type;

public class Variable {

	private String name;
	private type type;
	private boolean inherited;
	private VariableType varType;
	
	public Variable(String name, type type, boolean inherited, VariableType varType) {
		this.name = name;
		this.type = type;
		this.inherited = inherited;
		this.varType = varType;
	}
	
	public Variable(String name) {
		this(name, null, false, VariableType.VARIABLE);
	}
	
	public String getName() {
		return this.name;
	}
	
	public type getType() {
		return this.type;
	}
	
	public boolean isInherited() {
		return this.inherited;
	}
	
	public VariableType getVarType() {
		return this.varType;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Variable))
			return false;
		Variable other = (Variable) obj;
		return other.name.toLowerCase().equals(this.name.toLowerCase());
	}
	
	@Override
	public String toString() {
		return "[" + this.name + ", " + this.inherited + (this.varType == null ? "" : ", " + this.varType) + "]";
	}
	
}