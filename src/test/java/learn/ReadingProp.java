package learn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     Properties p = new Properties();
     FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
     p.load(file);
     
    String url = p.getProperty("url");
    String email = p.getProperty("email");
    String pwd = p.getProperty("password");
    String ordid = p.getProperty("orderid");
    String cusid = p.getProperty("customerid");
    
     Set<String> keys =  p.stringPropertyNames();
     //Set<Object> keys = p.keySet();
     
     //Reading all values from properties file
     Collection<Object> values = p.values();
	}

}
