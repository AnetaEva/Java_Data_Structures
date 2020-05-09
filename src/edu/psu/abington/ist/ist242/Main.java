package edu.psu.abington.ist.ist242;


import java.util.*;

enum Cars{Acura,Audi,Buick,BMW,Chevy}

public class Main {


    public static void main(String[] args) {

        enumExample();
        bitSetExample();
        vectorExample();
        stackExample();
        mapExample();
        hashTableExample();
    }

    // ENUMERATION ---------------------------------------------------------------------
    // Declare an enumeration named cars and add five different types.
    // Print each car out using iteration (loop)
    public static void enumExample() {
        System.out.println("Enumeration of Cars:");
        Cars carArray[] = Cars.values();
        for (Cars vals : carArray) {
            System.out.println(vals);
        }
        System.out.println(" ");
    }


    // BITSET ---------------------------------------------------------------------------
    // Declare a BitSet named flags, and five bits, set each bit using a for the statement.
    // Print each flag value out using iteration (loop)


    public static void bitSetExample() {
        System.out.println("\nBitSet of flags:");
        BitSet flags1 = new BitSet(5);
        BitSet flags2 = new BitSet(5);
        BitSet flags3 = new BitSet(5);
        BitSet flags4 = new BitSet(5);
        BitSet flags5 = new BitSet(5);

        // FLAG 1
        for (int i = 0; i < 31; i++) {
            if ((i % 2) == 0) flags1.set(i); // CORRECT
        }
        // FLAG 2
        for (int i = 1; i < 32; i++) {
            if ((i % 1) == 0) flags2.set(i);
            flags2.clear(5);
            flags2.clear(10);
            flags2.clear(15);
            flags2.clear(20);
            flags2.clear(25);
            flags2.clear(30);
        }
        // FLAG 3
        for (int i = 0; i < 31; i++) {
            if ((i % 4) == 0) flags3.set(i); // CORRECT
        }
        // FLAG 4
        for (int i = 1; i < 32; i++) {
            if ((i % 1) == 0) flags4.set(i);
            flags4.clear(7);
            flags4.clear(14);
            flags4.clear(21);
            flags4.clear(28);
        }
        // FLAG 5
        for (int i = 0; i < 32; i++) {
            flags5.clear();
        }


        System.out.println("Initial pattern in bits1: ");
        System.out.println(flags1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(flags2);
        System.out.println("\nInitial pattern in bits3: ");
        System.out.println(flags3);
        System.out.println("\nInitial pattern in bits4: ");
        System.out.println(flags4);
        System.out.println("\nInitial pattern in bits5: ");
        System.out.println(flags5);

        System.out.println(" ");
    }


    // VECTOR -------------------------------------------------------------------------------
    // Declare a vector named collection and add three different types: integers, double, float
    // Print each collection value out using iteration (loop)
    public static void vectorExample() {
        System.out.println("Vector collection:");

        Vector<Object> collection = new Vector<>(8);
        System.out.println("Initial size: " + collection.capacity());

        collection.add(new Integer(10));
        System.out.println("Capacity after addition of integer: " + collection.capacity());

        collection.addElement(new Double(22.55));
        System.out.println("Current capacity after addition of double: " + collection.capacity());

        collection.addElement(new Float(46.79));
        System.out.println("Current capacity after addition of float: " + collection.capacity());

        collection.addElement(new Integer(100));

        System.out.println("First element: " + (Integer) collection.firstElement());
        System.out.println("Last element: " + (Integer) collection.lastElement());

        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }

        System.out.println(" ");

            /*Iterator itr = collection.iterator();
            while(itr.hasNext())
                System.out.println(itr.next());*/
    }


    // STACK ------------------------------------------------------------------------------
    // Declare a stack named processes, push and pop five values on the stack
    // Print each process value out using iteration (loop)

