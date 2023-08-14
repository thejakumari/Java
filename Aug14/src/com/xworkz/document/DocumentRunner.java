package com.xworkz.document;

public class DocumentRunner {
	public static void main(String[] args) {
		System.out.println("Invoing main in DocumentRunner");
		
		Document document=new StoryDocument();

		System.out.println(document.copy());
		System.out.println(document.edit());
		System.out.println(document.getAuthor());
		System.out.println(document.getContent());
		System.out.println(document.getPageCount());
		System.out.println(document.getTitle());
		System.out.println(document.open());
		System.out.println(document.close());
		System.out.println(document.print());
		System.out.println(document.save());
	}

}
