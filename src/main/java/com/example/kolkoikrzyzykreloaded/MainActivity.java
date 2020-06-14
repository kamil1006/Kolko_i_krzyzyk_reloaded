package com.example.kolkoikrzyzykreloaded;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kkoikrzyrzykreloaded.R;


public class MainActivity extends AppCompatActivity {

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private RadioGroup grupa_radyjek;
    private RadioButton radioButton1 = null;
    private RadioButton radioButton2 = null;

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public class_rozgrywka gra;

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private Button button1 = null;
    private Button button2 = null;
    private Button button3 = null;
    private Button button4 = null;
    private Button button5 = null;
    private Button button6 = null;
    private Button button7 = null;
    private Button button8 = null;
    private Button button9 = null;
    private Button button10 = null;
    private Button button11 = null;

    private TextView tvWynik = null;
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private Button[] buttony=null;
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    private String[] wybor_x= null;
    private String[] wybor_y= null;

    private String[] wybor= null;
    private String[] wybor_k= null;

    private int[] wybor_1= null;
    private int[] wybor_2= null;

    private Class_przycisk[] przyciski = null;
    private int[] hhh =null;
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //______________________________________________________________________________________________
        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);

        grupa_radyjek = (RadioGroup) findViewById(R.id.grupa_radyjek);
        grupa_radyjek.clearCheck();
        //______________________________________________________________________________________________
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);

        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);

        tvWynik=(TextView)findViewById(R.id.tvWynik);
        //______________________________________________________________________________________________
        buttony =new Button[10];
        buttony[1]=button1;
        buttony[2]=button2;
        buttony[3]=button3;
        buttony[4]=button4;
        buttony[5]=button5;
        buttony[6]=button6;
        buttony[7]=button7;
        buttony[8]=button8;
        buttony[9]=button9;
        // gra = new class_rozgrywka();

        //______________________________________________________________________________________________
        wybor_x = new String[1];
        wybor_y = new String[1];

        wybor = new String[1];
        wybor_k = new String[1];

        wybor_1 = new int[1];
        wybor_2 = new int[1];


        //______________________________________________________________________________________________
        resetuj();

        //______________________________________________________________________________________________


        //______________________________________________________________________________________________

        grupa_radyjek.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                // if (null != rb && checkedId > -1) {
                //     Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                //      if (rb.getText()== "Kółko") {;}
                //  }

                if(rb==radioButton1){
                    Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                    wybor[0] = "O";
                    wybor_k[0] = "X";
                    wybor_1[0] = 1;
                    wybor_2[0] = 2;
                }
                if(rb==radioButton2){
                    Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                    wybor[0] = "X";
                    wybor_k[0] = "0";
                    wybor_1[0] = 2;
                    wybor_2[0] = 1;
                }

            }
        });
        //______________________________________________________________________________________________
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[1].numer = 1;
                przyciski[1].przypisz(wybor[0]);
                button1.setText(wybor[0]);
                button1.setEnabled(false);
                gra.wstaw(1,1,1);
                gra.wstaw(1,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________
        //______________________________________________________________________________________________
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[2].numer = 2;
                przyciski[2].przypisz(wybor[0]);
                button2.setText(wybor[0]);
                button2.setEnabled(false);
                gra.wstaw(2,1,1);
                gra.wstaw(2,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[3].numer = 3;
                przyciski[3].przypisz(wybor[0]);
                button3.setText(wybor[0]);
                button3.setEnabled(false);
                gra.wstaw(3,1,1);
                gra.wstaw(3,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[4].numer = 4;
                przyciski[4].przypisz(wybor[0]);
                button4.setText(wybor[0]);
                button4.setEnabled(false);
                gra.wstaw(4,1,1);
                gra.wstaw(4,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[5].numer = 5;
                przyciski[5].przypisz(wybor[0]);
                button5.setText(wybor[0]);
                button5.setEnabled(false);
                gra.wstaw(5,1,1);
                gra.wstaw(5,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[6].numer = 6;
                przyciski[6].przypisz(wybor[0]);
                button6.setText(wybor[0]);
                button6.setEnabled(false);
                gra.wstaw(6,1,1);
                gra.wstaw(6,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[7].numer = 7;
                przyciski[7].przypisz(wybor[0]);
                button7.setText(wybor[0]);
                button7.setEnabled(false);
                gra.wstaw(7,1,1);
                gra.wstaw(7,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[8].numer = 8;
                przyciski[8].przypisz(wybor[0]);
                button8.setText(wybor[0]);
                button8.setEnabled(false);
                gra.wstaw(8,1,1);
                gra.wstaw(8,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
                przyciski[9].numer = 9;
                przyciski[9].przypisz(wybor[0]);
                button9.setText(wybor[0]);
                button9.setEnabled(false);
                gra.wstaw(9,1,1);
                gra.wstaw(9,2,wybor_1[0]);
                podsumowanie();
                if(gra.wynik != 1){
                    int a=1;
                    a=gra.losowanie();
                    if (a!=0){ zmiana_przycisku(a);}
                    podsumowanie();
                }

            }
        });
        //______________________________________________________________________________________________








        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                resetuj();

            }
        });
        //______________________________________________________________________________________________
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                blokuj();
            }
        });

        //______________________________________________________________________________________________




        //______________________________________________________________________________________________




        //______________________________________________________________________________________________



        //______________________________________________________________________________________________

    }

    public void onClear(View v) {
        /* Clears all selected radio buttons to default */
        grupa_radyjek.clearCheck();
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    public void zmiana_przycisku(int a) {
        buttony[a].setEnabled(false);
        buttony[a].setText(wybor_k[0]);

    }
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    public void zmiana_przycisku2(int a) {
        buttony[a].setEnabled(true);

    }
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    public void resetuj(){
        button1.setEnabled(true);
        button1.setBackgroundColor(Color.parseColor("#1976D2"));
        button1.setText("");

        button2.setEnabled(true);
        button2.setBackgroundColor(Color.parseColor("#1976D2"));
        button2.setText("");

        button3.setEnabled(true);
        button3.setBackgroundColor(Color.parseColor("#1976D2"));
        button3.setText("");

        button4.setEnabled(true);
        button4.setBackgroundColor(Color.parseColor("#1976D2"));
        button4.setText("");

        button5.setEnabled(true);
        button5.setBackgroundColor(Color.parseColor("#1976D2"));
        button5.setText("");

        button6.setEnabled(true);
        button6.setBackgroundColor(Color.parseColor("#1976D2"));
        button6.setText("");

        button7.setEnabled(true);
        button7.setBackgroundColor(Color.parseColor("#1976D2"));
        button7.setText("");

        button8.setEnabled(true);
        button8.setBackgroundColor(Color.parseColor("#1976D2"));
        button8.setText("");

        button9.setEnabled(true);
        button9.setBackgroundColor(Color.parseColor("#1976D2"));
        button9.setText("");

        wybor[0] = "O";
        wybor_k[0] = "X";
        wybor_1[0] = 1;
        wybor_2[0] = 2;

        tvWynik.setText("");

        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);

        radioButton1.setChecked(true);

        gra=null;
        gra = new class_rozgrywka();
        przyciski = new Class_przycisk[10];

        for(int i=1;i<=9;i++){
            przyciski[i]= new Class_przycisk();
        }

    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    public void blokuj() {
        radioButton1.setEnabled(false);
        radioButton2.setEnabled(false);
        gra.wybor=wybor_1[0];
    }
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    public void podsumowanie(){
        gra.przelicz_wynik();
        int i=1;
        int a,b,c;
        if(gra.wynik==1 || gra.wynik==2){
            for(i=1;i<=9;i++){
                zmiana_przycisku2(i);
            }
            //tvWynik.setText(gra.wynik + " : " + gra.wynik_slownie());
            tvWynik.setText( "Rezultat gry to : " + gra.wynik_slownie());
        }
        if(gra.wynik==1 || gra.wynik==2){
            a=gra.podaj_nr(gra.ktory_wynik, 1);
            b=gra.podaj_nr(gra.ktory_wynik, 2);
            c=gra.podaj_nr(gra.ktory_wynik, 3);
            buttony[a].setBackgroundColor(Color.parseColor("#ff0000"));
            buttony[b].setBackgroundColor(Color.parseColor("#ff0000"));
            buttony[c].setBackgroundColor(Color.parseColor("#ff0000"));
        }

        boolean czy_koniec=true;

        for( i= 1 ; i<=9;i++)
        {
            if(buttony[i].isEnabled())
            {
                czy_koniec=false;
            }
        }
        if(czy_koniec)
        {
            //tvWynik.setText(gra.wynik + " : " + gra.wynik_slownie());
            tvWynik.setText( "Rezultat gry to : " + gra.wynik_slownie());
        }



    }
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
}
