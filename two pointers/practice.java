
// question 1 -- Reverse an array (in-place)
// import java.util.Scanner;

// class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number of elements");

// int n = sc.nextInt();
// int[] arr = new int[n];
// System.out.println("enter the elements");

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// int start = 0;
// int end = n - 1;

// while (start < end) {
// // swap
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// start++;
// end--;
// }
// System.out.println("reversed array:");
// for (int i = 0; i < n; i++) {
// System.out.println(arr[i] + " ");
// }
// }
// }

// question 2 --- Is array a palindrome?

// import java.util.Scanner;

// class practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array:");

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean isPalindrome = true;
//         // brute force approach
//         // for (int i = 0; i < n / 2; i++) {
//         // if (arr[i] != arr[n - 1 - i]) {
//         // isPalindrome = false;
//         // break;
//         // }
//         // }
//         // two pointers approach
//         int start = 0;
//         int end = n - 1;
//         for (int i = 0; i < n / 2; i++) {
//             if (arr[start] != arr[end]) {
//                 isPalindrome = false;
//                 break;
//             }
//             start++;
//             end--;
//         }

//         if (isPalindrome) {
//             System.out.println("Array is palindrome");
//         } else {
//             System.out.println("Array is not palindrome");
//         }

//         sc.close();
//     }
// }

// question 2 ---- Move zeros to end

// import java.util.Scanner;

// class practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int left = 0;
//         for (int right = 0; right < n; right++) {
//             if (arr[right] != 0) {
//                 int temp = arr[right];
//                 arr[right] = arr[left];
//                 arr[left] = temp;
//                 left++;
//             }
//             // System.out.println("array after zeros shifted");
//         }
//         System.out.println("array after zeros shifted");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }

//question-3--> Merge two sorted arrays
// import java.util.Scanner;

// class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input size of first array
//         System.out.print("Enter the number of elements in first array: ");
//         int n1 = sc.nextInt();
//         int[] arr1 = new int[n1];

//         System.out.println("Enter sorted elements of first array:");
//         for (int i = 0; i < n1; i++) {
//             arr1[i] = sc.nextInt();
//         }

//         // Input size of second array
//         System.out.print("Enter the number of elements in second array: ");
//         int n2 = sc.nextInt();
//         int[] arr2 = new int[n2];

//         System.out.println("Enter sorted elements of second array:");
//         for (int i = 0; i < n2; i++) {
//             arr2[i] = sc.nextInt();
//         }

//         // Create merged array
//         int[] merged = new int[n1 + n2];

//         int i = 0, j = 0, k = 0;

//         // Merge both arrays
//         while (i < n1 && j < n2) {
//             if (arr1[i] < arr2[j]) {
//                 merged[k++] = arr1[i++];
//             } else {
//                 merged[k++] = arr2[j++];
//             }
//         }

//         // Copy remaining elements
//         while (i < n1) {
//             merged[k++] = arr1[i++];
//         }

//         while (j < n2) {
//             merged[k++] = arr2[j++];
//         }

//         // Output merged array
//         System.out.println("Merged Sorted Array:");
//         for (int x = 0; x < merged.length; x++) {
//             System.out.print(merged[x] + " ");
//         }

//         sc.close();
//     }
// }

//  question 4 -->Pair with target sum in sorted array
// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input: array size

//         System.out.println("Enter the number of elements in the sorted array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Input: array elements (assumed sorted) point to be noted

//         System.out.println("Enter the sorted array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Input: target sum

//         System.out.println("Enter the target sum:");
//         int target = sc.nextInt();

//         // Two-pointer approach
//         int left = 0;
//         int right = n - 1;
//         boolean found = false;

//         while (left < right) {
//             int sum = arr[left] + arr[right];

//             if (sum == target) {
//                 System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
//                 found = true;
//                 break; // remove this line if you want to find all such pairs
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         if (!found) {
//             System.out.println("No pair found with the target sum.");
//         }

//         sc.close();
//     }
// }

// question 5--Remove duplicates from sorted array
// brute force
// import java.util.Scanner;

// class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter sorted elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Brute force using new array
//         int[] unique = new int[n];
//         unique[0] = arr[0]; // First element is always unique
//         int index = 1; // Index for unique array

//         for (int i = 1; i < n; i++) {
//             if (arr[i] != arr[i - 1]) {
//                 unique[index] = arr[i];
//                 index++;
//             }
//         }

//         System.out.println("Unique elements:");
//         for (int i = 0; i < index; i++) {
//             System.out.print(unique[i] + " ");
//         }

//         System.out.println("\nCount of unique elements: " + index);
//         sc.close();
//     }
// }

// two pointers approach
// import java.util.Scanner;

// class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter sorted elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Two pointers
//         int i = 0;
//         for (int j = 1; j < n; j++) {
//             if (arr[j] != arr[i]) {
//                 i++;
//                 arr[i] = arr[j];
//             }
//         }

//         System.out.println("Unique elements:");
//         for (int k = 0; k <= i; k++) {
//             System.out.print(arr[k] + " ");
//         }

//         System.out.println("\nCount of unique elements: " + (i + 1));
//         sc.close();
//     }
// }

//  question 5--Sort 0s, 1s, 2s ✅ Dutch National Flag (two-pointer pattern)
import java.util.Scanner;

class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements (only 0s, 1s, and 2s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Dutch National Flag Algorithm
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
