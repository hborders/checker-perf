package com.stealthmountain.rocks.emptyeither2;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface EmptyEither<
        LeftType extends EmptyEither.Left<
                LeftType,
                RightType
                >,
        RightType extends EmptyEither.Right<
                LeftType,
                RightType
                >
        > {
    interface Left<
            LeftType extends Left<
                    LeftType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    RightType
                    >
            > extends EmptyEither<
            LeftType,
            RightType
            > {
    }

    // Not final to allow reification
    abstract class LeftImpl<
            LeftType extends Left<
                    LeftType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    RightType
                    >
            > implements Left<
            LeftType,
            RightType
            > {
        @Nonnull
        private final Class<LeftType> selfClass;

        protected LeftImpl(@Nonnull Class<LeftType> selfClass) {
            this.selfClass = selfClass;
        }

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return true;
        }

        @Override
        public final int hashCode() {
            return Objects.hash(getClass());
        }

        @Override
        public final String toString() {
            @Nonnull final String simpleName = ClassUtil.getSpecificSimpleName(
                    LeftImpl.class,
                    getClass()
            );

            return simpleName + "{" +
                    '}';
        }

        @Nonnull
        @Override
        public final <T> T reduce(
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer
        ) {
            return leftReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super RightType> rightAction
        ) {
            leftAction.apply(getSelf());
        }

        private LeftType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Right<
            LeftType extends Left<
                    LeftType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    RightType
                    >
            > extends EmptyEither<
            LeftType,
            RightType
            > {
    }

    // Not final to allow reification
    abstract class RightImpl<
            LeftType extends Left<
                    LeftType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    RightType
                    >
            > implements Right<
            LeftType,
            RightType
            > {
        @Nonnull
        private final Class<RightType> selfClass;

        protected RightImpl(@Nonnull Class<RightType> selfClass) {
            this.selfClass = selfClass;
        }

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return true;
        }

        @Override
        public final int hashCode() {
            return Objects.hash(getClass());
        }

        @Override
        public final String toString() {
            @Nonnull final String simpleName = ClassUtil.getSpecificSimpleName(
                    RightImpl.class,
                    getClass()
            );

            return simpleName + "{" +
                    '}';
        }

        @Nonnull
        @Override
        public final <T> T reduce(
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer
        ) {
            return rightReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super RightType> rightAction
        ) {
            rightAction.apply(getSelf());
        }

        private RightType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    @Nonnull
    <T> T reduce(
            @Nonnull Function1<
                    ? super LeftType,
                    ? extends T
                    > leftReducer,
            @Nonnull Function1<
                    ? super RightType,
                    ? extends T
                    > rightReducer
    );

    void act(
            @Nonnull VoidFunction1<? super LeftType> leftAction,
            @Nonnull VoidFunction1<? super RightType> rightAction
    );
}


