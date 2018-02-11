package com.shenqi.mybatis;

import org.xml.sax.SAXException;

import com.shenqi.mybatis.manual.BuilderTableMapping;

public class GeneratorBuilderXMLMapping {

	
	/**
	 * @param args
	 * @throws SAXException 
	 */
	public static void main(String[] args) {
		BuilderTableMapping t = new BuilderTableMapping();
		t.queryTables();
		t.printXml();
		

		
	}
	

	

}
