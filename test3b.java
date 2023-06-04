import java.util.Scanner;
class test3b{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println("Welcome");
for(int i=0;i<=10;i++)
{
System.out.println(num+"*"+i+"="+(num*i));
}
}