public class MCQuestion extends Question {
	private String questionText;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private String correctAnswer;
	
	
	public String getQuestionText() {
	    return questionText;
	}
	
	public void setQuestionText(String newQuestionText)  {
	    questionText = newQuestionText;
	}
	
	public String getChoiceA() {
		return choiceA;
	}

	public void setChoiceA(String newChoiceA) {
		choiceA = newChoiceA;
	}

	public String getChoiceB() {
		return choiceB;
	}

	public void setChoiceB(String newChoiceB) {
		choiceB = newChoiceB;
	}

	public String getChoiceC() {
		return choiceC;
	}

	public void setChoiceC(String newChoiceC) {
		choiceC = newChoiceC;
	}

	public String getChoiceD() {
		return choiceD;
	}

	public void setChoiceD(String newChoiceD) {
		choiceD = newChoiceD;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public void setCorrectAnswer(String newCorrectAnswer) {
		correctAnswer = newCorrectAnswer;
	}
	@Override
	public void askQuestion() {
	  super.askQuestion();
	  System.out.println(questionText);
	  System.out.println(choiceA);
	  System.out.println(choiceB);
	  System.out.println(choiceC);
		System.out.println(choiceD);
	}
}