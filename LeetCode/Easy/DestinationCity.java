// You are given the array paths, where paths[i] = [cityAi, cityBi] 
// means there exists a direct path going from cityAi to cityBi. 
// Return the destination city, that is, the city without any 
// /path outgoing to another city. It is guaranteed that the graph 
// of paths forms a line without any loop, therefore, there will be 
// exactly one destination city.

package LeetCode.Easy;

import java.util.*;

public class DestinationCity { // 1436
    public static String destCity(List<List<String>> paths) { // Actual LC solution
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            String city = path.get(0);
            cities.add(city);
        }
        for (List<String> path : paths) {
            String destination = path.get(1);
            if (!cities.contains(destination))
                return destination;
        }
        return "BRRR";
    }

    public static String destCity2(String[][] paths) { // Solution with Arrays because initialization of an array of
                                                       // arrays of strings is wayyyyyyyy easier than initializing a
                                                       // list of list of strings.
        Set<String> cities = new HashSet<>();
        for (String[] path : paths) {
            String city = path[0];
            cities.add(city);
        }
        for (String[] path : paths) {
            String destination = path[1];
            if (!cities.contains(destination))
                return destination;
        }
        return "BRRR";
    }

    public static void main(String[] args) {
        String[][] paths = { { "London", "New York" }, { "New York", "Lima" }, { "Lima", "Sao Paulo" } };
        System.out.println(destCity2(paths));
    }
}
