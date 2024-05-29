
package isc_proyecto_final;

import java.util.Scanner;

/**
 *
 * Spring Team
 */
public class ISC_PROYECTO_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arreglo almacen de las personalidades
        int[] puntos = new int[8]; 
        //Opciones, datos del usuario
        String nombre;
        String clave;
        //Personajes relación con el usuario:
        int Violett = 0; //ENFP
        int Elena = 0; //ISFJ
        int Irving = 0; //ISFP
        int Axel = 0; //ENTP
        //INICIO DEL JUEGO VARIABLES
        int faseActual = 1;
        
        //----------------------------------------------------------------------
        
        System.out.println("Bienvenido a LOTUS! En este emocionante juego, te sumergirás en una historia llena de romance,");
        System.out.println("intriga y decisiones que marcarán tu destino. Conoce a cuatro personajes únicos, ");
        System.out.println("cada uno con su propia historia y secretos por descubrir. ");
        System.out.println("");
        System.out.println("¿Listo para empezar esta aventura?");
        
        System.out.println("---------------------------------------------------------------------------------------------");
  
        System.out.println();
        
        //INTRODUCE NOMBRE
        System.out.println("--------------------");
        System.out.println("¿Cual es tu nombre?");
        System.out.println("--------------------");
        
        Scanner captu = new Scanner (System.in);
        nombre = captu.nextLine();
        
        //INTRODUCE CLAVE
        System.out.println(nombre + " es un gusto conocerte, recuerda responder como te va guiando tu propio corazón.");
        System.out.println("Ahora otorganos una palabra clave, para que toda decisión quede");
        System.out.println("entre las estrellas y tú");
        
        clave = captu.nextLine();
        
        System.out.println("Acabas de llegar a este nuevo pueblo, donde la primavera apenas te da la bienvenida");
        System.out.println("al dar un paso al lugar. Este lugar podría ser un nuevo comienzo para ti, ");
        System.out.println("una oportunidad para explorar nuevas pasiones y conocer a personas fascinantes,");
        
        System.out.println();

// Bucle principal del juego
//Para que el usuario vaya a cada fase.

    while (faseActual <= 3) {
        
        switch (faseActual) {
            case 1:
                fase1(captu, nombre,puntos, Violett);
                break;
            case 2:
                fase2(captu, nombre,puntos,Elena);
                break;
            case 3:
                fase3(captu, nombre, puntos, Irving);
            case 4:
                fase4(captu, nombre, puntos, Axel);
                break;
        }
        faseActual++;
}
        

//-----------------------------------------------------------------------------
          //CLAVE PARA RECIBIR LOS RESULTADOS

        String claveIngresada = ""; 
        
        while (!claveIngresada.equals(clave)) {
            
            System.out.println("Por favor, ingrese la clave para acceder a tu información:");
            claveIngresada = captu.nextLine();

            if (!claveIngresada.equals(clave)) {
                System.out.println("Clave incorrecta. Inténtalo de nuevo.");
            }
        }
        
        // Si llegamos aquí, la clave es correcta
        System.out.println("Clave correcta. Accediendo a la información de tu test...");
        
        mostrarPuntos(puntos);
        
        System.out.println("*******************************************************************");
        System.out.println("Parece ser que te encontrsaste a varios personajes en tu camino.");
        System.out.println("           ¿Como es que te llevaste con ellos?       ");
        
        mostrarPuntosRelacion(Violett, Elena, Irving, Axel);
        
//------------------------------------------------------------------------------        
    }
    
