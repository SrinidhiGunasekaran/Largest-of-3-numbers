import java.util.*;
class Largest
{
public static void main(String args[])
{
int x,y,z;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if((x>y)&&(x>z))
{
System.out.println(x+" is greatest");
}
else if((y>x)&&(y>z))
{
System.out.println(y+" is greatest");
}
else if((z>x)&&(z>y))
{
System.out.println(z+" is greatest");
}
else if((x==y)&&(y==z)&&(x==z))
{
System.out.println("All numbers are equal");
}
}
}
