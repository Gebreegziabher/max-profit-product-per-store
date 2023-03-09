package org.profit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Shuffler {
    public static List<Pair<String, List<Pair<Pair<String, String>, Double>>>> shuffle(List<Pair<String, Pair<Pair<String, String>, Double>>> mapperOutput) {
        var grouped = mapperOutput.stream().collect(Collectors.groupingBy(g -> g.getKey()));
        List<Pair<String, List<Pair<Pair<String, String>, Double>>>> output = new ArrayList<>();
        for (Map.Entry<String, List<Pair<String, Pair<Pair<String, String>, Double>>>> entry : grouped.entrySet()) {
            output.add(new Pair(entry.getKey(), entry.getValue().stream().map(m -> m.getValue()).toList()));
        }
        return output.stream().sorted(Comparator.comparing(s -> s.getKey())).toList();
    }
}
