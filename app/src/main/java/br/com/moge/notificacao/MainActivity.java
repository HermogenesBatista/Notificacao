package br.com.moge.notificacao;

import android.app.AlertDialog;
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

    }

    public void mostrarAlerta(View v){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Aviso!")
                .setMessage("Alertas são Mara!")
                .setCancelable(false)
                .setIcon(R.drawable.fla_logo)
            .setPositiveButton("Ok", new OKClickListener())
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


    }

    public void mostrarDialogoCustomizado(View v){


    }
}
