package com.stealthmountain.rocks.either6;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Either6<
        LeftLeftLeftType extends Either6.LeftLeftLeft<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType,
                LeftLeftLeftValueType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType,
                RightRightRightValueType
                >,
        LeftLeftType extends Either6.LeftLeft<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType,
                LeftLeftLeftValueType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType,
                RightRightRightValueType
                >,
        LeftType extends Either6.Left<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType,
                LeftLeftLeftValueType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType,
                RightRightRightValueType
                >,
        RightType extends Either6.Right<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType,
                LeftLeftLeftValueType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType,
                RightRightRightValueType
                >,
        RightRightType extends Either6.RightRight<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType,
                LeftLeftLeftValueType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType,
                RightRightRightValueType
                >,
        RightRightRightType extends Either6.RightRightRight<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType,
                LeftLeftLeftValueType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType,
                RightRightRightValueType
                >,
        LeftLeftLeftValueType,
        LeftLeftValueType,
        LeftValueType,
        RightValueType,
        RightRightValueType,
        RightRightRightValueType
        > {
    @Nonnull
    <T> T reduce(
            @Nonnull Function1<
                    ? super LeftLeftLeftType,
                    ? extends T
                    > leftLeftLeftReducer,
            @Nonnull Function1<
                    ? super LeftLeftType,
                    ? extends T
                    > leftLeftReducer,
            @Nonnull Function1<
                    ? super LeftType,
                    ? extends T
                    > leftReducer,
            @Nonnull Function1<
                    ? super RightType,
                    ? extends T
                    > rightReducer,
            @Nonnull Function1<
                    ? super RightRightType,
                    ? extends T
                    > rightRightReducer,
            @Nonnull Function1<
                    ? super RightRightRightType,
                    ? extends T
                    > rightRightRightReducer
    );

    void act(
            @Nonnull VoidFunction1<? super LeftLeftLeftType> leftLeftLeftAction,
            @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
            @Nonnull VoidFunction1<? super LeftType> leftAction,
            @Nonnull VoidFunction1<? super RightType> rightAction,
            @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
            @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
    );

    interface LeftLeftLeft<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > extends Either6<
                        LeftLeftLeftType,
                        LeftLeftType,
                        LeftType,
                        RightType,
                        RightRightType,
                        RightRightRightType,
                        LeftLeftLeftValueType,
                        LeftLeftValueType,
                        LeftValueType,
                        RightValueType,
                        RightRightValueType,
                        RightRightRightValueType
                        > {
        @Nonnull
        LeftLeftLeftValueType getValue();
    }

    // Not final to allow reification
    abstract class LeftLeftLeftImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > implements LeftLeftLeft<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            RightRightRightType,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > {
        @Nonnull
        private final Class<LeftLeftLeftType> selfClass;
        @Nonnull
        public final LeftLeftLeftValueType value;

        protected LeftLeftLeftImpl(
                @Nonnull Class<LeftLeftLeftType> selfClass,
                @Nonnull LeftLeftLeftValueType value
        ) {
            this.selfClass = selfClass;
            this.value = value;
        }

        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final LeftLeftLeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (LeftLeftLeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                    LeftLeftLeftImpl.class,
                    getClass()
            );
            return simpleName + "{" +
                    ", value=" + value +
                    '}';
        }

        @Nonnull
        @Override
        public final <T> T reduce(
                @Nonnull Function1<
                        ? super LeftLeftLeftType,
                        ? extends T
                        > leftLeftLeftReducer,
                @Nonnull Function1<
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer,
                @Nonnull Function1<
                        ? super RightRightRightType,
                        ? extends T
                        > rightRightRightReducer
        ) {
            return leftLeftLeftReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftLeftType> leftLeftLeftAction,
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            leftLeftLeftAction.apply(getSelf());
        }

        @Nonnull
        @Override
        public final LeftLeftLeftValueType getValue() {
            return value;
        }

        @Nonnull
        private LeftLeftLeftType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface LeftLeft<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > extends Either6<
                        LeftLeftLeftType,
                        LeftLeftType,
                        LeftType,
                        RightType,
                        RightRightType,
                        RightRightRightType,
                        LeftLeftLeftValueType,
                        LeftLeftValueType,
                        LeftValueType,
                        RightValueType,
                        RightRightValueType,
                        RightRightRightValueType
                        > {
        @Nonnull
        LeftLeftValueType getValue();
    }

    // Not final to allow reification
    abstract class LeftLeftImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > implements LeftLeft<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            RightRightRightType,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
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
            @Nonnull final LeftLeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> leftLeft = (LeftLeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                        ? super LeftLeftLeftType,
                        ? extends T
                        > leftLeftLeftReducer,
                @Nonnull Function1<
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer,
                @Nonnull Function1<
                        ? super RightRightRightType,
                        ? extends T
                        > rightRightRightReducer
        ) {
            return leftLeftReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftLeftType> leftLeftLeftAction,
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
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
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > extends Either6<
                        LeftLeftLeftType,
                        LeftLeftType,
                        LeftType,
                        RightType,
                        RightRightType,
                        RightRightRightType,
                        LeftLeftLeftValueType,
                        LeftLeftValueType,
                        LeftValueType,
                        RightValueType,
                        RightRightValueType,
                        RightRightRightValueType
                        > {
        @Nonnull
        LeftValueType getValue();
    }

    // Not final to allow reification
    abstract class LeftImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > implements Left<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            RightRightRightType,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
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
            @Nonnull final LeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> left = (LeftImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                        ? super LeftLeftLeftType,
                        ? extends T
                        > leftLeftLeftReducer,
                @Nonnull Function1<
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer,
                @Nonnull Function1<
                        ? super RightRightRightType,
                        ? extends T
                        > rightRightRightReducer
        ) {
            return leftReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftLeftType> leftLeftLeftAction,
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
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

    interface Right<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > extends Either6<
                        LeftLeftLeftType,
                        LeftLeftType,
                        LeftType,
                        RightType,
                        RightRightType,
                        RightRightRightType,
                        LeftLeftLeftValueType,
                        LeftLeftValueType,
                        LeftValueType,
                        RightValueType,
                        RightRightValueType,
                        RightRightRightValueType
                        > {
        @Nonnull
        RightValueType getValue();
    }

    // Not final to allow reification
    abstract class RightImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > implements Right<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            RightRightRightType,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
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
            @Nonnull final RightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> right = (RightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                        ? super LeftLeftLeftType,
                        ? extends T
                        > leftLeftLeftReducer,
                @Nonnull Function1<
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer,
                @Nonnull Function1<
                        ? super RightRightRightType,
                        ? extends T
                        > rightRightRightReducer
        ) {
            return rightReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftLeftType> leftLeftLeftAction,
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
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
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > extends Either6<
                        LeftLeftLeftType,
                        LeftLeftType,
                        LeftType,
                        RightType,
                        RightRightType,
                        RightRightRightType,
                        LeftLeftLeftValueType,
                        LeftLeftValueType,
                        LeftValueType,
                        RightValueType,
                        RightRightValueType,
                        RightRightRightValueType
                        > {
        @Nonnull
        RightRightValueType getValue();
    }

    // Not final to allow reification
    abstract class RightRightImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > implements RightRight<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            RightRightRightType,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
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
            @Nonnull final RightRightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (RightRightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                        ? super LeftLeftLeftType,
                        ? extends T
                        > leftLeftLeftReducer,
                @Nonnull Function1<
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer,
                @Nonnull Function1<
                        ? super RightRightRightType,
                        ? extends T
                        > rightRightRightReducer
        ) {
            return rightRightReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftLeftType> leftLeftLeftAction,
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
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

    interface RightRightRight<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > extends Either6<
                        LeftLeftLeftType,
                        LeftLeftType,
                        LeftType,
                        RightType,
                        RightRightType,
                        RightRightRightType,
                        LeftLeftLeftValueType,
                        LeftLeftValueType,
                        LeftValueType,
                        RightValueType,
                        RightRightValueType,
                        RightRightRightValueType
                        > {

        @Nonnull
        RightRightRightValueType getValue();
    }

    // Not final to allow reification
    abstract class RightRightRightImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType,
                    LeftLeftLeftValueType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType,
                    RightRightRightValueType
                    >,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > implements RightRightRight<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            RightRightRightType,
            LeftLeftLeftValueType,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType,
            RightRightRightValueType
            > {
        @Nonnull
        private final Class<RightRightRightType> selfClass;
        @Nonnull
        public final RightRightRightValueType value;

        protected RightRightRightImpl(
                @Nonnull Class<RightRightRightType> selfClass,
                @Nonnull RightRightRightValueType value
        ) {
            this.selfClass = selfClass;
            this.value = value;
        }

        @Nonnull
        @Override
        public final boolean equals(@Nullable Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            @Nonnull final RightRightRightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (RightRightRightImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                    RightRightRightImpl.class,
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
                        ? super LeftLeftLeftType,
                        ? extends T
                        > leftLeftLeftReducer,
                @Nonnull Function1<
                        ? super LeftLeftType,
                        ? extends T
                        > leftLeftReducer,
                @Nonnull Function1<
                        ? super LeftType,
                        ? extends T
                        > leftReducer,
                @Nonnull Function1<
                        ? super RightType,
                        ? extends T
                        > rightReducer,
                @Nonnull Function1<
                        ? super RightRightType,
                        ? extends T
                        > rightRightReducer,
                @Nonnull Function1<
                        ? super RightRightRightType,
                        ? extends T
                        > rightRightRightReducer
        ) {
            return rightRightRightReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftLeftType> leftLeftLeftAction,
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            rightRightRightAction.apply(getSelf());
        }

        @Nonnull
        @Override
        public final RightRightRightValueType getValue() {
            return value;
        }

        @Nonnull
        private RightRightRightType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }
}
