package com.xworkz.document;

public abstract class Document {
	public String getTitle() {
		return "No Heart is Free";
	}
      public boolean open() {
    	  return true;
      }
    public String getAuthor() {
    	return "Barbara";
    }
   public boolean print() {
	   return true;
   }
    public String getContent() {
    	return "Eastern Poem";
    }
    public abstract boolean save();
    public abstract int   getPageCount();
    public abstract boolean copy();
   public abstract boolean close();
    
    public abstract boolean edit();
}

