package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface VoidFunction4<
        T1,
        T2,
        T3,
        T4
        > {
    void apply(
            @Nonnull T1 t1,
            @Nonnull T2 t2,
            @Nonnull T3 t3,
            @Nonnull T4 t4
    );

    @Nonnull
    @SuppressWarnings("unchecked")
    static <
            T1,
            T2,
            T3,
            T4
            > VoidFunction4<
            T1,
            T2,
            T3,
            T4
            > empty4() {
        return (VoidFunction4<
                T1,
                T2,
                T3,
                T4
                >) PackagePrivate.EMPTY_VOID_FUNCTION4;
    }
}
