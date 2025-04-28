/*
* *** NAME: Fareen Samad / SECTION: COMP 272-001 *** *

 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   * 
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    if (setA == null || setB == null) {
      return null; // if either sets are empty, return null 
    }

    Set<Integer> newTree1 = new TreeSet<Integer>(setA); // new tree set for setA
    Set<Integer> newTree2 = new TreeSet<Integer>(setB); // new tree set for setB

    newTree1.removeAll(setB); // remove setB elements from setA
    newTree2.removeAll(setA); // remove setA elements from setB

    Set<Integer> result = new TreeSet<Integer>(newTree1); // tree set for the result
    result.addAll(newTree2); // add elements from newTree2 to result

    return result; // provide result 

  } // end different method 


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    if (treeMap == null) {
      return; // if treeMap is null, return 
    }

    Set<Integer> keys = new HashSet<Integer>(treeMap.keySet()); // create a set of keys

    for (Integer key : keys) { // go through each key in the set
      if (key % 2 == 0) {
        treeMap.remove(key); // if key is even, remove it
      } 
    } 

  } // end removeEven method


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    if (tree1 == null || tree2 == null) {
      return false; // if any of the trees are null, return false
    }

    if (tree1.size() != tree2.size()) {
      return false; // if either of the two trees have different sizes, return false
    }

    for (Integer key : tree1.keySet()) {
      if (!tree2.containsKey(key)) {
        return false; // if key isnt in tree2, return false
      }

      if (!tree1.get(key).equals(tree2.get(key))) {
        return false; // if values arent equal, return false
      }
    } 

    return true; // if all are correct, return true

  } // end treesEqual method 

} // end treeProblems class
