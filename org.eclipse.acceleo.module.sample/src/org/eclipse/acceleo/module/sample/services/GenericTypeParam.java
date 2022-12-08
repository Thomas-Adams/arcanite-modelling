package org.eclipse.acceleo.module.sample.services;

public class GenericTypeParam {
	public String name = "";

	public String simpleClassName = "";

	public String instanceClassname = "";

	public GenericTypeParam(final String name) {
		this.name = name;
	}

	public GenericTypeParam(final String name, final String simpleClassName, final String instanceClassname) {
		this.name = name;
		this.simpleClassName = simpleClassName;
		this.instanceClassname = instanceClassname;
	}
}
