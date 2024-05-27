/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.final_pro;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class FINAL_PRO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int op1;

        System.out.println("Bienvenidos a la fase 4");
        System.out.println("Por favor, introduce tu nombre:");
        nombre = scanner.nextLine();

        System.out.println("Elige una opción para comenzar:");
        System.out.println("1. Momento más tranquilo");
        System.out.println("2. Interactuar con gente nueva");
        op1 = scanner.nextInt();

        if (op1 == 1) {
            System.out.println("Mientras lees tu libro se acerca una chica de pelo cobrizo, rizado y vestida de forma informal...");
            System.out.println("Violett: ¿ME PUEDO SENTAR AQUÍ?");
            System.out.println("Sonríes y asientes por buena onda.");
            System.out.println("Violett se sienta a tu lado y después de unos minutos comienza la plática...");
            System.out.println("Violett: \"El grupo allá parece estar bastante animado, pero a veces prefiero un poco de paz y tranquilidad. ¿Tú también prefieres los momentos más tranquilos?\"");
            System.out.println("Eliges:");
            System.out.println("1.- Momento más tranquilo");
            System.out.println("2.- Prefiero estar en el centro de acción");
            int respuesta = scanner.nextInt();

            if (respuesta == 1) {
                System.out.println("Violett: Lo entiendo, algunas veces uno solo quiere tener un momento de tranquilidad...");
                System.out.println("La conversación fluye de manera natural, cada uno compartiendo sus intereses y pasiones...");
                System.out.println("Al final del día, mientras disfrutan de una puesta de sol, Violett te pregunta:");
                System.out.println("¿Cómo te sientes después de pasar tiempo interactuando socialmente con amigos o conocidos?");
                System.out.println("a) Energizado/a y rejuvenecido/a");
                System.out.println("b) Normal, sin cambios significativos");
                System.out.println("c) Un poco cansado/a pero contento/a");
                // Aquí continuaría el código con las opciones y las respuestas del jugador.
            } else if (respuesta == 2) {
                System.out.println("Violett: ¡Ya veo…! Tal vez ahora solo prefieres tener un tiempo conviviendo contigo mismo/a...");
                System.out.println("La conversación fluye de manera natural, cada uno compartiendo sus intereses y pasiones...");
                System.out.println("Al final del día, mientras disfrutan de una puesta de sol, Violett te pregunta:");
                System.out.println("¿Cómo te sientes después de pasar tiempo interactuando socialmente con amigos o conocidos?");
                System.out.println("a) Energizado/a y rejuvenecido/a");
                System.out.println("b) Normal, sin cambios significativos");
                System.out.println("c) Un poco cansado/a pero contento/a");
                // Aquí continuaría el código con las opciones y las respuestas del jugador.
            } else {
                System.out.println("Opción no válida.");
            }
        } else if (op1 == 2) {
            System.out.println("Al acercarte al bullicio de gente, te encuentras rodeado de una variedad de personajes coloridos...");
            System.out.println("Elige una forma de interactuar con ellos:");
            System.out.println("1. Me siento más seguro/a cuando estoy hablando sobre un tema en el que tengo experiencia y conocimiento.");
            System.out.println("2. Me siento más inseguro/a al interactuar con personas que considero más autoritarias o dominantes.");
            System.out.println("3. Me siento más seguro/a cuando estoy con amigos cercanos o familiares.");
            System.out.println("4. Me siento más seguro/a en situaciones donde tengo que hablar en público o ser el centro de atención.");
            int op2 = scanner.nextInt();

            if (op2 == 1) {
                System.out.println("Después de tomar la decisión de enfocarte en un tema en el que te sientes cómodo...");
                // Aquí continuaría el código con la historia de la opción 2 - 1.
            } else if (op2 == 2) {
                System.out.println("Después de notar la presencia de algunas personas que parecen tener una actitud más autoritaria o dominante...");
                // Aquí continuaría el código con la historia de la opción 2 - 2.
            } else if (op2 == 3) {
                System.out.println("La chica de antes al notar esto, te sonrió y te invitó a unirte a ella para enfrentar la situación juntos...");
                // Aquí continuaría el código con la historia de la opción 2 - 3.
            } else if (op2 == 4) {
                System.out.println("Decidiste juntarte a un grupo y tomar el liderazgo de la conversación...");
                // Aquí continuaría el código con la historia de la opción 2 - 4.
            } else {
                System.out.println("Opción no válida.");
            }
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
    }
}
