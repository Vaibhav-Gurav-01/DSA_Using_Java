package Five;
import java.util.Scanner;

/*E) Write a  program to accept the names of cities and store them in array.
 Accept the city name from user and use linear search algorithm
  to check whether the city is present in array or not.	
*/

public class CitySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] cities = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            cities[i] = scanner.nextLine();
        }

        System.out.print("Enter the city name to search: ");
        String searchCity = scanner.nextLine();
        
        boolean found = linearSearch(cities, searchCity);

        if (found) {
            System.out.println(searchCity + " is present in the list of cities.");
        } else {
            System.out.println(searchCity + " is not present in the list of cities.");
        }

        scanner.close();
    }

    private static boolean linearSearch(String[] cities, String searchCity) {
        for (String city : cities) {
            if (city.equalsIgnoreCase(searchCity)) {
                return true; 
            }
        }
        return false; 
    }
}
