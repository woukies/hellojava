package api;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Test {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = dbf.newDocumentBuilder();
			Document xmlDoc = parser.parse("res/xml/book.xml");
			Element root = xmlDoc.getDocumentElement();
			
			for (int i = 0 ; i < root.getElementsByTagName("book").getLength(); i++) {
				Node bookNode = root.getElementsByTagName("book").item(i);
				
				// ((Element) bookNode).getAttribute("isbn")
				System.out.println(bookNode.getAttributes().getNamedItem("isbn").getTextContent());
				System.out.println(((Element) bookNode).getAttribute("kind"));
				System.out.print(((Element)((Element) bookNode).getElementsByTagName("title").item(0)).getTagName() + ": ");
				System.out.println(((Element)((Element) bookNode).getElementsByTagName("title").item(0)).getTextContent());
				System.out.print(((Element) bookNode).getElementsByTagName("author").item(0).getNodeName() + ": ");
				System.out.println(((Element) bookNode).getElementsByTagName("author").item(0).getTextContent());
				
				System.out.print(((Element) bookNode).getElementsByTagName("price").item(0).getNodeName() + ": ");
				System.out.println(((Element) bookNode).getElementsByTagName("price").item(0).getTextContent());
				
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
