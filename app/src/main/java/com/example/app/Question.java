package com.example.app;

public class Question {
    // instance variables
    private String qtext;
    private boolean correctAnswer;

    //constructor(s)
    public Question()
    {
        qtext = "Question undefined";
        correctAnswer = false;
    }
    public Question(String newQtext, boolean newCorrectAnswer)
    {
        qtext = newQtext;
        correctAnswer = newCorrectAnswer;
    }

    public Question(String s) {
    }

    @Override
    public String toString()
    {
        return "The question text is: " + qtext + ". The correct answer is: " + correctAnswer + ".";
    }


    // methods
    public String getQtext()
    {
        return qtext;
    }
    public void setQtext(String newQtext)
    {
        qtext = newQtext;
    }
    public boolean CorrectAnswer()
    { return correctAnswer;
    }
    public void setCorrectAnswer(boolean newCorrectAnswer) {
        correctAnswer = newCorrectAnswer;
    }

    public boolean getCorrectAnswer() {
        return false;
    }
}
