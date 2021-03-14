package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface VoidFunction3<
        T1,
        T2,
        T3
        > {
    void apply(
            @Nonnull T1 t1,
            @Nonnull T2 t2,
            @Nonnull T3 t3
    );

    @Nonnull
    @SuppressWarnings("unchecked")
    static <
            T1,
            T2,
            T3
            > VoidFunction3<
            T1,
            T2,
            T3
            > empty3() {
        return (VoidFunction3<
                T1,
                T2,
                T3
                >) PackagePrivate.EMPTY_VOID_FUNCTION3;
    }
}
