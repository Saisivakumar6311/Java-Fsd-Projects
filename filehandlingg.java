package Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandlingg
{
	//Create New File
	
		public static void createFileUsingFileClass() throws IOException
		{
	    File file=new File("D:\\New\\createfile.txt");
	    if(file.createNewFile())
	    {
	    	System.out.println("file is created");
	    }
	    else
	    {
	    	System.out.println("File is already exist");
	    }
	    
	    // Write data to the files 
	    
	    FileWriter obj=new FileWriter(file,false);
	    obj.write("This is how writer files will work");
	    obj.close();
		
		
		//Append text to the files
		
		 FileWriter writer=new FileWriter(file,true);
		    writer.write("\nThis is appended text");
		    writer.close();
		    
		}
		  public static void readFileReaderClass() throws IOException
		    {
		    	
		    FileReader obj1=new FileReader("E:\\\\writeup\\\\file.txt");
		    int data;
		    while((data=obj1.read())!=-1)
		    {
		    	System.out.print((char)data);
		    }
		    
			}
		    
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The file is created");
		try {
			createFileUsingFileClass();
			readFileReaderClass();
		} catch (IOException e) {
			 System.out.println("Given File not is  available");
			e.printStackTrace();
		}

	}

}
