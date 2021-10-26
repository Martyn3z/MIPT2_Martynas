package com.example.mipt2_martynas;

import android.widget.TextView;

public class CountActivity {

    public static int countEverything(TextView counter, String text){
        int length=text.length();
        String lengthConverted = String.valueOf(length);
        counter.setText(lengthConverted);
        return 0;
    }

    public static int countWords(TextView counter, String text){
        int words=0,j;
        int length=text.length();
        for (int i=0; i<length-1; i++) {
            j = i + 1;
            if (Character.isLetter(text.charAt(j)) && j == length-1 || Character.isLetter(text.charAt(i)) && text.charAt(j) == ',' || Character.isLetter(text.charAt(i)) && text.charAt(j) == '.' || Character.isLetter(text.charAt(i)) && text.charAt(j) == ' ')
                words++;
        }
        String wordsConverted = String.valueOf(words);
        counter.setText(wordsConverted);
        return 0;
    }
}
