package a11.uc.senac.br.senac_agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar o listView que esta na activity
        ListView contatosListView = findViewById(R.id.listaContatosListView);

        //Criar lista de String com os nomes dos contatos
        String[] contatos = {"Ari", "Aluno 1", "Aluno 2", "Aluno 3", "Aluno 4", "Aluno 5", "Aluno 6", "Aluno 7"};

        //Cria um adpater para adaptar a lista de string para posteriormente utiliza-la no listView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos);

        //Atribui o adapter para o ListView.
        contatosListView.setAdapter(adapter);

        //Testes commit
    }
}
