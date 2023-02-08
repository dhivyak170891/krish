package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing {
public static void main(String[] args) throws IOException {
	//File               : reach that file   :  pass path of the file as input
	//filewriter         : create a file     : pass file object as input
	//bufferedwriter     : write content     : pass filewriter object as input
	
	// nonstatic
	
	File f= new File("C:\\Users\\hp\\eclipse-workspace\\8.15AM\\sample.txt");
	FileWriter fw= new FileWriter(f);
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write("hi");
	bw.newLine();
	bw.write("welcome");
	bw.newLine();
	bw.write("hello");
	bw.newLine();
	bw.close();
}
}
