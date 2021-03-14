package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface Function2<
        T1,
        T2,
        R
        > {
    @Nonnull
    R apply(
            @Nonnull T1 t1,
            @Nonnull T2 t2
    );
}
