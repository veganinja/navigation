package com.example.friday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/*
1.добавили компоненты
2.присвоели идентификаторы и привзяки сделали
3.создать переменные до метода onCreate
4.связать между собой перменные которые создали и id  компонентов в методе onCreate
5.
 */
    /*
    1. способ - прописать метод onClick для каждой кнопки
    и вне метода onCreate прописать puclic void
    2. способ - 2,1 добавили компоненты
    2.2 присвоили идентификаторы и приящки сделали
    2.3с создать перменные до методаo pnCreate
    2.4 свзать между собой переменные которые создали и АЙли компонентов в методе onCreate
    2.5 слздать обработчик события нажатия на кнопку(дать имя) и приписать код (до метода он Крейт)
    2.6 прописать 
    */

 ;  Button btnOk;
    Button btnCancel;
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk = findViewById(R.id.btnOK);
        tvText = findViewById(R.id.tvOut);
        btnCancel =findViewById(R.id.btnCANCEL);
    }

    //У кнопки есть метод senOnClickListener (View.OnClickListener l).
    // На вход подается обьект с интерфейсом View.OnClickListener.

    View.OnClickListener oclBtnOK = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvText.setText("Нажата кнопка OK по второму методу");
        }
    };
    View.OnClickListener Cancel = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}