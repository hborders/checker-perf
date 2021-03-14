package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface VoidFunction2<T1, T2> {
    void apply(
            @Nonnull T1 t1,
            @Nonnull T2 t2
    );

    @Nonnull
    static <
            T,
            U
            > VoidFunction2<
            T,
            U
            > ignored1(@Nonnull VoidFunction1<U> function1) {
        return (
                @Nonnull T t,
                @Nonnull U u
        ) -> function1.apply(u);
    }

    @Nonnull
    static <
            T,
            U
            > VoidFunction2<
            T,
            U
            > ignored2(@Nonnull VoidFunction1<T> function1) {
        return (
                @Nonnull T t,
                @Nonnull U u
        ) -> function1.apply(t);
    }

    @Nonnull
    @SuppressWarnings("unchecked")
    static <
            T1,
            T2
            > VoidFunction2<
            T1,
            T2
            > empty2() {
        return (VoidFunction2<
                T1,
                T2
                >) PackagePrivate.EMPTY_VOID_FUNCTION2;
    }
}
