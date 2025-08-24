// strings

// public class Strings {
// public static void main(String args[]) {
// String name1 = "Tony";
// String name2 = "Tony";

// if (name1.equals(name2)) {
// System.out.println("They are the same string");
// } else {
// System.out.println("They are different strings");
// }

// DO NOT USE == to check for string equality
// // Gives correct answer here
// if (name1 == name2) {
// System.out.println("They are the same string");
// } else {
// System.out.println("They are different strings");
// }

// Gives incorrect answer here
// if(new String("Tony") == new String("Tony")) {
// System.out.println("They are the same string");
// } else {
// System.out.println("They are different strings");
// }

// }
// }

// ParseInt Method of Integer class
// public class Strings {
// public static void main(String args[]) {
// String str = "123";
// int number = Integer.parseInt(str);
// System.out.println(number);

// }
// }

// ToString Method of String class
// public class Strings {
// public static void main(String args[]) {
// int number = 123;
// String str = Integer.toString(number);
// System.out.println(str.length());

// }
// }

// questions of apni kaksha ==================================

// question 1 =>>Take an array of Strings input from the user & find the
// cumulative (combined) length of all those strings.

// substrings================================================================

// public class Strings {

// public static void main(String[] args) {

// // compare
// String sentence = "TonyStark";
// String name = sentence.substring(4);
// System.out.println(name);
// // strings are immutable
// }
// }

// stringbuilder============================================================

// public class Strings {
// public static void main(String[] args) {
// declaration
// StringBuilder sb = new StringBuilder("Hello");
// System.out.println(sb);

// charAt
// System.out.println(sb.charAt(2));

// setCharAt
// sb.setCharAt(0, 'y');
// System.out.println(sb);

// insert - it take the index place and remain shifts
// sb.insert(0, "c");
// System.out.println(sb);

// delete char
// sb.delete(0, 1);
// System.out.println(sb);

// append
// sb.append(" Stark");
// System.out.println(sb);

// System.out.println(sb.length());

// }
// }

// Reverse a String (using StringBuilder
// class)==============================================

// public class Strings {
// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder("HelloWorld");

// for (int i = 0; i < sb.length() / 2; i++) {

// index of front and back elements
// int front = i;
// int back = sb.length() - i - 1;

// setting charAt for back and front
// char frontchar = sb.charAt(front);
// char backchar = sb.charAt(back);

// sb.setCharAt(front, backchar);
// sb.setCharAt(back, frontchar);

// }
// System.out.println(sb);
// }
// }
// ---------------------------------------------------------------------------------------------------------------------------------------------

// 🔹 Part A: Basic (Understanding Strings)

// Print each character of a string
// Count vowels and consonants
// Check if the string is a palindrome
// Reverse a string
// Compare two strings
// Convert string to uppercase/lowercase

// 🔹 Part B: Intermediate

// Remove duplicates from a string
// Check for anagram strings
// Count frequency of characters in a string
// Replace spaces with %20 (URLify)
// Check if two strings are rotations of each other
// Longest word in a sentence

// 🔹 Part C: Advanced

// Longest substring without repeating characters
// Longest Palindromic Substring
// Zigzag conversion
// Minimum number of deletions to make a string palindrome
// Implement strstr() (substring search)
// Roman to Integer / Integer to Roman
// Group anagrams

// ✅ Easy (7–10):

// Remove spaces/duplicates
// Toggle case
// Anagram check (using array/map)

// ✅ Medium (10–15):

// Longest substring without repeating chars (Sliding Window)
// Longest common prefix (Array of strings)
// Valid parentheses
// Group anagrams
// First non-repeating character
// String compression
// Implement strStr() (Substring search)
// ✅ Hard (5–7):

// Minimum window substring
// Longest palindromic substring
// Regular expression match (if aiming for FAANG)
// Word Break (DP + HashSet)
// KMP / Z-algorithm (if aiming for CP or top product)
