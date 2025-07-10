package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public static String  getDataFromPropertyFile(String key) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		p.load(new FileInputStream("./commonData.properties"));
		String data = p.getProperty(key);
		return data;
	}

}
