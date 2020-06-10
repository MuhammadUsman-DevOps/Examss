package pk.cui.sc.project2;

import java.util.ArrayList;
import java.util.List;

public class HTMLParentElement extends HTMLTag {
	
	private String tagName; //name of tag
	private String startTag; //start tage
	private String endTag; //end tag variable
	
	private List<HTMLTag>childrenTag;
	
	public HTMLParentElement(String tagName){ // constructor
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
	}
	
	//below are getter and settters
	public String getTagName() {
		return tagName;
	}

	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	public void addChildTag(HTMLTag htmlTag){
		childrenTag.add(htmlTag);
	}
	
	public void removeChildTag(HTMLTag htmlTag){
		childrenTag.remove(htmlTag);
	}

	public List<HTMLTag>getChildren(){
		return childrenTag;
	}

	public void generateHtml() {
		
		System.out.println(startTag);
		for(HTMLTag tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}

}
