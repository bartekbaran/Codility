import java.util.*;

class Solution {
	public int solution(String S) {
		Stack<Character> bracketsStack = new Stack<>();

		for (char c : S.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				bracketsStack.push(c);
			} else {
				if (bracketsStack.isEmpty()) {
					return 0;
				} else {
					char opening = bracketsStack.pop();
					if (!doBracketsMatch(opening, c)) {
						return 0;
					}
				}
			}
		}

		return bracketsStack.isEmpty() ? 1 : 0;
	}

	private boolean doBracketsMatch(char opening, char closing) {
		return (opening == '(' && closing == ')') ||
			   (opening == '{' && closing == '}') ||
			   (opening == '[' && closing == ']');
	}
}