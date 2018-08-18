package pos.unipe.com.br.appmoeda;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cotacao {

    @JsonProperty("Realtime Currency Exchange Rate")
    private Moeda moeda;

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }
}