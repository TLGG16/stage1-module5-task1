package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return x ->{
            for (String str: x
                 ) {
                if (!Character.isUpperCase(str.charAt(0))){
                    return false;
                }
            }
           return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return (x) -> {
            List<Integer> list_2 = new ArrayList<>();

            for (Integer i : x
            ) {
                if (i % 2 == 0) {
                    list_2.add(i);
                }
            }
            x.addAll(list_2);
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return ()->{
            List<String> list_2 = new ArrayList<>();
            for (String str: values
                 ) {
                if (Character.isUpperCase(str.charAt(0)) && str.endsWith(".") && str.split(" ").length>3 ){
                    list_2.add(str);
                }
            }
            return list_2;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return x->{
            Map<String,Integer> answ = new HashMap<>();
            for (String str: x
                 ) {
                answ.put(str,str.length());
            }

            return answ;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (x,y)->{
            List<Integer> answ = new ArrayList<>(x);
            answ.addAll(y);
            return answ;
        };
    }
}
