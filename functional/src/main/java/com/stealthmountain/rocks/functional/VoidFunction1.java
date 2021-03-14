package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public interface VoidFunction1<T> {
    void apply(@Nonnull T t);

    @Nonnull
    static <T> VoidFunction1<? super T> ignored(@Nonnull VoidFunction0 function0) {
        return (@Nonnull T t) -> function0.apply();
    }

    @Nonnull
    @SuppressWarnings("unchecked")
    static <T> VoidFunction1<T> empty1() {
        return (VoidFunction1<T>) PackagePrivate.EMPTY_VOID_FUNCTION1;
    }
}
