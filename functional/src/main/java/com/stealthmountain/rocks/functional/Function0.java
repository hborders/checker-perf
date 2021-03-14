package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface Function0<R> {
    @Nonnull
    R apply();
}
