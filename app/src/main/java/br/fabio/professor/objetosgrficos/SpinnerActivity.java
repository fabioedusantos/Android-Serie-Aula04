package br.fabio.professor.objetosgrficos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayList<String> itens = new ArrayList<String>();
        itens.add("Banana");
        itens.add("Maçã");
        itens.add("Abacaxi");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, itens);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void testar(View v){
        Toast.makeText(SpinnerActivity.this, spinner.getSelectedItem().toString(),
                Toast.LENGTH_SHORT).show();
    }
}
