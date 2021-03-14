package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class Nothing {
    @Nonnull
    public static final Nothing INSTANCE = new Nothing();

    public Nothing() {
    }

    @Override
    public int hashCode() {
        return Nothing.class.hashCode();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return obj instanceof Nothing;
    }

    @Nonnull
    @Override
    public String toString() {
        return "Nothing{}";
    }
}
