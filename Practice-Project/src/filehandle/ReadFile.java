package filehandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {  
	try {  
          
        File f1 = new File("F:\\newfile.txt");    
        Scanner userdataReader = new Scanner(f1);  
        while (userdataReader.hasNextLine()) {  
            String fileData = userdataReader.nextLine();  
            System.out.println(fileData);  
        }  
        userdataReader.close();  
    } catch (FileNotFoundException exception) {  
        System.out.println("Unexcpected error occurred-Error in the read file");  
        exception.printStackTrace();  
    }  
}  

}

