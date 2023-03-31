package Practice;

import java.io.FileInputStream;
import java.util.Properties;

public class ProppertyFile {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
Properties p =new Properties();
p.load(fis);
String value = p.getProperty("url");
System.out.println(value);
} 
}
