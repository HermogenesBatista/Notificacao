package br.com.moge.notificacao;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Projeto Dialogs");

    }

    public void mostrarAlerta(View v){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Aviso!")
                .setMessage("Alertas são Mara!")
                .setCancelable(false)
                .setIcon(R.drawable.fla_logo)
                //COM CLASSE EXPLICITA
            .setPositiveButton("Ok", new OKClickListener())
                //COM CLASSE ANONIMA
            .setNegativeButton("Oush, porque?", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Eu num acho!", Toast.LENGTH_LONG).show();
                }
            });

        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void mostrarProgresso(View v){
        ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setCancelable(true);
        pDialog.setTitle("Por favor, aguarde!");
        pDialog.setMessage("Buscando dados...");
        pDialog.setMax(100);
        pDialog.setProgress(20);
        //pDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

        pDialog.show();
        pDialog.setProgress(30);
        pDialog.setProgress(40);
        pDialog.setProgress(50);
        pDialog.setProgress(60);


    }

    public void mostrarDialogoCustomizado(View v){
        FragmentManager fragmentManager = getFragmentManager();
        MeuDialog meuDialogo = new MeuDialog();
        meuDialogo.show(fragmentManager, "meu_dialogo");

    }
}
