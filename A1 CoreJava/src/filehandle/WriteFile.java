package filehandle;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {  
		String message="I am NandhiniMurugesan.I hale from Cuddalore.";
	      
	    try {  
	        FileWriter fwrite = new FileWriter("F:\\newfile.txt");
	        // writing the content into the FileOperationExample.txt file  
	        fwrite.write(message);   
	   
	        // Closing the stream  
	        fwrite.close();   
	        System.out.println("Content is successfully wrote to the file.");  
	    } 
	    catch (IOException e) {  
	        System.out.println("Unexpected error occurred-File is not Created");  
	        e.printStackTrace();  
	        }  
	    }  

}
