package com.mrtark.String;

public class String_2 {
    private static void stringProcess(StringBuilder stringBuilder){
        String text = "I Love JavaSE";
        stringBuilder.append(text);
        stringBuilder.append(" JavaEE");

        String ou = stringBuilder.toString();
        System.out.println(ou);
        System.out.println("-----");

        System.out.println("Reverse: " + stringBuilder.reverse() + "\n" +
                            "Reverse: " + stringBuilder.reverse() + "\n" +
                            "Replace: " + stringBuilder.replace(2,6,"LOVEE") + "\n" +
                            "setCharAt: " + "\n" +
                            "Delete: " + stringBuilder.delete(7,14) + "\n" +
                            "delete: " + stringBuilder.delete(5,stringBuilder.length()) + "\n" +
                            "length: " + stringBuilder.replace(stringBuilder.length() - 2 ,stringBuilder.length()," xD"));


    }
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringProcess(stringBuilder);
    }
}
