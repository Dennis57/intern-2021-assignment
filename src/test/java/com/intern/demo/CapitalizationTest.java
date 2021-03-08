package com.intern.demo;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CapitalizationTest {

    @Test
    public void convertToMapTest() {
        //TODO COMPLETE THIS
        List<Book> inputs = Arrays.asList(new ImportedBook("d eNnis", "bUkU DeNnIs", "dennis"), new ImportedBook("seOrang", "Buku seseorang", "seseorang"));
        assertEquals(Capitalization.convertToMap(inputs).toString(), "{D Ennis=[Buku Dennis], Seorang=[Buku Seseorang]}");
    }
}
