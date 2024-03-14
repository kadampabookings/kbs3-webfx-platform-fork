/*
 * Copyright 2019 Miroslav Pokorny (github.com/mP1)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package walkingkooka.stream.push;

import walkingkooka.Cast;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * The FLATMAP {@link PushableStreamConsumerStream}
 */
@SuppressWarnings("lgtm[java/inconsistent-equals-and-hashcode]")
final class PushableStreamConsumerStreamIntermediate2FlatMap extends PushableStreamConsumerStreamIntermediate2 {

    static PushableStreamConsumerStreamIntermediate2FlatMap with(final Function<?, Stream<?>> mapper) {
        Objects.requireNonNull(mapper, "mapper");

        return new PushableStreamConsumerStreamIntermediate2FlatMap(mapper);
    }

    private PushableStreamConsumerStreamIntermediate2FlatMap(final Function<?, Stream<?>> mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    PushableStreamConsumerStreamIntermediatePushableStreamConsumer<?> createWithNext(final PushableStreamConsumer<?> next) {
        return PushableStreamConsumerStreamIntermediatePushableStreamConsumer.flatMap(Cast.to(this.mapper), next);
    }

    private final Function<?, Stream<?>> mapper;

    // Object..........................................................................................................

    @Override
    public int hashCode() {
        return this.mapper.hashCode();
    }

    @Override
    boolean canBeEqual(final Object other) {
        return other instanceof PushableStreamConsumerStreamIntermediate2FlatMap;
    }

    @Override
    boolean equals0(final Object other) {
        return this.equals1(Cast.to(other));
    }

    private boolean equals1(final PushableStreamConsumerStreamIntermediate2FlatMap other) {
        return this.mapper.equals(other.mapper);
    }

    @Override
    public String toString() {
        return "flatmap " + this.mapper;
    }
}
