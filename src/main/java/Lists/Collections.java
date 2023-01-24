package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {
        System.out.println("Collections before action: ");
    List<Integer> integers = Arrays.asList(0,1,1,2,3,4,5,6,6,6,7);
    List<String> strings = new ArrayList<>(Arrays.asList("Hello", "World"));
    strings.add("Its");
    strings.add("Me");

        System.out.println(integers);
        System.out.println(strings);

        List<String> newStrings = strings.stream().map(e->e.toLowerCase()).collect(Collectors.toList());
        integers =integers.stream().filter(i -> i>=4).distinct().collect(Collectors.toList());
        strings = newStrings;
        System.out.println("Collections after action: ");
        System.out.println(strings);
        System.out.println(integers);


        HashMap<Integer, String> hashMapExample = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            hashMapExample.put(i, strings.get(i));
        }
        System.out.println("hashmap with values get form String List");
        System.out.println(hashMapExample);

        //iteracja listy żeby była na odwrót
    }
}