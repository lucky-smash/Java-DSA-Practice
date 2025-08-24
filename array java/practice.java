// question 1--Take an array of names as input from the user and print them on the screen.

// import java.util.Scanner;

// class practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of names:");
//         int size = sc.nextInt();
//         String names[] = new String[size];

//         System.out.println("enter the  array names");
//         for (int i = 0; i < size; i++) {
//             names[i] = sc.next();
//         }

//         for (int i = 0; i < size; i++) {
//             System.out.println("name" + " " + (i + 1) + " " + "is" + " " + names[i]);
//         }

//     }
// }

// question 2 --Find the maximum & minimum number in an array of integers.

// import java.util.Scanner;

// class practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of array to enter:");

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         // input array
//         System.out.println("enter the no.");

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // finding max and min
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < size; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//             // System.out.println("maximum" + max);
//             // System.out.println("minimum" + min);
//         }
//         System.out.println("maximum" + " " + max);
//         System.out.println("minimum" + " " + min);
//     }
// }

// question 3 ---Take an array of numbers as input and check if it is an array
// sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.

// import java.util.Scanner;

// class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of array to enter:");
// int size = sc.nextInt();
// int arr[] = new int[size];
// System.out.println("Enter the no.");
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();

// }
// boolean isSorted = true;

// for (int i = 0; i < size; i++) {
// if (arr[i] > arr[i + 1]) {
// isSorted = false;
// break;
// }
// }
// if (isSorted) {
// System.out.println("Array is sorted in ascending order");
// }

// else {
// System.out.println("Array is not sorted in ascending order");
// }

// }

// }

// question-4-->Reverse the elements of an array in-place.

// import java.util.Scanner;

// class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of array to enter:");
// int size = sc.nextInt();
// int arr[] = new int[size];
// System.out.println("Enter the no.");

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// brute force approach---
// int Reversed[] = new int[size];

// for (int i = 0; i < size; i++) {
// Reversed[i] = arr[size - 1 - i];
// }
// System.out.println("reversed array:");
// for (int i = 0; i < size; i++) {
// System.out.println(Reversed[i]);
// }
// two-pointers approach------
// int start = 0;
// int end = size - 1;
// while (start < end) {
// // swap
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// start++;
// end--;
// }
// System.out.println("Reversed array:");
// for (int i = 0; i < size; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// question 5-->Find Sum of All Elements in an Array

// ✅ Arrays + Two Pointers — 20 Selective DSA Questions

// 🔹 Part A: Basic to Intermediate (Q6–Q15)

// question 6 --> Linear Search in an Array

// import java.util.Scanner;

// class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of elements in the array:");

// int size = sc.nextInt();
// int arr[] = new int[size];

// System.out.println("Enter the elements of the array:");

// // input array
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// // linear search of target
// System.out.println("enter the target");
// int target = sc.nextInt();
// // System.out.println("enter the target");
// boolean found = false;

// for (int i = 0; i < size; i++) {
// if (target == arr[i]) {
// System.out.println("Target found at index " + i);
// found = true;
// break;
// } else if (!found) {
// System.out.println("target not found");
// }

// }
// }
// }

// question 7--> Count Occurrences of an Element

// import java.util.*;

// class practice {
// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the number of elements in the array:");

// int n = sc.nextInt();

// int arr[] = new int[n];

// System.out.println("Enter the elements of the array:");

// // input array
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();

// }

// System.out.println("enter the target");
// int target = sc.nextInt();

// int occurrences = 0;

// for (int i = 0; i < n; i++) {
// if (target == arr[i]) {
// occurrences += 1;
// }

// }
// System.out.println("no of occurence:" + occurrences);
// sc.close();
// }
// }

// question 8 --> Check if Array is Palindrome

// import java.util.Scanner;

// class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of elements in the array:");

// int n = sc.nextInt();
// int arr[] = new int[n];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// boolean isPalindrome = true;

// for (int i = 0; i < n / 2; i++) {
// if (arr[i] != arr[n - 1 - i]) {
// isPalindrome = false;
// break;
// }
// }

// if (isPalindrome) {
// System.out.println("Array is palindrome");
// } else {
// System.out.println("Array is not palindrome");
// }

// sc.close();
// }
// }

// question 9 --> Print All Pairs in Array (Brute Force)

// import java.util.Scanner;

