import java.util.List;
import java.util.ArrayList;
class Main8{
public static void main(String args[]){
List<Integer>numbers=new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+numbers);
int index=numbers.indexOf(2);
System.out.println("Position of 3 is"+index);
int removedNumber=numbers.removed(1);
System.out.println("List:"+numbers);
}
}

