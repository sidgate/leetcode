package algorithm

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PerformOpTest {
    @Test fun single(){
        assertEquals(1, finalValueAfterOperations(arrayOf("X++")))
        assertEquals(-1, finalValueAfterOperations(arrayOf("X--")))
    }
    @Test fun givenInput(){
        assertEquals(3, finalValueAfterOperations(arrayOf("++X","++X","X++")))
        assertEquals(0, finalValueAfterOperations(arrayOf("X++","++X","--X","X--")))

    }
}
fun finalValueAfterOperations(operations: Array<String>): Int {
    return operations.fold(0){acc, op ->
        if(op[1] == '-') acc-1 else acc+1
    }
}