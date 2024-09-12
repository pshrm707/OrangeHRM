package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String fetchDataFromPropert(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstant.PROPERTYFILEPATH);
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty(key);
	}

}
