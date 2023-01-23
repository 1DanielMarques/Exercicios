package org.example;

import java.util.Objects;

public class User {

    public int id;
    public int age;

    public User(int id, int age) {
        this.id = id;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age);
    }
}
