// question 1 -- Print each character of a string
// public class practice {
//     public static void main(String args[]) {
//         String name = "lakshit";

//         for (int i = 0; i < name.length(); i++) {
//             System.out.println(name.charAt(i));
//         }
//     }
// }

// question 2-- Count vowels and consonants

// public class practice {
//     public static void main(String args[]) {
//         String str = "Lakshit Tyagi";

//         str = str.toLowerCase();

//         int vowels = 0, consonants = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch >= 'a' && ch <= 'z') {
//                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                     vowels++;
//                 } else {
//                     consonants++;
//                 }
//             }
//         }
//         System.out.println("vowels:" + vowels);
//         System.out.println("consonants:" + consonants);
//     }
// }

// System.out.println("Vowels: " + vowels);
// System.out.println("Consonants: " + consonants);
// }
// }

// question--3--> Check if the string is a palindrome

// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// System.out.println("Enter a string:");

// String str = sc.nextLine();

// // convert to lower case for making case-insensitive
// str = str.toLowerCase();

// // reverse the string

// String reversed = "";
// for (int i = str.length() - 1; i >= 0; i--) {
// reversed += str.charAt(i);
// }

// // check if original and reversed are the same

// if (str.equals(reversed)) {
// System.out.println("The string is a palindrome.");
// } else {
// System.out.println("The string is not a palindrome.");
// }
// sc.close();

// }
// }
// question--4-->// Reverse a string
// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a string:");
// String str = sc.nextLine();
// String reversed = "";
// for (int i = str.length() - 1; i >= 0; i--) {
// reversed += str.charAt(i);
// }
// System.out.println("Reversed string is: " + reversed);
// sc.close();
// }
// }

// question--5-->// Compare two strings
// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter first string:");
// String str1 = sc.nextLine();
// // str1 = str1.toLowerCase(); we can o this also
// System.out.println("Enter second string:");
// String str2 = sc.nextLine();
// // str2 = str2.toLowerCase(); we can do this also
// if (str1.equals(str2)) {
// System.out.println("Both strings are equal.");
// } else {
// System.out.println("Both strings are not equal.");
// }
// sc.close();
// }
// }
// question--6-->// Convert string to uppercase/lowercase
// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a string:");
// String str = sc.nextLine();
// System.out.println("Uppercase string is: " + str.toUpperCase());
// System.out.println("Lowercase string is: " + str.toLowerCase());
// sc.close();
// }
// }
// =================================================================================================================================
// question--7-->// Remove duplicates from a string

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         String result = "";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             boolean found = false;

//             for (int j = 0; j < result.length(); j++) {
//                 if (result.charAt(j) == ch) {
//                     found = true;
//                     break;
//                 }
//             }

//             if (!found) {
//                 result += ch;
//             }
// //             Let's say the input is:

// // String str = "abc";
// // On the first iteration:

// // i = 0
// // ch = 'a'
// // result = "" (empty)
// // Now:

// // for (int j = 0; j < result.length(); j++) { ... }
// // result.length() = 0
// // j < 0 → false
// // → The loop body doesn't run.
// // So it skips checking and goes straight to:

// // if (!found) {
// //     result += ch; // adds 'a'
// // }
// // 🔁 Next iteration:
// // Now result = "a", so on the second loop:

// // ch = 'b'
// // result.length() = 1
// // Inner loop runs with j = 0

//         }
//         System.out.println("After removing duplicates: " + result);
//     }
// }

// -----------------------------------------------------------------------------------------------------------------------------------------------

// question--8-->Check for anagram strings

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first string: ");
//         String str1 = sc.nextLine();

//         System.out.print("Enter second string: ");
//         String str2 = sc.nextLine();

//         if (isAnagramBruteForce(str1, str2)) {
//             System.out.println("They are anagrams.");
//         } else {
//             System.out.println("They are NOT anagrams.");
//         }
//     }

//     public static boolean isAnagramBruteForce(String str1, String str2) {
//         // Step 1: Length must be equal
//         if (str1.length() != str2.length()) {
//             return false;
//         }

//         // Step 2: Convert str2 to a mutable string (e.g., StringBuilder)
//         StringBuilder temp = new StringBuilder(str2);

//         // Step 3: Loop through each char of str1
//         for (int i = 0; i < str1.length(); i++) {
//             char ch = str1.charAt(i);
//             int index = temp.indexOf(String.valueOf(ch));

//             // 🔎 Now Let’s Break Down This if Block:

//             // 🟢 if (index != -1)
//             // This means: the character was found in temp (good!)
//             // So now we want to remove it from temp so it doesn’t get counted again
//             // temp.deleteCharAt(index);
//             // This deletes the first occurrence of the character from temp
//             // It prevents counting the same character more than once (important for
//             // duplicates)
//             // 🔴 else { return false; }
//             // This means: the character from str1 was not found in str2
//             // So str1 and str2 can't be anagrams
//             // We immediately return false and stop checking further

//             if (index != -1) {
//                 temp.deleteCharAt(index); // remove found character
//             } else {
//                 return false; // character not found
//             }
//         }

//         return true;
//     }
// }

// question--9--> Count frequency of characters in a string
// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         // Convert to character array
//         char[] chars = str.toCharArray();

//         // Loop through each character
//         for (int i = 0; i < chars.length; i++) {
//             char ch = chars[i];
//             boolean alreadyCounted = false;

//             // Check if we've already counted this character
//             for (int j = 0; j < i; j++) {
//                 if (chars[j] == ch) {
//                     alreadyCounted = true;
//                     break;
//                 }
//             }

//             // If not already counted, count its frequency
//             if (!alreadyCounted) {
//                 int count = 1;
//                 for (int k = i + 1; k < chars.length; k++) {
//                     if (chars[k] == ch) {
//                         count++;
//                     }
//                 }

//                 // Print result
//                 System.out.println(ch + ": " + count);
//             }
//         }
//     }
// }
