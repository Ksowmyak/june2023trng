import java.util.*;
public class Program206
{
public static void main(String args[])
{
char ch;
System.out.print("Enter a character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9'))
System.out.println(ch+" is not special character:");
else
System.out.println(ch+" is special character:");
}
}
