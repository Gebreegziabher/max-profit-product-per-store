package org.profit;

import org.profit.data.StoreProduct;

public class Mapper<K> {
    public Mapper() {
    }

    public static <K> Pair<K, Pair<Pair<String, String>,Double>> map(StoreProduct product) {
        return new Pair(
                product.getStoreId(),
                new Pair(new Pair(product.getProductId(), product.getProductName()), product.getProfit())
        );
    }
}
