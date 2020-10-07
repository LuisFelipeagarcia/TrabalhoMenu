package com.example.trabalho1bimestre;

import android.view.*;

public class TelaPrincipal {
    MainActivity act;
    TelaRadioButton telaRadioButton;
    TelaCheckBox telaCheckBox;
    MenuItem item;

    public TelaPrincipal(MainActivity act){this.act = act;}

    public void CarregarTela()
    {
        act.setContentView(R.layout.activity_main);
        act.onOptionsItemSelected(item);
    }

    public void setTelaRadioButton(TelaRadioButton telaRadio){this.telaRadioButton = telaRadio;}

    public void setTelaCheckBox(TelaCheckBox telaCheckBox){this.telaCheckBox = telaCheckBox;}

}
