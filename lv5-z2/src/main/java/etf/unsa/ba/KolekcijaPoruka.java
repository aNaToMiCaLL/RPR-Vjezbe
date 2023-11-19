package etf.unsa.ba;

import java.util.ArrayList;

public class KolekcijaPoruka {
    ArrayList<String> poruke;
    KolekcijaPoruka(ArrayList<String> poruke)
    {
        this.poruke=poruke;
        //this.poruke=poruke.predstavi();
    }
    ArrayList<String> getPoruke(){return poruke;};
}
