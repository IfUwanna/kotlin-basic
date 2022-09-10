package domain;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by jihun.park@navercorp.com on 2022-07-26.
 */
public class Person {

    private final String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}