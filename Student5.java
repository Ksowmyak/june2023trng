class Student6{
int id;
String name;
Student(int i,String n){
id=i;
name=n;
}
Student6(Student6 s){
id=s.id;
name=s.name;
}
void display(){System.out.println(id+" "+name);}
public static void main(String args[]){
Student5 s1=new Student5(111,"Karan");
Student5 s2=new Student5(s1);
s1.display();
s2.display();
}
}