import exceptions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionOne {


    doSmthOne();

    doSmthTwo();

       try {
            doSmthThree();
        } catch (ExceptionThree e) {
            throw new RuntimeException(e);
        }

        //Runtime Exception
        doSmthFour();
        doSmthFive();


        int a = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome, type number: ");
            a = Integer.parseInt(scanner.next());
            FileReader fileReader = new FileReader("text.txt");
            System.out.println("File found");
        } catch (FileNotFoundException e) {
            a = 15;
            System.out.println("File not found, the number is now 15");

        } finally {
            System.out.println("Finally block executed, number a = " + a);
        }



    }

    public static void doSmthOne() throws ExceptionOne {
        throw new ExceptionOne("First exception message");
    }

    public static void doSmthTwo(){
        try {
            throw new ExceptionTwo("Second exception message");
        } catch (ExceptionTwo e) {
            throw new RuntimeException(e);
        }
    }
    public static void doSmthThree() throws ExceptionThree {
        throw new ExceptionThree("Third exception message");
    }
    //Runtime Exception
    public static void doSmthFour(){
        throw new ExceptionFour("Fourth exception message");
    }
    //Runtime Exception
    public static void doSmthFive(){
        throw new ExceptionFive("Fifth exception message");
    }


    }



