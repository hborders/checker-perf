package com.stealthmountain.rocks.either3;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Either3<
        LeftType extends Either3.Left<
                LeftType,
                MiddleType,
                RightType,
                LeftValueType,
                MiddleValueType,
                RightValueType
                >,
        MiddleType extends Either3.Middle<
                LeftType,
                MiddleType,
                RightType,
                LeftValueType,
                MiddleValueType,
                RightValueType
                >,
        RightType extends Either3.Right<
                LeftType,
                MiddleType,
                RightType,
                LeftValueType,
                MiddleValueType,
                RightValueType
                >,
        LeftValueType,
        MiddleValueType,
        RightValueType
        > {
    @Nonnull
    <T> T reduce(
            @Nonnull Function1<
                    ? super LeftType,
                    ? extends T
                    > leftReducer,
            @Nonnull Function1<
                    ? super MiddleType,
                    ? extends T
                    > middleReducer,
            @Nonnull Function1<
                    ? super RightType,
                    ? extends T
                    > rightReducer
    );

    void act(
            @Nonnull VoidFunction1<? super LeftType> leftAction,
            @Nonnull VoidFunction1<? super MiddleType> middleAction,
            @Nonnull VoidFunction1<? super RightType> rightAction
    );

    interface Left<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > extends Either3<
            LeftType,
            MiddleType,
            RightType,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > {
        @Nonnull
        LeftValueType getValue();
    }

    // Not final to allow reification
    abstract class LeftImpl<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > implements Left<
            LeftType,
            MiddleType,
            RightType,
            LeftValueType,
            MiddleValueType,
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

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final LeftImpl<?, ?, ?, ?, ?, ?> left = (LeftImpl<?, ?, ?, ?, ?, ?>) o;
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

        @Nonnull
        @Override
        public final <T> T reduce(
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super MiddleType,
                        ? extends T
                        > middleReducer,
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
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
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

    interface Middle<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > extends Either3<
            LeftType,
            MiddleType,
            RightType,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > {
        @Nonnull
        MiddleValueType getValue();
    }

    // Not final to allow reification
    abstract class MiddleImpl<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > implements Middle<
            LeftType,
            MiddleType,
            RightType,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > {
        @Nonnull
        private final Class<MiddleType> selfClass;
        @Nonnull
        public final MiddleValueType value;

        protected MiddleImpl(
                @Nonnull Class<MiddleType> selfClass,
                @Nonnull MiddleValueType value
        ) {
            this.selfClass = selfClass;
            this.value = value;
        }

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final MiddleImpl<?, ?, ?, ?, ?, ?> middle = (MiddleImpl<?, ?, ?, ?, ?, ?>) o;
            return value.equals(middle.value);
        }

        @Override
        public final int hashCode() {
            return Objects.hash(value);
        }

        @Nonnull
        @Override
        public final String toString() {
            @Nonnull final String simpleName = ClassUtil.getSpecificSimpleName(
                    MiddleImpl.class,
                    getClass()
            );

            return simpleName + "{" +
                    "value=" + value +
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
                        ? super MiddleType,
                        ? extends T
                        > middleReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer
        ) {
            return middleReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction
        ) {
            middleAction.apply(getSelf());
        }

        @Nonnull
        @Override
        public MiddleValueType getValue() {
            return value;
        }

        @Nonnull
        private MiddleType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Right<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > extends Either3<
            LeftType,
            MiddleType,
            RightType,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > {
        @Nonnull
        RightValueType getValue();
    }

    // Not final to allow reification
    abstract class RightImpl<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType
                    >,
            LeftValueType,
            MiddleValueType,
            RightValueType
            > implements Right<
            LeftType,
            MiddleType,
            RightType,
            LeftValueType,
            MiddleValueType,
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

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final RightImpl<?, ?, ?, ?, ?, ?> right = (RightImpl<?, ?, ?, ?, ?, ?>) o;
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

        @Nonnull
        @Override
        public final <T> T reduce(
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super MiddleType,
                        ? extends T
                        > middleReducer,
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
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
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
}
