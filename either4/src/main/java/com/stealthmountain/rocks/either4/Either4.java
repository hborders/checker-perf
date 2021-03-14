package com.stealthmountain.rocks.either4;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Either4<
        LeftLeftType extends Either4.LeftLeft<
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType
                >,
        LeftType extends Either4.Left<
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType
                >,
        RightType extends Either4.Right<
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType
                >,
        RightRightType extends Either4.RightRight<
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                LeftLeftValueType,
                LeftValueType,
                RightValueType,
                RightRightValueType
                >,
        LeftLeftValueType,
        LeftValueType,
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
            @Nonnull VoidFunction1<? super RightType> rightAction,
            @Nonnull VoidFunction1<? super RightRightType> rightRightAction
    );

    interface LeftLeft<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType
            > extends Either4<
                                    LeftLeftType,
                                    LeftType,
                                    RightType,
                                    RightRightType,
                                    LeftLeftValueType,
                                    LeftValueType,
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
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType
            > implements LeftLeft<
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
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
            @Nonnull final LeftLeftImpl<?, ?, ?, ?, ?, ?, ?, ?> leftLeft = (LeftLeftImpl<?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType
            > extends Either4<
                                    LeftLeftType,
                                    LeftType,
                                    RightType,
                                    RightRightType,
                                    LeftLeftValueType,
                                    LeftValueType,
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
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType
            > implements Left<
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
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
            @Nonnull final LeftImpl<?, ?, ?, ?, ?, ?, ?, ?> left = (LeftImpl<?, ?, ?, ?, ?, ?, ?, ?>) o;
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

    interface Right<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType
            > extends Either4<
                                    LeftLeftType,
                                    LeftType,
                                    RightType,
                                    RightRightType,
                                    LeftLeftValueType,
                                    LeftValueType,
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
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType
            > implements Right<
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
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
            @Nonnull final RightImpl<?, ?, ?, ?, ?, ?, ?, ?> right = (RightImpl<?, ?, ?, ?, ?, ?, ?, ?>) o;
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
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType
            > extends Either4<
                                    LeftLeftType,
                                    LeftType,
                                    RightType,
                                    RightRightType,
                                    LeftLeftValueType,
                                    LeftValueType,
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
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    LeftLeftValueType,
                    LeftValueType,
                    RightValueType,
                    RightRightValueType
                    >,
            LeftLeftValueType,
            LeftValueType,
            RightValueType,
            RightRightValueType
            > implements RightRight<
            LeftLeftType,
            LeftType,
            RightType,
            RightRightType,
            LeftLeftValueType,
            LeftValueType,
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
            @Nonnull final RightRightImpl<?, ?, ?, ?, ?, ?, ?, ?> that = (RightRightImpl<?, ?, ?, ?, ?, ?, ?, ?>) o;
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
