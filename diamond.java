/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    int size = 5;
		int length = 3;
// print first part of stars		
for(int i = 1; i <= length; i++)
{
//print spaces
for(int j = 0;j < length -i;j++)
{
System.out.print(" ");
}
//print stars
//1. print half of stars
for(int star = 1; star <= i; star++)
{
System.out.print("*");
}
for(int star = 1; star <= i-1; star++)
{
System.out.print("*");
}
System.out.println(" ");
}

// print second half of stars

for(int i = length -1 ; i > 0;i--)
{
//print spaces
for(int space = 0; space < length-i; space++)
{
System.out.print(" ");
}
//print stars
for(int star = 1; star <= i; star++)
{
System.out.print("*");
}
for(int star = 1;  star <= i-1; star++)
{
System.out.print("*");
}
System.out.println(" ");
}
	}
}
