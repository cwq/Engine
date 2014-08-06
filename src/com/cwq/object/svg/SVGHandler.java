package com.cwq.object.svg;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SVGHandler extends DefaultHandler {
	
	private static final String TAG_SVG = "svg";
	
	private static final String TAG_CIRCLE = "circle";
	private static final String TAG_ELLIPSE = "ellipse";
	private static final String TAG_LINE = "line";
	private static final String TAG_PATH = "path";
	private static final String TAG_POLYGON = "polygon";
	private static final String TAG_POLYLINE = "polyline";
	private static final String TAG_RECTANGLE = "rect";
	
	private static final String ATTRIBUTE_X = "x";
	private static final String ATTRIBUTE_Y = "y";
	private static final String ATTRIBUTE_X1 = "x1";
	private static final String ATTRIBUTE_Y1 = "y1";
	private static final String ATTRIBUTE_X2 = "x2";
	private static final String ATTRIBUTE_Y2 = "y2";
	private static final String ATTRIBUTE_WIDTH = "width";
	private static final String ATTRIBUTE_HEIGHT = "height";
	
	private SVG svg;
	
	public SVG getSVG() {
		return svg;
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		svg = new SVG();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}
}
