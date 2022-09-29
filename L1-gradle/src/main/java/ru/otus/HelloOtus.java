package ru.otus;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {

        List<String> items = Lists.newArrayList("Moscow", "Novosibirsk", "Perm", "Yekaterinburg", "Irkutsk");

        Collection<String> result  = Collections2.filter(items,
                Predicates.containsPattern("o"));

        for (String item: result) {
            System.out.println(item);
        }

    }
}