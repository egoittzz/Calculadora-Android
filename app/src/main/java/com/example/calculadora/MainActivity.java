package com.example.calculadora;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
int que_tipo = 10;
double valor1;
int modo =0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_oscuro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }
    public void cambiar_color(View v){
        View fondo = findViewById(R.id.main);
        Button borrar = findViewById(R.id.bt_borrar);
        Button mas_menos = findViewById(R.id.bt_mas_menos);
        Button porciento = findViewById(R.id.bt_porciento);
        Button dividir = findViewById(R.id.bt_dividir);
        Button siete = findViewById(R.id.bt_siete);
        Button ocho = findViewById(R.id.bt_ocho);
        Button nueve = findViewById(R.id.bt_nueve);
        Button x = findViewById(R.id.bt_x);
        Button cuatro = findViewById(R.id.bt_cuatro);
        Button cinco = findViewById(R.id.bt_cinco);
        Button seis = findViewById(R.id.bt_seis);
        Button menos = findViewById(R.id.bt_menos);
        Button uno = findViewById(R.id.bt_uno);
        Button dos = findViewById(R.id.bt_dos);
        Button tres = findViewById(R.id.bt_tres);
        Button mas = findViewById(R.id.bt_mas);
        Button color = findViewById(R.id.bt_cambiar_color);
        Button zero = findViewById(R.id.bt_zero);
        Button coma = findViewById(R.id.bt_coma);
        Button igual = findViewById(R.id.bt_igual);

        if(modo == 0){
            fondo.setBackgroundColor(Color.parseColor("#EFEFEF"));
            borrar.setBackgroundColor(Color.parseColor("#4CAF50"));
            borrar.setTextColor(Color.BLACK);
            mas_menos.setBackgroundColor(Color.parseColor("#4CAF50"));
            mas_menos.setTextColor(Color.BLACK);
            porciento.setBackgroundColor(Color.parseColor("#4CAF50"));
            porciento.setTextColor(Color.BLACK);
            dividir.setBackgroundColor(Color.parseColor("#00A884"));
            dividir.setTextColor(Color.BLACK);
            x.setBackgroundColor(Color.parseColor("#00A884"));
            x.setTextColor(Color.BLACK);
            menos.setBackgroundColor(Color.parseColor("#00A884"));
            menos.setTextColor(Color.BLACK);
            mas.setBackgroundColor(Color.parseColor("#00A884"));
            mas.setTextColor(Color.BLACK);
            igual.setBackgroundColor(Color.parseColor("#00A884"));
            igual.setTextColor(Color.BLACK);
            siete.setBackgroundColor(Color.parseColor("#DCDCDC"));
            siete.setTextColor(Color.BLACK);
            ocho.setBackgroundColor(Color.parseColor("#DCDCDC"));
            ocho.setTextColor(Color.BLACK);
            nueve.setBackgroundColor(Color.parseColor("#DCDCDC"));
            nueve.setTextColor(Color.BLACK);
            cuatro.setBackgroundColor(Color.parseColor("#DCDCDC"));
            cuatro.setTextColor(Color.BLACK);
            cinco.setBackgroundColor(Color.parseColor("#DCDCDC"));
            cinco.setTextColor(Color.BLACK);
            seis.setBackgroundColor(Color.parseColor("#DCDCDC"));
            seis.setTextColor(Color.BLACK);
            uno.setBackgroundColor(Color.parseColor("#DCDCDC"));
            uno.setTextColor(Color.BLACK);
            dos.setBackgroundColor(Color.parseColor("#DCDCDC"));
            dos.setTextColor(Color.BLACK);
            tres.setBackgroundColor(Color.parseColor("#DCDCDC"));
            tres.setTextColor(Color.BLACK);
            color.setBackgroundColor(Color.parseColor("#DCDCDC"));
            color.setTextColor(Color.BLACK);
            zero.setBackgroundColor(Color.parseColor("#DCDCDC"));
            zero.setTextColor(Color.BLACK);
            coma.setBackgroundColor(Color.parseColor("#DCDCDC"));
            coma.setTextColor(Color.BLACK);

            modo = 0;



        } else if (modo ==1) {
            fondo.setBackgroundColor(Color.BLACK);
            borrar.setBackgroundColor(Color.parseColor("#A29B9B"));
            borrar.setTextColor(Color.WHITE);
            mas_menos.setBackgroundColor(Color.parseColor("#A29B9B"));
            mas_menos.setTextColor(Color.WHITE);
            porciento.setBackgroundColor(Color.parseColor("#A29B9B"));
            porciento.setTextColor(Color.WHITE);
            dividir.setBackgroundColor(Color.parseColor("#FF9800"));
            dividir.setTextColor(Color.WHITE);
            x.setBackgroundColor(Color.parseColor("#FF9800"));
            x.setTextColor(Color.WHITE);
            menos.setBackgroundColor(Color.parseColor("#FF9800"));
            menos.setTextColor(Color.WHITE);
            mas.setBackgroundColor(Color.parseColor("#FF9800"));
            mas.setTextColor(Color.WHITE);
            igual.setBackgroundColor(Color.parseColor("#FF9800"));
            igual.setTextColor(Color.WHITE);
            siete.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            siete.setTextColor(Color.WHITE);
            ocho.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            ocho.setTextColor(Color.WHITE);
            nueve.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            nueve.setTextColor(Color.WHITE);
            cuatro.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            cuatro.setTextColor(Color.WHITE);
            cinco.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            cinco.setTextColor(Color.WHITE);
            seis.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            seis.setTextColor(Color.WHITE);
            uno.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            uno.setTextColor(Color.WHITE);
            dos.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            dos.setTextColor(Color.WHITE);
            tres.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            tres.setTextColor(Color.WHITE);
            color.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            color.setTextColor(Color.WHITE);
            zero.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            zero.setTextColor(Color.WHITE);
            coma.setBackgroundColor(Color.parseColor("#30FFFFFF"));
            coma.setTextColor(Color.WHITE);

            modo = 1;

        }

    }
    public void pulsar_tecla(View v) {
        double valor2 = 0;



        TextView contador = findViewById(R.id.tx_cont);
        TextView pantalla = findViewById(R.id.pantalla);


        int id = v.getId();

        if (id == R.id.bt_uno) {
            pantalla.setText(pantalla.getText() + "1");
        } else if (id == R.id.bt_dos) {
            pantalla.setText(pantalla.getText() + "2");
        } else if (id == R.id.bt_tres) {
            pantalla.setText(pantalla.getText() + "3");
        } else if (id == R.id.bt_cuatro) {
            pantalla.setText(pantalla.getText() + "4");
        } else if (id == R.id.bt_cinco) {
            pantalla.setText(pantalla.getText() + "5");
        } else if (id == R.id.bt_seis) {
            pantalla.setText(pantalla.getText() + "6");
        } else if (id == R.id.bt_siete) {
            pantalla.setText(pantalla.getText() + "7");
        } else if (id == R.id.bt_ocho) {
            pantalla.setText(pantalla.getText() + "8");
        } else if (id == R.id.bt_nueve) {
            pantalla.setText(pantalla.getText() + "9");
        } else if (id == R.id.bt_zero) {
            if(pantalla.getText().toString().equals("")){
                pantalla.setText("0.");
            }else{
                pantalla.setText(pantalla.getText()+ "0");
            }

        } else if (id == R.id.bt_borrar) {
            pantalla.setText("");
            contador.setText("");
            contador.setVisibility(View.INVISIBLE);

        } else if (id == R.id.bt_mas_menos) {
            String texto = pantalla.getText().toString();

            if (!texto.isEmpty() && !texto.equals("-")) {

                double numero = Double.parseDouble(texto);

                if (numero > 0) {
                    pantalla.setText("-" + texto);
                } else {
                    pantalla.setText(texto.substring(1));
                }

                valor1 = Double.parseDouble(pantalla.getText().toString());
            }


        } else if (id == R.id.bt_porciento) {
            valor1 = Double.parseDouble(pantalla.getText().toString());
            contador.setVisibility(View.VISIBLE);
            contador.setText(""+valor1+" %");
            que_tipo = 4;

        } else if (id == R.id.bt_dividir) {

            que_tipo = 3;
            valor1 = Double.parseDouble(pantalla.getText().toString());
            contador.setVisibility(View.VISIBLE);
            contador.setText(pantalla.getText().toString() + "/");
            pantalla.setText("");

        } else if (id == R.id.bt_x) {
            que_tipo= 2;
            valor1 = Double.parseDouble(pantalla.getText().toString());
            contador.setVisibility(View.VISIBLE);
            contador.setText(pantalla.getText().toString() + "*");
            pantalla.setText("");
        } else if (id == R.id.bt_menos) {

                que_tipo = 1;
                String texto = pantalla.getText().toString();

                if (texto.isEmpty()) {
                    pantalla.setText("-");
                    contador.setText("-");
                } else if (texto.equals("-")) {

                } else {
                    valor1 = Double.parseDouble(texto);

                    contador.setVisibility(View.VISIBLE);
                    contador.setText(texto + "-");
                    pantalla.setText("");
                }





        } else if (id == R.id.bt_mas) {
            que_tipo = 0;
            valor1 = Double.parseDouble(pantalla.getText().toString());
            contador.setVisibility(View.VISIBLE);
            contador.setText(pantalla.getText().toString() + "+");
            pantalla.setText("");


        }
        else if (id == R.id.bt_igual) {

            String resto = contador.getText().toString();
            String resto1 = pantalla.getText().toString();
            if(resto1.isBlank()){
                contador.setText(""+resto+"");
            }else{
                contador.setText(""+resto+""+""+resto1+""); ;
            }
            valor2 = Double.parseDouble(pantalla.getText().toString());

            if (que_tipo == 0){
                double resul = valor1 + valor2;
                pantalla.setText("" + resul + "");
                valor1 = (resul);
            } else if (que_tipo == 1) {
                double resul = valor1 - valor2;
                pantalla.setText("" + resul + "");
                valor1 = (resul);

            } else if (que_tipo ==2) {
                double resul = valor1 * valor2;
                pantalla.setText("" + resul + "");
                valor1 = (resul);
            } else if (que_tipo == 3) {
                if(valor2 == 0){
                    pantalla.setText("Error Division 0");
                }else{
                    double resul = valor1 / valor2;
                    pantalla.setText("" + resul + "");
                    valor1 = (resul);
                }
            } else if (que_tipo == 4) {
                double resul = valor1/100;
                pantalla.setText("" + resul + "");
                valor1 = (resul);
            }
        }else if (id == R.id.bt_coma) {
            int cuantas_comas = 0;

            if (pantalla.getText().equals("")) {
                pantalla.setText("0.");
                for(char c : pantalla.getText().toString().toCharArray()){
                    if (c == '.') {
                        cuantas_comas ++;
                    }
                }
                if (cuantas_comas > 1) {
                    pantalla.setText("Error mas de una coma");
                }
                cuantas_comas = 0;


            }else{
                pantalla.setText(pantalla.getText() + ".");
                for(char c : pantalla.getText().toString().toCharArray()){
                    if (c == '.') {
                        cuantas_comas ++;
                    }
                }
                if (cuantas_comas > 1) {
                    pantalla.setText("Error mas de una coma");
                }
                cuantas_comas = 0;

            }


        }


    }

}