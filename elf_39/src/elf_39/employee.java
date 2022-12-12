package elf_39;

public class employee {
	String Name;
int salary;
int employeeid;
employee(String Name,int salary,int employeeid){
	this.Name=Name;
	this.salary=salary;
	this.employeeid=employeeid;
	System.out.println(this.Name+" "+this.salary+ " "+this.employeeid);
}
public static void main(String[]args) {
	employee s1=new employee("pinky",100,01);
	employee s2=new employee("rozy",200,02);
	employee s3=new employee("julie",3100,03);
	employee s4=new employee("raja",400,04);
	employee s5=new employee("rani",500,05);
	
}
}