package com.bridglabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenContainsSadItShouldReturnSadMood() {
        JunitMoodAnalyzer moodAnalyser = new JunitMoodAnalyzer("I am Sad");
        String actualResult = moodAnalyser.moodAnalyser();
        String expectedMood = "sad";
        Assertions Assert = null;
        Assert.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenContainsHappyItShouldReturnHappyMood() {
        JunitMoodAnalyzer moodAnalyser = new JunitMoodAnalyzer("I am Happy");
        String actualResult = moodAnalyser.moodAnalyser();
        String expectedMood = "happy";
        Assertions Assert = null;
        Assert.assertEquals(actualResult, expectedMood);
    }
}
