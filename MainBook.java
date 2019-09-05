import java.util.*;
class Book
{
String name=new String();
String author=new String();
int price,pages;
void intake()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the name of the book and author");
name=s.next();
author=s.next();
System.out.println("Enter the price of the book and the number of pages of the book");
price=s.nextInt();
pages=s.nextInt();
}
void Book()
{}
void display()
{

System.out.println("The price of the book is :"+price+"the no.of pages in the book is :"+pages);
}
public String toString()
{String name1= new String();
name1="The name of the book is :"+name+""+"The author of the book is :"+author;
return name1;
}

}
class MainBook
{
public static void main(String xx[])
{int n;
Scanner p=new Scanner(System.in);
System.out.println("Enter the number of object you want to create:");
n=p.nextInt();
Book object[]=new Book[n];
for(int i=0;i<n;i++)
{
object[i]=new Book();
object[i].intake();
}
for(int i=0;i<n;i++)
{
object[i].display();
System.out.println(object[i]);
}

}
}

