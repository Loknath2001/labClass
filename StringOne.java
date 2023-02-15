// Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string. For example, if the argument is
"12345678", the return value should be "XXXX5678".

public static String maskString(String inputString) {
    if (inputString == null || inputString.length() < 4) {
        return inputString;
    }
    int stringLength = inputString.length();
    StringBuilder maskedString = new StringBuilder(stringLength);
    for (int i = 0; i < stringLength - 4; i++) {
        maskedString.append('X');
    }
    maskedString.append(inputString.substring(stringLength - 4));
    return maskedString.toString();
}