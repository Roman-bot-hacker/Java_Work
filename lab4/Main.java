package lab4;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		ProcessText process = new ProcessText();
		StringProcessor processor = new StringProcessor();
		processor.processText("It is Ukraine! want want want what?", 'I', 4, process);
		processor.showResult(process.getWordsResult(), process.getQuestionResult());
	}

}
