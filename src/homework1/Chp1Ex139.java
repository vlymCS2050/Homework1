/*
 * 
 * Write a program that takes from standard input an expression without left
 * parentheses and prints the equivalent infix expression with the parentheses
 * inserted.
 * 
 * When entering input expression last character needs to ? to stop
 * Scanner next().
 */
package homework1;

import java.util.*;

/**
 *
 * @author Vicky Lym
 */
public class Chp1Ex139<Item> implements Iterable<Item> {
    
    // public class Stack<Item> implements Iterable<Item> {
    private Node<Item> first;     // top of stack
    private int n;                // size of the stack

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty stack.
     */
    public Chp1Ex139() {
        first = null;
        n = 0;
    }

    /**
     * Returns true if this stack is empty.
     *
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return the number of items in this stack
     */
    public int size() {
        return n;
    }

    /**
     * Adds the item to this stack.
     *
     * @param  item the item to add
     */
    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * Removes and returns the item most recently added to this stack.
     *
     * @return the item most recently added
     * @throws NoSuchElementException if this stack is empty
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }


    /**
     * Returns (but does not remove) the item most recently added to this stack.
     *
     * @return the item most recently added to this stack
     * @throws NoSuchElementException if this stack is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    /**
     * Returns a string representation of this stack.
     *
     * @return the sequence of items in this stack in LIFO order, separated by spaces
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    }
       

    /**
     * Returns an iterator to this stack that iterates through the items in LIFO order.
     *
     * @return an iterator to this stack that iterates through the items in LIFO order
     */
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }


    /**
     * Unit tests the {@code Stack} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String charstr = null;
        
        Chp1Ex139<String> stack = new Chp1Ex139<String>();
        Chp1Ex139<String> stack2 = new Chp1Ex139<String>();
        
        String item = " ";       
        int closeParen = 0;
        int numItem = 0;
        int numOperator = 0;
        
        
        System.out.println("Enter a expression:");
        
        while(!(item.equals("?"))) {

            item = scanner.next();
            
        //  System.out.println("item is" + item);
            if (!(item.equals("?")))
                stack.push(item);
        }
        
        // System.out.println("Check Stack isEmpty");  
        
        while(!stack.isEmpty()) {

            // item = scanner.next();
            item = stack.pop();
            if (item.equals(")")) {
                closeParen ++;
                stack2.push(item);
            } else if ((item.equals("0")) ||
                       (item.equals("1")) ||
                       (item.equals("2")) ||
                       (item.equals("3")) ||
                       (item.equals("4")) ||
                       (item.equals("5")) ||
                       (item.equals("6")) ||
                       (item.equals("7")) ||
                       (item.equals("8")) ||
                       (item.equals("9"))) {
                   if (numItem == 0) {
                       numItem ++;
                       stack2.push(item);
                   } else if (numItem == 1) {
                              numItem = 0;
                              stack2.push(item);
                              item = "(";
                              closeParen --;
                              stack2.push(item);
                              if (numOperator == 2) {
                                  stack2.push(item);
                                  closeParen --;
                              }
                              numOperator = 0;
                   }
            } else if ((item.equals("*")) ||
                       (item.equals("-")) ||
                       (item.equals("+"))) {
                       stack2.push(item);
                       numOperator ++;    
            }
            
        }
        
        while(!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
        
        System.out.println("(" + stack2.size() + " left on stack)");
    }   
}
