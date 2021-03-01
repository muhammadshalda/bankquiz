package com.ruang301.bankquiz;

public class QuestionBank {

    private String textQuestions [] = {
            "Berapakah jumlah pulau yang ada di Indonesia ?",
            "Sebutkan ibukota Indonesia ? ",
            "Rencong adalah senjata khas yang berasal dari ? ",
            "iam going to .... for study",
            "120 * 5 + 2 +="

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"5", "6", "8", "10"},
            {"Jakarta", "Riau", "Surabaya", "Bengkulu"},
            {"Aceh", "Jawa", "Medan", "Papua"},
            {"Market", "Hotel", "School", "Hospital"},
            {"600", "602", "620", "650"}
    };

    private String mCorrectAnswers[] = {"5", "Jakarta", "Aceh", "School", "602"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
