package algorithm.badVersion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class SearchInsertPositionKtTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1), 1, 0),
            of(intArrayOf(1, 3, 5, 6), -1, 0),
            of(intArrayOf(1, 3, 5, 6), 1, 0),
            of(intArrayOf(1, 3, 5, 6), 5, 2),
            of(intArrayOf(1, 3, 5, 6), 2, 1),
            of(intArrayOf(1, 3, 5, 6), 7, 4),
            of(intArrayOf(1, 3, 5, 6, 7), -1, 0),
            of(intArrayOf(1, 3, 5, 6, 7), 1, 0),
            of(intArrayOf(1, 3, 5, 6, 7), 5, 2),
            of(intArrayOf(1, 3, 5, 6, 7), 2, 1),
            of(intArrayOf(1, 3, 5, 6, 7), 7, 4),
            of(intArrayOf(1, 3, 5, 6, 7), 8, 5)

        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test bad version`(num: IntArray, target: Int, expected: Int) {
        assertEquals(expected, searchInsert(num, target))
    }
}