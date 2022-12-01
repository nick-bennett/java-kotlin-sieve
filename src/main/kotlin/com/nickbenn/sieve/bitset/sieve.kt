/*
 *  Copyright 2022 Nicholas Bennett.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.nickbenn.sieve.bitset

import java.util.*

internal fun sieve(limit: Int): BitSet {
    throw UnsupportedOperationException("Not yet implemented") // TODO Replace with BitSet-based implementation.
}

fun main() {
    val start = System.currentTimeMillis()
    val upperBound = 10_000_000
    val primes = sieve(upperBound)
    val end = System.currentTimeMillis()
    print(
        """
            Kotlin Sieve with BitSet: 
            ${primes.cardinality()} primes found between ${primes.nextSetBit(0)} and ${
            primes.previousSetBit(
                primes.size() - 1
            )
        } (inclusive) in ${end - start} ms.
        """.trimIndent()
    )
}