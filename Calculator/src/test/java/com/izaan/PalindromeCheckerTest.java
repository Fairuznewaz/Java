package com.izaan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        Assert.assertTrue(checker.isPalindrome("racecar"));
        Assert.assertFalse(checker.isPalindrome("hello"));
        Assert.assertFalse(checker.isPalindrome("mom"));
        Assert.assertFalse(checker.isPalindrome("dad"));
        Assert.assertFalse(checker.isPalindrome("wow"));

    }
}
