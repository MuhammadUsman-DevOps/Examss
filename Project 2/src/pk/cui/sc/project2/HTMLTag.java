package pk.cui.sc.project2;
import java.util.List;

public abstract class HTMLTag {
	
	String tagName; 
	public HTMLTag() { //construct
		
	}
	
	//below are the abstract methods
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	
	
	public void setTagBody(String tagBody){
	}
	
	
	public void addChildTag(HTMLTag htmlTag){
	
	}
	
	public void removeChildTag(HTMLTag htmlTag){

	}
	
	
	public List<HTMLTag>getChildren(){
		throw new UnsupportedOperationException("not supported yet");
	}
	public abstract void generateHtml(); //abstract method
	
}
