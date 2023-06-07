import java.util.Scanner;
class ExtractDigit1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
String strobj=sc.LowerCase();
String rev="";
for(int i=strobj.length()-1;i>=0;i--){rev=rev+strobj.charAt(i);}
//System.out.println(strobj+" "+rev);
if(strobj.equals(rev))
{
System.out.print("YES");
}
else
{
System.out.println("NO");
}
}
}
