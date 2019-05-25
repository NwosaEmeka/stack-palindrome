import java.util.Stack;
public class symetrical {
	
	public static void main (String[]args){
		
		Stack<Character> st = new Stack<Character>();
		
		String word = "racecar";
		
		String newword = "";
		
		for (int i = 0; i < word.length(); i++){
			st.push(word.charAt(i));
		}
		
		while(!st.isEmpty()){
			newword += st.pop();
		}
		
		if (newword.equals(word)){
			System.out.println(word +" is palindrome");
		}
		else{
			System.out.println(word + "is not a palindrome");
		}

	}

}
