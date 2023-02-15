/* Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and Cathy, and another one containing int values: 15,9, 14, 10,and 12.  create an table showing  these values as name value pairs as below.

Name           Value
Amy		9
Boyd		10
Cathy		12
John		14
Peter		15 */

public class ArrayTableExample {
    public static void main(String[] args) {
        // Create the arrays
        String[] names = {"Peter", "Amy", "John", "Boyd", "Cathy"};
        int[] values = {15, 9, 14, 10, 12};

        // Display the arrays as a table
        System.out.println("Name\tValue");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "\t" + values[i]);
        }
    }
}