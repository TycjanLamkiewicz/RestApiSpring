package com.restapi.RestAPI;

import java.util.ArrayList;
import java.util.List;

public class DummyDB {
    public static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Jan", "Kowalski", 20));
        users.add(new User("Anna", "Kowalska", 30));
        users.add(new User("Krzysztof", "Nowak", 25));

    }
}
