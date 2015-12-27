package org.hypernovae.apis.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class XmlOmHandler {
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;
	public Marshaller getMarshaller() {
		return marshaller;
	}
	public void setMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
	}
	public Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}
	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}
	
	public void fromObjectToXml(Object object, String filePath) throws IOException {
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(filePath);
			getMarshaller().marshal(object, new StreamResult(os));
		} finally {
			if (os != null) {
				os.close();
			}
		}
		
	}
	
	public Object fromXmlToObject(String xmlFile) throws IOException {
		
		FileInputStream is = null;
		try {
			is = new FileInputStream(xmlFile);
			return getUnmarshaller().unmarshal(new StreamSource(is));
			
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}
	
	

}