// class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of elements in the array:");
// int size = sc.nextInt();
// int arr[] = new int[size];
// System.out.println("Enter the elements of the array:");

// // input array
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// for (int i = 0; i < size; i++) {
// for (int j = i+1 ; j < size; j++) {
// System.out.println("(" + arr[i] + "," + arr[j] + ")");
// }
// }

// }

// }
// question 10 --> Find Duplicate Element in Array

// import java.util.Scanner;

// class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of elements in the array:");
// int size = sc.nextInt();
// int arr[] = new int[size];
// System.out.println("Enter the elements of the array:");

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// boolean duplicateFound = false;
// for (int i = 0; i < size; i++) {
// for (int j = i + 1; j < size; j++) {
// if (arr[i] == arr[j]) {
// System.out.println("Duplicate element is " + arr[i]);
// duplicateFound = true;
// break;
// }

// }
// if (duplicateFound) {
// break;
// }

// }
// if (!duplicateFound) {
// System.out.println("No duplicate found.");
// }
// sc.close();

// }
// }
// question 11 --> Find Second Largest Element

// import java.util.Scanner;

// class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Input size
// System.out.println("Enter number of elements:");
// int n = sc.nextInt();
// int[] arr = new int[n];

// // Input array elements
// System.out.println("Enter elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // Step 1: Find the largest element
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// }

// // Step 2: Find second largest (not equal to max)
// int secondMax = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
// if (arr[i] != max && arr[i] > secondMax) {
// secondMax = arr[i];
// }
// }

// // Step 3: Output
// if (secondMax == Integer.MIN_VALUE) {
// System.out.println("No second largest element.");
// } else {
// System.out.println("Second largest element is: " + secondMax);
// }

// sc.close();
// }
// }

// question 12 --> Left Rotate the Array by 1

// import java.util.Scanner;

// class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("enter the number of elements");
// int size = sc.nextInt();
// int[] arr = new int[size];

// System.out.println("enter the elements");

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// int temp = arr[0];

// for (int i = 0; i < size - 1; i++) {
// arr[i] = arr[i + 1];

// can also use this ==> arr[i-1]=arr[i];
// arr[n-1]=temp

// }
// arr[size - 1] = temp;
// System.out.println("rotated array by 1");
// for (int i = 0; i < size; i++) {
// System.out.print(arr[i] + " ");
// }

// }

// }

// question 13 --> Left Rotate Array by K Elements

// import java.util.Scanner;

// class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Input: Array size
// System.out.println("Enter the number of elements:");
// int size = sc.nextInt();
// int[] arr = new int[size];

// // Input: Elements
// System.out.println("Enter the elements:");
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// // Input: k
// System.out.println("Enter how many times to rotate:");
// int k = sc.nextInt();

// // Normalize k in case k > size modular helping here
// k = k % size;

// // Temporary array to store first k elements
// int[] temp = new int[k];
// for (int i = 0; i < k; i++) {
// temp[i] = arr[i];
// }

// // Shift the remaining elements to the left
// for (int i = k; i < size; i++) {
// arr[i - k] = arr[i];

// // i-k
// // 3-3 = 0
// // 4-3 = 1
// // 5-3 = 2
// }

// // Copy back the k elements to the end
// for (int i = 0; i < k; i++) {
// arr[size - k + i] = temp[i];
// }

// // Output: Rotated array
// System.out.println("Array after rotating left by " + k + " positions:");
// for (int i = 0; i < size; i++) {
// System.out.print(arr[i] + " ");
// }

// sc.close();
// }
// }

// question 14 --> Move All Zeros to End (Two Pointers)

// question 15 --> Merge Two Sorted Arrays (Two Pointers)

// 🔹 Part B: Medium (Q16–Q25)

// question 16 --> Sort 0s, 1s, 2s (Dutch National Flag - Two Pointers)
// question 17 --> Find Missing Number (0 to n)
// question 18 --> Kadane's Algorithm (Max Subarray Sum)
// question 19 --> Longest Subarray with Given Sum (Sliding Window)
// question 20 --> Find All Unique Pairs with Given Sum (Two Pointers + HashSet)
// question 21 --> Buy & Sell Stock for Max Profit
// question 22 --> Leaders in an Array (Right to Left)
// question 23 --> Find the Majority Element (Boyer–Moore Algorithm)
// question 24 --> Equilibrium Index in an Arrayquestion
// question 25 --> Find Peak Element (Binary Search based)