package com.oscar;

import javax.inject.Named;

@Named("theName")
public class JustTheName implements Person{
	private String lastName = "Castiblanco";


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}
}
