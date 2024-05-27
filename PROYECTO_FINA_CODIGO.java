/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_fina_codigo;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class PROYECTO_FINA_CODIGO {

    public static void main(String[] args) {
        // Características iniciales
        int extrovertido = 0;
        int introvertido = 0;
        int relacion = 0;

        Scanner scanner = new Scanner(System.in);

        // Primer encuentro con Violett
        System.out.println("Violett: ¿ME PUEDO SENTAR AQUI? (1 para SONREIRLE DE VUELTA Y ASENTIR POR BUENA ONDA): ");
        int violettPrimeraReaccion = scanner.nextInt();

        if (violettPrimeraReaccion == 1) {
            extrovertido += 2;
            introvertido += 3;
            System.out.println("Violett se sienta junto a ti.");
        }

        // Conversación bajo el árbol
        if (extrovertido >= 2 && introvertido >= 3) {
            System.out.println("Después de que se hayan sentado en aquel árbol, se encuentran en silencio por unos minutos, pero finalmente te comienza la plática, Violett aun no siente que pueda empezar una buena platica, por el hecho de ser alguien nuevo, pero también tenia curiosidad por lo que podrías brindarle.");

            System.out.println("¿Decirle que sí y hasta darle un espacio? (1 para Sí, 2 para No): ");
            int violettSegundaReaccion = scanner.nextInt();

            if (violettSegundaReaccion == 1) {
                extrovertido += 3;
                relacion += 5;
                System.out.println("Le dices que sí y hasta le das un espacio.");
                System.out.println("Violett al escuchar esto se siente más cómoda y continúa la conversación.");
            } else if (violettSegundaReaccion == 2) {
                System.out.println("Esta opción muestra una actitud más reservada o incluso grosera por parte del jugador, lo que podría tener repercusiones negativas en la relación con Violett.");
                System.out.println("Violett al escuchar esto solo ríe incómoda y permanece callada por esta respuesta pero igual se sienta enseguida tuyo, al no querer dejarte solo/a. Tarda unos segundos en poder dirigirte la palabra.");
                relacion -= 1;
            }

            // Continuación de la conversación
            System.out.println("Violett: \"El grupo allá parece estar bastante animado, pero a veces prefiero un poco de paz y tranquilidad. ¿Tú también prefieres los momentos más tranquilos?\"");
            System.out.println("1. Momento más tranquilo");
            System.out.println("2. Prefiero estar en el centro de acción");
            int respuestaTranquilo = scanner.nextInt();

            if (respuestaTranquilo == 1) {
                System.out.println("Violett: Lo entiendo, algunas veces uno solo quiere tener un momento de tranquilidad, o solo disfruta de un momento conviviendo con sí mismo. En lo personal a mí me encanta pasar tiempo con la gente, me hace sentir querida.");
            } else if (respuestaTranquilo == 2) {
                System.out.println("Violett: ¡Ya veo…! Tal vez ahora solo prefieres tener un tiempo conviviendo contigo mismo/a, Entiendo, ¡eres una persona de acción entonces! ¡Me gusta eso! Aunque a veces, tener un poco de tiempo a solas también es importante, ¿no crees? ¿Qué es lo que más te gusta hacer cuando estás en el centro de la acción?");
                System.out.println("Es interesante ver cómo Violett reconoce y acepta tus preferencias, incluso si difieren un poco de las suyas. Su apertura y comprensión contribuyen a fortalecer la conexión entre ustedes.");
            }

            System.out.println("La conversación fluye de manera natural, cada uno compartiendo sus intereses y pasiones, consolidando aún más el vínculo entre ustedes. La tarde transcurre en un agradable intercambio de historias y perspectivas, creando recuerdos que ambos atesorarán.");
            System.out.println("Al final del día, mientras disfrutan de una puesta de sol, Violett te pregunta:");
            System.out.println("¿Cómo te sientes después de pasar tiempo interactuando socialmente con amigos o conocidos?");
            System.out.println("a) Energizado/a y rejuvenecido/a: Extrovertido (5), Introvertido (1)");
            System.out.println("b) Normal, sin cambios significativos: Extrovertido (3), Introvertido (3)");
            System.out.println("c) Un poco cansado/a pero contento/a: Extrovertido (2), Introvertido (4)");
            char respuestaInteraccion = scanner.next().charAt(0);

            if (respuestaInteraccion == 'a') {
                extrovertido += 5;
                introvertido += 1;
            } else if (respuestaInteraccion == 'b') {
                extrovertido += 3;
                introvertido += 3;
            } else if (respuestaInteraccion == 'c') {
                extrovertido += 2;
                introvertido += 4;
            }

            System.out.println("Mientras la tarde se convierte en noche y las estrellas comienzan a aparecer, Violett, con una sonrisa curiosa, te hace otra pregunta para conocerte mejor:");
            System.out.println("¿Disfrutas más de actividades en solitario o en grupos pequeños?");
            System.out.println("1. Disfruto más de actividades en solitario.");
            System.out.println("2. Prefiero actividades en grupos pequeños.");
            System.out.println("3. Disfruto tanto de actividades en solitario como en grupos pequeños.");
            System.out.println("4. Depende del tipo de actividad y mi estado de ánimo en ese momento.");
            int respuestaActividades = scanner.nextInt();

            if (respuestaActividades == 1) {
                introvertido += 5;
            } else if (respuestaActividades == 2) {
                extrovertido += 4;
                introvertido += 2;
            } else if (respuestaActividades == 3) {
                extrovertido += 3;
                introvertido += 3;
            } else if (respuestaActividades == 4) {
                extrovertido += 3;
                introvertido += 3;
            }

            System.out.println("La pregunta muestra su interés genuino en entender tus preferencias y encontrar maneras de disfrutar juntos, respetando tanto tus inclinaciones como las suyas. Violett asiente, comprendiendo tus palabras.");
            System.out.println("\"Eso tiene mucho sentido. Creo que es importante tener ese equilibrio y saber lo que uno necesita en cada momento.\"");
            System.out.println("La conversación fluye con naturalidad, y mientras el cielo se oscurece y las estrellas brillan más intensamente, Violett te hace otra pregunta para conocerte mejor.");
            System.out.println("\"¿Cuál es tu reacción ante eventos sociales muy concurridos y bulliciosos?\"");
            System.out.println("A) Me siento emocionado/a y energizado/a por la atmósfera animada. Extrovertido (5), Introvertido (1)");
            System.out.println("B) Me siento abrumado/a y prefiero encontrar un lugar más tranquilo. Extrovertido (1), Introvertido (5)");
            System.out.println("C) Me adapto fácilmente y disfruto de la diversidad de experiencias. Extrovertido (4), Introvertido (2)");
            System.out.println("D) Depende de mi nivel de comodidad y familiaridad con el entorno. Extrovertido (3), Introvertido (3)");
            char respuestaEventos = scanner.next().charAt(0);

            if (respuestaEventos == 'A') {
                extrovertido += 5;
                introvertido += 1;
            } else if (respuestaEventos == 'B') {
                extrovertido += 1;
                introvertido += 5;
            } else if (respuestaEventos == 'C') {
                extrovertido += 4;
                introvertido += 2;
            } else if (respuestaEventos == 'D') {
                extrovertido += 3;
                introvertido += 3;
            }

            System.out.println("La conversación fluye con naturalidad, y mientras el cielo se oscurece y las estrellas brillan más intensamente, Violett te hace otra pregunta para conocerte mejor.");
            System.out.println("\"¿Cómo recargas tus energías después de un día ocupado?\"");
            System.out.println("A) Pasando tiempo a solas para relajarme y recargar. Extrovertido (1), Introvertido (5)");
            System.out.println("B) Socializando con amigos o seres queridos. Extrovertido (5), Introvertido (1)");
            System.out.println("C) Haciendo ejercicio físico o practicando actividades al aire libre. Extrovertido (4), Introvertido (2)");
            System.out.println("D) Disfrutando de pasatiempos o actividades creativas que me gusten. Extrovertido (3), Introvertido (3)");
            char respuestaRecargar = scanner.next().charAt(0);

            if (respuestaRecargar == 'A') {
                extrovertido += 1;
                introvertido += 5;
            } else if (respuestaRecargar == 'B') {
                extrovertido += 5;
                introvertido += 1;
            } else if (respuestaRecargar == 'C') {
                extrovertido += 4;
                introvertido += 2;
            } else if (respuestaRecargar == 'D') {
                extrovertido += 3;
                introvertido += 3;
            }

            System.out.println("Violett sonríe de nuevo. \"Entiendo perfectamente. A veces, ese tiempo a solas es justo lo que necesitamos para recuperar nuestro equilibrio.\"");
            System.out.println("Pasáis el resto de la noche charlando bajo las estrellas, compartiendo historias y risas. La conexión entre vosotros se siente más fuerte y más profunda. La honestidad y la apertura de la conversación os han acercado aún más.");

            System.out.println("La conversación fluye con naturalidad, y mientras el cielo se oscurece y las estrellas brillan más intensamente, Violett te hace otra pregunta para conocerte mejor.");
            System.out.println("\"¿Cómo te sientes después de una semana intensa de trabajo o estudio?\"");
            System.out.println("A) Necesito pasar tiempo a solas para recargar mis energías. Extrovertido (1), Introvertido (5)");
            System.out.println("B) Me gusta salir y socializar para desconectar y relajarme. Extrovertido (5), Introvertido (1)");
            char respuestaSemana = scanner.next().charAt(0);

            if (respuestaSemana == 'A') {
                extrovertido += 1;
                introvertido += 5;
            } else if (respuestaSemana == 'B') {
                extrovertido += 5;
                introvertido += 1;
            }

            System.out.println("Pasáis el resto de la noche charlando bajo las estrellas, compartiendo historias y risas. La conexión entre vosotros se siente más fuerte y más profunda. La honestidad y la apertura de la conversación os han acercado aún más.");
            System.out.println("Cuando finalmente es hora de despedirse, ambos sentís que habéis creado un lazo especial.");
            System.out.println("\"Gracias por este día,\" dices sinceramente. \"Ha sido increíble conocerte mejor.\"");
            System.out.println("\"Gracias a ti,\" responde Violett con una sonrisa brillante. \"Espero que tengamos muchas más conversaciones como esta.\"");
        }

        System.out.println("Estadísticas finales: Extrovertido: " + extrovertido + ", Introvertido: " + introvertido + ", Relación: " + relacion);
    }
}
    

