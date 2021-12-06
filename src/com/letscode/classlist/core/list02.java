//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.letscode.classlist.core;

public class list02 {
    public list02(){

    }

//question 1
//Escreva um programa que recebe dois números inteiros e informa o resultado das
// operações soma, subtração,
// multiplicação e divisão. Considere sempre a ordem em que foram informados.

    public static String[] Question01 (int a, int b ){

        String [] result = new String[4];

        int plus = a + b;
        int less = a - b;
        int mux  = a * b;
        int rest = a / b;

        result [0] = ("a + b" + " = " + plus);
        result [1] = ("a - b" + " = " + less);
        result [2] = ("a * b" + " = " + mux);
        result [3] = ("a / b" + " = " + rest);

         return result;
    }

//Question 2
//Escreva um programa que informa a tabuada de um número informado (entre 1-10).

    public static String[][] Question02(int c){

            String [][] Resultado = new String[4][11];

            for (int i = 1; i <= 10 ; i++){

                Resultado[0][i] = (c + "+" + i + " = " + (c+i) );
                Resultado[1][i] = (c + "-" + i + " = " + (c-i) );
                Resultado[2][i] = (c + "*" + i + " = " + (c*i) );
                Resultado[3][i] = ((i*c) + "/" + c + " = " + ((i*c)/c) );
            }

            return Resultado;
        }

//Question 03
//Escreva um programa que converte temperaturas de Celsius para Farenheit.

    public static double Question03( double celsius){
            double Temperatura = ((celsius * 1.8) + 32);
            return Temperatura;
    }

//Question 04
//Escreva um programa que recebe a cotação do dólar do dia e,
// seguida recebe um valor em reais. A saída é a quantia em dólares.
// Use formatação de saída para exibir os valores de acordo com cada representação de moeda.

    public static double Question04(double real){

            double dolarFactor = 5.65f;
            double ExChange = real * dolarFactor;

            return ExChange;
    }


//Question05
//Escreva um programa que realiza conversão de medidas de polegadas em centímetros.

    public static double Question05(double centimeters) {
            double incheFactor = 2.54f;
            double NewSize = centimeters * incheFactor;

           return NewSize;
    }
}
