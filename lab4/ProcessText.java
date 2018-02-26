package lab4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcessText {
	private LinkedList<String> wordsResult = new LinkedList<>();
	
	private Set<String> questionsResult = new HashSet<>();
	
	public LinkedList<String> getWordsResult() {
		return wordsResult;
	}
	
	public Set<String> getQuestionResult() {
		return questionsResult;
	}
	
	public void secondPlaceWords(String inputText, char letter) {
		String pattern = "\\w+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(inputText);
		m.find();
		m.find();
		if (inputText.charAt(m.start())==letter) {
			wordsResult.add(inputText.substring(m.start(), m.end()));
		}
	}
	public void wordsInQuestion(String inputText, int wordLength) {
		String pattern = "\\w+";
		inputText = inputText.toLowerCase();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(inputText);
		while (m.find()) {
			if (inputText.substring(m.start(), m.end()).length()==wordLength) {
				questionsResult.add(inputText.substring(m.start(), m.end()));
			}
		}
	}
}
