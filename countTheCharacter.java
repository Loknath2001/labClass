import java.util.Scanner;  
public class CountTheCharacter
{  
public static void main(String args[])   
{  
String str;  
int i, len;  
int counter[] = new int[256];  
Scanner scanner = new Scanner(System.in);  
System.out.print("Please enter a string: ");  
//reading a string from the user  
str = scanner.nextLine();  
//finds the length of the string  
len = str.length();  
// loop through the string and count frequency of every character and store it in counter array  
for (i = 0; i < len; i++)   
{  
counter[(int) str.charAt(i)]++;  
}  
//print Frequency of characters  
for (i = 0; i < 256; i++)   
{  
if (counter[i] != 0)   
{  
//prints frequency of characters      
System.out.println((char) i + " --> " + counter[i]);  
}  
}  
}  
}  