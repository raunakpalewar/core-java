import java.util.Scanner;
class CharacterGame{

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);//C
		if(Character.isLowerCase(ch)){ 
			System.out.println("Given Alphabet is in Lowercase :" +ch);
		}
	
	}
}