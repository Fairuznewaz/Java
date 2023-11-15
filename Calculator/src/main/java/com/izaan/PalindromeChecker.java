package com.izaan;

public class PalindromeChecker {

    public boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

}
