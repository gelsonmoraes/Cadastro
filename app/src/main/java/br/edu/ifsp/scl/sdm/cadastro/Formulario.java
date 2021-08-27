package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Formulario extends AppCompatActivity implements View.OnClickListener {
    
    private EditText txtNome;
    private EditText txtFone;
    private EditText txtEmail;
    private CheckBox selecionadoEmailCb;
    private RadioButton rdMasc;
    private Spinner spnEstado;
    private EditText txtCidade;
    private Button btnLimpar;
    private Button btnSalvar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtNome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtFone = findViewById(R.id.txtFone);
        txtFone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtEmail = findViewById(R.id.txtEmail);
        txtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtCidade = findViewById(R.id.txtCidade);
        txtCidade.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        selecionadoEmailCb = findViewById(R.id.selecionadoEmailCb);
        rdMasc = findViewById(R.id.rdMasc);


        spnEstado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //btn
        btnSalvar = findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener((View.OnClickListener) this);

        btnLimpar = findViewById(R.id.btnLimpar);
    }

    public void limpaCampos(View view){
        txtNome.getText().clear();
        txtEmail.getText().clear();
        txtFone.getText().clear();
        txtCidade.getText().clear();
    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();

        sb.append(txtNome.getText().toString());
        sb.append('\n');

        sb.append(txtFone.getText().toString());
        sb.append('\n');

        sb.append(txtEmail.getText().toString());
        sb.append('\n');

        sb.append(txtCidade.getText().toString());
        sb.append('\n');

        sb.append(((TextView) spnEstado.getSelectedView()).getText());
        sb.append('\n');

        sb.append(selecionadoEmailCb.isChecked() ? "selecionado" : "não selecionado");
        sb.append('\n');

        sb.append(rdMasc.isChecked() ? "Masculino" : "Feminino");
        sb.append('\n');

        Toast.makeText(this, sb.toString(), Toast.LENGTH_LONG).show();

    }
}

