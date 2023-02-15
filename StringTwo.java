// Write a method that takes a String[] as an argument and returns a String containing the concatenation of all the strings in the input array. Invoke your method 3 times with different arguments. Make sure that your code handles the cases where the argument is null.

public static String concatenateStrings(String[] strings) {
    if (strings == null) {
        return "";
    }
    StringBuilder result = new StringBuilder();
    for (String s : strings) {
        if (s != null) {
            result.append(s);
        }
    }
    return result.toString();
}