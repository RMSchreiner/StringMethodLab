
public class StringMethodLab {

	public static void main(String[] args) {


		capitalize("ralph");
		wheresWaldo("Striped Waldo");
		firstThingsFirst("Richard","King");
		reverse("saippuakivikauppias"); //Finnish soapstone dealer (palindrome)
		soLong("Rhinoceros","Hippopotamus");
		afterMath("Is there any math in this?");
		afterMath("Is there any Math in this?");
		letterize("Java");
	}

	public static void capitalize(String word) { //capitalizes the first letter of a word and lower cases those that proceed
		String firstLetter = word.substring(0,1);
		firstLetter = firstLetter.toUpperCase();
		String restWord = word.substring(1);//substring is built to go to the end unless declared otherwise
		restWord = restWord.toLowerCase();
		String wholeWord = firstLetter + restWord;
		System.out.println(wholeWord);
	}

	public static void wheresWaldo(String phrase) { //finds waldo in a string phrase by searching for 'W' this could be extended to 'Waldo'
		System.out.println(phrase.indexOf('W'));

	}

	public static void firstThingsFirst(String a, String b) { //compares two strings and prints them in alphabetical order
		int difference = a.compareTo(b); //gives back a negative or positive number based upon distance removed of letters
		if (difference < 0) {            //function could error with the difference between Z and a
			System.out.println(a + " " + b);  //this can be solved for by converting the strings of the int difference to uppercase
		}
		else if (difference > 0) {
			System.out.println(b + " " + a); //this is structured so that the words are printed out in order
		}
		else {
			System.out.println("These both are the same word.");
		}
	}

	public static void reverse(String s) {
		StringBuilder str = new StringBuilder(s);
		System.out.println("string = " + str.reverse());
	}
	/*Following are some interesting facts about String and StringBuffer classes :
	 *1. Objects of String are immutable.
	 * 2. String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method.
	 * 3. StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.
	 */

	public static void soLong(String s1, String s2) {
		int whoseLonger = s1.length() - s2.length();

		if (whoseLonger < 0) {            
			System.out.println(s2);  
		}
		else if (whoseLonger > 0) {
			System.out.println(s1); 
		}
		else {
			System.out.println(s1 + " " + s2);
		}	
		// why did I need to add (" math")+1 so that I would not get the -1 out of range error when using a word other than math?
	}
	public static void afterMath(String phrase) {
		String edited = phrase.substring(phrase.indexOf(" math")+1, phrase.length());
		int intEdited = (phrase.length()-edited.length());
		if (intEdited > 1) {
			System.out.println(edited);
		}
		else {System.out.println("dud");}
	}

	public static void letterize(String word) { 

		for (int i = 0; i < word.length(); i++) {
			char c =word.charAt(i);
			System.out.println(c);
		}		
	}	
	/*public static char letterize(char word){ 
 	   		for (int i = 0; i < word.length(); i++) {
	         char c =word.charAt(i);
	         System.out.println(c);
		}*/
}
