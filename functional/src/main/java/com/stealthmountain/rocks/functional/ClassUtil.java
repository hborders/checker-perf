package com.stealthmountain.rocks.functional;

import javax.annotation.Nonnull;

public final class ClassUtil {
    @Nonnull
    public static <
            AbstractType,
            SpecificType extends AbstractType
            > String getSpecificSimpleName(
            @Nonnull Class<AbstractType> abstractClass,
            @Nonnull Class<SpecificType> specificClass
    ) {
        @Nonnull final String simpleName;
        if (specificClass.isAnonymousClass()) {
            if (abstractClass.isAnonymousClass()) {
                simpleName = "$$";
            } else {
                simpleName = abstractClass.getSimpleName() + "$";
            }
        } else {
            simpleName = specificClass.getSimpleName();
        }

        return simpleName;
    }

    private ClassUtil() {
    }
}
