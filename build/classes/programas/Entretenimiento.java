/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion;

import java.util.Scanner;

/**
 *
 * @author Martha Rodríguez
 */



public class Entretenimiento {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenido al buscador de informacion cultural");
            System.out.println("Ingresa el nombre de un artista, pelicula, serie, etc.:");
            String opcion = scanner.nextLine();
            
            switch (opcion.toLowerCase()) {
                case "ariana grande":
                    System.out.println("Ariana Grande es una cantante estadounidense...");
                    break;
                case "naruto":
                    System.out.println("Manga creado por masashi kishimoto sobre un niño ...");
                    break;
                case "fortnite":
                    System.out.println("Videojuego creado por epic games en el año 2013...");
                    break;
                case "breaking bad":
                    System.out.println("Breaking Bad es una serie de televisión estadounidense creada por Vince Gilligan...");
                    break;
                case "un lugar en silencio":
                    System.out.println("Es una pelicula protagonizada por Emily Blunt estrenada en el 2018...");
                    break;
                default:
                    System.out.println("Lo siento, no tengo informacion sobre " + opcion);
            }
        }
    }
}