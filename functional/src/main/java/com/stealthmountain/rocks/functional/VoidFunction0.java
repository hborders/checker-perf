package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface VoidFunction0 {
    void apply();

    @Nonnull
    default Function0<Nothing> nothingify() {
        return () -> {
            this.apply();
            return Nothing.INSTANCE;
        };
    }

    @Nonnull
    static VoidFunction0 empty0() {
        return PackagePrivate.EMPTY_VOID_FUNCTION0;
    }
}
