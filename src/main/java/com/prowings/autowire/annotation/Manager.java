package com.prowings.autowire.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//@Service(value = "mngr1")
@Repository(value = "mngr1")
//@Controller(value = "mngr1")
//@Component(value = "mngr1")
//@Scope()
public class Manager {
	@Value(value = "4")
	int id;
	@Value(value = "Suhas")
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + "]";
	}

}
