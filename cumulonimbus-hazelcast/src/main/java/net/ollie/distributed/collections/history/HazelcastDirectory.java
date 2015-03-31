package net.ollie.distributed.collections.history;

import net.ollie.distributed.collections.HazelcastMap;
import net.ollie.distributed.serialization.MustNotSerialize;

/**
 *
 * @author Ollie
 */
@MustNotSerialize
public interface HazelcastDirectory<T, K, V>
        extends DistributedDirectory<T, K, V> {

    @Override
    HazelcastMap<K, V> at(T temporal);

}