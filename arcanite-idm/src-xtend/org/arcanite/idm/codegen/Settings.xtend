package org.arcanite.idm.codegen

class Settings {
	
	
	var doGetterAndSetters = Boolean.FALSE
	 
	
	new(Boolean doGetterAndSetters) {
		this.doGetterAndSetters = doGetterAndSetters 
	}
	
	def Boolean  doGetterAndSetters() {
		return this.doGetterAndSetters
	}
	
	def doGetterAndSetters(Boolean value) {
		this.doGetterAndSetters = value
	}
	
}