package com.example.trabalho1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    TelaPrincipal telaPrincipal;
    TelaRadioButton telaRadioButton;
    TelaCheckBox telaCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telaPrincipal = new TelaPrincipal(this);
        telaRadioButton = new TelaRadioButton(this, telaPrincipal);
        telaPrincipal.setTelaRadioButton(telaRadioButton);

        telaCheckBox = new TelaCheckBox(this, telaPrincipal);
        telaPrincipal.setTelaCheckBox(telaCheckBox);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.imn1)
        {
            telaRadioButton.CarregarTela();

        }
        if(id == R.id.imn2)
        {
            telaCheckBox.CarregarTela();
        }
        return super.onOptionsItemSelected(item);
    }
}