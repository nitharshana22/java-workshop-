package com.vetias.java.workshop.basic.string;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {
            @Test
            public void testWordCount(){
                WordCount wordCount = new WordCount();
                int count = wordCount.count("This is a java program");
                Assertions.assertEquals(10,count);
            }
}
 