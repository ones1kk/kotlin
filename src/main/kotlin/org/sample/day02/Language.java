package org.sample.day02;

import org.jetbrains.annotations.NotNull;

public class Language {

    private final String name;

    public Language(String name) {
        this.name = name;
    }

    //    @Nullable
    @NotNull
    public String getName() {
        return name;
    }
}
