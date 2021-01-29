package Introduction_to_Java_12;

public class Char_Strings_Demo {

	public static void main(String[] args) {
		
		int i = 10;

		//Part-6
		//Implicit conversion
		char ch;
		
		ch = 97;
		System.out.println(ch);
		
		i = ch;
		
		i = ch + 2;
		System.out.println(i);
		//char ----> integer
		System.out.println(ch + 2);
		
		//'a' + 'b' --> 97 + 98 = 195
		System.out.println(ch + 'b');
		
		ch = (char)(ch + 2);
		
		System.out.println(ch);
		
		//Part - 7
		
		System.out.println("-----------------------");
		String name = "abc";
		System.out.println(name);

		System.out.println("Hi" + "Hello");
		
		//30 + "Hello" + 10 + 20
		//"30" + "Hello" + 10 + 20
		//"30Hello" + 10 + 20
		//"30Hello" + "10" + 20
		//"30Hello10" + 20
		//"30Hello10" + "20"
		//"30Hello1020"
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		
		//int + char ---> int + int
		//2 + 9 + 5 = 16
		System.out.println(2 + '\t' + 5);
		
		System.out.println(2 + " " + 5);
		
		System.out.println("Hello" + '\t' + "World");
		System.out.println("Hello" + "\t" + "World");
		
		
		System.out.println("\t");
	}

}
