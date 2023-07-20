class TeacherKiller{
	public static void main(String[]values){
	System.out.println("Invoking TeacherKiller in main ");
	Teacher teacher=new Teacher();
	System.out.println(teacher.collegeName);
	System.out.println(teacher.noofclass);
	System.out.println(teacher.salary);
	System.out.println(teacher.subject);
	System.out.println(teacher.name);
	System.out.println("===============================================================");
	teacher.collegeName="SHPS";
	teacher.noofclass=6;
	teacher.salary=56000;
	teacher.subject="Hindi";
	teacher.name="Hemavathi";
	System.out.println(teacher.name);
	System.out.println(teacher.subject);
	System.out.println(teacher.salary);
	System.out.println(teacher.noofclass);
	System.out.println(teacher.collegeName);
	System.out.println("===============================================================");
	Teacher teacher1=new Teacher();
	System.out.println(teacher1.collegeName);
	System.out.println(teacher1.noofclass);
	System.out.println(teacher1.salary);
	System.out.println(teacher1.subject);
	System.out.println(teacher1.name);
	System.out.println("===============================================================");
	teacher1.collegeName="SHPS";
	teacher1.noofclass=8;
	teacher1.salary=60000;
	teacher1.subject="Maths";
	teacher1.name="Manjula";
	System.out.println(teacher1.name);
	System.out.println(teacher1.subject);
	System.out.println(teacher1.salary);
	System.out.println(teacher1.noofclass);
	System.out.println(teacher1.collegeName);
	}
}