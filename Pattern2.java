import java.util.Scanner;
class Main
{static int x=0;
public static void printPattern4(int n){
for(int i=0;x<=n;i++}{printLine(i);System.out.println();}
}
public static void printPattern3(int stop){
for(int i=0;i<=stop;i++){System.out.print(x++);
if(i<stop)System.out.print(" ,");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printpattern4(n);
}
}
