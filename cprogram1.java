
 
import java.util.*;
import  java.util.Stack;
public class Q1 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("ram");
        s.push( "Sonu");
        s.push(" Avi");
        s.push("Govind");
        System.out.println("orignal values=" +s);
         
        String a= "Govind";

        int p = searchForString(s,a);
        if(p!= -1)
        {
            System.out.println(a+ " "+ p);
        }
         else {
            System.out.println(a);
        }
    }
private static int searchForString(Stack<String> stack, String a) {
            // Convert the stack to an array for easy access
            String[] array = new String[stack.size()];
            int index = 0;
    
            // Fill the array with the stack's elements
            while (!stack.isEmpty()) {
                array[index++] = stack.pop();
            }
    
            // Restore the stack from the array and search for the string
            for (int i = 0; i < array.length; i++) {
                stack.push(array[i]); // Restore the original stack
                if (array[i].equals(a)) {
                    return i; // Return the position
                }
            }
    
            // If not found, return -1
            return -1;
        }

    }

    
    

