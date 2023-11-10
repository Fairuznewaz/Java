import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UncheckedIOException;

//1. Basic String Manipulation
public class TryandCatch {
    public static void main(String[] args) {
        String greeting = "Hello, ";
        String name = "John";
        String message = greeting + name; //Concatenation

        System.out.println("Message: " + message);
        System.out.println("Length of message:" + message.length());
    }

    //Unchecked Exception
//Converting string type to int type
    public static int ConvertToInt() {

    }
}

//String Comparison and Control Flow
class StringExample2 {
    public static void main(String[]args) {
        String input = "Yes";
        if(input.equals("Yes")) {
            System.out.println("You chose Yes.");
        }
        else if(input.equalsIgnoreCase("yes")) {
       System.out.println("You chose yes, case-insensitive.");
        }
        else {
            System.out.println("You didn't chose Yes.");
        }
    }
}

//String Searching & Substring Extraction
class StringExample3 {
    public static void main(String[]args){
        String sentence = "Using Java for the last few weeks have been very effective.";

        int indexOfJava = sentence.indexOf("Java");
        String substring = sentence.substring(indexOfJava, indexOfJava + 9);

        System.out.println("Index of Java':" +indexOfJava);
        System.out.println("Extracted substring:" + substring);
    }
}

//Checked Exceptions(Error & Exception Handling)
class ExceptionExample {
    public static void main(String[]args) {
        try {
            //Attempt to open a file that may not exist
            try {
                FileReader fileReader = new FileReader("nonexistent.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
                //Handle the exception
                System.err.println("File not found: " +e.getMessage());
            }
        }
    }
}

//Try-Catch Example for Checked Exception
//10 divided by 0
class TryCatchExample {
    public static void main(String[]args) {
        int numerator = 10;
        int denominator = 0;
        int result;

        try {
            result = numerator/denominator;
            System.out.println("Result: " +result);
        }  catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Program continues after the try-catch block.");
    }
}

//Unchecked Exceptions
//Converting string to int
class TryCatchExample2 {
    public static int convertToInt() {
        String name = "John";
        int nameInInt = Integer.parseInt(name);
        return nameInInt;
    }
    System.out.println(UncheckedIOException.convertToInt());
    System.out.println(UncheckedIOException.convert StringToInt);
}



