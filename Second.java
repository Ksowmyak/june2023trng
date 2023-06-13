class First2 implements Runnable
{
Thread t; String S;
First2(String Name){
S=Name;
t=new Thread(this,S);
System.out.println("CHILD:"+t);
t.start();
}
public void run(){
try{for(int i=5;i>0;i--){
System.out.println("S+":"+i);
Thread.sleep(1000);}
}//END OF TRY BLOCK
catch(InterruptedException e){ }
System.out.println("EXITING" +S);
}
}
class Second3
{
public static void main(String args[])throws Exception
{
new First("ONE");
new First("TWO");
new First("THREE");
try{
Thread.sleep(2000);
}//END OF TRY BLOCK
catch(Exception e){}
System.out.println("Exiting main");
}
}