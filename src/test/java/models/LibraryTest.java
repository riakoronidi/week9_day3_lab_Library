package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library("Strathclyde University library");
    }

    @Test
    public void canGetName() {
        assertEquals("Strathclyde University library", library.getName());
    }
}
