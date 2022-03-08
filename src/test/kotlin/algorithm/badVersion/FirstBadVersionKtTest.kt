package algorithm.badVersion

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class FirstBadVersionKtTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(1,1),
            of(5,4),
            of(2,1),
            of(2,2),
            of(3,3),
            of(4,2),
            of(4,3),
            of(4,4),
            of(4,1),
            of(1000,345),
            of(1000,346),
            of(1000,746),
            of(1000,747),
            of(1001,345),
            of(1001,346),
            of(1001,746),
            of(1001,747),
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test bad version`(num: Int, expected: Int){
        val solution = Solution(object : VersionControl{
            override fun isBadVersion(version: Int) = version >= expected
        })

        assertEquals(expected, solution.firstBadVersion(num))
    }
}