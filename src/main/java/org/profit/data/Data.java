package org.profit.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    private static final List<StoreProduct> list1 = new ArrayList<>(Arrays.asList(
            new StoreProduct("001", "New York", "P001", "Aisle 1", 10.50, 20.00, 100),
            new StoreProduct("001", "New York", "P002", "Aisle 2", 15.20, 25.00, 150),
            new StoreProduct("001", "New York", "P003", "Aisle 3", 20.00, 35.50, 200),
            new StoreProduct("002", "Houston", "P001", "Aisle 1", 12.30, 22.75, 120),
            new StoreProduct("003", "Philadelphia", "P001", "Aisle 1", 18.00, 30.00, 180),
            new StoreProduct("003", "Philadelphia", "P002", "Aisle 2", 25.50, 40.00, 250),
            new StoreProduct("002", "Houston", "P002", "Aisle 2", 30.20, 50.00, 300),
            new StoreProduct("004", "Atlanta", "P004", "Aisle 4", 17.50, 28.50, 170),
            new StoreProduct("005", "Seattle", "P005", "Aisle 5", 22.00, 37.00, 220),
            new StoreProduct("004", "Atlanta", "P004", "Aisle 4", 14.80, 26.00, 140)
    ));

    private static final List<StoreProduct> list2 = new ArrayList<>(Arrays.asList(
            new StoreProduct("002", "Houston", "P006", "Aisle 6", 11.50, 21.00, 110),
            new StoreProduct("002", "Houston", "P007", "Aisle 7", 16.20, 26.50, 160),
            new StoreProduct("003", "Philadelphia", "P006", "Aisle 6", 21.00, 36.50, 210),
            new StoreProduct("004", "Atlanta", "P007", "Aisle 7", 13.30, 23.75, 130),
            new StoreProduct("005", "Seattle", "P004", "Aisle 4", 19.00, 31.00, 190),
            new StoreProduct("001", "New York", "P005", "Aisle 5", 26.50, 41.00, 260),
            new StoreProduct("003", "Philadelphia", "P005", "Aisle 5", 31.20, 51.00, 310),
            new StoreProduct("005", "Seattle", "P001", "Aisle 1", 18.50, 29.50, 180),
            new StoreProduct("005", "Seattle", "P002", "Aisle 2", 23.00, 38.00, 230),
            new StoreProduct("002", "Houston", "P003", "Aisle 3", 18.50, 29.50, 180)
    ));

    public static List<StoreProduct> getList1() {
        return list1;
    }

    public static List<StoreProduct> getList2() {
        return list2;
    }

    public static List<StoreProduct> getAllList() {
        List<StoreProduct> allLists = new ArrayList<>();
        allLists.addAll(list1);
        allLists.addAll(list2);
        return allLists;
    }
}

