package br.com.moge.notificacao;

import android.content.DialogInterface;

/**
 * Created by cd-107 on 31/01/2015.
 */
public class OKClickListener implements DialogInterface.OnClickListener {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        dialog.dismiss();
    }
}
