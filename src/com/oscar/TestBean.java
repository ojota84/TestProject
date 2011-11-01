package com.oscar;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class TestBean {
	private String name ="Oscar";

	@Inject @Named("theName")
	private Person person;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}	
}
