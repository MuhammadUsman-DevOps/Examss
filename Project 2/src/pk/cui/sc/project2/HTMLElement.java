package pk.cui.sc.project2;

public class HTMLElement extends HTMLTag {
	
	
	private String tagName;
	private String startTag; 
	private String endTag;
	private String tagBody;
	
	public HTMLElement(String tagName){
		this.tagName = tagName;
	}
	public String getTagName() {
		
		return tagName;
	}

	public void setStartTag(String tag)
	{
		this.startTag = tag;
	}
	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	public void setTagBody(String tagBody){
		
		this.tagBody = tagBody;
	}
	public void generateHtml() {
		
		System.out.println(startTag+""+tagBody+""+endTag);
	}


}
