package ru.otus;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;


import java.util.Collection;
import java.util.List;



public class HelloOtus {

    private static void p_sort() {
        List<String> items = Lists.newArrayList("Moscow", "Novosibirsk", "Perm", "Yekaterinburg", "Irkutsk", "Tomsk", "Krasnoyarsk");

        Collection<String> result  = Collections2.filter(items,
                Predicates.containsPattern("o"));

        for (String item: result) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        p_sort();

    }




}