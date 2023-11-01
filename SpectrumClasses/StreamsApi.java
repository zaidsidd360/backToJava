package SpectrumClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApi {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,56,6,8,9));
        Stream<Integer> stream = list.stream();
        System.out.println(
            stream
                .map((val) -> val * 3)
                .filter((val) -> val % 2 == 0)
                .sorted()
                .collect(Collectors.toList())
        );
    }
}
