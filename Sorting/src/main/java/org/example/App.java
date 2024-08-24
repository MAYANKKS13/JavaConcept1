package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        doSorting ds = new doSorting();
        doSortingonNames dsName = new doSortingonNames();
        doSortingwithInsertion dsInsert = new doSortingwithInsertion();
        doSortingQUICK dsQuick = new doSortingQUICK();

        String[] cities = {"Pune", "Kolkata", "Chennai", "Ahemdabad"};
        int[] distance = {1000, 2000, 500, 2500};

        ds.sort(distance, cities);
        System.out.println();
        dsName.sort(distance, cities);
        System.out.println();
        dsInsert.sort(distance, cities);
        System.out.println();
        dsQuick.sort(distance, cities, 0, distance.length - 1);

    }
}
