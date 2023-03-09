package org.profit;

import org.profit.data.Data;
import org.profit.data.StoreProduct;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //One mapper
        List<Pair<String, Pair<Pair<String, String>,Double>>> mapperOutput = new ArrayList<>();
        for(StoreProduct record: Data.getAllList())
            mapperOutput.add(Mapper.map(record));

        System.out.println("\nMAPPER OUTPUT");
        System.out.println(mapperOutput);

        //One reducer
        List<Pair<String, Pair<Pair<String, String>, Double>>> reducerOutput = new ArrayList<>();
        for(Pair<String, List<Pair<Pair<String, String>, Double>>> reducerInput: Shuffler.shuffle(mapperOutput))
            reducerOutput.add(Reducer.reduce(reducerInput.getKey(), reducerInput.getValue()));

        System.out.println("\nREDUCER OUTPUT");
        System.out.println(reducerOutput);
    }
}