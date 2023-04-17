package I_Academy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayVideo {
    public static void main(String[] args) {

        int[] rollNo = new int[5];

        String[] nameOfStudents;
        nameOfStudents  = new String[10];

        String[] nameOfFootballers = {"Messi", "Ronaldo", "Pele", "Maradona"};
        System.out.println(nameOfFootballers[0]);
        System.out.println(nameOfFootballers[1]);
        System.out.println(nameOfFootballers[2]);
        System.out.println(nameOfFootballers[3]);

        System.out.println(nameOfFootballers.length);

        int[] daysInMonths = new int[12];
        daysInMonths[0] = 31;
        daysInMonths[1] = 29;
        daysInMonths[2] = 30;
        daysInMonths[3] = 31;

        System.out.println(daysInMonths[4]);
        System.out.println(daysInMonths[0]);
        daysInMonths[0] = 40;
        System.out.println(daysInMonths[0]);

        int age = 32;
        System.out.println(age);
        System.out.println(daysInMonths);
        System.out.println("iterating through the array");

        for (int counter = 0; counter < daysInMonths.length; counter++) {
            System.out.println(daysInMonths[counter]);
        }

        System.out.println("using alternative for loop");

        for (int element: daysInMonths) {
            System.out.println(element);
        }

        System.out.println("using arrays to string method");
        System.out.println(Arrays.toString(daysInMonths));

        for (int counter = 0; counter < nameOfFootballers.length; counter++) {
            System.out.print(nameOfFootballers[counter] + " ");

        }

        System.out.println();

        for (String footballer: nameOfFootballers){
            System.out.print(footballer + " ");
        }

        System.out.println( );
        System.out.print(Arrays.toString(nameOfFootballers));

        int[] rollNos = {1,2,3,4,5};
        displayElementsInArray(rollNos);

        System.out.println(Arrays.toString(displayBetweenOneAndTen()));

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] rainyMonths = new String[5];
        System.arraycopy(months,4,rainyMonths,0,rainyMonths.length);
        System.out.println(Arrays.toString(rainyMonths));


        Arrays.sort(months);
        System.out.println(Arrays.toString(months));
        System.out.println(months[0]);


    }

    public static void displayElementsInArray(int[] myArray){
        for (int counter = 0; counter < myArray.length; counter++) {
            System.out.println(myArray[counter]);
        }
    }

    public static int[] displayBetweenOneAndTen(){
        int[] resultArray = new int[10];
        for (int counter = 1; counter < 9; counter++) {
            resultArray[counter] = counter;
        }
        return resultArray;
    }

    /**
     * create an array of any 20 numbers
     * copy the even in the source array into a destination
     * @return
     */

    public static int[] arrayCopy(){
        int[] arrayNo = new int[10];
        int[] arrayNoCopy = new int[5];
        for (int counter = 0; counter < 9; counter++) {
            if (arrayNo[counter] % 2 == 0){
                System.arraycopy(arrayNo,2, arrayNoCopy,0, arrayNoCopy.length);

            }
        }
        return arrayNoCopy;
    }

    /**
     * create a method that checks the maximum out of three integers
     */





}


