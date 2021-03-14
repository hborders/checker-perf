package com.stealthmountain.rocks.emptyeither3;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface EmptyEither3<
        LeftType extends EmptyEither3.Left<
                LeftType,
                MiddleType,
                RightType
                >,
        MiddleType extends EmptyEither3.Middle<
                LeftType,
                MiddleType,
                RightType
                >,
        RightType extends EmptyEither3.Right<
                LeftType,
                MiddleType,
                RightType
                >
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
                    RightType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType
                    >
            > extends EmptyEither3<
            LeftType,
            MiddleType,
            RightType
            > {
    }

    // Not final to allow reification
    abstract class LeftImpl<
            LeftType extends LeftImpl<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            MiddleType extends MiddleImpl<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            RightType extends RightImpl<
                    LeftType,
                    MiddleType,
                    RightType
                    >
            > implements Left<
            LeftType,
            MiddleType,
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

        @Nonnull
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
        private LeftType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Middle<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType
                    >
            > extends EmptyEither3<
            LeftType,
            MiddleType,
            RightType
            > {
    }

    // Not final to allow reification
    abstract class MiddleImpl<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType
                    >
            > implements Middle<
            LeftType,
            MiddleType,
            RightType
            > {
        @Nonnull
        private final Class<MiddleType> selfClass;

        protected MiddleImpl(@Nonnull Class<MiddleType> selfClass) {
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
                    MiddleImpl.class,
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
        private MiddleType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Right<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType
                    >
            > extends EmptyEither3<
            LeftType,
            MiddleType,
            RightType
            > {
    }

    // Not final to allow reification
    abstract class RightImpl<
            LeftType extends Left<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            MiddleType extends Middle<
                    LeftType,
                    MiddleType,
                    RightType
                    >,
            RightType extends Right<
                    LeftType,
                    MiddleType,
                    RightType
                    >
            > implements Right<
            LeftType,
            MiddleType,
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

        @Nonnull
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
        private RightType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }
}
