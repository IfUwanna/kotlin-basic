package domain;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by jihun.park@navercorp.com on 2022-07-26.
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Nullable //@NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

