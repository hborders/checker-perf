package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface Function3<
        T1,
        T2,
        T3,
        R
        > {
    @Nonnull
    R apply(
            @Nonnull T1 t1,
            @Nonnull T2 t2,
            @Nonnull T3 t3
    );
}
