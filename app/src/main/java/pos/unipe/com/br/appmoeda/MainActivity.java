package pos.unipe.com.br.appmoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Gson gson = new Gson();

        final EditText idmoedaOrigem = findViewById(R.id.idmoedaorigem);
        final EditText idmoedaDestino = findViewById(R.id.idmoedadestino);
        final TextView resposta = findViewById(R.id.idresposta);

        Button botaoConverte = findViewById(R.id.idbtnConsultar);

        botaoConverte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Call<Cotacao> call = new RetrofitConfig().getMoedaService().conversaoMoeda(idmoedaOrigem.getText().toString(),idmoedaDestino.getText().toString());

                call.enqueue(new Callback<Cotacao>() {
                    @Override
                    public void onResponse(Call<Cotacao> call, Response<Cotacao> response) {

                        Cotacao cotacao = response.body();

                        Moeda m = cotacao.getMoeda();

                        resposta.setText(m.toString());
                    }

                    @Override
                    public void onFailure(Call<Cotacao> call, Throwable t) {
                        Log.e("MoedaService   ", "Erro ao converter Cotação:" + t.getMessage());
                    }
                });
            }
        });
    }
}
