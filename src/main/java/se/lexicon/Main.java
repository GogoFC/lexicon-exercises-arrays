package se.lexicon;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");

        //1
        int[] numbers = {11,23,39};
        System.out.println(Arrays.toString(numbers) + "\n");
        
        //3
        sortingCities();

        //4
        int[] cloneArray = {1,15,20};
        int[] copyOfCloneArray = Arrays.copyOf(cloneArray,cloneArray.length);
        System.out.println(Arrays.toString(copyOfCloneArray) + "\n");

        //5
        String[][] countryCity = new String[4][2];

        countryCity[0][0] = "Sweden";
        countryCity[0][1] = "Malmö";
        countryCity[1][0] = "Denmark";
        countryCity[1][1] = "København";
        countryCity[2][0] = "USA";
        countryCity[2][1] = "Louisville";
        countryCity[3][0] = "Australia";
        countryCity[3][1] = "Sydney";

        System.out.println(Arrays.deepToString(countryCity) + "\n");

        System.out.println(Arrays.deepToString(countryCity).replace("], [", "],\n [") + "\n");

        printMultiDimensionArray(countryCity);
        // Before
        /*
        Iterator<String[]> iteratorCountyCity = Arrays.asList(countryCity).iterator();
        while (iteratorCountyCity.hasNext()) {
            System.out.println(Arrays.asList(iteratorCountyCity.next()));
        }
         */

        /*
        System.out.println("for loop");
        for (String[] o : countryCity) {
            System.out.println(Arrays.asList(countryCity));
        }
        */
        

        /*
        for (String[] strings : Arrays.asList(countryCity)) {
            System.out.println(strings);
        }
        */
        //System.out.println(Arrays.asList(countryCity));


        System.out.println(" ");
        String[][] colorsArray = new String[4][3];
        colorsArray[0][0] = "DeepPink";
        colorsArray[0][1] = "#FF1493";
        colorsArray[0][2] = "rgb(255, 20, 147)";
        colorsArray[1][0] = "DarkSlateBlue";
        colorsArray[1][1] = "#483D8B";
        colorsArray[1][2] = "rgb(72, 61, 139)";
        colorsArray[2][0] = "MediumSpringGreen";
        colorsArray[2][1] = "#00FA9A";
        colorsArray[2][2] = "rgb(0, 250, 154)";
        colorsArray[3][0] = "Azure";
        colorsArray[3][1] = "#F0FFFF";
        colorsArray[3][2] = "rgb(240, 255, 255)";
        printMultiDimensionArray(colorsArray);

        System.out.println(" ");
        int[][] twoDimNumbers = new int[2][2];
        twoDimNumbers[0][0] = 22;
        twoDimNumbers[0][1] = 23;
        twoDimNumbers[1][0] = 24;
        twoDimNumbers[1][1] = 25;
        printMultiDimensionArray(twoDimNumbers);
        System.out.println(" ");

        System.out.println("Lambda");
        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println(" ");
        System.out.println(" ");
        String[] stringArray = {"Paris","London","New York","Stockholm"};
        Arrays.stream(stringArray).forEach(System.out::println);
        System.out.println(" ");


        //6
        double[] bunchOfNumbers = {43,5,23,17,2,14};
        double avg = getAverage(bunchOfNumbers);
        System.out.println("Average is: " + avg);
        System.out.println(" ");

        double[] testNumbers = {100,1000,10000};
        double testAvg = getAverage(testNumbers);
        System.out.println("Average is: " + testAvg);
        System.out.println(" ");

        //7
        int size = 0;
        int[] oddAndEvenNumbers = {1, 2, 4, 7, 9, 12};
        for (int o : oddAndEvenNumbers) {
            if (o%2!=0) size++;
        }
        int oddIndex = 0;
        int[] oddNumbers = new int[size];
        aa:
        for (int i : oddAndEvenNumbers) {
            if (i%2!=0) {
                oddNumbers[oddIndex] = i;
                oddIndex++;
                continue aa;
                //aa is a label. idk why or if this is useful.
            }
        }
        System.out.println(Arrays.toString(oddAndEvenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
        // continue
        /*
        ##############################
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
        System.out.println(i);
        }
        ##############################
        */

/*
        //7b
        int arrayIndex = 0;
        int[] mixOfNumbers = {1, 2, 4, 7, 9, 12};
        int[] mixOfNumbersCopy = Arrays.copyOf(mixOfNumbers, mixOfNumbers.length);
        int[] mixOfNumbersCopy2 = new int[0];


        for (int o : mixOfNumbers) {
            if (o%2!=0) {
                mixOfNumbersCopy[arrayIndex] = o;
                mixOfNumbersCopy2 = Arrays.copyOf(mixOfNumbersCopy, mixOfNumbersCopy.length -1);
                arrayIndex++;

                continue;
            }

        }

        System.out.println(Arrays.toString(mixOfNumbers));
        System.out.println(Arrays.toString(mixOfNumbersCopy));
        System.out.println(Arrays.toString(mixOfNumbersCopy2));

*/


        //8

        /*
        int[] duplicates = new int[] {20,20,40,20,30,40,50,60,50};
        int[] uniques = new int[0];
        int counterH = 0;

        for (int number : duplicates) {
            //int findNumber = Arrays.binarySearch(duplicates,number);
            if (number != Arrays.binarySearch(uniques,number) ) {
                uniques[counterH] = number;
                counterH++;
                continue;
            }

        }
        System.out.println();



*/


        //2
        System.out.println(" ");
        int[] test = new int[] {1,6,3,4,5};
        System.out.println("Checking for number in array");
        System.out.println(indexOf(test,7));









    }

    public static int indexOf (int[] array, int value) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == value) {
                return j;
            }

        }
        return -1;

    }

    private static double getAverage(double[] bunchOfNumbers) {
        double j = 0;
        double avg = 0;
        for (double i : bunchOfNumbers) {
            j = j + i;
            }
        avg = j / bunchOfNumbers.length;
        return avg;
    }

    private static void printMultiDimensionArray(String[][] countryCity) {
        Iterator<String[]> iteratorCountyCity = Arrays.asList(countryCity).iterator();
        while (iteratorCountyCity.hasNext()) {
            System.out.println(Arrays.asList(iteratorCountyCity.next()));
        }
    }

    private static void printMultiDimensionArray(int[][] countryCity) {
        Iterator<int[]> iteratorCountyCity = Arrays.asList(countryCity).iterator();
        while (iteratorCountyCity.hasNext()) {
            System.out.println(Arrays.toString(iteratorCountyCity.next()));
        }
    }

    private static void sortingCities() {
        //3
        String[] cities = {"Paris","London","New York","Stockholm"};
        Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.asList(cities) + "\n");
    }


    //public static String[] indexOf
    //something.indexOf("o")
}