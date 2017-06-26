/**
 * File Name: EmployeeApp.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 23, 2017
 */
package com.sqa.ec;

import com.sqa.ec.helpers.*;

/**
 * EmployeeApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class EmployeeApp
{

	private static String appName = "Employee Registration";

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name = AppBasics.greetUserAndGetName(appName);
		registerEmployee();
		AppBasics.fareWellUser(name);
	}

	public static void registerEmployee()
	{
		int numEmployee = AppBasics.requestInt("How many employee would you like to register?");
		String[] employeeName = new String[numEmployee];
		String[] employeeAddress = new String[numEmployee];
		int[] employeeAge = new int[numEmployee];
		String[] employeeCity = new String[numEmployee];
		String[] employeePhoneNumber = new String[numEmployee];
		String[] employeeJobTitle = new String[numEmployee];
		for (int i = 0; i < numEmployee; i++)
		{
			employeeName[i] = AppBasics.requestString("Enter employee name: ");
			employeeAddress[i] = AppBasics.requestString("Enter address: ");
			employeeAge[i] = AppBasics.requestInt("Enter age: ");
			employeeCity[i] = AppBasics.requestString("Enter city: ");
			employeePhoneNumber[i] = AppBasics.requestString("Enter phone number: ");
			employeeJobTitle[i] = AppBasics.requestString("Enter job title: ");
		}
		if (numEmployee == 0)
		{
			System.out.println("No employee was registered.\n");
		} else
		{
			System.out.println("\nHere's the list of employee...\n");
		}
		for (int j = 0; j < numEmployee; j++)
		{
			System.out.println(
					employeeName[j] + ", " + employeeAddress[j] + ", " + employeeAge[j] + ", " + employeeCity[j] + ", " + employeePhoneNumber[j] + ", " + employeeJobTitle[j]);
		}
	}
}
