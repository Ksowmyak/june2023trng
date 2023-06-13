class TryCatchExample4{
public static void main(String args[]){
try
{
int data=50/0;
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Can't divided by zero");
}
}