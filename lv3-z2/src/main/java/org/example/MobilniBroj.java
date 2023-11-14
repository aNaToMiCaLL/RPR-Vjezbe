package org.example;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;
    MobilniBroj(int mobilnaMreza,String broj)
    {
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    };

    @Override
    public String ispisi() {
        return mobilnaMreza +broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza,broj);
    }
}
