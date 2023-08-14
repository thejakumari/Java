package com.xworkz.document;

public class StoryDocument extends Document {
	@Override
	public  boolean save() {
		return true;
	}
	@Override
    public  int   getPageCount() {
    	return 345;
    }
	@Override
    public  boolean copy() {
    	return true;
    }
	@Override
   public  boolean close() {
	   return true;
   }
    @Override
    public  boolean edit() {
    	return true;
    }

}
