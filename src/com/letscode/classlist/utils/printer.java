package com.letscode.classlist.utils;

import static java.lang.System.*;

public class printer {

        static final String DisplayLine1 = "Escolha:";
        static final String DisplayLine2 = "1 - Para Exercicio 1";
        static final String DisplayLine3 = "2 - Para Exercicio 2";
        static final String DisplayLine4 = "3 - Para Exercicio 3";
        static final String DisplayLine5 = "4 - Para Exercicio 4";
        static final String DisplayLine6 = "5 - Para Exercicio 5";
        static final String DisplayLine7  = "Digite dois numeros inteiros";
        static final String DisplayLine8  = "Digite um número inteiro";
        static final String DisplayLine9  = "Digite um valor em Celsius";
        static final String DisplayLine10 = "Digite um valor em Reais";
        static final String DisplayLine11 = "Digite um valor em Centimetros";


        public printer(){

        }

        public static void printStartMsg(){
            out.println(DisplayLine1);
            out.println(DisplayLine2);
            out.println(DisplayLine3);
            out.println(DisplayLine4);
            out.println(DisplayLine5);
            out.println(DisplayLine6);
        }

        public static void printOptionMsg(){
            out.println(DisplayLine7);
            out.println(DisplayLine8);
            out.println(DisplayLine9);
            out.println(DisplayLine10);
            out.println(DisplayLine11);
    }

}

