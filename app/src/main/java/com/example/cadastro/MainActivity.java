package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nomeEt;
    private EditText numeroEt;
    private EditText Email;
    private CheckBox checkBox;
    private LinearLayout botoes;
    private RadioGroup sexoRg;
    private RadioButton masculinoRb;
    private EditText Cidade;
    private Spinner opcoesSp;
    private Button salvarBt;
    private Button limparBt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calls();
    }

    public void calls(){
        nomeEt = findViewById(R.id.nomeEt);
        numeroEt = findViewById(R.id.numeroEt);
        Email = findViewById(R.id.Email);
        checkBox = findViewById(R.id.checkBox);
        botoes = findViewById(R.id.botoes);
        sexoRg = findViewById(R.id.sexoRg);
        masculinoRb = findViewById(R.id.masculinoRb);
        Cidade = findViewById(R.id.Cidade);
        opcoesSp = findViewById(R.id.opcoesSp);
        salvarBt.setOnClickListener(this);
        limparBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        StringBuilder sb = new StringBuilder();
        sb.append(nomeEt.getText().toString());
        sb.append("\n");
        sb.append(numeroEt.getText().toString());
        sb.append("\n");
        sb.append(Email.getText().toString());
        sb.append("\n");
        sb.append(checkBox.isChecked() ? "checado" : "não checado");
        sb.append("\n");
        sb.append(masculinoRb.isChecked() ? "Masculino":"Feminino");
        sb.append("\n");
        sb.append(Cidade.getText().toString());
        sb.append("\n");
        sb.append(((TextView) opcoesSp.getSelectedView()).getText());

        if(view.getId() == R.id.salvarBt) {
            Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT ).show();
        }
        else{
            if(view.getId() == R.id.limparBt){
                Toast.makeText(this,"Botão limpar foi clicado", Toast.LENGTH_SHORT).show();
            }
        }
    }
}