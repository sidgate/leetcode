package algorithm

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DefangIpTest {
    @Test fun justDot(){
        assertEquals("[.]", defangIPaddr("."))
    }

    @Test fun enddot(){
        assertEquals("123[.]", defangIPaddr("123."))
    }

    @Test fun givenInput(){
        assertEquals("1[.]1[.]1[.]1", defangIPaddr("1.1.1.1"))
        assertEquals("255[.]100[.]50[.]0", defangIPaddr("255.100.50.0"))
    }
}

fun defangIPaddr(address: String): String {
    return address.map { if(it == '.') "[.]" else it }.joinToString("")
}