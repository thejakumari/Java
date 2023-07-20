class ResumeKiller{
	public static void main(String[] values){
		System.out.println("Invoking main in ResumeKiller ");
		Resume.format();
		Resume.format("Combination Resume");
		Resume.format("Functional Resume",3);
		Resume.clear();
		Resume.delete();
	}
}