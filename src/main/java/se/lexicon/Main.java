package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");

        //1
        int[] numbers = {11,23,39};
        System.out.println(Arrays.toString(numbers) + "\n");

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

        Iterator<String[]> itrC = Arrays.asList(countryCity).iterator();
        while (itrC.hasNext()) {
            System.out.println(Arrays.asList(itrC.next()));
        }

        /*
        for (String[] strings : Arrays.asList(countryCity)) {
            System.out.println(strings);
        }
        */
        //System.out.println(Arrays.asList(countryCity));








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