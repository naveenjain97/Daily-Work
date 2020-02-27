package com.cognizant.traning.nestedClass;

public class Geeneric {
	public static class GenericsType<T> {

	    private T t;
	    
	    public T get(){
	        return this.t;
	    }
	    
	    public void set(T t1){
	        this.t=t1;
	    }
	    
	    public static void main(String args[]){
	        GenericsType<String> type = new GenericsType<>();
	        type.set("Naveen"); //valid
	        String n = type.get();
	        System.out.println(n);
	        GenericsType type1 = new GenericsType(); //raw type
	        type1.set("naveen"); //valid
	        type1.set(10); //valid and autoboxing support
	        GenericsType<Integer> type11 = new GenericsType<>();
	    System.out.println(type11);
	    }
	}

}