// °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°COMIENZO DEL JUEGO°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°    
public static void fase1(Scanner captu, String nombre, int[] puntos, int Violett) {
int op1;
boolean opV = true; //OPCIÓN VALIDA 
            System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°");
            System.out.println();
            System.out.println();
            
            System.out.println("Bienvenido a la fase 1: primeros petalos, " + nombre);
            
            System.out.println();
            System.out.println();

            System.out.println("Has llegado al corazón de este encantador pueblo, un crisol de historias esperando ser escritas.");
            System.out.println("Cada callejuela y cada esquina ocultan secretos y oportunidades para aquellos dispuestos a explorar y descubrir.");
            System.out.println("Decides ir a un parque oculto entre el bosque, donde la fresca brisa te da la ");
            System.out.println("bienvenida con una alegría inexplicable, sientes como tu corazón se siente como una ");
            System.out.println("flor en primavera, floreciendo con esperanzas a nuevas experiencias.");
            
            System.out.println();
            System.out.println();
            System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°");  
            System.out.println();
            System.out.println();
            System.out.println("Por lo que puedes ver en este lugar hay varios lugares donde puedes hacer ");
            System.out.println("varias actividades, uno parece estar repleto de gente, junto con diferentes ");
            System.out.println("tipos de personas nuevas con las que pues interactuar de diferente manera, ");
            System.out.println("mientras que otro esta un poco mas aislado de los demás, donde podrías leer ");
            System.out.println("tu libro en calma y disfrutar de aquella brisa de antes.");
            
            
            System.out.println();
            
            System.out.println("Empecemos a ver que opción te sienta mejor!");
            System.out.println();
            System.out.println("");
            System.out.println("-------------------------------------");
            System.out.println("1.- Interactuar con gente nueva "); //+5 Extrovertido
            System.out.println("2.- Leer un libro debajo del árbol"); //+5 Introvertido
            System.out.println("-------------------------------------");
            System.out.println("");
            do{
                
            op1 = captu.nextInt(); 
    
            switch(op1){
                                //++++INTERACTUAR GENTE NUEVA++++
                case 1:
                System.out.println("Al acercarte al bullicio de gente, te encuentras rodeado de una variedad de personajes ");
                System.out.println("coloridos. Entre la multitud, pudiste notar como una chica destacaba por su risa.");
                System.out.println("Una chica de pelo cobrizo, rizado y vestida de una forma informal,");
                System.out.println("con una blusa de color morado y un pantalón de mezclilla largo. Ojos cafés y de una tez morena. ");
                puntos[1] += 5; //Extrovertido

                    System.out.println("Al llegar al lugar se te presenta diferentes formas de poder interactuar con ellos, ¿Con cuál te sentirías más cómodo?");
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("1. Me siento más seguro/a cuando estoy hablando sobre un tema en el que  tengo experiencia y conocimiento. ");//3 INTROVERTIDO Y +3 EXTROVERTIDO
                    System.out.println("2.-Me siento más inseguro/a al interactuar con personas que considero más autoritarias o dominantes.");//+5 INTROVERTIDO 
                    System.out.println("3.-Me siento más seguro/a cuando estoy con amigos cercanos o familiares. ");//5 INTROVERTIDO Y +2 EXTROVERTIDO
                    System.out.println("4.-Me siento más seguro/a en situaciones donde tengo que hablar en público o ser el centro de atención. "); //5 EXTROVERTIDO
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("");

                do{    
                    op1 = captu.nextInt();
                    
                    switch (op1) {
                        case 1:
                            System.out.println("Después de tomar la decisión de enfocarte en un tema en el que te sientes cómodo, te acercas a un grupo más pequeño de personas que parecen estar discutiendo sobre algo");
                            System.out.println("que te interesa profundamente. Te unes a la conversación y rápidamente te sientes en tu elemento.");
                            System.out.println("");
                            puntos[0]+=3;
                            puntos[1]+=3;
                            break;
                        case 2:
                            System.out.println("Después de notar la presencia de algunas personas que parecen tener una actitud más autoritaria o dominante en el grupo, te sientes un poco inseguro/a sobre cómo interactuar con ellos.");
                            System.out.println("Una de las chicas al notar esto, se acerca a ti sacándote levemente una conversación.");
                            System.out.println("");
                            puntos[0] += 5;
                            break;
                        case 3:
                            System.out.println("La chica de antes al notar esto, te sonrió y te invitó a unirte a ella para enfrentar la situación juntos. Su tono amigable te hizo sentir más a gusto.");
                            System.out.println("Violett: Debes de ser nuevo/a por aquí, soy Violett, es un gusto conocerte.");
                            System.out.println("");
                            puntos[0]+=5;
                            puntos[1]+=2;
                            break;
                        case 4:
                            System.out.println("Decidiste juntarse a un grupo y tomar el liderazgo de la conversación,incluso llegando a agrandarle a varias personas." );
                            System.out.println("");
                            puntos[1]+=5;
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4.");
                    opV = false; // Opción no válida, repetir el bucle
                    break;
                    }
                }while(!opV);
                
                System.out.println("Gracias a esto llamas la atención de varias personas por esta iniciativa. Violett se acerca con una sonrisa cálida en el rostro,mostrando interés genuino en lo que estás compartiendo.");
                System.out.println("Violett:¡Wow, tienes muchas ideas interesantes! Realmente disfruto tu entusiasmo por este tema, Me encantaría saber más sobre lo que estás diciendo.¿Qué te motivó a aprender tanto sobre esto?");
                System.out.println("Dice con entusiasmo, sintiendo inmediatamente una conexion.");
                    System.out.println("");
                    System.out.println("---------------------------------------");    
                    System.out.println("1.Una curiosidad natural.");
                    System.out.println("2.Aumentar tu conocimiento.");
                    System.out.println("3.Sentir una gran pasión por esta. ");
                    System.out.println("---------------------------------------");
                    System.out.println("");
                    
                do{
                op1 = captu.nextInt();
                    
                    switch (op1) {
                        case 1:
                            System.out.println("Violett: Oh, entiendo completamente eso. A menudo me encuentro investigando sobre temas que simplemente me intrigan.");
                            System.out.println("Es como si mi mente estuviera constantemente buscando nuevas cosas para descubrir y aprender.");
                            System.out.println("");
                            Violett += 5;
                            break;
                        case 2:
                            System.out.println("Violett: Oh, ¡totalmente! Aumentar tu conocimiento es genial, ¿verdad? Siempre me encuentro buscando nuevas cosas para aprender");
                            System.out.println("especialmente sobre temas que me interesan. ¿Qué te llevó a querer saber más sobre esto? Fue como un ¡guau, esto es increíble!");
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("Violett: ¡Qué maravilloso! La pasión puede ser un motor increíble para la investigación. Cuando te apasiona algo, realmente te sumerges en ello, ¿verdad?");
                            System.out.println("Personalmente, experimentó esa sensación al investigar sobre temas que realmente me emocionan.");
                            System.out.println("");
                            Violett += 5;
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4.");
                    opV = false; // Opción no válida, repetir el bucle
                    break;
                    }
                }while(!opV); 
                
                    System.out.println("");
                    System.out.println("La  conversación sigue, y te das cuenta de cuánto disfrutas compartir tus intereses con Violett.");
                    System.out.println("La conexión entre vosotros se profundiza con cada intercambio, creando una base sólida para una amistad duradera.");
                    System.out.println("");
                    System.out.println("Violett: Es increible encontrar a alguien que comparte esa pasión por aprender.");
                    System.out.println("Me encantaría seguir conversando sobre esto y explorar más temas juntos. ¿Qué dices?");
                    System.out.println("");
                    System.out.println("Asientes con entusiasmo. \"¡Claro que sí! Sería genial seguir compartiendo ideas y aprendiendo juntos.");
                    System.out.println("Estoy seguro de que hay muchas más conversaciones fascinantes por venir.\"");
                    System.out.println("");
                    System.out.println("Mientras camináis juntos, Violett te hace otra pregunta que demuestra su interés por conocerte más a fondo.");
                    System.out.println("Violett: ¿Cómo te sientes acerca de hablar en público? Te tomas un momento para considerar tu respuesta. ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("1.- Me emociona y disfruto estar en el centro de atención");
                    System.out.println("2.- Prefiero evitarlo y me siento mas comodo/a en roles de apoyo");
                    System.out.println("3.- Depende del tema y del púbico.");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("");
        
        do {
            op1 = captu.nextInt();
            
            switch (op1){
                case 1:
                    System.out.println("Siempre he encontrado emocionante poder compartir mis ideas con el publico.");
                    puntos[1]+=5;
                     break;
                case 2:
                    System.out.println("La idea de hablar en público siempre me ha puesto un poco nervioso/a");
                    puntos[0]+=5;
                    break;
                case 3:
                    System.out.println("Si es algo que me apasiona, puedo hacerlo sin problemas,");
                    System.out.println("pero en otras situaciones prefiero no ser el centro de atencion.");
                    puntos[0]+=3;
                    puntos[1]+=3;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4");
                  opV = false;// Opción no valida, repite bucle
            }     
            break;
        }
        while(!opV);
        
        System.out.println("Violett asiente comprensivamente. \"Eso tiene mucho sentido.");
        System.out.println("Creo que todos tenemos esos momentos en los que nos sentimos más cómodos hablando delante de otros, ");
        System.out.println("especialmente cuando se trata de algo que realmente nos importa.\"");
        System.out.println("La noche avanza y continuáis conversando bajo el cielo estrellado. ");
        System.out.println("La calidez y la profundidad de vuestra charla hacen que el tiempo pase volando.");
        System.out.println("");
        System.out.println("Camináis juntos por el sendero iluminado por las estrellas, ");
        System.out.println("sintiendo que este encuentro ha sido el comienzo de algo especial. ");
        System.out.println(" Mientras miras el cielo una última vez antes de irte a casa, ");
        System.out.println("sabes que esta noche ha sido verdaderamente memorable,");
        System.out.println("Llena de momentos que atesorarás para siempre.");
        System.out.println("");
        System.out.println("Justo cuando creías que la noche estaba llegando a su fin,");
        System.out.println("Violett se detiene de repente y te mira con una chispa de curiosidad en los ojos.");
        System.out.println("Violett: \"¿Cómo te sientes al conocer a nuevas personas?\"");
        System.out.println("");
        System.out.println("Te sorprende la pregunta, pero te tomas un momento para considerar tu respuesta.");
                    System.out.println("");
                    System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("1.- Me siento emocionado/a y disfruto la oportunidad de hacer nuevos amigos.");
        System.out.println("2.- Me siento un poco tímido/a y prefiero conocer a la gente lentamente.");
        System.out.println("3.- Depende del ambiente y de la situación.");
        System.out.println("--------------------------------------------------------------------------------");

        
        do {
            op1 = captu.nextInt();
            
            switch (op1){
                case 1:
                    System.out.println("");
                    puntos[1]+=5;
                    break;
                case 2:
                    System.out.println("");
                    puntos[0]+=5;
                    break;
                case 3:
                    System.out.println("");
                    puntos[0]+=3;
                    puntos[1]+=3;
                    break;
                 default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4");
                  opV = false;// Opción no valida, repite bucle
            }
            break;
        }
        while (!opV);
        
        System.out.println("Justo cuando creías que la noche estaba llegando a su fin, ");
        System.out.println("Violett se detiene de repente y te mira con una chispa de curiosidad en los ojos.");
                    System.out.println("");
        System.out.println("Violett: \"¿Qué prefieres hacer después de un día estresante?\"");
        System.out.println("Te sorprende la pregunta, pero te tomas un momento para considerar tu respuesta");
                    System.out.println("");
                    System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("1.- Me siento emocionado/a y disfruto la oportunidad de hacer nuevos amigos.");
        System.out.println("2.- Me siento un poco tímido/a y prefiero conocer a la gente lentamente.");
        System.out.println("3.- Depende del ambiente y de la situación.");
        System.out.println("----------------------------------------------------------------------------------");
        
        do {
            op1 = captu.nextInt();
            
            switch (op1){
                case 1:
                    System.out.println("");
                    puntos[1]+=5;
                    break;
                case 2:
                    System.out.println("");
                    puntos[0]+=5;
                    break;
                case 3:
                    System.out.println("");
                    puntos[0]+=3;
                    puntos[1]+=3;
                    break;
                 default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4");
                  opV = false;// Opción no valida, repite bucle
            }
            break;
        }
        while (!opV);
        
        System.out.println("Justo cuando creías que la noche estaba llegando a su fin, Violett se detiene de repente y te mira con una chispa de curiosidad en los ojos.");
        System.out.println("Violett: ¿Qué prefieres hacer después de un día estresante?");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("1. Me siento emocionado/a y disfruto la oportunidad de hacer nuevos amigos.");
        System.out.println("2. Me siento un poco tímido/a y prefiero conocer a la gente lentamente.");
        System.out.println("3. Depende del ambiente y de la situación.");
        System.out.println("----------------------------------------------------------------------------------");
        do {
            op1 = captu.nextInt();
            
            switch (op1){
                case 1:
                    System.out.println("");
                    puntos[1]+=5;
                    break;
                case 2:
                    System.out.println("");
                    puntos[0]+=5;
                    break;
                case 3:
                    System.out.println("");
                    puntos[0]+=3;
                    puntos[1]+=3;
                    break;
                 default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4");
                  opV = false;// Opción no valida, repite bucle
            }
            break;
        }
        while (!opV);
                    System.out.println("");
        
        // ULTIMO TEXTO DEL PRIMER CAMINO
        System.out.println("Después de una tarde llena de conversaciones profundas y conexión genuina,");
        System.out.println("Violett y tú caminan juntos bajo el cielo estrellado, compartiendo risas y reflexiones. ");
        System.out.println("A medida que la noche avanza, ambos se dan cuenta de que han encontrado en el otro a alguien con quien pueden compartir sus pasiones y curiosidades.");
        System.out.println("Este encuentro marca el comienzo de una amistad que promete muchas más conversaciones fascinantes y momentos memorables en el futuro");
                    
                    break;
                    
            //++++LEER UN LIBRO++++
                case 2:
                System.out.println("Mientras lees tu libro se acerca una chica de pelo cobrizo, rizado y vestida de una ");
                System.out.println("forma informal, con una blusa de color morado y un pantalón de mezclilla largo");
                System.out.println("Ojos cafes y de una tez morena.");
                System.out.println("Volteaste a ver como tu momento de paz ha sido interrumpida, por esta chica.");
                puntos[0] += 5; //Introvertido
                System.out.println();
                
                System.out.println("Violett:¿Me puedo sentar aqui?");//Dialogo
                System.out.println();
                System.out.println("");
                System.out.println("----------------------------------------------------");
                System.out.println("1.- Sonreírle de vuelta y asentir por buena onda "); //+2 Extrovertido y +3 Introvertido
                System.out.println("2.- Decirle que sí y hasta darle un espacio "); //+3 Extrovertido y Rela +5
                System.out.println("3.- Decirle que no, quieres estar solo/a"); //+3 Introvertido --> Rela: -5
                System.out.println("----------------------------------------------------");
                
                do{
            op1 = captu.nextInt();
            
            switch (op1){
                case 1 :
                    System.out.println("Después de que se hayan sentado en aquel árbol, se encuentran en silencio por unos minutos, ");
                    System.out.println("pero finalmente te comienza la plática, Violett aun no siente que pueda empezar una buena platica,");
                    System.out.println("por el hecho de ser alguien nuevo, pero también tenia curiosidad por lo que podrías brindarle");
                    puntos[0] += 3;
                    puntos[1] += 2;
                    Violett += 5;
                    break;
                case 2:
                    
                    puntos[0] += 3;
                    puntos[1] += 2;
                    break;
                case 3:
                    System.out.println("Violett al escuchar esto solo ríe incomoda y permanece callada por esta respuesta pero igual se sienta enseguida tuyo, al no querer dejarte solo/a.");
                    puntos[0] += 3;
                    puntos[1] += 2;
                    Violett -= 5;
                    break;
                default:
                    System.out.println("Opción no válida,repite bucle  ");
            }
            break;
        }while (!opV);
        
        System.out.println("Tarda unos segundos en poder dirigirte la palabra.");
        System.out.println("Tomando esto como una oportunidad para socializar contigo.");
        System.out.println("Violett: \" El grupo allá parece estar bastante animado, pero a veces prefiero un poco de paz y tranquilidad.");
        System.out.println("¿Tú también prefieres los momentos más tranquilos?");
                    System.out.println("");
                    System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("1.- Momento mas tranquilo");
        System.out.println("2.- prefiero estar en el centro de acción");
        System.out.println("--------------------------------------------");

        
        while (true){
            op1 = captu.nextInt();
            
            if (op1 ==1){
                System.out.println("Violett: Lo entiendo, algunas veces uno solo quiere tener un momento de tranquilidad, ");
                System.out.println("o solo disfruta de un momento conviviendo con si mismo. ");
                System.out.println("En lo personal a mi me encanta pasar tiempo con la gente, me hace sentir querida.");
                puntos[0] += 5;
                break;
            }
            else if (op1 == 2){
                System.out.println("Violett: ¡Ya veo…! Tal vez ahora solo prefieres tener un tiempo conviviendo contigo mismo/a, Entiendo, ");
                System.out.println("¡eres una persona de acción entonces! ¡Me gusta eso! Aunque a veces, tener un poco de tiempo a solas también es importante,");
                System.out.println("¿no crees? ¿Qué es lo que más te gusta hacer cuando estás en el centro de la acción?");
                puntos[1] += 5;
                break;
            } else{
                System.out.println("Opción no válida");
            }
        }
        
        System.out.println("Es interesante ver cómo Violett reconoce y acepta tus preferencias, incluso si difieren un poco de las suyas.");
        System.out.println("Su apertura y comprensión contribuyen a fortalecer la conexión entre ustedes.");
                    System.out.println("");
        System.out.println("La conversación fluye de manera natural, cada uno compartiendo sus intereses y pasiones, consolidando aún más el vínculo entre ustedes. ");
        System.out.println("La tarde transcurre en un agradable intercambio de historias y perspectivas, creando recuerdos que ambos atesorarán");
                    System.out.println("");
        System.out.println("Al final del día, mientras disfrutan de una puesta de sol, Violett te pregunta:");
        System.out.println("¿Cómo te sientes después de pasar tiempo interactuando socialmente con amigos o conocidos?");
                    System.out.println("");
                    System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("1.- Energizado/a y rejuvenecido/a.");
        System.out.println("2.- Normal, sin cambios significativos.");
        System.out.println("3.- Un poco cansado/a pero contento/a.");
        System.out.println("4.- Agotado/a y abrumado/a.");
        System.out.println("------------------------------------------");

        
        do{
            op1 = captu.nextInt();
            
            switch (op1){
                case 1 :
                    System.out.println("");
                    puntos[1] += 5;
                    break;
                case 2:
                    System.out.println("");
                    puntos[0] += 3;
                    puntos[1] += 3;
                    break;
                case 3:
                    System.out.println("");
                    puntos[0] += 4;
                    puntos[1] += 2;
                    break;
                case 4:
                    System.out.println("");
                    puntos[0] += 5;
                    break;
                default:
                    System.out.println("");
            }
            break;
        }
        while (!opV);
        
        System.out.println("Mientras la tarde se convierte en noche y las estrellas comienzan a aparecer,");
        System.out.println("Violett, con una sonrisa curiosa, te hace otra pregunta para conocerte mejor:");
        System.out.println("¿Disfrutas más de actividades en solitario o en grupos pequeños?");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1.- Disfruto más de actividades en solitario.");
        System.out.println("2.- Prefiero actividades en grupos pequeños.");
        System.out.println("3.- Disfruto tanto de actividades en solitario como en grupos pequeños.");
        System.out.println("4.- Depende del tipo de actividad y mi estado de ánimo en ese momento.");
        System.out.println("---------------------------------------------------------------------------");

        
        do{
            op1 = captu.nextInt();
            
            switch (op1){
                case 1 :
                    System.out.println("");
                    puntos[0] += 5;
                    break;
                case 2:
                    System.out.println("");
                    puntos[0] += 3;
                    puntos[1] += 2;
                    break;
                case 3:
                    System.out.println("");
                    puntos[0] += 3;
                    puntos[1] += 3;
                    break;
                case 4:
                    System.out.println("");
                    puntos[0] += 3;
                    puntos[1] += 3;
                    break;
                default:
                    System.out.println("");
            }
            break;
        }
        while (!opV);
        
        System.out.println("Violett asiente, comprendiendo tus palabras. \"Eso tiene mucho sentido.");
        System.out.println("Creo que es importante tener ese equilibrio y saber lo que uno necesita en cada momento.\"");
                    System.out.println("");
        System.out.println("La conversación fluye con naturalidad, y mientras el cielo se oscurece y las estrellas brillan más intensamente,");
        System.out.println(" Violett te hace otra pregunta para conocerte mejor.");
        System.out.println("\"¿Cuál es tu reacción ante eventos sociales muy concurridos y bulliciosos?\"");
                    System.out.println("");
                    System.out.println("");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1.- Me siento emocionado/a y energizado/a por la atmósfera animada.");
        System.out.println("2.- Me siento abrumado/a y prefiero encontrar un lugar más tranquilo.");
        System.out.println("3.- Me adapto fácilmente y disfruto de la diversidad de experiencias.");
        System.out.println("4.- Depende de mi nivel de comodidad y familiaridad con el entorno.");
                System.out.println("-----------------------------------------------------------------------------");

        
        do{
            op1 = captu.nextInt();
            
            switch (op1){
                case 1 :
                    System.out.println("");
                    puntos[1] += 5;
                    break;
                case 2:
                    System.out.println("");
                    puntos[0] += 5;
                    break;
                case 3:
                    System.out.println("");
                    puntos[0] += 2;
                    puntos[1] += 4;
                    break;
                case 4:
                    System.out.println("");
                    puntos[0] += 3;
                    puntos[1] += 3;
                    break;
                default:
                    System.out.println("");
            }
            break;
        }
        while (!opV);
        
        System.out.println("La conversación fluye con naturalidad, y mientras el cielo se oscurece y las estrellas brillan más intensamente");
        System.out.println("Violett te hace otra pregunta para conocerte mejor.");
        System.out.println("\"¿Cómo recargas tus energías después de un día ocupado?\"");
                    System.out.println("");
                    System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("1.- Pasando tiempo a solas para relajarme y recargar.");
        System.out.println("2.- Socializando con amigos o seres queridos.");
        System.out.println("3.- Haciendo ejercicio físico o practicando actividades al aire libre.");
        System.out.println("4.- Disfrutando de pasatiempos o actividades creativas que me gusten.");
        System.out.println("-------------------------------------------------------------------------");
        
         do{
            op1 = captu.nextInt();
            
            switch (op1){
                case 1 :
                    System.out.println("");
                    puntos[0] += 5;
                    break;
                case 2:
                    System.out.println("");
                    puntos[1] += 5;
                    break;
                case 3:
                    System.out.println("");
                    puntos[0] += 2;
                    puntos[1] += 4;
                    break;
                case 4:
                    System.out.println("");
                    puntos[0] += 3;
                    puntos[1] += 3;
                    break;
                default:
                    System.out.println("");
            }
            break;
        }
        while (!opV);
         
         System.out.println("Violett sonríe de nuevo. \"Entiendo perfectamente.");
         System.out.println("A veces, ese tiempo a solas es justo lo que necesitamos para recuperar nuestro equilibrio.\"");
         System.out.println("Pasáis el resto de la noche charlando bajo las estrellas, compartiendo historias y risas. ");
         System.out.println("La conexión entre vosotros se siente más fuerte y más profunda. ");
         System.out.println("La honestidad y la apertura de la conversación os han acercado aún más.");
         
         System.out.println("La conversación fluye con naturalidad, y mientras el cielo se oscurece y las estrellas brillan más intensamente, ");
         System.out.println("Violett te hace otra pregunta para conocerte mejor.");
         System.out.println("\"¿Cómo te sientes después de una semana intensa de trabajo o estudio?\"");
         
         System.out.println("Te tomas otro momento para pensar enates de responder.");
                    System.out.println("");
                    System.out.println("");
         System.out.println("---------------------------------------------------------------------");
         System.out.println("1.- Necesito pasar tiempo a solas para recargar mis energías.");
         System.out.println("2.- Me gusta salir y socializar para desconectar y relajarme.");
         System.out.println("---------------------------------------------------------------------");

         
         do{
            op1 = captu.nextInt();
            
            switch (op1){
                case 1 :
                    System.out.println("");
                    puntos[0] += 5;
                    break;
                case 2:
                    System.out.println("");
                    puntos[1] += 5;
                    break;
                default:
                    System.out.println("");
                    opV = false;
            }
            break;
        }
        while (!opV);
         
        System.out.println("Pasáis el resto de la noche charlando bajo las estrellas, compartiendo historias y risas. ");
        System.out.println("La conexión entre vosotros se siente más fuerte y más profunda.");
        System.out.println("La honestidad y la apertura de la conversación os han acercado aún más.");        
                    System.out.println("");
        System.out.println("Cuando finalmente es hora de despedirse, ambos sentís que habéis creado un lazo especial.");
        System.out.println("\"Gracias por este día,\" dices sinceramente. \"Ha sido increíble conocerte mejor.\"");
        System.out.println("\"Gracias a ti,\" responde Violett con una sonrisa brillante. \"Espero que tengamos muchas más conversaciones como esta.\"");
                    System.out.println("");
        System.out.println("Camináis juntos hasta el final del sendero, donde vuestros caminos se separan por la noche. ");
        System.out.println("Te alejas con una sensación de satisfacción y paz, sabiendo que has encontrado una conexión significativa y auténtica. ");
        System.out.println("Mientras miras las estrellas una última vez antes de irte a casa, sientes que el día ha sido verdaderamente especial,");
        System.out.println("lleno de momentos que atesorarás para siempre FIN.");
             break;
             
             default:
                System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4.");
                opV = false; // Opción no válida, repetir el bucle
                    break;
   }
            }while(!opV);   

                        
}

public static void fase2(Scanner captu, String nombre, int[] puntos, int Elena) {
int op1;
boolean opV = true;

    System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*");
                System.out.println("");
                System.out.println("");
                System.out.println("Bienvenido a la fase 2: El escudo del amanecer, *°" + nombre +"°*");
                System.out.println("");
                System.out.println("Elena: Hola ¿Eres nuevo en este pueblo verdad?,yo soy Elena mi labor en este pueblo es manternelo seguro,");
                System.out.println("¿Confías en tus corazonadas o prefieres basarte en datos y hechos correctos al tomar decisiones?  ya que al tomar la decision de estar en mi torre ");
                System.out.println("fue gracias a un presentimiento de que podría ayudar mas al pueblo. ");
                System.out.println("Parece ser que este es un tema que le entesuiasma a la chica, ya que cada que llegaba gente le gustaba hablar sobre todo aspecto de la torre y lo que le hacia sentir.");
                System.out.println("");
                System.out.println("");
            System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*");

                System.out.println("");
                System.out.println("");
             System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.println("1.Confío principalmente en mis corazonadas.");
                System.out.println("2.Prefiero basarme en datos y hechos concretos al tomar decisiones. ");
                System.out.println("3.Me gusta equilibrar ambas cosas, considerando tanto mis corazonadas como los datos disponibles.");
                System.out.println("4.Depende de la situación específica y de la importancia de la decisión. ");
            System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.println("");

    do{
        op1 = captu.nextInt();
        
            switch (op1) {
                case 1:
                    System.out.println("Elena: Entonces concordamos en una cosa.");
                    puntos[4] += 5;
                    break;
                case 2:
                    System.out.println("Elena:Me parece bastante bien hay personas a las que las estadísticas les gustan mas para no dar ningun paso en falso.");
                    puntos[5]+=5;
                    break;
                case 3:
                    System.out.println("Elena: Tienes razon, no todo es dejarse llevar por una corazonada, aveces si es necesario revisar los datos del problema.");
                    puntos[4]+=3;
                    puntos[5]+=2;

                    break;
                case 4:
                    System.out.println("Elena: Es una respuesta algo vaga... Pero igual tiene sentido que no siempre te dejes guiar por el corazon.");
                    puntos[4]+=2;
                    puntos[5]+=3;
                    break;
                default: 
                    System.out.println("opción invalida");
                    opV = false;
                    break;
            }
            
        }while(!opV);

        System.out.println("");
            System.out.println("Elena: Lamento entrar tan apresurado a la converssacion, regularmente no hay visitas en este lugar... Es un poco solitario pero aun asi es interesante lo que uno puede descubrir de los nuevos.");
            System.out.println( nombre + ",es un nombre interesante.");
            System.out.println("Al decir esto te da mas curiosidad de los misterios que pueda ocultar esta chica.");
            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------------");
            System.out.println("1.- ¿Como sabes mi nombre?");
            System.out.println("2.- ¿Que sabes de este lugar?"); //Sube relación
            System.out.println("-----------------------------");
            System.out.println("");
            
        
        
        while(true){
            op1 = captu.nextInt();
        
            if (op1 == 1) { //Como sabes mi nombre
                    System.out.println("");
                    break;
            }
            else if(op1 == 2){ //Que sabes de este lugar
                System.out.println("");
                Elena+=5;
                break;
             }else{
                    System.out.println("Opción no válida");
            }
        }
      
            System.out.println("Elena: Uno se entera de muchas cosas cuando esta solo...");
            System.out.println("Dice con una leve sonrisa mientras te invitaba con una seña a acercarte a un sillón donde se podía observar la vista del mar, notándose el atardecer de ese lugar. ");
            System.out.println("Elena: ¿Porqué estas aqui?¿Acaso es por un proyecto? Casi siempre la gente viene por eso.");
            System.out.println("");
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("1.Asi es, vengo por un proyecto."); //Sube relación
            System.out.println("2.No, solo vine por curiosidad"); //Baja Relación
            System.out.println("------------------------------------------------");
            
            
        while(true){

            op1 = captu.nextInt();

            if(op1 == 1){
                Elena =- 5;
                break;
            }
            else if(op1 == 2){
                Elena =+ 5;
                break;
            }else{
                System.out.println("Opción invalida.");
}
}
            System.out.println("Elena solo asiente entendiendo la situación, para después observar a su nueva visita.");
            System.out.println("Elena: Ahora me surgió la curiosidad ¿Cómo sueles planificar tus actividades o proyectos? ¿Sigues una estructura detallada o confías en la improvisación?");
            
            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println("1. Sigo una estructura detallada al planificar mis actividades o proyectos.");
            System.out.println("2. Confío en la improvisación y adapto mi enfoque según surjan las circunstancias.");
            System.out.println("3. Me gusta tener un plan general pero estar abierto/a a ajustes según sea   necesario.");
            System.out.println("4. Combino ambos enfoques: tengo un plan inicial pero estoy dispuesto/a a  improvisar según se requiera.");
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println("");
            
do{
    
    op1 = captu.nextInt();
    
           switch(op1){
              case 1:
                System.out.println("Elena: Opino lo mismo, soy una persona bastante organizada, no me gusta dejar ningun detalle de lado.");
                    puntos[5]+=5;
              break;
              
              case 2:
                System.out.println("Elena: Esa tambien es una opción, las personas verrsatiles les  tengo una gran admiración.");
                    puntos[4]+=5;
               break;
              case 3:
                System.out.println("Elena: ¡Es bueno ser así no cerrarte a los cambios y adaptarte a ellos!");
                    puntos[4]+=2;
                    puntos[5]+=3;
              break;
              case 4:
                System.out.println("Elena: siempre hay que tener un orden, pero nunca se sabe que puede pasar ¿verdad?");
                    puntos[4]+=3;
                    puntos[5]+=2;
             break;  
            default:
               System.out.println("Opción invalida.");
               opV = false;
               break;
} 
}while (!opV);

            System.out.println(nombre +": ¿Qué es lo que usualmente haces en esta torre?");
            System.out.println("");
            System.out.println("Preguntaste con algo de curiosidad, acercándote hacia la chica. Quien seguía viendo el paisaje de siempre.");
            System.out.println("Elena: Ven acompáñame a vigilar un rato, ves el rio que divide la aldea de los huertos, siempre hemos intentado saber como cruzar mejor los alimentos tal ves un puente mas grande nos sirva ¿no?");
            System.out.println("o ¿Eres de esas personas que no se enfoca mucho en las ideas y posibilidades futuras?");

            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.- Me llama más la atención los detalles específicos.");
            System.out.println("2.- Te interesan más las ideas y posibilidades futuras."); 
            System.out.println("3.- Disfruto de ambos, pero depende del contexto."); 
            System.out.println("------------------------------------------------------------");

do{            
    op1 = captu.nextInt();

         switch(op1){

            case 1:
            System.out.println(nombre + ": Me llama mas la atención los detalles específicos.  ");
            puntos[5]+=5;
            break;
            case 2:     
        System.out.println(nombre + ": Opino lo mismo que tu, me interesa las ideas y posibilidades del futuro.");
           puntos[4]+=5;
           break;
            case 3:
        System.out.println(nombre + ": Disfruto de ambos, siento que depende mucho del contexto.");
          puntos[4]+=3;
          puntos[5]+=2; 
          break;
          default:
          System.out.println("Opción invalida");
          opV = false;
          break;
    }

}while(!opV);

        System.out.println("Elena: Lo entiendo, todos tienen diferentes formas de pensar.");
        System.out.println("Dice algo pensativa al ver de nuevo donde se localizaba aquel rio. Ambos se encontraron en un silencio por momentos, ocasionando que esta solo te sonriera. ");
        System.out.println("Elena: Lo lamento, no suelo tener visitas tan seguido... Estoy mas cómoda con el silencio.");
        System.out.println("");
        System.out.println("");        

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("1. Me gusta el silencio también."); //+3 Introvertido y +5 Relacion Elena
        System.out.println("2. No me gusta estar en silencio."); // +3 Extrovertido
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("");

while(true){
        if (op1 == 1){
        System.out.println(" No te preocupes por eso, también soy una persona que le agrada el silencio.");
        break;
}
        else if(op1 == 2){       
        System.out.println(nombre + ": No me gusta estar en silencio, pero no me molesta acompañarte si lo prefieres.");
        System.out.println("Elena solo se rie por esto algo nerviosa, parece ser que fue suficiente para poner la conversación mas comoda."); //+5 Relación"
            Elena =+ 5;
        break;
}else{
            System.out.println("Opción invalida");
            break;
}
        
}
            
        System.out.println("Aun así, Elena quería seguir una conversación, tal vez solo para tener un tiempo con alguien nuevo.");
        System.out.println("Elena:... Entonces, ¿Qué tipo de conversación te llama mas la atención? como.. anécdotas y experiencias concretas o ideas abstractas y reflexiones profundas.");
        System.out.println("");
        System.out.println("");
        
        System.out.println("----------------------------------------------------------------------------");
            System.out.println("1. Anécdotas y experiencias concretas que ilustren puntos específicos.");
            System.out.println("2. Ideas abstractas y reflexiones profundas que generen discusión y reflexión");
            System.out.println("3. Disfruto de ambos aspectos, dependiendo del tema y el contexto");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("");
        
do{

op1 = captu.nextInt();

switch(op1){
        case 1:
        System.out.println(nombre + "Me gusta hablar de anecdotas o experinecias de mi vida. Siento que asi puedo llegar a llevar una mejor conversación");
        System.out.println("Elena solo asiente mientras ibas respondiendo su pregunta queriendo encontrar algun tipo de anecdota que tuviera ¿Por cual empezar?");
        System.out.println("Elena: Algun tema que te podria interesar seria la vez.. ");
        System.out.println("Momento de suspenso, literal se quedo callada para poner ambiente");
        System.out.println("Elena: Fue la vez que encontré unas estatuas en la biblioteca de los fundadores.");
        
        break;
        case 2:     
        System.out.println("Me gusta sacar de conversación de cualquier tema que te haga profundizar al punto de hacerte dudar de hasta tu propia existancia");
        System.out.println("Elena: ¿Algo profundo? volvió a repetir para si misma para encontrar algun tema similar");
        System.out.println("Elena: ¿Crees en los fantasmas? Pregunta con curiosidad, volviendo sus grandes ojos hacia ti");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("1.No");
        System.out.println("2.Si");
        System.out.println("-------------------");
       
        while(true){
            
        op1 = captu.nextInt();
        
        if (op1 == 1){
        System.out.println(nombre + ": No lo se me parece algo bastante dificil de creer.");
        Elena -= 5;
        System.out.println("");
        break;
        }
        else if(op1 == 2){
        System.out.println(nombre + ": Es algo desconocido pero curiosamente entretenido de pensar que pueda ser posible. ");
        
        break;
        }else{
            System.out.println("Opción no valida.");
        }
}
        break;
        
        case 3:
        System.out.println("Depende, realmente solo voy siguiendo la conversación como va saliendo");
        System.out.println("Elena: Mhh.. bueno tengo unas cuantas historias que podrían interesarte.");
        break;
        
        default:
            System.out.println("Opción invalida.");
            opV = false;
        break;
}
}while(!opV);

        System.out.println("");
        
        System.out.println("El ambiente ahora se torno mas oscuro, cuando Elena empezo a contar su historia.");
        System.out.println("Elena: Este pueblo guarda varios secretos, entre ellos se dice que en la misma biblioteca del pueblo, fue construida al mismo tiempo en que se fundo MirrorTown. Con eso, se puede llegar que tienen registros de cada aspecto de aquí..");
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("1.- Quedarse callada/o");
        System.out.println("2.- Eso que tiene de misterioso");
        System.out.println("----------------------------------");
        System.out.println("");
        
        while(true){
        op1 = captu.nextInt();    
        
        if (op1 == 1){
        
                System.out.println("Decidiste guardar silencio, escuchando atentamete a cada aspecto que te decia Elena. ");
                System.out.println("Quien apreciaba que le prestaras tanta atención en su historia. ");
                Elena += 5;
                break;
            }
            else if (op1 == 2){
                System.out.println("Elena no le pareció agradarle tu comentario,");
                System.out.println("viendo esto tu solo hiciste un ademan con la mano para invitarla a continuar con la historia.");
                System.out.println("Aun así le pareció poco amable tu actitud.");  
                Elena -= 5;
                    break;
        }else{
                System.out.println("Opciòn invalidad.");
                }
        }
    
        System.out.println("Elena: Bueno, al escuchar ese rumor, decidí probarlo por mi misma.");
        System.out.println("Dice con una determinación en sus ojos, incluso algo emocionada al recordar todo este acontecimiento.");
        System.out.println("Elena: Cuando llegue, no pude evitar sentirme algo ansiosa.");
        System.out.println("La chica solo volvio a sonreir algo timida, mientras volvia su mirada al paisaje");
        System.out.println("Elena: Tiene sentido ¿No? o ¿Como te sentirias al enfretarte a situaciones nuevas o a lo desconocido?");
        
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("1.Emocionado/a y motivado/a por el desafío.");
        System.out.println("2.Ansioso/a y nervioso/a por la incertidumbre.");
        System.out.println("3.Curioso/a y dispuesto/a a aprender.");
        System.out.println("-------------------------------------------------");
        
do{
         op1 = captu.nextInt();
         switch (op1){
          
             case 1:
                 System.out.println("Elena: ¿Emocionado/a? Creo que entonces eres un poco mas aventurera/o que yo.");
                 puntos[4]+=5;
                 break;
             case 2:
                 System.out.println("Elena: Se siente bien no ser la única.");
                 System.out.println("Dice en un suspiro, aun manteniendo aquella sonrisa de antes, incluso sintiéndose mas cómoda por tu respuesta.");
                 puntos[5]+=5;
                 break;
             case 3:
                 System.out.println("Elena: Eso parece una respuesta de todo un gran reportero. Siempre es emocionante aprender algo nuevo.");
                 puntos[4]+=3;
                 puntos[5]+=2;
                 break;
             default:
                 System.out.println("Opción invalida.");
               opV = false;
               break;
         }
}while(!opV);

    System.out.println("");
                 
     System.out.println(nombre + ":Pero entonces ¿Qué paso?¿Encontraste algo?");
      System.out.println("Elena niega con la cabeza algo desanimada, aun algo triste por no poder resolver aquel misterio.");
     System.out.println("Elena: No realmente no pude encontrarlo, y lo peor es que no pude salir de la biblioteca hasta la mañana siguiente. Fue hasta que llego la noche que apareció esa voz... La verdad me dio mucho miedo, no sabia que hacer asi que solo la segui, se detuvo hasta lo que eran unas estatuas.");
    System.out.println("");
    System.out.println("");
    System.out.println("------------------------------------");
    System.out.println("1. "+ nombre + "¿Que calse de estatuas?");
    System.out.println("2. "+ nombre + ": ¿Una voz?");
    System.out.println("-----------------------------------");
do{
    op1 = captu.nextInt();
switch (op1){
case 1:
System.out.println("Elena: Estatuas de los mismo fundadores de MirrorTown. Creo que estan bastantes abandonados, se encontraban algo descuidados");
System.out.println("Unas estatuas abandonadas, podría ser  por algún tipo de descuido por parte de los dueños, o algo mucho mas interesante que ello");
break;
case 2:
System.out.println("Elena: Si era incluso como escuchar tu propio subconsciente. Se que suena algo tonto, pero realmente era como escucharme a mi misma");
System.out.println("Esto fue un dato algo peculiar, ya que si parecía toda una historia de fantasmas.");
break;
default:
System.out.println("opcion no valida");
        opV = false;
        break;
}
}while(!opV);

System.out.println("Elena: Decidí empezar a acercarme a aquellas estatuas, donde se encontraba esa voz.");
System.out.println("Lo único que encontré cerca de ahí, fueron libros de la historia de siempre.");
System.out.println("Por un momento la chica se quedo pensando, como si estuviera recordando aquel día. Parece ser que quería darte todo detalle posible.");
System.out.println("Elena: No me sentí lista de hacerlo, no lo se, fue algo que se sentía muy intimo.");
System.out.println("Elena: Suelo resolver todo mediante una solución creativa o como me va guiando mi imaginación. ");
System.out.println("Pero mi mente estaba en blanco. ¿Sabes a lo que me refiero? o ¿Eres mas del estilo pragmático y practico?");
    System.out.println("");
    System.out.println("");
    System.out.println("-----------------------------------------------------------------------------------");
   System.out.println("1.Pragmático y práctico, enfocado en encontrar soluciones directas y  efectivas.");
   System.out.println("2.Imaginativo y creativo, buscando enfoques novedosos y fuera de lo común.");
   System.out.println("3.Una combinación de ambos, dependiendo de la naturaleza del problema.");
   System.out.println("4.Flexible, adaptándome al problema y empleando diferentes enfoques según  sea necesario.");
    System.out.println("-----------------------------------------------------------------------------------");

//opciones 
do{
switch(op1){
case 1:
    puntos[5]+=5;
break;
case 2:
    puntos[4]+=5;
break;
case 3:
  puntos[4]+=3;
  puntos[5]+=3;
break;
default:
    System.out.println("Opción invalida");
    opV = false;
   break; 
}
}while(!opV);

System.out.println("Elena: Entonces tal vez puedas conseguir abrir aquel lugar");
System.out.println("Sonara cursi pero solo sigue lo que dicta tu alma interior.");
System.out.println("Con estas palabras, se quedan en silencio. ");
System.out.println("No era un silencio incomodo, incluso podías sentir como esto era un lugar cómodo y incluso hogareño");
System.out.println("Finalmente el sonido del agua chocando contra las rocas del lugar te ayudo a descansar, cayendo dormido en minutos,");
System.out.println("y con eso el fin de tu interacción con Elena, la vigilante de MirrorTown.");
        
}
                    
public static void fase3(Scanner captu, String nombre, int[] puntos, int Irving) {
//Variables de las opciones
int op1;
boolean opV = true;

                System.out.println("Bienvenido a la fase 3 " + nombre);
                System.out.println("MirroTown es bastante grande por lo que resulta difícil decidir por donde empezar, ya que esto te sumerge como si estuvieras atrapado en un acuario sin fin. Pero finalmente decidiste dar una vuelta por los locales. ");
                System.out.println("¿Por cuál lugar quieres entrar?");
                System.out.println("");
                System.out.println("--------------------------");
                System.out.println("1.- La plaza principal.");
                System.out.println("2.- El mirador.");
                System.out.println("--------------------------");
                System.out.println("");
                
    do{        
        op1 = captu.nextInt ();
               
        switch (op1) {
            //***************PLAZA PRINCIPAL*******************
            case 1:
            System.out.println("La Plaza Principal: Este lugar podría representar un sentido de comunidad y conexión.");
            System.out.println("Es un punto de encuentro donde la gente se reúne para socializar, compartir historias y disfrutar de la vida en el pueblo. ");
            System.out.println("Entrar aquí podría simbolizar un deseo de pertenencia y conexión con los demás habitantes del pueblo.");
            
            System.out.println("");
            
            System.out.println("Nuestro intrépido explorador, que llamaremos Irving, se encuentra ante la encrucijada de elegir por dónde comenzar su aventura en el pueblo de Tulipán. ");
            System.out.println("Su espíritu aventurero y curioso lo lleva a inclinarse por la opción que promete una experiencia más social y vibrante: la Plaza Principal.");
            System.out.println("Con paso decidido y una sonrisa juguetona en el rostro, Irving se adentra en la bulliciosa plaza, donde los colores, sonidos y aromas se entrelazan en una danza encantadora. ");
            System.out.println("Observa a su alrededor con ojos ávidos de descubrimientos, preguntándose qué historias y secretos aguardan entre los habitantes del pueblo.");
            
            System.out.println("");
            
            System.out.println("Los usuarios se reconoce a sí mismos como uno viajeros guiados tanto por la cabeza como por el corazón.");
            System.out.println("Sus decisiones suelen ser una amalgama de lógica y emoción, una danza equilibrada entre la razón y la pasión que les permite enfrentarse a los desafíos con una mente clara y un corazón valiente.");
            System.out.println("Entonces, pregunta Irving al enfrentarse a una decisión importante, ");
            System.out.println("¿Qué aspecto priorizan la lógica y los hechos o los valores y sentimientos personales? ");
            
            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.-La logica y los hechos");//Sentimiento +5
            System.out.println("2.- Valores y sentimientos personales");//pensamiento +5
            System.out.println("3.- Ambos aspectos por igual");//pensamiento +3 y sentimiento +3
            System.out.println("4.- Depende del contexto específico y la naturaleza de la decisión que esté enfrentando. ");//pensamiento y senitimiento +3
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("");
            

            do{
               op1 = captu.nextInt();
            switch (op1) {
        case 1:
          System.out.println("Valorar la importancia de tomar decisiones informadas y basadas en datos concretos. Esto les permite abordar los desafíos de manera objetiva y resolver problemas de manera eficiente.");
          puntos[7] += 5;
            break;
        case 2:
          System.out.println("Para ustedes, la autenticidad y la integridad son pilares fundamentales en sus vidas. ");
          System.out.println("Consideran cómo sus decisiones afectarán no solo a ustedes, sino también a los demás y a su entorno. ");
          System.out.println("Sus emociones y principios guían sus elecciones, asegurándose de que estén alineadas con lo que realmente valoran en la vida.");
          puntos[6] += 5;
            break;
        case 3:
          System.out.println("Ustedes busca un equilibrio entre la lógica y la consideración de sus valores y sentimientos.");
          System.out.println("Reconocen la importancia de mantener una mente abierta y flexible, capaz de adaptarse a diferentes situaciones y desafíos. ");
          System.out.println("Este  enfoque te permite tomar decisiones informadas sin perder de vista su brújula moral y emocional.");
          puntos[7] += 3;
          puntos[6] += 3;
                  
            break;
        case 4:
          System.out.println("Ustedes entiende que cada situación es única y requiere un enfoque diferente.");
          System.out.println("Evalúan cuidadosamente el contexto y las circunstancias antes de tomar una decisión, adaptando su enfoque según sea necesario para lograr el mejor resultado posible.");
          puntos[7] += 3;
          puntos[6] += 3;
            break;
        default:
            System.out.println("Opción invalida");
            opV = false;
            break;
    }
}while(!opV);   

            System.out.println("");
            System.out.println("");

            System.out.println("Con su mente ágil y su corazon valiente, estan listos para sumegirse en las maravillas que aguardan en la Plaza Principal de MirrorTown");
            System.out.println("Está aventura apenas comienza, y me imagino que todos están ansiosos por descrubir qué sorpresas le depara el destino");

            System.out.println("");

            System.out.println("ustedes exploradores, se encuentran ahora en la inmersa bulliciosa Plaza Principal de MirrorTown. ");
            System.out.println("Sus ojos curiosos se iluminan con cada detalle que captura su atención, mientras se mezclan con la multitud animada que llena el lugar con risas y conversaciones animadas.");

            System.out.println("");

            System.out.println("De repente, mientras observan una colorida exhibición de artesanías locales, escucha un susurro de angustia proveniente de un rincón cercano. ");
            System.out.println("Intrigados, se dirigen hacia el origen del sonido y encuentra a una anciana sentada en un banco, con lágrimas en los ojos y un gesto de preocupación en su rostro arrugado.");
            System.out.println("¿Cómo abordar esta situación delicada? Considerando los sentimientos de la anciana.");

            System.out.println("");
            System.out.println("");

            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("1.- Principalmente mis propios sentimientos y necesidades."); //pnesamiento +5
            System.out.println("2.- Tanto mis propios sentimientos como los de los demás, tratando de equilibrar ambas perspectivas");//pensamiento y sentimiento +3
            System.out.println("3.- Principalmente los sentimientos de los demás, priorizando su bienestar emocional. ");//sentimiento +5
            System.out.println("4.- Depende del contexto y la relevancia de los sentimientos involucrados en la situación específica. "); //sentimiento y pensamiento +3
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("");
        
        do{
            op1 = captu.nextInt();
            switch(op1){
            case 1:
                System.out.println("Podrían optar por priorizar sus propias emociones y necesidades en esta situación. ");
                System.out.println("Quizás se sienta incómodos al intervenir en la vida personal de un extraño y prefierir mantenerse al margen.");
                System.out.println("");
                puntos[6]+= 5;
            break;
            case 2:
                System.out.println("Reconociendo la importancia de la empatía y la compasión, eligen adoptar un enfoque equilibrado.");
                System.out.println("Considerando sus propias emociones y necesidades, pero también se esfuerza por comprender y atender los sentimientos de la anciana.");
                System.out.println("");
                puntos[6]+= 3;
                puntos[7]+= 3;
                        
            break;
            case 3:
                System.out.println("Deciden centrarse en los sentimientos de la anciana, colocando su bienestar emocional en primer plano.");
                System.out.println("Están dispuesto a sacrificar sus propias comodidades y preocupaciones para ayudarla en su momento de necesidad.");
                System.out.println("");
                puntos[7]+= 5;
            break;
            case 4:
                System.out.println("Reconociendo la complejidad de la situación, eligen evaluar cada elemento con cuidado antes de tomar una decisión.");
                System.out.println("Considerando tanto sus propios sentimientos como los de la anciana, así como el contexto general de la situación.");
                System.out.println("");
                puntos[7]+= 3;
                puntos[6]+= 3;
            break;
            default:
            System.out.println("Opción invalida.");
            opV = false;
            }
        }while(!opV);

            System.out.println("");
            System.out.println("Con su corazon compasivo y su mente perspicaz, ustedes se nfrentan a un dilema moral en la Plaza Principal de Tulipán. ");
            System.out.println("¿Cómo decidirán actuar y qué impacto tendrá su elección en la anciana y en su propia aventura? ");
                System.out.println("");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1.Acercarse con delicadeza a la anciana"); //Pensamiento +5
            System.out.println("2.Actuar con empatía y solidaridad");// pensamiento y sentimiento +3
            System.out.println("3.Actuar con rapidez y eficacia en ayudarla con los recursos disponibles.");//sentimientno +5
            System.out.println("4.Dar espacio a la anciana para que procese sus emociones a su propio ritmo.");//sentimiento y pensamiento +3
            System.out.println("-------------------------------------------------------------------------------");
                System.out.println("");

do{
            op1 = captu.nextInt();
            switch (op1){
                case 1:
                System.out.println("Decide acercarse con delicadeza a la anciana ofreciendole una sonrisa amable y unas palabras reconfortantes.");
                System.out.println("Le ofrece su ayuda sin imponerse, permitiendo que la anciana decida si desea compartir su carga emocional. ");
                System.out.println(" Su acto de compasión genera un vínculo humano genuino, trayendo consuelo tanto a la anciana como a ustedes mismos.");
                System.out.println("");
                puntos[6] += 5;
                break;
                
                case 2:
                System.out.println("Al observar la angustia de la anciana,  Eligen actuar con empatía y solidaridad. ");
                System.out.println("Se sientan a su lado y le ofrecen su apoyo incondicional, escuchando atentamente sus preocupaciones y ofreciendo palabras de aliento. ");
                System.out.println("Sus intervenciones no solo alivian el sufrimiento de la anciana, sino que también fortalece su conexión con la comunidad de Tulipán.");
                System.out.println("");
                puntos[6]+=3;
                puntos[7]+=3;
                break;
                
                case 3:
                System.out.println("Con su corazón compasivo y mente ágil, perciben la necesidad de la anciana y deciden actuar con rapidez y eficacia. ");
                System.out.println("Identifican recursos y servicios disponibles en el pueblo que puedan ayudar a la anciana a superar sus dificultades. ");
                System.out.println("Con determinación, guían a la anciana hacia el apoyo que necesita, asegurándose de que no esté sola en su lucha.");
                System.out.println("");
                puntos[7]+=5;
                break;
                
                case 4:
                System.out.println("Con sensibilidad y respeto, Eligen dar espacio a la anciana para que procese sus emociones a su propio ritmo. ");
                System.out.println("Reconociendo la importancia de la autonomía y la dignidad, se mantienen cerca para brindar apoyo si es necesario, pero respetan los límites de la anciana. ");
                System.out.println("Sus enfoques permiten que la anciana recupere el control de su situación, fortaleciendo su sentido de empoderamiento y autoestima.");
                puntos[6]+=3;
                puntos[7]+=3;
                break;
                
                default:
                System.out.println("Opción invalida.");
                opV = false;
            }
}while(!opV);


            System.out.println("");
            
            System.out.println("Irving, el aventurero intrépido, les plantea otra situación un poco mas extrema, donde se lanzan desde un avión sobre el exuberante paisaje de Mirrortown,");
            System.out.println("con el viento rugiendo en sus oídos y la adrenalina bombeando por sus venas.");
            System.out.println("El cielo se extiende infinitamente ante ustedes, y su corazón late con emoción mientras se preparan para abrir sus  paracaídas y aterrizar en tierra firme.");
            
            System.out.println("");
            
            System.out.println("Sin embargo, justo cuando ustedes se disponen a desplegar sus paracaídas, una ráfaga de viento inesperada los desvía de su curso planeado.");
            System.out.println("Sienten el corazón en la garganta mientras luchan por mantener el control de su descenso, sus mentes divididas entre el instinto de supervivencia y la necesidad de mantener la calma.");
            System.out.println("");
            System.out.println("En medio de la crisis, Irving les plantea una pregunta crucial:");
            System.out.println("¿Qué le resulta más difícil: ser objetivo y analítico o tener en cuenta las emociones y relaciones interpersonales?");
            System.out.println("");
            System.out.println("");
            
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("1.- Ser objetivo y analítico, separando mis emociones de la situación."); //Pensamiento +5
            System.out.println("2.- Tener en cuenta las emociones y relaciones interpersonales, especialmente 	al tomar decisiones. "); //Sentimiento +5
            System.out.println("3.- Ambos aspectos pueden presentar desafíos en diferentes situaciones. "); //pensamiento y sentimiento +3
            System.out.println("4.- Depende del contexto específico y las circunstancias involucradas. ");//Pensamiento y sentimiento +3
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("");
    do{        
            op1 = captu.nextInt();
            switch(op1){
                case 1:
                System.out.println("Mantener la objetividad y el análisis en  momentos de crisis puede ser un desafio");
                System.out.println("Sus mentes están inundadas de emociones y adrenalina, lo que les dificulta mantener la calma y tomar decisiones racionales.");
                System.out.println("A pesar del desafío que representa mantener la objetividad en medio de la crisis, se aferran a su entrenamiento y experiencia");
                System.out.println("Conscientes de que las emociones pueden nublar su juicio, hacen un esfuerzo consciente por separar sus sntimientos de la situación.");
                System.out.println("Pero saben que solo tomando decisiones racionales podrán encontrar una solución segura");
                puntos[6]+= 5;
                break;
            
                case 2:
                System.out.println("A pesar de la gravedad de la situacion, reconocen la importancia de mantenerse conectados con sus emociones y considerar cómo sus acciones afectarán a los demás.");
                System.out.println("La seguridada y el bienestar de todos son sus prioridades principales");
                System.out.println("Mientras la adrenalina bombea por sus venas, no pueden evitar sentir empatía por aquellos que podrían verse afectados por sus acciones.");
                System.out.println("Reconoce que, en momentos de crisis, las relaciones interpersonales son fundamentales.");
                System.out.println("Su prioridad es asegurarse de que todos estén a salvo, inclusivo si eso significa ponerse en riesgo.");
                puntos[7]+=5;
            break;
                case 3:
                System.out.println("Ustedes pueden comprende que tanto la objetividad como la consideración de las emociones son habilidades vitales en momentos de crisis.");
                System.out.println("Adaptarse a las circunstancias cambiantes y equilibrar estos dos aspectos pueden ser un desafío, pero están dispuestos a enfrentarlo con valentía.");
                System.out.println("El equilibrio entre la objetividad y las emociones es como caminar por una cuerda floja.");
                System.out.println("Con cada paso, se esfuerzan por mantenerse firme y centrados, sabiendo que un solo desliz puede llevarlos al abismo. ");
                System.out.println(" Aunque la tarea es desafiante, están decididos a enfrentarla con valentía y determinación.");
                puntos[6]+= 3;
                puntos[7]+= 3;
            break;
                case 4:
                System.out.println("Reconociendo la complejidad de la situación, entienden que no hay una respuesta única para cada situación.");
                System.out.println("Evalúan cuidadosamente el contexto y las circunstancias antes de determinar cómo abordar la crisis, priorizando la seguridad y el bienestar de todos los involucrados.");
                System.out.println("Reconociendo la complejidad del panorama frente a él, comprenden que no existe una solución fácil.");
                System.out.println("Se sumergen en una reflexión profunda, evaluando meticulosamente cada aspecto de la situación.");
                System.out.println("Conscientes de que cada decisión tiene consecuencias, se toman su tiempo para considerar todas las opciones antes de actuar.");
                puntos[6]+= 3;
                puntos[7]+= 3;
                break;
                default:
                System.out.println("Opción invalida.");
                opV = false;
            }
}while (!opV);
            System.out.println("");
            System.out.println("");

            System.out.println("Irving les dice que la mejor opción para enfrentar esta situación es mantener la objetividad y el análisis, separando sus emociones de la situación.");
            System.out.println("¡Qué valentía! A pesar de la avalancha de emociones que lo embarga, Ustedes se sumerge en una mentalidad de concentración y calma, listos para abordar cada desafío con una mente clara y racional.");
            System.out.println("Con una sonrisa en el rostro y una mirada determinada, se enfrentan al desafío con entusiasmo y determinación. ");
            System.out.println("¡Nadie los detendrá en su camino hacia la seguridad y el éxito! En medio del caos, su espíritu aventurero brilla con una luz inquebrantable, inspirando a todos a su alrededor con su energía contagiosa y su valentía sin límites. ");

            System.out.println("");

            System.out.println("Después de aterrizar con éxito en el pueblo de MirrorTown, Son recibidos con celebración y elogios.");
            System.out.println("Los habitantes lo consideran unos héroes por su valentía y habilidad para mantener la calma en la crisis.");
            System.out.println("Se unen a la fiesta en la plaza principal, compartiendo risas y alegría con la comunidad.");
            System.out.println("Al final del día, se sienten en paz y felices por haber dejado una marca positiva en el pueblo.");
            System.out.println("Con una sonrisa en el rostro, saben que ha llegado a un final feliz en esta emocionante aventura.");

            System.out.println("");

            System.out.println("Durante la bulliciosa fiesta en el pueblo de MirrorTown, se encuantran en medio de la alegría y la algarabíq, disfrutando del ambiente festivo.");
            System.out.println("Sin embargo, en un momento dado, surge una situación insesperada que requiere de su atención.");
            System.out.println("Un desacuerdo entre dos gripos de vecinos estalla repentinamente, amenazando con ensombrecer la celebración");

            System.out.println("");

            System.out.println("Ante este nuevo desafío, Irving les pregunta:¿Cómo reaccionas cuando tus decisiones pueden afectar a los demás emocionalmente?");

            System.out.println("");
            System.out.println("");
          
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1.- Considerando cuidadosamente cómo comunicar mi decisión y tratando de minimizar cualquier impacto negativo. ");
            System.out.println("2.- Sintiendo empatía por las posibles emociones de los demás, pero priorizando lo que considero mejor en términos objetivos.");
            System.out.println("3.- Preocupándome por las emociones de los demás y tratando de encontrar una solución que satisfaga a todas las partes involucradas. ");
            System.out.println("4.- Tomando en cuenta las emociones de los demás, pero manteniendo mi enfoque en lo que creo que es lo correcto o necesario en la situación. ");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
    do{        
            op1 = captu.nextInt();
        switch(op1){    
            case 1:
                System.out.println("Tratan de calmar los ánimos y encontrar un terreno común entre las partes en conflicto, utilizando un tono comprensivo y tranquilizador.");
                puntos[6]+= 3;
                puntos[7]+= 3;
            break;
            case 2:
                System.out.println("Intentan separar las emociones del problema en sí, buscando una resolución basada en hechos y necesidades prácticas más que en sentimientos personales.");
                puntos[6]+= 4;
                puntos[7]+= 1;
           break;
            case 3:
                System.out.println("Busca un compromiso que tenga en cuenta los puntos de vista y preocupaciones de cada grupo, con la esperanza de restaurar la armonía en la comunidad.");
                puntos[6]+= 1;
                puntos[7]+= 4;
            break;
            case 4:
                System.out.println("Mantiene su postura firme en sus convicciones y valores, tomando decisiones basadas en lo que consideran necesario para resolver el conflicto, incluso si esto implica decepcionar a algunos.");
                puntos[6]+= 3;
                puntos[7]+= 3;
            break;
            default:
                System.out.println("Opción no valida.");
                opV = false;
        }
}while(!opV);
            System.out.println("");

            System.out.println("Ustedes proponen una solución que no solo reconcilia a las partes en conflicto, ¡sino que también las une en un espíritu de cooperación y armonía! ");
            System.out.println("Con palabras llenas de pasión y convicción, transmite su visión de un futuro donde todos puedan vivir en paz y prosperidad.");
            System.out.println("El pueblo estalla en aplausas mientras ustedes, los héroes de MirrorTown, celebran su victoria con una alegría contagiosa.");
            System.out.println("");
            System.out.println("");
            System.out.println("Irving:¡Qué emocionante es ver cómo una comunidad se une en momentos de adversidad, y qué maravilloso es saber que el espíritu de ustedes ha iluminado el camino hacia un futuro más brillante para todos en MirrorTown!");
        break;
        
//********************OPCIÓN 2 DEL DIAGRAMA.******************
            case 2:
            System.out.println("");

            System.out.println("El Mirador: En el corazón de MirrorTown, se alzaba imponente °||El Mirador||°. Era mucho más que una estructura; era el punto de encuentro de la comunidad.");
            System.out.println("Desde sus alturas, se podía contemplar el paisaje y compartir risas y sueños.");
            System.out.println("Para Muchos, el mirador es inspirador, se iluminaba con luces y música, celebrando la vida en la comunidad.");
            System.out.println("Con el tiempo, se convirtió en el símbolo de unidad y hogar entre amigos.");
            System.out.println("");
            System.out.println("Irving, un joven del pueblo, se encontraba en el Mirador, disfrutando de la vista y la brisa fresca que acariciaba su rostro.");
            System.out.println("Mientras contemplaba el horizonte, mientras unos amigos se acercan a el y entre la platica les preguntaba: ");
            System.out.println("¿Qué papel juegan las opiniones y expectativas de los demás en tus decisiones personales? ");
            System.out.println("");
            System.out.println("");

            System.out.println("-------------------");
            System.out.println("1.- Significativo");
            System.out.println("2.- Algún papel");
            System.out.println("3.- Mínimo");
            System.out.println("4.- Variable");
            System.out.println("-------------------");
            System.out.println("");
            
do{
            op1 = captu.nextInt();
            switch(op1){
                case 1:
                System.out.println("Consideran cuidadosamente las opiniones de los demás antes de decidir, especialmente si afectan a la comunidad.");
                System.out.println("Valoran el sentido de pertenecia y conexión con sus vecinos en MirrorTown");
                puntos[6]+= 4;
                puntos[7]+= 1;
            break;
                case 2:
                System.out.println("Tienen en cuenta las opiniones de los demás, pero no son determinates en sus decisiones finales.");
                System.out.println("Confín en su propia intuición y en lo que consideran mejor para ustedes mismos.");
                puntos[6]+= 3;
                puntos[7]+= 3;
            break;
                case 3:
                System.out.println("Valoran más su propia opinión y lo que consideran mejor para ustedes, regalando las opiniones de los demás a un papel secundario.");
                System.out.println("Confían en su propio citerio y en lo que le dicta su corazón.");
                
                puntos[7]+= 5;
            break;
                case 4:
                System.out.println("Reconocenn que la influencia de las opiniones externas en sus decisiones varían dependiendo del contexto y la importancia de la situación específica.");
                System.out.println("Esta flexibilidad les permite tomar decisiones de manera más consciente y equilibrada.");
                puntos[6]+= 3;
                puntos[7]+= 3;
                break;
                default:
                    System.out.println("Opción invalida.");
                    opV = false;
            }
}while(!opV);

            System.out.println("");
            System.out.println("Con esta conversación, Irving y sus amigos continuaron disfrutando de la vista desde el Mirador, compartiendo perspectivas y fortaleciendo los lazos de comunidad que tanto valoraban.");
            System.out.println("Irving, un joven del pueblo decide plantear una situación que pasa si tienen en cita en El Mirador, mientras disfrutan de la vista panorámica surgue una pregunta:");
            System.out.println("¿Cómo manejan los desacuerdos o diferencias de opinión con tu cita?.");
            System.out.println("");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1.- Buscan comprender sus perspectivas y tratando de encontrar un punto medio o una solución que nos satisfaga a ambos.");
            System.out.println("2.- Expresando respetuosamente mi opinión y escuchando activamente su punto de vista para llegar a un entendimiento mutuo.");
            System.out.println("3.- Manteniendo la calma y abordando los desacuerdos de manera constructiva, evitando confrontaciones innecesarias.");
            System.out.println("4.- Adaptándome al estilo de comunicación de mi cita y tratando de encontrar un terreno comun para resolver los desacuerdos de manera positiva.");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
do{            
             op1 = captu.nextInt();
            switch(op1){
               case 1:
               System.out.println("Expresas tu punto de vista con firmeza, mientras que tu pareja, en un intento por comprender tu perspectiva, busca encontrar un punto medio que satisfaciera a ambos.");
               System.out.println("Valorando la importancia de llegar a un concenso que fortalezca su conexión");
               System.out.println("");
               puntos[6]+= 3;
               puntos[7]+= 3;
               break;
               case 2:
               System.out.println("Cuando expresas tu opinión, te aseguras de hacerlo de manera respetuosa y escuchando atentamente el punto de vista de tu pareja.");
               System.out.println("Trabajan juntos para llegar a un entendimiento mutuo, reconociendo la validez de ambas perspectivas.");
               puntos[6]+= 4;
                puntos[7]+= 1;
           break;
               case 3:
               System.out.println("Frente al desacuerdo, ambos mantienen la calma y abordan la situación de manera constructiva.");
               System.out.println("Evitando confrontaciones innecesarias y enfocandose en encontrar soluciones para que fortalecieran su relación.");
               puntos[6]+= 3;
               puntos[7]+= 3;
           break;
               case 4:
               System.out.println("Están, conscientes de las diferencias en el estilo de comunicación de ambos, se adaptan al enfoque de su pareja y buscan un terreno común para resolver el desacuerdo de manera positiva.");
               System.out.println("Valorando la armonía en su relación y estar dispuestos a trabajar en equipo para superar cualquier obstáculo.");
               System.out.println("");
               puntos[6]+= 5;
           break;
               default:
                   System.out.println("Opción invalida.");
                   opV = false;
            }
}while(!opV);

            System.out.println("");
           System.out.println("Después Irving se reunió con sus amigas en el acogedor café del pueblo. Mientras campartían risas y anécdotas, surgió una pregunta que le intrigaba:");
           System.out.println("¿Qué tan importante es para cada uno que su cita sea honesta y directa?");
            System.out.println("-----------------------------------------------------------------------------------");
           System.out.println("1.- Valoro la transparencia y la sinceridad en las relaciones. ");
           System.out.println("2.- Creo que la comunicación abierta es esencial para construir confianza mutua. ");
           System.out.println("3.- Prefiero saber dónde estamos parados y qué piensa realmente mi cita.");
           System.out.println("4.- Todas las anteriores.");
           System.out.println("------------------------------------------------------------------------------------");
           System.out.println("");


    do{       
           op1 = captu.nextInt();
           switch(op1){
               case 1:
               System.out.println("Para mí, la transparencia y la sinceridad son fundamentales en una relación. No puedo imaginar estar con alguien que no sea honesto conmigo.");
               puntos[7]+= 5;
           break;
               case 2:
               System.out.println("Totalmente de acuerdo, la comunicación abierta es clave. Solo a través de esa honestidad podemos construir confianza mutua y comprendernos realmente.");
               puntos[6]+= 3;
               puntos[7]+= 3;
           break;
               case 3:
               System.out.println("Personalmente, prefiero saber dónde estamos parados y qué piensa realmente mi cita. La honestidad directa puede ser dura a veces, pero es mejor que la incertidumbre.");
               
               puntos[7]+= 5;
           break;
               case 4:
               System.out.println("Creo que todas las anteriores son importantes. La transparencia, la comunicación abierta y la sinceridad son pilares de una relación sólida. Sin ellas, ¿cómo podríamos realmente conectarnos con nuestra pareja?.");
               puntos[6]+= 5;
               puntos[7]+= 5;
           break;
               default:
                   System.out.println("Opción invalida.");
                   opV = false;
           }
}while(!opV);


            System.out.println("");
            
            System.out.println("En el cálido atardecer en Villa Esperanza, Irving reflexionaba sobre lo que más valoraba en una cita mientras paseaba por las pintorescas calles del pueblo. ");
            System.out.println("Se encontró con sus amigos en la plaza principal, donde decidieron sentarse en un banco y disfrutar de la serenidad del lugar antes de que el sol se ocultara por completo.");
            System.out.println("Irving: ¿qué opinan sobre los gestos de cortesía en una cita? ¿Prefieren aquellos basados en la razón o en la empatía y consideración?"); 
            
            System.out.println("");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("1.- La razón, como ser puntual y respetar los acuerdos previos.");
            System.out.println("2.- La empatía y consideración, como mostrar interés genuino por mis experiencias y sentimientos.");
            System.out.println("3.- Ambos aspectos son importantes para mí, pero valoro especialmente la empatía y la consideración.");
            System.out.println("4.- Depende del contexto específico y la naturaleza de la situación.");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("");
           
    do{
            op1 = captu.nextInt();
            switch(op1){
                case 1:
                System.out.println("Para mí, los gestos de cortesía basados en la razón son esenciales.");
                System.out.println("Cosas simples como ser puntual y respetar los acuerdos previos que muestran respeto por el tiempo y los compromisos de ambos.");
                puntos[6]+= 4;
                puntos[7]+= 1;
            break;
                case 2:
                System.out.println("Creo que la empatía y la consideración son igualmente importantes.");
                System.out.println("Mostrar interés genuino por las experiencias y sentimientos del otro crea una conexión más profunda y significativa en una cita.");
                puntos[6]+= 1;
                puntos[7]+= 4;
            break;
                case 3:
                System.out.println("Ambos aspectos son importantes, pero personalmente valoro especialmente la empatía y la consideración.");
                System.out.println("Es lo que realmente hace que una cita sea memorable y especial.");
                puntos[6]+= 3;
                puntos[7]+= 3;
            break;
                case 4:
                System.out.println("Depende del contexto específico y la naturaleza de la situación.");
                System.out.println("En algunas ocasiones, la razón puede ser más relevante, mientras que en otras, la empatía y la consideración son fundamentales para crear una conexión significativa.");
                puntos[6]+= 3;
                puntos[7]+= 3;
            break;
                default:
                    System.out.println("Opción invalida");
                    opV = false;
            }
}while(!opV);

            System.out.println("");
            System.out.println("Concluyeron su conversación con una sensación de gratitud por las experiencias compartidas en Villa Esperanza y el profundo vínculo que habían construido juntos.");
            System.out.println("A medida que el sol se ponía en el horizonte, se despidieron con la promesa de más momentos memorables en el futuro.");
            System.out.println("");
            break;
            
        //*******FIN DE LA FASE 3************    
            
        default:
            System.out.println("opción invalida");
            opV = false;
            break;
        }
    }while(!opV);
            
            
}
           
public static void fase4(Scanner captu, String nombre, int[] puntos, int Axel) {               
                int op1;
                boolean opV = true;
                
                System.out.println("");
                System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*");
                System.out.println("");
                System.out.println("");
                System.out.println("Bienvenido a la fase 4:Gotas sin rumbo " + nombre);
                System.out.println("");
                System.out.println("");
                
                System.out.println("Era un día soleado, ninguna nube se veía alrededor del cielo por lo que no ");
                System.out.println("te preocupaste por llevar un paraguas. El mismo clima te había dejado en claro que ");
                System.out.println("iba a ser un día ideal para un picnic.");
                System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*"); 
                
                System.out.println("");
                System.out.println("");
            
                System.out.println("Al entrar a la biblioteca, te diriges hacia lo que era una mesa algo escondida, enfrente ");
                System.out.println("de una gran ventana mostrando el como las gotas del agua se resbalaban y chocaban ");
                System.out.println("con la ventana, ya estaba empezando a llover.");
                
                System.out.println("");
                
                System.out.println("Axel: ¿Qué tal, compañero/a de estudio? Parece que el clima no nos está favoreciendo ");
                System.out.println("hoy. ¿Estás listo para desafiar a la tormenta y conquistar este proyecto juntos?");
                
                System.out.println("");
                
                System.out.println("Al sentarte en la silla enfrente de él, pudiste notar como ya estaba empezando a estudiar sobre el tema del proyecto.");
                System.out.println("------------------------------------------------------------------");
                System.out.println("1.- Prefiero un plan detallado antes de comenzar. ");//+5 juzgar
                System.out.println("2.- Me gusta tener un plan general, pero puedo improvisar. ");// +3 Juzgar +2 prospeccion
                System.out.println("3.-Prefiero tener una idea básica y adaptarme según sea necesario.");// +3 juzgar y +3 prospección
                System.out.println("4.-Me siento más cómodo improvisando desde el principio."); //+5 prospección
                System.out.println("------------------------------------------------------------------");
                
            do{    
                 op1 = captu.nextInt();
                
                switch (op1) {
                    
                    case 1:
                    System.out.println("Necesitamos tener claras todas las variables para poder improvisar con estilo.");
                    
                    System.out.println("");
                    
                    System.out.println("Al ser Axel una persona que se lleva mejor al momento de improvisar le parece una");
                    System.out.println("perdida de tiempo el ponerse a analizar bien todos los aspectos para concretar un plan.");
                    System.out.println("Pero aun así respeta tu opinión");
                    
                    System.out.println("");
                    puntos[2]+=5; //JUZGAR
                    
                    break;
                    case 2:
                    System.out.println("Axel: Algunas veces está bien improvisar, aun teniendo un plan en mente nunca se puede estar");
                    System.out.println("seguro completamente de que vaya a funcionando.");
                    System.out.println("");
                    System.out.println("Le gusto tu respuesta, entiende completamente que muchas veces lo ideal es hacer un plan, pero");
                    System.out.println("aun así le gusta tu iniciativa de estar dispuesto a improvisar.");
                    System.out.println("");
                    puntos[2] += 3; //JUICIO
                    puntos[3] += 2;//PROSPECCIÓN
                    break;
                    
                
                    case 3:
                
                    System.out.println("Axel: Excelente, de igual forma solo investigue lo principal del proyecto. Pero me agrada mas");
                    System.out.println("lanzarme a la acción que esperar por un plan bastante detallado.");
                    System.out.println("");
                    System.out.println("Le gusto tu respuesta, Axel prefiere improvisar pero igual respeta que siempre se debe tener una");
                    System.out.println("idea para tomar como base al momento de hacer un plan.");
                    System.out.println("");
                    puntos[2] += 3;//JUICIO
                    puntos[3] += 3; //PROSPECCIÓN
                     break;    
                
                    case 4:
                
                    System.out.println("Axel: Confío en mi capacidad para pensar rápido y actuar aún más rápido. ¿Un plan detallado?");
                    System.out.println("¡Aburrido! Somos capaces de hacer este proyecto con pura intuición y una pizca de locura creativa.");
                    System.out.println("");
                    System.out.println("Alex se siente bastante cómodo de conocer alguien que opine igual que el,");
                    System.out.println("");
                    puntos[3] += 5; //PROSPECCIÓN
                    
                    break;
                    
                    default:
                        
                        System.out.println("Opción invalida.");
                        opV = false;
                   
                }
            }while(!opV);
            
                System.out.println("");
                
                System.out.println("Axel: Muy bien " + nombre + " como ya sabes tenemos que mostrar información de lo que sabemos de este pueblo...");
                System.out.println("pero honestamente no he encontrado nada interesante. Mas que los fundadores y varias fotografías viejas.");
                
                System.out.println("");
                
                System.out.println("Te quedas pensando en ello, y tenia razón, cualquier tipo de información de este pueblo no podía ser relevante. ");
                System.out.println("Aun siendo nuevo/a en este lugar, te has dado cuenta que todo es inusualmente tranquilo y desconocido, como un tipo de vacío.");
                
                System.out.println("");
                
                System.out.println(nombre + ": Tienes razón, este pueblo se siente... vacío realmente no creo que vayamos a encontrar algo mas interesante que los fundadores ");
                System.out.println("lanzaron una flecha para decidir su destino. ");
                
                System.out.println("");
                
                System.out.println("Axel: A eso mismos quería llegar, hasta me arrepiento de elegir este tema como exposició.");
                System.out.println("¿que te parecería cambiar de tema?");
                System.out.println("");
                System.out.println("");
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("1.- Soy muy flexible y estoy dispuesto/a a cambiar de dirección.");
        System.out.println("2.- Soy flexible, pero prefiero seguir el plan original.");
        System.out.println("3.- Prefiero seguir el plan, pero puedo adaptarme si es necesario.");
        System.out.println("4.- No me gusta cambiar de dirección y prefiero mantener el plan original.");
        System.out.println("------------------------------------------------------------------------------");
        
 do{       
        op1 = captu.nextInt();
        switch(op1){
            case 1:
            System.out.println(nombre + ":No encuentro problema en cambiar de proyecto, paro aun así no tendriamos mucho tiempo para elaborar.");
                System.out.println("");
            puntos[3] += 5;
        break;
            case 2:
            System.out.println(nombre + ":Prefiero seguir el plan original, después de todo este proyecto es para esta semana.");
            puntos[2] += 2;
            puntos[3] += 2;
        break;
            case 3:
            System.out.println(nombre + ":Sigamos el plan original, podemos adaptarnos si es necesario, pero este trabajo es para esta semana.");
            puntos[2] += 3;
            puntos[3] += 2;
            Axel -= 5;
        break;
            case 4:
            System.out.println(nombre + ":¡Para nada! Debemos de seguir este trabajo, debemos de mantenerlos al plan orginal. Este trabajo es para esta semana.");
            puntos[2] += 5;
            System.out.println("");
            Axel += 5;
            break;
            default:
                System.out.println("Opción invalida.");
                opV = false;
        }
 }while(!opV);
 
        System.out.println("");
    
        System.out.println("Axel la penso por un momento, tenias razon, ya era demasiado tarde para cambiar de proyecto.");
        System.out.println("Sin embargo, tampoco estaba de acuerdo de sacar una historia aburrida del lanzamiento de una flecha.");
        System.out.println("");
        System.out.println("Axel: Tienes razón, tal vez podamos encontara información en el faro.");
        System.out.println("La chica de ahí tiene conocimiento de todo lo que pasa y ha pasado en este pueblo.");
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("1.- No creo haber escuchado de ella.");
        System.out.println("2.- ¿Chica en un faro..? Te refieres a Elena?");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        
     do{
         op1 = captu.nextInt();
     switch(op1){
         case 1:
            System.out.println("Axel: Tiene sentido, despues de todo eres nuevo/a por aquí.");
            System.out.println("Pero tal vez tengas la oportunidad de conocerla.");
            System.out.println("Dice algo pensativo mientras giraba su pluma algo pensativo.");
            
            System.out.println("");
            
            System.out.println("Axel: El caso es que ella tiene todo tipo de información del pueblo, pero no creo que podamos ir a visitarla por la lluvia...");
            System.out.println("No me llevo mucho con ella, se me hace alguien muy entrometida, pero cuando puedas habla con ella, aprovecha la oportunidad.");
            
            System.out.println("");
            
            System.out.println("Axel se levanta de la silla, mostrando su atuendo algo informal, ropa holgada.");
            System.out.println("Axel: Muy bien, vamos a investgar por la biblioteca, de seguro encontramos algo por aquells estatuas, tiene toda la pinta de tener algo oculto.");
           
            System.out.println("");
            
        break;
        
         case 2:
            System.out.println("Axel: Así es, vaya que haces amigos muy rápido! Entonces ya debes de conocer algunos aspectos de la ciudad.");
            
            System.out.println("");
            
            System.out.println("Axel: Es alguien bastante observadora, incluso algo entrometida... No muy de mi gusto pero eso es lo que la hace buena en su trabajo.");
            System.out.println("¿Que información pudiste sacarle?");
            
            System.out.println("");
            
            System.out.println("Te pusiste a pensar sobre los temas que te había dicho Elena, que fueron bastantes, pero entre esos te llamo la atención uno en especial.");
            System.out.println( nombre + ":Ahora que lo mencionas, hubo algo que me había dicho.");
            
            System.out.println("");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("1.- Una voz.");
            System.out.println("2.- Estatuas.");
            System.out.println("-------------------------------");
            System.out.println("");
           
            
            do{
            op1 = captu.nextInt();

            switch(op1){
                    case 1:
                System.out.println(nombre + ":Me había comentado sobre una extraña voz en la biblioteca, dice que escucho rumores de que se encuentran varios libros ocultos.");
                System.out.println("Axel se queda pensando algo interseado por esta nueva información, para después levantarse del lugar. ");
                System.out.println("Axel:Muy bien, ahora sabemos que vamos a hacer hoy.");
           break;
                    case 2:
                System.out.println(nombre + ":Me había dicho que las estatuas eran parte de una gran historia del pueblo, pero no especifíco mucho.");
                System.out.println("Axel se queda, pensando algo interesado por esta nueva información, para después levantarse del lugar.");
                System.out.println("Axel: Muy bien, ahora sabemos que vamos hacer hoy.");
            break;
            
                    default:
                System.out.println("Opción invalida.");
                opV = false;
                break;
            }
            }while(!opV);

                System.out.println("");
                
            System.out.println("Axel: Vamos a empezar buscando por las estatuas de la biblioteca, de seguro encontraremos una pista ahí");
            System.out.println("Tiene toda la pinta de ocultar de todo.");
            
             default:
             System.out.println("Opción invalida.");
             opV = false;
       }
       }while(!opV);
     
        System.out.println("Pudiste notar como te extendía la mano, para que le tomes la mano.");
        System.out.println("Axel: ¿Cómo te sientes acerca de tomar el riesgo querid@ reportera/o? ¿Prefieres mantener la seguridad o estás dispuesto a asumir este desafio?");
       
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("1.- Estoy dispuesto/a a asumir riesgos calculados y desfios.");
        System.out.println("2.- Me siento comodo/a con algunos riesgos, pero prefiero no arriesgar demasiado.");
        System.out.println("3.- Prefiero mantener la seguridad, pero tomaré riesgos si es necesario.");
        System.out.println("4.- Prefiero matener la seguridad y evitar riesgos siempre que sea posible.");
         System.out.println("--------------------------------------------------------------------------------------");
         System.out.println("");
         
 do{
        op1 = captu.nextInt();
        
        switch(op1){
            case 1:
            System.out.println("Axel: ¡Me gusta como piensas! Luchemos contra el enigma de esta biblioteca");
        
        puntos[3] += 5;
        break;
            case 2:
            System.out.println("Axel: Eres una persona precavida, me gusta. Pero aveces hay que tomarse unos cuantos riesgos para ver que nos brinda.");
        puntos[2] += 2;
        puntos[3] += 3;
        Axel += 5;
            break;
            case 3:
            System.out.println("Axel: ¡Ese es el espíritu! Salte de tu zona de confort, de todos modos, aqui estamos juntos compañero/a.");
            puntos[2] += 3;
            puntos[3] += 2;
            break;
            case 4:
            System.out.println("Axel: ¡No seas aburrido/a! No es como si esto fuera algo de vida y muerte.");
        puntos[2] += 5;
            Axel -= 5;
            break;
            default:
                System.out.println("Opción invalida.");
                opV = false;
                break;
        }
        
 }while(!opV);
 
        System.out.println("Con este pequeño comienzo de investigación decidieron emprender el camino al fondo de la biblioteca, escondidos entre las repisas lleno de libros,");
        System.out.println("al igual que aquel olor peculiar de libros viejos se estaba haciendo mas presente. Ante este sentimiento de desconexión, te preguntaste..");
        System.out.println("¿Qué me motiva..?  La posibilidad de descubrir algo nuevo y emocionante o la satisfacción de resolver problemas complejos?");
         System.out.println("");
         System.out.println("");
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("1.Me motiva más la posibilidad de descubrir algo nuevo y emocionante.");
        System.out.println("2.Me motiva tanto descubrir cosas nuevas como resolver problemas complejos.");
        System.out.println("3.Me motiva más la satisfacción de resolver problemas complejos de manera metódica.");
         System.out.println("----------------------------------------------------------------------------------");
          
         do{
             
        op1 = captu.nextInt();
        switch(op1){
            case 1:
        puntos[3] += 5;
        break;
            case 2:
        puntos[2] += 3;
        puntos[3] += 3;
            break;
            case 3:
            puntos[2] += 5;
            break;
            default:
                System.out.println("Opción invalida.");
                opV = false;
                break;
        }
 }while(!opV);
         
         
        System.out.println("Así es, era tan claro, cada persona es diferente y tan similar.");
        System.out.println("Que curioso que aproveche esta oportunidad para identificar tal cualidad.");
        System.out.println("Llegaron en cuestión de minutos, dejando ver que Axel se dirigía a una de las estatuas.");
         System.out.println("");
        System.out.println("Esto lo veias como algo sin mucho sentido aun, pero solo te quedaste mirando el rostro esculpido de una de las tastatuas,");
        System.out.println("quien reconociste como uno de los fundadores.");
        
        System.out.println(nombre + ": (Suspiro) Vaya... esto se ve complicado.");
        
        System.out.println("Axel: ¿Enserio?¿Como sueles manejar la incertidumbre en el trabajo?"); 
         System.out.println("");
         System.out.println("");
         System.out.println("----------------------------------------------------------------------------------");
         System.out.println("1. Me siento cómodo/a con la incertidumbre y la veo como una oportunidad"); //+ 5 Prospección
         System.out.println("2. Puedo manejar cierta incertidumbre, pero prefiero tener algo de claridad"); //+3 Prospección y +2 Juicio
         System.out.println("3. Me siento incómodo/a con la incertidumbre, pero trato de adaptarme ");//+3 Juicio y +2 Prospección
         System.out.println("4. Prefiero tener certeza y claridad en todo momento  ");//+5 Juicio
         System.out.println("-----------------------------------------------------------------------------");
         System.out.println("");   
         
 do{
     
        op1 = captu.nextInt();
        switch(op1){
            case 1:
            System.out.println(nombre + ": Se que podemos tomar esto como una oportunidad, solo tengo que observar bien mi entorno.");
            System.out.println("Esta respuesta fue mas para ti mismo/a.");
        puntos[3] += 5;
        break;
            case 2:
            System.out.println(nombre + ": Puedo manejar esta situación, pero me ayudaría algún tipo de guía..");
        puntos[2] += 2;
        puntos[3] += 3;
        
            break;
            
            case 3:
            System.out.println(nombre + ": Trato de adaptarme pero no me gusta estar en situaciones donde no se por donde empezar.");
            puntos[2] += 3;
            puntos[3] += 2;
            break;
            
            case 4:
            System.out.println(nombre + ":No me gusta estar en la deriva, me siento mas comodo/a cuando hay una pista o algun camino por seguir");
        puntos[2] += 5;
            break;
            
            default:
                System.out.println("Opción invalida.");
                opV = false;
        }
 }while(!opV);   
    System.out.println("");
    
        System.out.println("Axel: Bueno pregúntate a ti mismo/a ¿Cómo abrirías algo que parece imposible?");
        System.out.println("Te pregunta de una forma serena incluso transmitiendote una paz.");
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("1. Crear espacio para la claridad.");
        System.out.println("2. Explorar con curiosidad.");
        System.out.println("3. Invitar a la exploración.");
        System.out.println("----------------------------------------------");
       do{ 
        op1 = captu.nextInt();
        switch(op1){
            case 1:
            System.out.println("La luz permite ver claramente, dejando que los demás comprendan tu verdadero yo sin sombras ni máscaras.");
            
        break;
            case 2:
            System.out.println("Al igual que un explorador en una biblioteca llena de misterios, te sumerges en los libros y pergaminos, buscando pistas.");
        
            break;
            
            case 3:
            System.out.println("El pasaje invita a otros a explorarlo contigo, así como tu autenticidad invita a las personas a conocerte de manera más profunda y genuina.");
                System.out.println(nombre + ": ¿Podrías ayudarme?");
                System.out.println("Axel le agrado que buscaras por su ayuda, por lo que solo sonrío y asintió. Ahora ambos buscando por alguna pista.");
                Axel += 5;
            break;
            
            default:
                System.out.println("Opción invalida.");
                opV = false;
                break;
        }
 }while(!opV);  
       
       System.out.println("");
       System.out.println("Después de un tiempo buscando hasta que te lleven al botón escondido, encontrándolo escondido atrás de la oreja de una de las estatuas.");
       System.out.println("Esto ocasiono que se abriera en medio de unos estantes, mostrando unas escaleras de caracol ante ustedes.");
       System.out.println("");
       System.out.println("Axel: ¡Bien hecho!" + nombre + ",eres todo un detective! ¿Cómo lo hiciste?");
       System.out.println("");
       System.out.println("");
       System.out.println("----------------------------------------------------------------");
       System.out.println("1.Me gusta analizar minuciosamente todas las opciones");// juicio +5
       System.out.println("2.Prefiero analizar algunas opciones clave antes de decidir ");//+3 juicio +2 prospección
       System.out.println("3.Me gusta encontrar un equilibrio entre análisis e intuición ");//+2 juicio y +3 prospección
       System.out.println("4.Prefiero tomar decisiones rápidas basadas en la intuición ");//+5 prospección
       System.out.println("------------------------------------------------------------------");
       System.out.println("");
       
       do{ 
        op1 = captu.nextInt();
        switch(op1){
            case 1:
            System.out.println(nombre + ":Solo analice toda opción que tenia disponible en el momento.");
            puntos[2] += 5;
            
            break;
            case 2:
            System.out.println(nombre + ":Bueno solo trate de encontrar alguna opción clave que me podría ayudar.");
            puntos[2] += 3;
            puntos[3] += 2;
            break;
            
            case 3:
            System.out.println(nombre + ": Creo que fue cosa de ambas, junto con lo que pude encontrar y algunas corazonadas.");
            puntos[2] += 2;
            puntos[3] += 3;
            break;
            case 4:
            System.out.println(nombre + ": Una corazonada.");
            puntos[3] += 5;
            default:
                System.out.println("Opción invalida.");
                opV = false;
        }
 }while(!opV);
       
       System.out.println("");
       System.out.println("Axel: Eres alguien capaz de muchas cosas" + nombre + ", debes de estar orgulloso/a de eso, este es un gran paso a un gran descubrimiento.");
       System.out.println("");
       System.out.println("Ante esto, procedió a empezar a bajar las escaleras, tu después de el. Aquellas escaleras parecían eternas, como si no tuviera un fin."); 
       System.out.println("Cada vez se oscurecía mas por lo que Alex prendió la linterna de su celular.");
       System.out.println("");
       System.out.println("Alex: Tengo una duda, parece ser que dudaste de entrar a este lugar..");
       System.out.println("¿Eres de esas personas que le parecen muy importante tener toda la información antes de tomar una decisión muy importante? ");
       System.out.println("");
       System.out.println("");
       System.out.println("-----------------------------------------------------------------------------");
       System.out.println("1. Muy importante, prefiero tener todos los datos posibles.");
       System.out.println("2. Bastante importante, pero puedo decidir con información parcial.");
       System.out.println("3. No es muy importante, puedo tomar decisiones con información limitada.");
       System.out.println("4. No es importante, prefiero tomar decisiones rápidas sin muchos datos.");
       System.out.println("-----------------------------------------------------------------------------");
       System.out.println("");
       
       do{
           
        op1 = captu.nextInt();
        
        switch(op1){
            case 1:
            System.out.println("Axel: Ah.. ya veo, realmente yo no me guio mucho por los datos, creo que ya lo habrás notado.");
            puntos[2] += 5;
            
            break;
            case 2:
            System.out.println("Axel: Bueno creo que con tener un poco de información ya se puede hacer lo que sea.");
            puntos[2] += 3;
            puntos[3] += 2;
            break;
            
            case 3:
            System.out.println("Axel: Te adaptas a cualquier tipo de situación entonces, eso si que es algo impresionante.");
            puntos[2] += 2;
            puntos[3] += 3;
            break;
            case 4:
            System.out.println("Axel: Dejarte llevar con el viento, creo que ya habras notado que yo también me dejo llevar mucho por lo primero que pienso");
            puntos[3] += 5;
            default:
                System.out.println("Opción invalida.");
                opV = false;
        }
 }while(!opV);
               
       System.out.println("Axel: Este proyecto es bastante pesado, incluso llegamos a buscar entre libros viejos para poder encontrar este lugar.");
       System.out.println("");
       System.out.println("Dice el chico con un tono relajado, mientras continuaba caminando hacia abajo de esas escaleras de caracol.");
       System.out.println("");
       System.out.println("Axel: Sinceramente no estaría aquí, si no fuera por que ahora nos encargaron pocos trabajos. ");
       System.out.println("");          
       System.out.println("");          
       System.out.println("------------------------------------------------------------------------------------------");          
       System.out.println("1. Me siento más productivo/a con múltiples proyectos en marcha.");          
       System.out.println("2. Me siento más productivo/a cuando tengo algunos proyectos para variar.");          
       System.out.println("3. Prefiero enfocarme en uno a la vez, pero puedo trabajar en varios si es necesario.");          
       System.out.println("4. Prefiero enfocarme en un solo proyecto hasta completarlo");  
       System.out.println("------------------------------------------------------------------------------------------");
       System.out.println("");
       
       do{
           
        op1 = captu.nextInt();
        
        switch(op1){
            case 1:
            puntos[3] += 5;
            
            break;
            case 2:
            puntos[2] += 2;
            puntos[3] += 3;
            break;
            
            case 3:
            puntos[2] += 3;
            puntos[3] += 2;
            break;
            
            case 4:
            puntos[2] += 5;
            default:
                System.out.println("Opción invalida.");
                opV = false;
        }
 }while(!opV);
       
    System.out.println("");
    
    System.out.println("Axel: Ya veo, ¿Entonces sueles seguir un horario estricto no o eres mas flexible?");
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println("1. Sigo un horario estricto para organizar mi tiempo y tareas.");
    System.out.println("2. Prefiero tener un plan general, pero soy flexible según las necesidades.");
    System.out.println("3. Trato de mantener un equilibrio entre estructura y flexibilidad");
    System.out.println("4. Me adapto según surjan las necesidades sin un plan estricto");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println("");
    
     do{
           
        op1 = captu.nextInt();
        
        switch(op1){
            case 1:
            System.out.println("Axel: Si tienes vibras de guiarte por un horario estricto, aunque tengo que admitirlo que para mi seria algo pesado.");
            puntos[2] += 5;
            
            break;
            case 2:
                System.out.println("Axel: Diria que me pasa lo mismo, me gusta tener una idea de lo que voy hacer.");
            puntos[2] += 3;
            puntos[3] += 2;
            break;
            
            case 3:
            System.out.println("Axel: Un equilibrio de ambos es una buena combinación, lo mejor de ambos mundos como dirían algunos.");
            puntos[2] += 2;
            puntos[3] += 3;
            break;
            
            case 4:
            System.out.println("Axel: Me gusta esa idea, solo dejarse ir por como va tomando el rumbo");
            puntos[3] += 5;
            default:
                
                System.out.println("Opción invalida.");
                opV = false;
        }
 }while(!opV);
     
     System.out.println("Su conversación fue interrumpida al ver que aquellas escaleras dieron a su fin, con ello, Axel alumbro el lugar encontrando a unos pasos una mesa bien detallada de una madera algo vieja pero resistente.");
     System.out.println("");
     System.out.println("Por un momento te quedaste viendo aquel libro con cierta curiosidad y duda, pero al momento de querer acercarte. Esa voz apareció, como Elena lo había descrito, como si fuera tu propio subconsciente.");
     System.out.println("");
     System.out.println("Vaya que has llegado lejos, ahora aquí te pregunto"+ nombre + "¿Qué harás? ¿Estas listo para saber los secretos ocultos de MirrorTown?");
     System.out.println("");
     System.out.println("*°*°*°*°*°*°*°*°*°*°");
       System.out.println("1. Si, estoy listo/a.");
       System.out.println("2. No lo estoy.");
    System.out.println("*°*°*°*°*°*°*°*°*°*°");

     do{            
    op1 = captu.nextInt();

         switch(op1){

            case 1:
            System.out.println("");
            break;
            case 2:     
        System.out.println("Algunas veces uno tiene miedo del conocimiento, mucho mas cuando sabes que esta relacionado contigo.");
        System.out.println("");
        System.out.println("Pero por todo este trayecto que has tomado, puedo confirmar que eres una persona maravillosa, y lo sabes perfectamente" + nombre);
        System.out.println("");
        break;
default:
    System.out.println("Opción invalida");
opV = false;
    }
}while(!opV);
     
     System.out.println("vamos " + nombre + ", y descubramos lo que este libro tiene que decir de MirrorTown, donde el reflejo de cada habitante reluce.");
     System.out.println("Axel solo te guio, como los otros habitantes del pueblo te fueron guiando para llegar hasta aquí. Al llegar al libro, colocaste tu mano sobre la portada, abriéndola con cuidado.");
     System.out.println("");
     System.out.println("Mostrándote la información que estabas buscando..");
     
     
        }

//°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°FIN DEL JUEGO°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°

  
    //----------------------------------------------------------
    
    public static void mostrarPuntos(int[] puntos){
        String[] categorias = {
            "Introvertido", "Extrovertido", "Juzgar", "Prospección",
            "Intuitivo", "Observador", "Pensamiento", "Sentimiento"
        };
        
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Puntos en la categoria " + categorias[i] + ":" + puntos[i]);
        }
    }
    //------------------------------------------------------------
    public static void mostrarPuntosRelacion(int Violett ,int Elena ,int Irving , int Axel ) {
        System.out.println("\nPuntos actuales:");
        System.out.println("Violett (ENFP): " + Violett);
        System.out.println("Elena (ISFJ): " + Elena);
        System.out.println("Irving (ISFP): " + Irving);
        System.out.println("Axel (ENTP): " + Axel);
        System.out.println();
    }
}  


