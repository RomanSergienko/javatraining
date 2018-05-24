package com.company.lesson6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> list1 = new ArrayList<>();
        List<User> list2 = new ArrayList<>();

        list1.add(new User("Иван", "ivan@com", "hoho"));
        list1.add(new User("Сергей", "sergey@com", "abcabc"));
        list1.add(new User("Наталья", "hatalya@com", "me111222"));

        list2.add(new User("Наталья", "hatalya@com", "me111222"));
        list2.add(new User("Майкл", "m@com", "guftalls"));
        list2.add(new User("Корбен", "corb@com", "asdq2"));
        list2.add(new User("Иван", "ivan@com", "hoho"));

        Collection<User> result = intersectTwoList(list1, list2);
        if (result.size() != 0) {
            System.out.println("===================================");
            System.out.println("Одинаковые пользователи для списков");
            for (User u : result) {
                System.out.println(u);
            }
            System.out.println("===================================");
        } else {
            System.out.println("===================================");
            System.out.println("В списках нет одинаковых пользователей");
            System.out.println("===================================");
        }


    }

    public static Collection<User> intersectTwoList(Collection<User> l1, Collection<User> l2) {
        Collection<User> intersectList = new ArrayList<>();
        for (User user : l1) {
            if (l2.contains(user)) {
                intersectList.add(user);
            }
        }
        return intersectList;
    }

}
