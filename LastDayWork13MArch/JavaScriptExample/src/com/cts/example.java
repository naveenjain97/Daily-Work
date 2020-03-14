package com.cts;

public class example {
	public int i;
	public example(int i)
	{
		this.i=i;
	}
public static void main(String[] args) {
	example e= new example(98);
	example a2=e;
	a2.i=988;
	System.out.println(a2.i+"   "+e.i);
}
}
