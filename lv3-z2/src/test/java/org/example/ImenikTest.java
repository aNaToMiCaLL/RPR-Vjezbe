package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {
    public static Imenik imenik=new Imenik();
    @BeforeAll
    public static void setup()
    {
        imenik.dodaj("Arman",new FiksniBroj(Grad.Sarajevo,"457-436"));
        imenik.dodaj("Tarik",new FiksniBroj(Grad.Sarajevo,"217-321"));
        imenik.dodaj("Meša",new FiksniBroj(Grad.Sarajevo,"773-246"));
        imenik.dodaj("Adnan",new FiksniBroj(Grad.Sarajevo,"237-158"));

    }
    @Test
    void provjeriDajBroj()
    {
        assertEquals("033457-436",imenik.dajBroj("Arman"));
    }
    @Test
    void provjeriDajBroj2()
    {
        assertNull(imenik.dajBroj("Bakir"));
    }
    @Test
    void dodavanjeKorisnika()
    {
        imenik.dodaj("Hašim",new FiksniBroj(Grad.Tuzla,"991-332"));
        assertNotNull(imenik.dajBroj("Hašim"));
    }

}