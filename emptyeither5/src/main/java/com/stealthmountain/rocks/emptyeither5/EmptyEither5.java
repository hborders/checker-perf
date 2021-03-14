package com.stealthmountain.rocks.emptyeither5;

import com.stealthmountain.rocks.functional.ClassUtil;
import com.stealthmountain.rocks.functional.Function1;
import com.stealthmountain.rocks.functional.VoidFunction1;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface EmptyEither5<
        LeftLeftType extends EmptyEither5.LeftLeft<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType
                >,
        LeftType extends EmptyEither5.Left<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType
                >,
        MiddleType extends EmptyEither5.Middle<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType
                >,
        RightType extends EmptyEither5.Right<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType
                >,
        RightRightType extends EmptyEither5.RightRight<
                LeftLeftType,
                LeftType,
                MiddleType,
                RightType,
                RightRightType
                >
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
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > extends EmptyEither5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
            > {
    }

    // Not final to allow reification
    abstract class LeftLeftImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > implements LeftLeft<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
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
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > extends EmptyEither5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
            > {
    }

    // Not final to allow reification
    abstract class LeftImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > implements Left<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
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
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > extends EmptyEither5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
            > {
    }

    // Not final to allow reification
    abstract class MiddleImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > implements Middle<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
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
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > extends EmptyEither5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
            > {
    }

    // Not final to allow reification
    abstract class RightImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > implements Right<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
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
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > extends EmptyEither5<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
            > {
    }

    // Not final to allow reification
    abstract class RightRightImpl<
            LeftLeftType extends LeftLeft<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            LeftType extends Left<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            MiddleType extends EmptyEither5.Middle<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightType extends Right<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >,
            RightRightType extends RightRight<
                    LeftLeftType,
                    LeftType,
                    MiddleType,
                    RightType,
                    RightRightType
                    >
            > implements RightRight<
            LeftLeftType,
            LeftType,
            MiddleType,
            RightType,
            RightRightType
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
        private RightRightType getSelf() {
            return Objects.requireNonNull(selfClass.cast(this));
        }
    }
}
