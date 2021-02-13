package com.company;
import java.lang.String;
import java.util.Scanner;


class matriz{
    int array[][];

    public void sumaxMultiplicacion(){

    }

    public void indefinida(){

    }

    public void identidad(){

    }


    public void trianguloSuperior(){

    }


    matriz(int x, int y){
        this.array = new int[x][y];
    }
}



class    menu{
    Scanner keying;
    boolean result;

    public void renderMenu(){

        System.out.println("1) Suma de Matrices)");
        System.out.println("2) Matriz de tamaño indefinido)");
        System.out.println("3) Matriz identidad)");
        System.out.println("4) Matriz Triaungulo Superior");
        System.out.println("5) Salir del Sistema");
    }

    public void mostrarMenu( int e){
        System.out.println("Entro al menu");
        while(e < 5) {
            System.out.println("Escoga una opción");
            switch (e) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: System.out.println("Entro al menu");
                default:
                    System.out.println("Entro al menu");
            }
        }
    }

    public menu(){
        this.keying = new Scanner(System.in);
        this.result = false;
    }
}


public class Main {

    public static void main(String[] args) {
	        menu men = new menu();

            men.renderMenu();
            int e = men.keying.nextInt();

            while (men.result){

            }




    }
}
