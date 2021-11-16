package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, or a 4 ,or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not  1 or 2");
        }

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, or a 4, or a 5 ");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found
        char letter = 'C';
        switch (letter){
            case 'A'-> System.out.println("A was found");
            case 'B'-> System.out.println("B was found");
            case 'C','D','E' -> System.out.println("C, D, or E was found");
            default -> System.out.println("Could not find A, B, C, D, or E");
        }

        String birthMonth = "jULy";
        switch (birthMonth.toLowerCase()) {
            case "january" -> System.out.println("Birth month was January");
            case "june" -> System.out.println("Birth month was june");
            case "july" -> System.out.println("Birth month was July");
            default -> System.out.println("Birth month not found");
        }
    }
}
