package pos.unipe.com.br.appmoeda;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoedaService {

    @GET("query?function=CURRENCY_EXCHANGE_RATE&from_currency=?&to_currency=?&apikey=ALYIKTBEYLYWXZN2")
    Call<Cotacao> conversaoMoeda(@Query("from_currency") String origem, @Query("to_currency") String destino);
}
