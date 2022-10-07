// Java review!

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // In Java, variables have types and objects have types.
        // A variable type that refers to an object must have a type that appears in the object.

        // Java uses the type of the reference to figure out whether a line of code is legal.

        String s = "Hello"; // Java creates a String object here
        System.out.println(s);
        // Why is this legal? Because there's an Object part in the object to which s refers.
        Object o = s;  // o and s are now aliases



        // Java doesn't remember what o refers to.
        // We can cast to change the type of the expression.
        s = (String) o;
        System.out.println(s);

        Object p = new Object();

        // "If p refers to an object that has a String part"
        // Casting is dangerous.
        if (p instanceof String) {
            s = (String) p; // don't worry, I know what I'm doing, let's treat it as a String
        }

        System.out.println(
                s.substring(3)
        );
        System.out.println(
                // Casting pats Java on the head and says "I know what I'm doing".
                ((String) o).substring(3)
        );

        // Remember that o refers to a String object.
        String u = (String) o;

        Integer i = new Integer(4);
        int j = i;  // Autoboxing/unboxing
        System.out.println(j);

        ArrayList myWeirdList = new ArrayList();
        myWeirdList.add(i);
        myWeirdList.add(o);
        System.out.println(myWeirdList);
        System.out.println(myWeirdList.get(0));
        System.out.println(myWeirdList.get(1));
        // ArrayList.get returns type Object, so this won't work:
//        Integer k = myWeirdList.get(0);
        // Unboxing again:
        int k = (int) myWeirdList.get(0);
        // ArrayLists contain memory addresses of objects.

        myWeirdList.add(5);
        System.out.println(myWeirdList);

        ArrayList<String> myList = new ArrayList<>();
        myList.add(s);
        myList.add(s);
        myList.add("Goodbye");
        System.out.println(myList);
        // Java can figure out whether a cast is plausible.
//        myList.add(
//                (String) ((Object) i)
//        );

        int m = (int) 3.5; // truncates
        System.out.println(m);

        double d = m;
        System.out.println(d);

        for (String x : myList) {
            System.out.println(x);
        }

        String s1 = "frooble";
        String s2 = "frooble";
        String s3 = new String(s2);
        System.out.println(s1 + s2 + s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}