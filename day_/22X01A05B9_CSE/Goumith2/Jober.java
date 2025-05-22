package Goumith2;

import java.util.*;

class JoberIdInvalidException extends Exception{
	public JoberIdInvalidException(String message) {
		super(message);
	}
}

public class Jober {
	public static void  searchCheck(int search) throws JoberIdInvalidException{
		
	
	if(search<0 || search>999) {
		throw new JoberIdInvalidException("Invalid employee id");
	}else {
		System.out.println("Valid employee id");
	}
}

	public static void main(String[] args) {
		try {
			searchCheck(10000);
		}catch(JoberIdInvalidException e) {
		System.out.println(e.getMessage());
		

	}
	}

	}