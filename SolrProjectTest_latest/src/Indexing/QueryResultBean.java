package Indexing;

import java.util.List;



public class QueryResultBean {
	
	private String url;
	private String title;
	private  List<String> content;
	private String message;	
	private int indexerCount;
	

	public int getIndexerCount() {
		return indexerCount;
	}
	public void setIndexerCount(int i) {
		this.indexerCount = i;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getContent() {
		return content;
	}
	public void setContent(List<String> content) {
		this.content = content;
	}
	
	

}
