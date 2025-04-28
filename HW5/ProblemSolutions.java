/******************************************************************
 *
 *   NAME: Fareen Samad      SECTION: COMP 272-001
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.util.*;

class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset of array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

    public boolean isSubset(int list1[], int list2[]) {

        HashSet<Integer> set = new HashSet<>(); // HashSet to store elements of list1
        
        // Add elements of list1 to HashSet 
        for (int num : list1) {
            set.add(num);
        }

        // Check list2 elements with list1, if any element is in list2 but not list1, return false
        for (int numTwo : list2) {
            if (!set.contains(numTwo)) {
                return false; 
            } 
        }

        return true; // if list2 elements are in list1, return true

    } // end of isSubset method 


    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

    public int findKthLargest(int[] array, int k) {

        // max heap created, using PriorityQueue for this method 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add array elements to the max heap
        for (int num : array) {
            maxHeap.add(num);
        } 

        // Remove top k-1 elements from max heap
        for (int i = 0; i < k - 1; i++) {
            maxHeap.remove(); // remove largest element
        } 

        return maxHeap.remove(); // return the kth largest element

    } // end of findKthLargest method


    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

    public int[] sort2Arrays(int[] array1, int[] array2) {

        // HashSet to store elements of array1 and array2
        HashSet<Integer> set = new HashSet<>(); 

        // Add elements of array1 and array2 to HashSet
        for (int num : array1) {
            set.add(num);
        }

        for (int numTwo : array2) {
            set.add(numTwo);
        }

        // Convert HashSet to ArrayList
        ArrayList<Integer> list = new ArrayList<>(set); 

        Collections.sort(list); // Sort the ArrayList

        int[] result = new int[list.size()]; // Convert ArrayList to array

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result; // return sorted array

    } // end of sort2Arrays method

}