    // You can set a generic type on a Stack specifying the type of objects the Stack instance can contain.
    // You specify the stack type when you declare the Stack variable.
    public static void stackExample() {
        try {
            System.out.println("Stack []");
            Stack<Integer> processes = new Stack<Integer>();
            processes.push(75);
            processes.push(100);
            processes.push(125);
            processes.push(150);
            processes.push(175);
            System.out.println("Stack :" + processes);
            processes.pop();
            System.out.println("pop --> Stack :" + processes);
            processes.pop();
            System.out.println("pop --> Stack :" + processes);
            processes.pop();
            System.out.println("pop --> Stack :" + processes);
            processes.pop();
            System.out.println("pop --> Stack :" + processes);
            processes.pop();
            System.out.println("pop --> Stack :" + processes);
            processes.pop();
            System.out.println("pop --> Stack :" + processes);
        } catch (EmptyStackException e) {
            System.out.println("pop --> Empty Stack");
        }
        System.out.println(" ");
    }



        /*Stack<Integer> processes = new Stack<Integer>();

        System.out.println("Stack: " + processes);

        processes.push(75);
        processes.push(100);
        processes.push(125);
        processes.push(150);
        processes.push(175);

        //System.out.println("Size of stack after push operations: " + processes.size());
        System.out.println("Stack: " + processes);

        for(int i = 0; i < processes.size(); i++) {
            processes.pop();
           System.out.println("pop --> Stack:" + processes.pop());
        }


        // Pop items from the stack until its empty
        /*while (!processes.isEmpty()) {
            System.out.println("pop --> Stack:" + processes.pop());
        }*/

    //System.out.println("Stack: " + processes);

        /*System.out.println("pop --> Empty Stack");

        System.out.println(" ");*/

    // ANOTHER WAY OF DOING A STACK ------------------------------------------------------------------------
        /*pushOnStack(processes, 75);
        pushOnStack(processes, 100);
        pushOnStack(processes, 125);
        pushOnStack(processes, 150);
        pushOnStack(processes, 175);

        pushOffStack(processes);
        pushOffStack(processes);
        pushOffStack(processes);
        pushOffStack(processes);
        pushOffStack(processes);

        try {
            pushOffStack(processes);
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack");
        }
    }

    static void pushOnStack(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("PUSH (" + a + ")");
        System.out.println("StacK: " + st);
    }

    static void pushOffStack(Stack st) {
        System.out.print("POP -> ");
        Integer a = (Integer) st.pop();

        System.out.println(a);
        System.out.println("STAck: " + st);
    }*/

    //Declare a map named products, put five values in the map
    //Print each product value out using iteration (loop)
    public static void mapExample() {
        Map<String,Integer> products = new HashMap<String,Integer>();

        products.put("Hershey's", new Integer(13));
        products.put("M&M's", new Integer(16));
        products.put("Reese's", new Integer(9));
        products.put("York", new Integer(5));
        products.put("Twix", new Integer(7));

        System.out.println("Number of Products");
        System.out.println("Map Products:" + products);

        // Iterate over all products, using the keySet method.
        for(String key : products.keySet())
            System.out.println("Number of "+ key + ": " + products.get(key));
        System.out.println(" ");
    }

    //Declare a hashtable named customers, put five values in the hashtable
    //Print each customer value out using iteration (loop)
    public static void hashTableExample() {
        Hashtable<String,Double> customers = new Hashtable<String,Double>();

        customers.put("Mike", 888.88);
        customers.put("Larry", 1133.53);
        customers.put("Jason", 500.0);
        customers.put("Kirk", 4499.55);
        customers.put("Paul", 79.95);

        System.out.println("Customer purchases:");

        System.out.println("Customers: " + customers);

        // Iterate over all customers, using the keySet method.
        for(String key : customers.keySet())
            System.out.println(key + ": " + customers.get(key));

        System.out.println(" ");

        System.out.println("Jason has a $50 coupon for a purchase made over $400");
        customers.put("Jason", 450.0);
        System.out.println("Jason's new total: " + customers.get("Jason"));




    }


}



