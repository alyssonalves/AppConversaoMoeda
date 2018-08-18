package pos.unipe.com.br.appmoeda;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by aalve on 18/07/2018.
 */

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://www.alphavantage.co/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public MoedaService getMoedaService() {
        return this.retrofit.create(MoedaService.class);
    }
}
