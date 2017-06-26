/**
 * File Name: ArraysApp.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 22, 2017
 */
package com.sqa.ec;

/**
 * ArraysApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class ArraysApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Must initialize with the size of array from the beginning
		char[] grade =
		{ 'A', 'B', 'C', 'D', 'E' };
		for (int i = 0; i < grade.length; i++)
		{
			System.out.println(grade[i] + " ");
		}
		int[] ages;
		ages = new int[]
		{ 4, 8, 12, 18, 36 };
		for (int j = 0; j < ages.length; j++)
		{
			System.out.println(ages[j] + " ");
		}
		double[] prices =
		{ 4.96, 2.99, 5.34, 1.99 };
		for (int i = 0; i < prices.length; i++)
		{
			System.out.println(prices[i]);
		}
		for (double d : prices)
		{
			System.out.println("Price: " + prices);
		}
		printArraySize(ages);
		String[] arrayOfString =
		{ "This", "will", "be", "an", "array", "of", "String", "!!!" };
		printArrayOfString(arrayOfString);
	}

	public static void printArrayOfString(String[] array)
	{
		for (int k = 0; k < array.length; k++)
		{
			System.out.print(array[k] + " ");
		}
	}

	public static void printArraySize(int[] intArray)
	{
		System.out.println("Array size is " + intArray.length + ".\n");
	}
}
