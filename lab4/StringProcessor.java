package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
	
	private static final Pattern END_OF_SENTENCE_PATTERN = Pattern.compile("[^\\.!?]+[\\.!?]");

	private ProcessText process = new ProcessText();

	public ProcessText getProcess() {
		return process;
	}

	public String readInputText() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String:");
		return br.readLine();
	}

	public void processText(String inputText, char startLetter, int wordLength) {

		Matcher m = END_OF_SENTENCE_PATTERN.matcher(inputText);
		while (m.find()) {
			process.secondPlaceWords(inputText.substring(m.start(), m.end()), startLetter);
			if (inputText.charAt(m.end() - 1) == '?') {
				process.wordsInQuestion(inputText.substring(m.start(), m.end()), wordLength);
			}
		}
	}

	public void showResult(List<String> resultList1, Set<String> resultList2) {
		resultList1.forEach((word) -> System.out.println(word));
		System.out.println();
		resultList2.forEach((word) -> System.out.println(word));
	}
}
