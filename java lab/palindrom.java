import java.util.Scanner;
class Palindrom
{
public static void main(String args[])
{
String str,rev="";
System.out.println("enter a string:");
Scanner s=new Scanner(System.in) ;
str=s.nextLine();
int len=str.length();
for(int i=len-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
if(str.equals(rev))
{
System.out.println(str +" is a palindrome");
}
else
{
System.out.println(str + "is not a palindrom");
}
s.close();
}
}
