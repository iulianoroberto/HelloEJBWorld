package it.unisannio.application;

import javax.ejb.Stateless;

/*
 * EJB Session di tipo stateless
 */

@Stateless
public class HelloImpl implements HelloLocal{

	@Override
	public String sayHello() {
		return "Hello EJB World";
	}

}
