package com.stealthmountain.rocks.either2;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Either<
        LeftType extends Either.Left<
                LeftType,
                RightType,
                LeftValueType,
                RightValueType
                >,
        RightType extends Either.Right<
                LeftType,
                RightType,
                LeftValueType,
                RightValueType
                >,
        LeftValueType,
        RightValueType
        > {
    interface Left<
            LeftType extends Left<
                    LeftType,
                    RightType,
                    LeftValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    RightType,
                    LeftValueType,
                    RightValueType
                    >,
            LeftValueType,
            RightValueType
            > extends Either<
            LeftType,
            RightType,
            LeftValueType,
            RightValueType
            > {
        @Nonnull
        LeftValueType getValue();
    }

    // Not final to allow reification
    abstract class LeftImpl<
            LeftType extends Left<
                    LeftType,
                    RightType,
                    LeftValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    RightType,
                    LeftValueType,
                    RightValueType
                    >,
            LeftValueType,
            RightValueType
            > implements Left<
            LeftType,
            RightType,
            LeftValueType,
            RightValueType
            > {
        @Nonnull
        private final Class<LeftType> selfClass;
        @Nonnull
        public final LeftValueType value;

        protected LeftImpl(
                @Nonnull Class<LeftType> selfClass,
                @Nonnull LeftValueType value
        ) {
            this.selfClass = selfClass;
            this.value = value;
        }

        // Object

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final LeftImpl<?, ?, ?, ?> left = (LeftImpl<?, ?, ?, ?>) o;
            return value.equals(left.value);
        }

        @Override
        public final int hashCode() {
            return Objects.hash(value);
        }

        @Nonnull
        @Override
        public final String toString() {
            @Nonnull final String simpleName = ClassUtil.getSpecificSimpleName(
                    LeftImpl.class,
                    getClass()
            );

            return simpleName + "{" +
                    "value=" + value +
                    '}';
        }

        // Either

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

        @Nonnull
        @Override
        public LeftValueType getValue() {
            return value;
        }

        @Nonnull
        private LeftType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Right<
            LeftType extends Left<
                    LeftType,
                    RightType,
                    LeftValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    RightType,
                    LeftValueType,
                    RightValueType
                    >,
            LeftValueType,
            RightValueType
            > extends Either<
            LeftType,
            RightType,
            LeftValueType,
            RightValueType
            > {
        @Nonnull
        RightValueType getValue();
    }

    // Not final to allow reification
    abstract class RightImpl<
            LeftType extends Left<
                    LeftType,
                    RightType,
                    LeftValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    RightType,
                    LeftValueType,
                    RightValueType
                    >,
            LeftValueType,
            RightValueType
            > implements Right<
            LeftType,
            RightType,
            LeftValueType,
            RightValueType
            > {
        @Nonnull
        private final Class<RightType> selfClass;
        @Nonnull
        public final RightValueType value;

        protected RightImpl(
                @Nonnull Class<RightType> selfClass,
                @Nonnull RightValueType value
        ) {
            this.selfClass = selfClass;
            this.value = value;
        }

        // Object

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final RightImpl<?, ?, ?, ?> right = (RightImpl<?, ?, ?, ?>) o;
            return value.equals(right.value);
        }

        @Override
        public final int hashCode() {
            return Objects.hash(value);
        }

        @Nonnull
        @Override
        public final String toString() {
            @Nonnull final String simpleName = ClassUtil.getSpecificSimpleName(
                    RightImpl.class,
                    getClass()
            );

            return simpleName + "{" +
                    "value=" + value +
                    '}';
        }

        // Either

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

        @Nonnull
        @Override
        public RightValueType getValue() {
            return value;
        }

        @Nonnull
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


