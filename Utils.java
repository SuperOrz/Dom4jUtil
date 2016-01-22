package Dom4jUtil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Utils {
	public static Document getDocument(String path) {
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read(path);
			return doc;
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void  xmlWriteBack(Document doc,String path) {
		try {
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(new FileOutputStream(path), format);
			writer.write(doc);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
