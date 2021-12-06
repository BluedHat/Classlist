package com.letscode.classlist.utils;

import com.letscode.classlist.basis.quests;
import com.letscode.classlist.core.list02;

import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;

public class scan {

        private static Scanner UserEntry;

        public scan(){

        }

        public static String scanUserEntry(){
            UserEntry = new Scanner(System.in);
            printer.printStartMsg();
            String UserOption = UserEntry.nextLine();

            switch (UserOption) {
                case "1":
                    quests DesiredQuestion01 = quests.Question01;
                    out.println("Você escolheu" + UserOption);
                    out.println(printer.DisplayLine7);
                    Integer a = UserEntry.nextInt();
                    Integer b = UserEntry.nextInt();
                    out.println("Dados os valores:" + a +" " +"e" +" " + b);
                    out.println(Arrays.asList(list02.Question01(a,b)));
                    break;
                case "2":
                    quests DesiredQuestion02 = quests.Question02;
                    out.println("Você escolheu" + UserOption);
                    out.println(printer.DisplayLine8);
                    Integer c = UserEntry.nextInt();
                    out.println("A tabuada de" +":" + c);
                    out.println("É igual a: soma: " +" " + Arrays.asList(list02.Question02(c)[0]) );
                    out.println("É igual a: subtração " +" " + Arrays.asList(list02.Question02(c)[1]) );
                    out.println("É igual a: multiplicação " +" " + Arrays.asList(list02.Question02(c)[2]) );
                    out.println("É igual a: divisão " +" " + Arrays.asList(list02.Question02(c)[3]) );
                    break;
                case "3":
                    quests DesiredQuestion03 = quests.Question03;
                    out.println("Você escolheu" + UserOption);
                    out.println(printer.DisplayLine9);
                    Double celsius = UserEntry.nextDouble();
                    out.println("A temperatura de entrada foi:" + celsius);
                    out.println("A temperadura de saída é:" + " " + list02.Question03(celsius));
                    break;
                case "4":
                    quests DesiredQuestion04 = quests.Question04;
                    out.println("Você escolheu" + UserOption);
                    out.println(printer.DisplayLine10);
                    Float real = UserEntry.nextFloat();
                    out.println("O valor em real:" + real);
                    out.println("É igual a:" + " " + list02.Question04(real)+" " + "dolares");
                    break;
                case "5":
                    quests DesiredQuestion05 = quests.Question05;
                    out.println("Você escolheu" + UserOption);
                    out.println(printer.DisplayLine11);
                    Float centimeters = UserEntry.nextFloat();
                    out.println("O valor em centimetros:" + centimeters);
                    out.println("É igual a:"  + " " +  list02.Question05(centimeters)  + " " + "polegadas");
                    break;
                default:
                    throw new IllegalStateException("Por favor digite uma opção válida");
            }
            return ("Processando");
        }

    }

