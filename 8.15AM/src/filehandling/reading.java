package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reading {
	
	public static void main(String[] args) throws IOException {
		
		
		//File                : reach the path    : pass path of the file as input
		//FileReader          : fetch that file   : pass file object as input  
		//BufferedReader      : read that file    : pass filereader object as input 
		
		// nonstatic 
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\8.15AM\\dk.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line;
		
	while((line=br.readLine())!=null)
	{
		System.out.println(line);
	}
	}
	
	// first time  br.readline reads 1st line and store in line variable    line=hi   line!=null  print hi
	// second time br.readline reads 2nd line and store in line          line=welcome line!=null  print welcome
	// third time  br.readline reads null   line=null    null!=null // terminate 

}
