package lab4;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ProcessText process = new ProcessText();
		StringProcessor processor = new StringProcessor();
		try {
			processor.processText(processor.readInputText(), 'i', 4, process);
		} catch (IOException e) {
			System.out.println("You don't enter text we need!");
		}
		processor.showResult(process.getWordsResult(), process.getQuestionResult());
	}

}
