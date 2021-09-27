package com.example.contatos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.List;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity

{
    TextView mostraConteudo;
    String text = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostraConteudo = (TextView) findViewById(R.id.mostraConteudo);
        BancoDeDados banco = new BancoDeDados(this);
        banco.insereContatos(new Contatos("Steve Formoso", "9321-4430"));
        banco.insereContatos(new Contatos("Osmar Mota", "(8267-7025"));
        banco.insereContatos(new Contatos("Rolando Caio da Rocha", "8745-1123"));
        banco.insereContatos( new Contatos("Omar Telo", "8766-4411"));
        List<Contatos> contatos = banco.listaTodosContatos();
        for (Contatos c : contatos )
        {
            String log = "ID: " + c.getId() + ", NOME: " + c.getNome() + ", CELULAR: " + c.getCelular() + "\n";
            text = text + log;
        }
        mostraConteudo.setText(text);
    }
}