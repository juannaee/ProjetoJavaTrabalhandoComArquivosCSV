package model.service;

public interface ConcatenatingStringService {

	 static String concatenatingString(String login,String password,Double salary) {
		 return login + "," + password + "," + salary;
			 
		}
	
}
