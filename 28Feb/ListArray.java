 package com.cts.training.controller.Feb27;

import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>list=new ArrayList<Integer>();
		ArrayList <Integer>list1=new ArrayList<Integer>();
		ArrayList <Integer>list2=new ArrayList<Integer>();
		list.add(20);
		list.add(40);
		list.add(35);
		list.add(80);
		list.add(62);
		System.out.println(list);
		
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) % 2==0 &&list.get(i)%5==0)
			{
				list1.add(list.get(i));
			}
		}
//		for(int i=0;i<list1.size();i++)
//		{
			System.out.println("Array list is="+list1);
		//}

			//for (Integer i :list)
			for(int i=0;i<list.size();i++)
			{
				list2.add(list.get(i)*2);
			}
			
				System.out.println("Double Array Element is="+list2);
		
	}

}
