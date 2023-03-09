package org.profit;

import java.util.List;

public class Reducer<K> {

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