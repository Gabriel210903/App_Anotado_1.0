package com.example.anotado_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adiciona a barra de tarefas como a "action bar"
        Toolbar barMain = findViewById(R.id.barMain);
        setSupportActionBar(barMain);
    }

    //Importa os botões
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_barradetarefas, menu);
        return true;
    }

    //Determina o q cada botão vai fazer, cada case é um botão que deve retornar "true"
    /*@Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.btAdd:
                Toast.makeText(this, "Adicionar Sala", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btOpt1:
                Toast.makeText(this, "Opção 1 selecionada", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btOpt2:
                Toast.makeText(this, "Opção 2 selecionada", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btOpt3:
                Toast.makeText(this, "Opção 3 selecionada", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btSub1:
                Toast.makeText(this, "Sub-opção 1 selecionada", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btSub2:
                Toast.makeText(this, "Sub-opção 2 selecionada", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
}