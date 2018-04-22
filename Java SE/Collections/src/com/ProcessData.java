package com;

import java.util.HashMap;
import java.util.Map;

public class ProcessData<E> {

	static int count=0;
	Object[] objs = new Object[10];

	public E add(E element) {

		//objs[0] = new Object();
		objs[count] = element;
		count++;

		return element;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+objs.toString()+"]"; 
	}

}
