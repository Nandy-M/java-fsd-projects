package filehandle;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
	public static void main(String[] args) {
		String apmessage="The new Text is appended to the following .txt folder";
		
		try {
			FileWriter output=new FileWriter("F:\\newfile.txt",true);
			output.write(apmessage);
			System.out.println("File is Appended Successfully.");
			output.close();
		} catch (IOException e) {
			System.out.println("File Append Failed");
		}

	}

}
