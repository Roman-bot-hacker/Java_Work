package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
	
	public String readInputText() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("Enter String:");
    	return br.readLine();
	}
	
	public void processText(String inputText, char letter, int wordLength, ProcessText process) {
		String pattern = "[^\\.!?]+[\\.!?]";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(inputText);
		while (m.find()) {
			process.secondPlaceWords(inputText.substring(m.start(), m.end()), letter);
			if (inputText.charAt(m.end()-1)=='?') {
				process.wordsInQuestion(inputText.substring(m.start(), m.end()), wordLength);
			}
		}
	}
	
	public void showResult(LinkedList<String> resultList1, 
							Set<String> resultList2) {
		resultList1.forEach((word) -> System.out.println(word));
		System.out.println();
		resultList2.forEach((word) -> System.out.println(word));
	}
}