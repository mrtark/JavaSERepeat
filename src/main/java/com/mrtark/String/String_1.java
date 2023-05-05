package com.mrtark.String;

public class String_1 {
    public static void main(String[] args) {
        String text = " Lorem Ipsum is simply dummy text of the printing and typesetting industry. ";
        System.out.println("Length: " + text.length() + "\n" +
                            "UpperCase: " + text.toUpperCase() + "\n" +
                            "LowerCase: " + text.toLowerCase() + "\n" +
                            "Trim : " + text.trim() + "\n" +
                            "Strip: " + text.strip() + "\n" + //Unicode whitespace characters
                            "StartsWith: " + text.startsWith("L") + "\n" +
                            "EndsWith: " + text.endsWith(".") + "\n" +
                            "Char: " + text.charAt(29) + "\n" +
                            "Indexof: " + text.indexOf("t") + "\n" +
                            "LastIndexof: " + text.lastIndexOf("t") + "\n" +
                            "Substring begin: " + text.substring(6) + " \n" +
                            "Substring begind & end: " + text.substring(6,12) + "\n" +
                            "Concat: " + text.trim().concat("1500") + "\n" +
                            "Contains: " + text.contains("Lorem") + " - " + text.contains("m") + "\n" +
                            "Equals: " + text.equals("Lorem") + "\n" +
                            "Repeat: " + text.repeat(14) + "\n" +
                            "Empty?: " + text.isEmpty() + "\n" +
                            "Replace: " + text.replace("i","?") + "\n" +
                            "Replace all: " + text.replaceAll("i","!") + "\n" +
                            text.codePointAt(29));

        System.out.println("----");
        String x = "lOREM";
        String y = "lOREM";
        System.out.println(x.compareTo(y));
        System.out.println("x == y ? = " + (x == y) + "\n" +
                            "x equals y ? = " + x.equals(y) + "\n" +
                            "x compareto y ? = " + x.compareTo(y) + "\n");

        String a = new String("lOREM");
        String b = new String("lOREM");
        System.out.println("a == b ? = " + (a == b) + "\n" +
                            "a equals b ? = " + a.equals(b) + "\n" +
                            "a compareto b ? = " + a.compareTo(b)+ "\n");

        System.out.println("x == a ? = " + (x ==a) + "\n" +
                            "x equals a ? = " + x.equals(a) + "\n" +
                            "x compareto a ? = " + x.compareTo(a) + "\n");

        System.out.println("----");



    }
}
