package org.example;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad,String broj){
        this.grad=grad;
        this.broj=broj;
    };

    @Override
    public String ispisi() {
        String br=grad.dajBroj();
        return br+broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad,broj);
    }

    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }
}
