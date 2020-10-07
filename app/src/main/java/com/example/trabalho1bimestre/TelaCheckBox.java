package com.example.trabalho1bimestre;

import android.app.AlertDialog;
import android.view.View;
import android.widget.*;

public class TelaCheckBox {

    MainActivity act;
    Button btnCheck;
    CheckBox ckbI, ckbA, ckbF, ckbE, ckbJ;
    TelaPrincipal telaPrincipal;

    public TelaCheckBox(MainActivity act, TelaPrincipal telaPrincipal)
    {
        this.act = act;
        this.telaPrincipal = telaPrincipal;
    }

    public void CarregarTela()
    {
        act.setContentView(R.layout.pagina_ckb);
        ckbI = act.findViewById(R.id.ckbI);
        ckbA = act.findViewById(R.id.ckbA);
        ckbJ = act.findViewById(R.id.ckbJ);
        ckbF = act.findViewById(R.id.ckbF);
        ckbE = act.findViewById(R.id.ckbE);
        btnCheck = act.findViewById(R.id.btnEnviar);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(act);
                dialog.setTitle("Idiomas Fluentes");
                dialog.setMessage(texts(ckbI, ckbA, ckbF, ckbJ, ckbE));
                dialog.setNeutralButton("Fechar", null);
                dialog.show();
            }
        });
    }

    public String texts(CheckBox ckbI, CheckBox ckbA, CheckBox ckbF, CheckBox ckbJ, CheckBox ckbE)
    {
        String msg = "Português"+"\n";
        if(ckbI.isChecked())
        {
            msg += "Inglês" +"\n";
        }
        if(ckbE.isChecked())
        {
            msg += "Espanhol" +"\n";
        }
        if(ckbA.isChecked())
        {
            msg += "Alemão" +"\n";
        }
        if(ckbF.isChecked())
        {
            msg += "Francês" +"\n";
        }
        if(ckbJ.isChecked())
        {
            msg += "Japonês" +"\n";
        }

        return msg;
    }
}
