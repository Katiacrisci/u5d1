package Caterina.Crisci.u5d1.models;

import Caterina.Crisci.u5d1.configuration.AppConfig;

import java.time.LocalTime;
import java.util.List;

public class Ordine {

    private List<Consummation> consumazioni;
    private int numero;
    private StatoOrdine statoOrdine;
    private int coperti;
    private LocalTime acquisizione;

    public float getTotale() {
      float totaleConsumazioni = consumazioni.stream().map(Consummation::getPrice).reduce(0f, Float::sum);
      float totaleCoperti = coperti * AppConfig.costoCoperto;
     return totaleCoperti + totaleConsumazioni;



    }
}
