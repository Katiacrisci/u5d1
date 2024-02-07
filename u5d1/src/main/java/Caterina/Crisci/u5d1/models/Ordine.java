package Caterina.Crisci.u5d1.models;

import Caterina.Crisci.u5d1.configuration.AppConfig;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;
@Getter
@Setter
@Builder
@ToString

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
