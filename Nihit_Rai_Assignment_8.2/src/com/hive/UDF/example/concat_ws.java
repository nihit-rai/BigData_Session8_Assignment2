package com.hive.UDF.example;
import java.util.ArrayList;
import org.apache.hadoop.hive.ql.exec.UDF;
/**
 * 
 * @author Nihit Rai
 * HIVE UDF for Assignment 8.2
 * hive UDF that implements functionality of string concat_ws(string SEP, array<string>). 
 * This UDF will accept two arguments, one string and one array of string. 
 * It will return a single string where all the elements of the array are separated by the SEP
 *
 */
public class concat_ws extends UDF{
	
	public String evaluate(String SEP, ArrayList<String> strArray)
	{
		//using string builder
		StringBuilder sb = new StringBuilder();
		
		//enhanced for loop for iterating over string array and appending array element and SEP to StringBuilder
		for (String str : strArray)
		{
			sb.append(str);
			sb.append(SEP);
		}
		
		//Removing extra SEP from end of string builder
		sb.setLength(sb.length() - SEP.length());
		//Converting string builder to String and returning it 
		return sb.toString();
	}
}
