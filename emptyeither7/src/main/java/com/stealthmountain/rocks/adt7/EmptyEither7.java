package com.stealthmountain.rocks.adt7;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface EmptyEither7<
        LeftLeftLeftType extends EmptyEither7.LeftLeftLeft<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        LeftLeftType extends EmptyEither7.LeftLeft<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        LeftType extends EmptyEither7.Left<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        MiddleType extends EmptyEither7.Middle<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        RightType extends EmptyEither7.Right<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        RightRightType extends EmptyEither7.RightRight<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        RightRightRightType extends EmptyEither7.RightRightRight<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType,
                RightRightRightType
                >
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
            @Nonnull VoidFunction1<? super MiddleType> middleAction,
            @Nonnull VoidFunction1<? super RightType> rightAction,
            @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
            @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
    );

    interface LeftLeftLeft<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither7<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
    }

    // Not final to allow reification
    abstract class LeftLeftLeftImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements LeftLeftLeft<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
        @Nonnull
        private final Class<LeftLeftLeftType> selfClass;

        protected LeftLeftLeftImpl(@Nonnull Class<LeftLeftLeftType> selfClass) {
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
                    LeftLeftLeftImpl.class,
                    getClass()
            );

            return simpleName + "{" +
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
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            leftLeftLeftAction.apply(getSelf());
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
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither7<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
    }

    // Not final to allow reification
    abstract class LeftLeftImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements LeftLeft<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
        @Nonnull
        private final Class<LeftLeftType> selfClass;

        protected LeftLeftImpl(@Nonnull Class<LeftLeftType> selfClass) {
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
                    LeftLeftImpl.class,
                    getClass()
            );

            return simpleName + "{" +
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
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            leftLeftAction.apply(getSelf());
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
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither7<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
    }

    // Not final to allow reification
    abstract class LeftImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements Left<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
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
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            leftAction.apply(getSelf());
        }

        @Nonnull
        private LeftType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Middle<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither7<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
    }

    // Not final to allow reification
    abstract class MiddleImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements Middle<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
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

        @Nonnull
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
                        > rightRightReducer,
                @Nonnull Function1<
                        ? super RightRightRightType,
                        ? extends T
                        > rightRightRightReducer
        ) {
            return middleReducer.apply(getSelf());
        }

        @Override
        public final void act(
                @Nonnull VoidFunction1<? super LeftLeftLeftType> leftLeftLeftAction,
                @Nonnull VoidFunction1<? super LeftLeftType> leftLeftAction,
                @Nonnull VoidFunction1<? super LeftType> leftAction,
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            middleAction.apply(getSelf());
        }

        @Nonnull
        private MiddleType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }

    interface Right<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither7<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
    }

    // Not final to allow reification
    abstract class RightImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements Right<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
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
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            rightAction.apply(getSelf());
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
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither7<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
    }

    // Not final to allow reification
    abstract class RightRightImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements RightRight<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
        @Nonnull
        private final Class<RightRightType> selfClass;

        protected RightRightImpl(@Nonnull Class<RightRightType> selfClass) {
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
                    RightRightImpl.class,
                    getClass()
            );

            return simpleName + "{" +
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
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            rightRightAction.apply(getSelf());
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
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither7<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
    }

    // Not final to allow reification
    abstract class RightRightRightImpl<
            LeftLeftLeftType extends LeftLeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            MiddleType extends Middle<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements RightRightRight<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType,
            RightRightRightType
            > {
        @Nonnull
        private final Class<RightRightRightType> selfClass;

        protected RightRightRightImpl(@Nonnull Class<RightRightRightType> selfClass) {
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
                    RightRightRightImpl.class,
                    getClass()
            );

            return simpleName + "{" +
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
                @Nonnull VoidFunction1<? super MiddleType> middleAction,
                @Nonnull VoidFunction1<? super RightType> rightAction,
                @Nonnull VoidFunction1<? super RightRightType> rightRightAction,
                @Nonnull VoidFunction1<? super RightRightRightType> rightRightRightAction
        ) {
            rightRightRightAction.apply(getSelf());
        }

        @Nonnull
        private RightRightRightType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }
}
