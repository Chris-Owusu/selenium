package test;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class readWrite {

	public static void main(String[] args) throws IOException {
	
		
		// Read property
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\eclipseWorkflow\\123\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputstream);
		System.out.println(properties.getProperty("browser"));
		
		
		//Write
		FileOutputStream outputstream = new FileOutputStream("C:\\eclipseWorkflow\\123\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("newData", "newInfo");
		
		properties.store(outputstream, null);
	}

}
