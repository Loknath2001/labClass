// Make a method that accepts a String from user and print all Duplicate character which belongs to that String.

public static void printDuplicateChars(String inputString) {
    if (inputString == null) {
        return;
    }

    Map<Character, Integer> charCount = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
        char c = inputString.charAt(i);
        int count = charCount.getOrDefault(c, 0);
        charCount.put(c, count + 1);
    }

    System.out.print("Duplicate characters in the string \"" + inputString + "\": ");
    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.print(entry.getKey() + " ");
        }
    }
    System.out.println();
}