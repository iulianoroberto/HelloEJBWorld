package it.unisannio.application;

import javax.ejb.Local;

// Annotazione @Local presente di default.

@Local
public interface HelloLocal {
	public String sayHello();
}
