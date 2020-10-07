package com.example.trabalho1bimestre;

import android.app.AlertDialog;
import android.view.View;
import android.widget.*;

public class TelaRadioButton {

    MainActivity act;

    RadioGroup rdgJava, rdgCS, rdgPython;
    Button btnEnviar;
    TelaPrincipal telaPrincipal;
    public TelaRadioButton(MainActivity act, TelaPrincipal telaPrincipal){
        this.act = act;
        this.telaPrincipal = telaPrincipal;
    }

    public void CarregarTela()
    {
        act.setContentView(R.layout.pagina_rdb);
        rdgJava = act.findViewById(R.id.rdgJava);
        rdgCS = act.findViewById(R.id.rdgCS);
        rdgPython = act.findViewById(R.id.rdgPython);
        btnEnviar = act.findViewById(R.id.btnRadio);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(act);
                dialog.setTitle("Nivel em cada linguagem");
                dialog.setMessage(
                        "Java:   " + opJava().toString() + "\n"+
                                ""+
                        "C#:     " + opCS().toString()+ "\n"+
                                ""+
                        "Python: " +opPython().toString());
                dialog.setNeutralButton("Fechar", null);
                dialog.show();
            }
        });
    }

    public String opJava()
    {
        int opJ = rdgJava.getCheckedRadioButtonId();

        if(opJ == R.id.rdbJ1)
        {
            return "Nada";
        } else if(opJ == R.id.rdbJ2)
        {
            return "Básico";
        } else if(opJ == R.id.rdbJ3)
        {
            return "Intermediário";
        } else if(opJ == R.id.rdbJ4)
        {
            return "Avançado";
        } else if(opJ == R.id.rdbJ5)
        {
            return "Sênior";
        }
        return "";
    }
    public String opCS()
    {
        int opC = rdgCS.getCheckedRadioButtonId();

        if(opC == R.id.rdbC1)
        {
            return "Nada";
        } else if(opC == R.id.rdbC2)
        {
            return "Básico";
        } else if(opC == R.id.rdbC3)
        {
            return "Intermediário";
        } else if(opC == R.id.rdbC4)
        {
            return "Avançado";
        } else if(opC == R.id.rdbC5)
        {
            return "Sênior";
        }
        return "";
    }
    public String opPython()
    {
        int opP = rdgPython.getCheckedRadioButtonId();

        if(opP == R.id.rdbP1)
        {
            return "Nada";
        } else if(opP == R.id.rdbP2)
        {
            return "Básico";
        } else if(opP == R.id.rdbP3)
        {
            return "Intermediário";
        } else if(opP == R.id.rdbP4)
        {
            return "Avançado";
        } else if(opP == R.id.rdbP5)
        {
            return "Sênior";
        }
        return "";
    }

}
