import java.util.Scanner;
class Operation{
	void selectOption(){
		 System.out.println("\n---------------------- Choice The Operation To Perform -------------------- ");
		 System.out.println("\n\t 1 : String Constructor.");
		 System.out.println("\n\t 2 : String Length.");
		 System.out.println("\n\t 3 : Character Exctreaction(By Using charAt()).");
		 System.out.println("\n\t 4 : Character Exctreaction(By Using getChars()).");
		 System.out.println("\n\t 5 : Character Exctreaction(By Using byte[] getBytes()).");
		 System.out.println("\n\t 6 : Character Exctreaction(By Using char[] toCharArray()).");
		 System.out.println("\n\t 7 : String Comaprision(By Using equals()).");
		 System.out.println("\n\t 8 : String Comaprision(By Using equalsIgnoreCase()).");
		 System.out.println("\n\t 9 : String Comaprision(By Using regionMatches()).");
		 System.out.println("\n\t 10 : String Comaprision(By Using comapreTo()).");
		 System.out.println("\n\t 11 : Exit.");
	    }
	void stringConstructor(){
         System.out.println("\n\t-------------------- Program Of String Constructors -------------------- ");
         Scanner sc = new Scanner(System.in);
         System.out.print("\n\t\tEnter The Character : " );
         char[] chars = sc.next().toCharArray();
         System.out.println("\n\t\tValue Of Character Entered : " + chars); 
         String str1 = new String(chars);
         String str2 = new String(str1);
         System.out.println("\n\t\tValue Of String 1 : " + str1);
         System.out.println("\n\t\tValue Of String 2 : " + str2);
         System.out.println("\n------------------ Second Operation Of Find SubString ------------------ ");
         System.out.println("\n\t\tThe Character Value : " + str1);
         System.out.print("\n\t\tEnter The Strart Index : ");
         int startIndex = sc.nextInt();
         System.out.print("\n\t\tEnter The Number Of Character : " );
         int numChars = sc.nextInt();
         String str3 = new String(chars,startIndex,numChars);
         System.out.println("\n\t\tValue Of SubString : " + str3);
	    }
	void stringLength(){
		 System.out.println("\n--------------------- Program To Find String Length -------------------- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The Character : " );
         char[] chars = sc.next().toCharArray();
		 String str4 = new String(chars);
		 System.out.println("\n\t\tTotal Length Of String : " + str4.length());
	}
	void characterExctreaction1(){
		 System.out.println("\n-------- Program To Find Character Exctreaction(Using charAt()) -------- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The Character : " );
         char[] chars = sc.next().toCharArray();
		 System.out.print("\n\t\tEnter The Index Number : " );
		 int where = sc.nextInt();
		 String str5 = new String(chars);
		 System.out.println("\n\t\tValue  : " + str5.charAt(where));
	}
	void characterExctreaction2(){
		 System.out.println("\n------ Program To Find Character Exctreaction(Using getChars()) ------- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The String : " );
         String str6 = sc.nextLine();
		 System.out.print("\n\t\tEnter The Start Number : " );
		 int start = sc.nextInt();
		 System.out.print("\n\t\tEnter The End Number : " );
		 int end = sc.nextInt();
		 char buf[] = new char[end - start];
		 str6.getChars(start,end,buf,0);
		 System.out.print("\n\t\tValue : ");
		 System.out.print(buf);
	}
	void characterExctreaction3(){
		 System.out.println("\n--- Program To Find Character Exctreaction(Using byte[] getBytes()) --- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The String : " );
         String str7 = sc.nextLine();
		 byte[] array = str7.getBytes();
		 System.out.print("\n\t\tValue : ");
		 for(byte b : array){
			 System.out.print(b);
		 }
	}
	void characterExctreaction4(){
		 System.out.println("\n-- Program To Find Character Exctreaction(Using char[] toCharArray()) -- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The String : " );
         String str8 = sc.nextLine();
		 char[] array1 = str8.toCharArray();
		 System.out.print("\n\t\tValue : ");
		 for(char c : array1){
			 System.out.print(c);
		 }
	}
	void stringComaprison1(){
		 System.out.println("\n---------- Program To Find String Comparision(Using equals()) ---------- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The String 1 : " );
         String str9 = sc.nextLine();
		 System.out.print("\n\t\tEnter The String 2 : " );
         String str10 = sc.nextLine();
		 System.out.println("\n\t\tValue Of Equals : " + str9.equals(str10));
	}
	void stringComaprison2(){
		 System.out.println("\n----- Program To Find String Comparision(Using equalsIgnoreCase()) ----- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The String 1 : " );
         String str11 = sc.nextLine();
		 System.out.print("\n\t\tEnter The String 2 : " );
         String str12 = sc.nextLine();
		 System.out.println("\n\t\tValue Of Equals Ignore Case : " + str11.equalsIgnoreCase(str12));
	}
	void stringComaprison3(){
		 System.out.println("\n------- Program To Find String Comparision(Using regionMatches()) ----- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The String1 : " );
         String String1 = sc.nextLine();
		 System.out.print("\n\t\tEnter The String2 : " );
         String String2 = sc.nextLine();
		 System.out.print("\n\t\tEnter The Start Index : ");
		 int startIndex2 = sc.nextInt();
		 System.out.print("\n\t\tEnter The Second String Start Index : ");
		 int secStartIndex = sc.nextInt();
		 System.out.print("\n\t\tEnter The Number Of Character : ");
		 int numChar2 = sc.nextInt();
		 boolean regionmatches = String1.regionMatches(startIndex2,String2,secStartIndex,numChar2);
		 System.out.println("\n\t\tValue : " + regionmatches);
		 System.out.println("\n------------------- In Case Of Region Ignore Case -------------------- ");
		 boolean regionmatches1 = String1.regionMatches(true,startIndex2,String2,secStartIndex,numChar2);
		 System.out.println("\n\t\tValue : " + regionmatches1);
	}
	void stringComaprison4(){
		 System.out.println("\n------- Program To Find String Comparision(Using comapreTo()) -------- ");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\n\t\tEnter The String1 : " );
         String Str13 = sc.nextLine();
		 System.out.print("\n\t\tEnter The String2 : " );
         String Str14 = sc.nextLine();
		 int value = Str13.compareTo(Str14);
		 System.out.println("\n\t\tValue : " + value);
		 System.out.println("\n------------------------ Comapre To Ignore Case ---------------------- ");
		 int value2 = Str13.compareToIgnoreCase(Str14);
		 System.out.println("\n\t\tValue : " + value2);
	}
}
class StringHandling{
public static void main(String args[]){
    Operation op = new Operation();
	System.out.println("\n------------------------- String Handling Program ------------------------- ");
	op.selectOption();
	System.out.println("\n--------------------------------------------------------------------------- ");
	System.out.print("\n\t\tSelect The Above Option : ");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	System.out.println("\n--------------------------------------------------------------------------- ");
	switch(choice){
	    case 1:
	          op.stringConstructor();
			  break;
	    case 2:
	          op.stringLength();
			  break;
		case 3:	  
	          op.characterExctreaction1();
			  break;
		case 4:
	          op.characterExctreaction2();
			  break;
		case 5:
	          op.characterExctreaction3();
			  break;
	    case 6:
	          op.characterExctreaction4();
			  break;
	    case 7:
	          op.stringComaprison1();
			  break;
	    case 8:
	          op.stringComaprison2();
			  break;
	    case 9:
	          op.stringComaprison3();
			  break;
	    case 10:
	           op.stringComaprison4();
			   break;
		default:
		        System.out.println("\n--------------------------------------------------------------------------- ");
		        System.out.println("\n\t\t!......... Invalid .........!");
				System.out.println("\n--------------------------------------------------------------------------- ");
        }
		System.out.println("\n--------------------------------------------------------------------------- ");
		System.out.println("\n\t\tThanks For Using This Application.!");
    System.out.println("\n\t\t   Created By Ravi Chaurasia !");
		System.out.println("\n--------------------------------------------------------------------------- ");
 }
}
