package io.qameta.allure.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleAssertTest {

    @Test
    public void failTest() {
        assertAll("fail",
                () -> fail("fail message"),
                () -> fail("fail message", new Throwable("exception message")),
                () -> fail(new Throwable("exception message"))
        );
    }

    @Test
    public void assertTrueTest() {
        assertAll("assertTrue",
                () -> assertTrue(true),
                () -> assertTrue(true, "must be true"),
                () -> assertTrue(false),
                () -> assertTrue(false, "must be true")
        );
    }

    @Test
    public void assertFalseTest() {
        assertAll("assertFalse",
                () -> assertFalse(false),
                () -> assertFalse(false, "must be false"),
                () -> assertFalse(true),
                () -> assertFalse(true, "must be false")
        );
    }

    @Test
    public void assertNullTest() {
        assertAll("assertNull",
                () -> assertNull(null),
                () -> assertNull(null, "must be null"),
                () -> assertNull("not null"),
                () -> assertNull("not null", "must be null")
        );
    }

    @Test
    public void assertNotNullTest() {
        assertAll("assertNotNull",
                () -> assertNotNull("not null"),
                () -> assertNotNull("not null", "must be not null"),
                () -> assertNotNull(null),
                () -> assertNotNull(null, "must be not null")
        );
    }

    @Test
    public void assertEqualsTest() {
        assertAll("assertEquals",
                () -> assertEquals(1, 1),
                () -> assertEquals(1, 1, "must be equals"),
                () -> assertEquals(1, 2),
                () -> assertEquals(1, 2, "must be equals")
        );
    }

    @Test
    public void assertNotEqualsTest() {
        assertAll("assertNotEquals",
                () -> assertNotEquals(1, 2),
                () -> assertNotEquals(1, 2, "must be not equals"),
                () -> assertNotEquals(1, 1),
                () -> assertNotEquals(1, 1, "must be not equals")
        );
    }

    //assertArrayEquals (message)
    //assertIterableEquals
    //assertLinesMatch
    //assertSame assertNotSame
    //assertThrows
    //assertDoesNotThrow
    //assertTimeout
    //assertTimeoutPreemptively


    @Test
    public void assertAllTest() {
        assertAll(() -> {
            assertTrue(true);
            assertTrue(false, "message");
        });

        assertAll("message", () -> {
            assertTrue(true);
            assertTrue(false, "message");
        });
    }

}
