package ProjectOnboarding;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Weekly Coding Challenge:
Pls provide the link to your solution in the comments section not later than Friday morning.
1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.
For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, return the node with value 8. In this example, assume nodes with the same value are the exact same node objects.
Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.

 */

public class IntersectingLinkListNode {


    public static void main(String[] args){


        // Creating object of the
        // class linked list
        LinkedList<Integer> l1 = new LinkedList<Integer>();

        // Adding elements to the linked list, One Way
        l1.add(0,3);
        l1.add(1, 7);
        l1.add(2, 8);
        l1.add(3, 10);


        System.out.println(l1);

        LinkedList<Integer> l2 = new LinkedList<Integer>();


        // Another way
        l2.add(99);
        l2.add(1);
        l2.add(8);
        l2.add(10);


        System.out.println(l2);

        // Using the Get method and the
        // for loop
        for (int i = 0; i < l1.size(); i++) {

            if(l2.contains(l1.get(i))){      // Get the first value
                System.out.print("The node with the value: "+ l1.get(i) + " ");
                break;
            }
            else{
                System.out.print("Intersecting node not found.");
            }

        }

        }
    }



