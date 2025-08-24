
// import java.util.*;

// class array {
// public static void main(String[] args) {
// // declaring array input output
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// // print the arr array
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]);

// }

// }
// }

// question 1--Take an array of names as input from the user and print them on
// the screen.

// class array {
// public static void main(String[] args) {
// // question--Take an array of names as input from the user and print them on
// the screen.

// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// String names[] = new String[size];

// input

// for (int i = 0; i < size; i++) {
// names[i] = sc.next();
// }
// // print the names array

// output

// for (int i = 0; i < names.length; i++) {
// System.out.println("name" + (i + 1) + "is" + names[i]);

// }

// }
// }

// question 2 --Find the maximum & minimum number in an array of integers.

// method 1
// public class array {
// public static void main(String[] args) {
// int[] arr = { 4, 7, 1, 9, 3, 6 };

// int max = arr[0];
// int min = arr[0];

// for (int i = 1; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }

// if (arr[i] < min) {
// min = arr[i];
// }
// }

// System.out.println("Maximum: " + max);
// System.out.println("Minimum: " + min);
// }
// }

// method2-----this is universal method
// public class array {
// public static void main(String[] args) {
// int[] arr = { -10, -4, -9, -1, -20 };

// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }

// if (arr[i] < min) {
// min = arr[i];
// }
// }

// System.out.println("Maximum: " + max);
// System.out.println("Minimum: " + min);
// }
// }

// question 3 ---Take an array of numbers as input and check if it is an array
// sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.

// public class array {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Input: size of array
// System.out.print("Enter number of elements: ");
// int n = sc.nextInt();

// int[] arr = new int[n];

// // Input: array elements
// System.out.println("Enter the elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // Check if array is sorted
// boolean isSorted = true;

// for (int i = 0; i < n - 1; i++) {
// if (arr[i] > arr[i + 1]) {
// isSorted = false;
// break;
// }
// }

// // Output result
// if (isSorted) {
// System.out.println("The array is sorted in ascending order.");
// } else {
// System.out.println("The array is NOT sorted in ascending order.");
// }
// }
// }

// question-4-->Reverse the elements of an array in-place.

// import java.util.Scanner;

// method 1
// import java.util.Scanner;

// public class array {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Step 1: Input array size
// System.out.print("Enter number of elements: ");
// int n = sc.nextInt();

// // Step 2: Create original array
// int[] arr = new int[n];
// System.out.println("Enter the elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // Step 3: Create new array to store reversed values
// int[] reversed = new int[n];
// for (int i = 0; i < n; i++) {
// reversed[i] = arr[n - 1 - i];
// }

// // Step 4: Print reversed array
// System.out.println("Reversed array:");
// for (int i = 0; i < n; i++) {
// System.out.print(reversed[i] + " ");
// }
// }
// }
// method 2 this is two pointer approach

// import java.util.Scanner;

// public class array {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Input: size of array
// System.out.print("Enter number of elements: ");
// int n = sc.nextInt();
// int[] arr = new int[n];

// // Input: array elements
// System.out.println("Enter the elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // Logic: reverse array using two pointers
// int start = 0;
// int end = n - 1;
// while (start < end) {
// // Swap
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;

// start++;
// end--;
// }

// // Output reversed array
// System.out.println("Reversed array:");
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// question 5-->Find Sum of All Elements in an Array

// import java.util.Scanner;

// public class array {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Input: size of array
// System.out.print("Enter number of elements: ");
// int n = sc.nextInt();
// int[] arr = new int[n];

// // Input: array elements
// System.out.println("Enter the elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // Logic: calculate sum
// int sum = 0;
// for (int i = 0; i < n; i++) {
// sum += arr[i];
// }

// // Output
// System.out.println("Sum of all elements = " + sum);
// }
// }
