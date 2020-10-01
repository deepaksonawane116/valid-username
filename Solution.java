package thirteenthquestion;
import java.util.Scanner;


public class TypeOfCharacter {
public static void main(String[] args){

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter character");
	//int a= sc.nextInt();
	char a= sc.next().charAt(0);
	
	if(a<=57&&a>=48)
	{
		System.out.println("Character is number");
	}else if(a<=90&&a>=65||a<=122&&a>=97)
		{
			System.out.println("Character is alphabet");
		}
		else
			System.out.println("Character is Special type");
	
