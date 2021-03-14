package com.stealthmountain.rocks.either5;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Either5<
        LeftLeftType extends Either5.LeftLeft<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                MiddleValueType,
                RightValueType,
                RightRightValueType
                >,
        LeftType extends Either5.Left<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                MiddleValueType,
                RightValueType,
                RightRightValueType
                >,
        MiddleType extends Either5.Middle<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                MiddleValueType,
                RightValueType,
                RightRightValueType
                >,
        RightType extends Either5.Right<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                MiddleValueType,
                RightValueType,
                RightRightValueType
                >,
        RightRightType extends Either5.RightRight<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                MiddleValueType,
                RightValueType,
                RightRightValueType
                >,
        LeftLeftValueType,
        LeftValueType,
        MiddleValueType,
        RightValueType,
        RightRightValueType
        > {
    @Nonnull
    <T> T reduce(
            @Nonnull Function1<
                    ? super LeftLeftType,
                    ? extends T
                    > leftLeftReducer,
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
                    > rightReducer,
            @Nonnull Function1<
                    ? super RightRightType,
                    ? extends T
                    > rightRightReducer
    );

    void act(
            @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
            @Nonnull VoidFunction1<? super LeftType> leftAction,
            @Nonnull VoidFunction1<? super MiddleType> middleAction,
            @Nonnull VoidFunction1<? super RightType> rightAction,
            @Nonnull VoidFunction1<? super RightRightType> rightRightAction
    );

    interface LeftLeft<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > extends Either5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > {
        @Nonnull
        LeftLeftValueType getValue();
    }

    // Not final to allow reification
    abstract class LeftLeftImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > implements LeftLeft<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > {
        @Nonnull
        private final Class<LeftLeftType> selfClass;
        @Nonnull
        public final LeftLeftValueType value;

        protected LeftLeftImpl(
                @Nonnull Class<LeftLeftType> selfClass,
                @Nonnull LeftLeftValueType value
        ) {
            this.selfClass = selfClass;
            this.value = value;
        }

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final LeftLeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> leftLeft = (LeftLeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return value.equals(leftLeft.value);
        }

        @Override
        public final int hashCode() {
            return Objects.hash(value);
        }

        @Nonnull
        @Override
        public final String toString() {
            @Nonnull final String simpleName = ClassUtil.getSpecificSimpleName(
                    LeftLeftImpl.class,
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
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
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
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer
        ) {
            return leftLeftReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction
        ) {
            leftLeftAction.apply(getSelf());
        }

        @Nonnull
        @Override
        public final LeftLeftValueType getValue() {
            return value;
        }

        @Nonnull
        private LeftLeftType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Left<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > extends Either5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > {
        @Nonnull
        LeftValueType getValue();
    }

    // Not final to allow reification
    abstract class LeftImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > implements Left<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
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
            @Nonnull final LeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> left = (LeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
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
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer
        ) {
            return leftReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction
        ) {
            leftAction.apply(getSelf());
        }

        @Nonnull
        @Override
        public final LeftValueType getValue() {
            return value;
        }

        @Nonnull
        private LeftType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Middle<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > extends Either5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > {
        @Nonnull
        MiddleValueType getValue();
    }

    // Not final to allow reification
    abstract class MiddleImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > implements Middle<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
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
            @Nonnull final MiddleImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> left = (MiddleImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
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
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer
        ) {
            return middleReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction
        ) {
            middleAction.apply(getSelf());
        }

        @Nonnull
        @Override
        public final MiddleValueType getValue() {
            return value;
        }

        @Nonnull
        private MiddleType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Right<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > extends Either5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > {
        @Nonnull
        RightValueType getValue();
    }

    // Not final to allow reification
    abstract class RightImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > implements Right<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
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
            @Nonnull final RightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> right = (RightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return value.equals(right.value);
        }

        @Override
        public final int hashCode() {
            return Objects.hash(value);
        }

        @Nonnull
        @Override
        public final String toString() {
            final String simpleName = ClassUtil.getSpecificSimpleName(
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
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
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
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer
        ) {
            return rightReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction
        ) {
            rightAction.apply(getSelf());
        }

        @Nonnull
        @Override
        public final RightValueType getValue() {
            return value;
        }

        @Nonnull
        private RightType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface RightRight<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > extends Either5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > {
        @Nonnull
        RightRightValueType getValue();
    }

    // Not final to allow reification
    abstract class RightRightImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            MiddleType extends Either5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    MiddleValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > implements RightRight<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
            MiddleValueType,
            RightValueType,
            RightRightValueType
            > {
        @Nonnull
        private final Class<RightRightType> selfClass;
        @Nonnull
        public final RightRightValueType value;

        protected RightRightImpl(
                @Nonnull Class<RightRightType> selfClass,
                @Nonnull RightRightValueType value
        ) {
            this.selfClass = selfClass;
            this.value = value;
        }

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final RightRightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (RightRightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return value.equals(that.value);
        }

        @Override
        public final int hashCode() {
            return Objects.hash(value);
        }

        @Nonnull
        @Override
        public final String toString() {
            @Nonnull final String simpleName = ClassUtil.getSpecificSimpleName(
                    RightRightImpl.class,
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
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
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
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer
        ) {
            return rightRightReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction
        ) {
            rightRightAction.apply(getSelf());
        }

        @Nonnull
        @Override
        public final RightRightValueType getValue() {
            return value;
        }

        @Nonnull
        private RightRightType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }
}
