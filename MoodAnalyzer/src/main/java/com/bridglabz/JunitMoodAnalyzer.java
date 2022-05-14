package com.bridglabz;

public class JunitMoodAnalyzer {
    String message;
    public JunitMoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodAnalyser() {
        if (this.message.toLowerCase().contains("sad")) {
            return "sad";
        } else {
            return "happy";
        }
    }
}

