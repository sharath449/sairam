package day3;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<String>();
		s.add("Selenium");
		s.add("UFT");
		s.add("Loadrunner");
		s.add("CodedUi");
		s.add("SoapUi");
		
		System.out.println(s.size());
		
		
//		System.out.println(s.get(0));
//		System.out.println(s.get(1));
//		System.out.println(s.get(2));
//		System.out.println(s.get(3));
//		System.out.println(s.get(4));
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
			
			
		}

	}

}
