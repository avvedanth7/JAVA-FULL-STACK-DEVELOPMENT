package com.avvedanth7.ioc.applicationcontext;

import org.springframework.stereotype.Component;

@Component
public class Cat {
	void sleep() {
		System.out.println("cat is sleeping....");
	}
}
