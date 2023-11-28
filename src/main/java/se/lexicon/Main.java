package se.lexicon;

import com.sun.source.util.SourcePositions;


import java.util.ArrayList;
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

        System.out.println("Lambda");
        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println(" ");
        String[] stringArray = {"Paris","London","New York","Stockholm"};
        Arrays.stream(stringArray).forEach(System.out::println);











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