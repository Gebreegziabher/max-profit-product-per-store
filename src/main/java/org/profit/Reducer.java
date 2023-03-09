package org.profit;

import java.util.ArrayList;
import java.util.List;

public class Reducer<K> {
    //called once for each partition
    public static <K> List<Pair<K, Pair<Pair<K, K>, Double>>> reduce(List<Pair<K, List<Pair<Pair<K, K>, Double>>>> input) {
        List<Pair<K, Pair<Pair<K, K>, Double>>> output = new ArrayList<>();
        for (Pair<K, List<Pair<Pair<K, K>, Double>>> store : input) {
            Pair<Pair<K, K>, Double> productWithMaxProfit = null;
            double previousMax = 0;

            for (Pair<Pair<K, K>, Double> product : store.getValue()) {
                if (previousMax < product.getValue()) {
                    previousMax = product.getValue();
                    productWithMaxProfit = product;
                }
            }
            output.add(new Pair(store.getKey(), productWithMaxProfit));
        }
        return output;
    }

    //called for each key-value pair in a partition
    public static <K> Pair<K, Pair<Pair<K, K>, Double>> reduce(String storeId, List<Pair<Pair<K, K>, Double>> products) {
        Pair<Pair<K, K>, Double> productWithMaxProfit = null;
        double previousMax = 0;
        for (Pair<Pair<K, K>, Double> product : products) {
            if (previousMax < product.getValue()) {
                previousMax = product.getValue();
                productWithMaxProfit = product;
            }
        }
        return new Pair(storeId, productWithMaxProfit);
    }
}