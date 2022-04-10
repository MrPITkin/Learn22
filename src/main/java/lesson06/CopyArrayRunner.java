package lesson06;

import java.util.Arrays;

public class CopyArrayRunner {

    public static void main(String[] args) {
        String[] words = {"Мама", "мыла", "раму"};
        String[] wordsMore = copyArray(words);
        wordsMore[words.length] = "финита ля комедия";
        System.out.println(Arrays.toString(wordsMore));
        String[] newArray = Arrays.copyOf(wordsMore, Math.round(wordsMore.length * 1.5f));
        System.out.println(Arrays.toString(newArray));

        String[] effectiveArray = new String[12];
        System.arraycopy(words, 1, effectiveArray, 7, words.length-2);
        int firstIndex = 3;
// System.arraycopy быстрее, чем Arrays.copyOf
        System.arraycopy(wordsMore, firstIndex, effectiveArray, 1, wordsMore.length-firstIndex);
        System.out.println(Arrays.toString(effectiveArray));
    }

    private static String[] copyArray(String[] words) {
        String[] newAdd = new String[Math.round(words.length * 1.5f)];
        for (int i = 0; i < words.length; i++) {
            newAdd[i] = words[i];
        }
        return newAdd;
    }
}
