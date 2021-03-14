package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface Function1<
        T,
        R
        > {
    @Nonnull
    R apply(@Nonnull T t);

    @Nonnull
    static <T> Function1<
            T,
            T
            > identity() {
        return t -> t;
    }

    @Nonnull
    static <
            T,
            R
            > Function1<
            T,
            R
            > ignored(@Nonnull Function0<R> function0) {
        return (@Nonnull T ignored) -> function0.apply();
    }

    @Nonnull
    static <T> Function1<
            T,
            Nothing
            > nothingify(@Nonnull VoidFunction0 function0) {
        return (@Nonnull T t) -> {
            function0.apply();
            return Nothing.INSTANCE;
        };
    }
}
