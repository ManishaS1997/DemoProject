package com.FileOperations.ExcelFileRead;

import java.util.ArrayList;

public class StrDemo {

	public static void main(String[] args) {


		String str="My name is  Manisha";
		
		 final ArrayList list=new ArrayList();
		list.add(10);
		list.add(10);
		System.out.println(list);
		
		int count=0;
		char ch[]=str.toCharArray();
		String s[]=str.split(" ");
		System.out.println(s.length);
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(Character.isDigit(ch[i]))
			{
				count++;
			}
		}
		System.out.println("total count: "+count);
	}

}
