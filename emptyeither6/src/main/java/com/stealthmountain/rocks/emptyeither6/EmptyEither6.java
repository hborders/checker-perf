package com.stealthmountain.rocks.emptyeither6;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface EmptyEither6<
        LeftLeftLeftType extends EmptyEither6.LeftLeftLeft<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        LeftLeftType extends EmptyEither6.LeftLeft<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        LeftType extends EmptyEither6.Left<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        RightType extends EmptyEither6.Right<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        RightRightType extends EmptyEither6.RightRight<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
                RightType,
                RightRightType,
                RightRightRightType
                >,
        RightRightRightType extends EmptyEither6.RightRightRight<
                LeftLeftLeftType,
                LeftLeftType,
                LeftType,
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
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither6<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements LeftLeftLeft<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither6<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements LeftLeft<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither6<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements Left<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither6<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements Right<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither6<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements RightRight<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > extends EmptyEither6<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftLeftType extends LeftLeft<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            LeftType extends Left<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightType extends Right<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >,
            RightRightRightType extends RightRightRight<
                    LeftLeftLeftType,
                    LeftLeftType,
                    LeftType,
                    RightType,
                    RightRightType,
                    RightRightRightType
                    >
            > implements RightRightRight<
            LeftLeftLeftType,
            LeftLeftType,
            LeftType,
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
        private RightRightRightType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }
}
