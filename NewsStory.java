/**
 @author:	 Zachary Springer
 @date:		 06/07/2019
 desc:		 This program sets, gets, and displays a predefined news article
			 or can be modified to accept user input
*/
public class NewsStory {
	String guid;
	String title;
	String subject;
	String summary;
	String link;
	
	// Class Constructor
	public NewsStory(String guid){
		this.guid = guid;
	}
	
	// Setters
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	public void setSummary(String summary){
		this.summary = summary;
	} 
	
	public void setLink(String link){
		this.link = link;
	}
	
	// Getters
	public String getGuid(){
		return this.guid;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getSubject(){
		return this.subject;
	}
	
	public String getSummary(){
		return this.summary;
	}
	
	public String getLink(){
		return this.link;
	}
	
	// Displays info
	public void displayInfo(){
		System.out.println("GUID: " + this.guid);
		System.out.println("Title: " + this.title);
		System.out.println("Subject: " + this.subject);
		System.out.println("Summary: " + this.summary);
		System.out.println("Link: " + this.link);
	}
	
	// Main method
	public static void main(String[] args){
		NewsStory newsArticle = new NewsStory("ASDF");
		newsArticle.setTitle("World Peace Achieved!");
		newsArticle.setSubject("Politics");
		newsArticle.setSummary("With the advent of humanity becoming a transplanetary species, people now understand that working together will produce the best results");
		newsArticle.setLink("news.StineTech.com/World-Peace-Achieved");
		
		newsArticle.displayInfo();
	}
}
























