package com.cts.Parse.Example;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomeParserDemo {
	public static void main(String[] args) {
		System.out.println("Start of Main");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("employee.xml");
			Element element = document.getDocumentElement();
			System.out.println(element.getNodeName());
			NodeList list = element.getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				if (node.getNodeType() == node.ELEMENT_NODE) {
					System.out.println(node.getNodeName() + "  " + node.getTextContent());
				}
			}
		} catch (SAXException |IOException |ParserConfigurationException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("End of MAin");
	}

}
