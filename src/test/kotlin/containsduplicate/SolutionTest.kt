package containsduplicate

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    @Test fun `empty array does not contain duplicate`(){
        assertFalse( Solution().containsDuplicate(intArrayOf()))
    }

    @Test fun `single element array does not contain duplicate`(){
        assertFalse( Solution().containsDuplicate(intArrayOf(1)))
    }

    @Test fun `two distinct element array does not contain duplicate`(){
        assertFalse( Solution().containsDuplicate(intArrayOf(1,2)))
    }

    @Test fun `two same element array contains duplicate`(){
        assertTrue( Solution().containsDuplicate(intArrayOf(1,1)))
    }

    @Test fun `multiple same element array contains duplicate`(){
        assertTrue( Solution().containsDuplicate(intArrayOf(1,2,3,5,6,4,1,3,5,6,8,3,8)))
    }

    @Test fun `multiple distinct element array does not contain duplicate`(){
        assertFalse( Solution().containsDuplicate(intArrayOf(1,2,3,4,5,6,7,8,9)))
    }

    @Test fun `last duplicate returns true`(){
        assertTrue( Solution().containsDuplicate(intArrayOf(1,2,3,4,5,6,7,8,9,1)))
    }

    @Test fun `negative duplicates`(){
        assertTrue( Solution().containsDuplicate(intArrayOf(-1,2,3,4,5,6,7,8,9,-1)))
    }

    @Test fun `negative non duplicates`(){
        assertFalse( Solution().containsDuplicate(intArrayOf(-1,2,3,4,5,6,7,8,9,-2)))
    }

    @Test fun `negative non duplicates with zero`(){
        assertFalse( Solution().containsDuplicate(intArrayOf(1,5,-2,-4,0)))
    }

}