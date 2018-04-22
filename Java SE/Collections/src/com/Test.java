package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		ProcessData<Object> pd=new ProcessData<>();
		pd.add("Praveen");
		pd.add("Ozvitha");
		pd.add(1000);
		for(Object obj:pd.objs) {
			if(obj!=null)
			System.out.println(obj);
		}
		
		System.out.println(pd);
		Map<Object, String> m=new HashMap<>();
		Set<Object> s= m.keySet();
		
		

	}

}
