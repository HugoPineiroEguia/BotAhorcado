import java.util.Scanner;
import discord4j.common.util.Snowflake;
import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.channel.GuildMessageChannel;
import discord4j.core.object.entity.channel.MessageChannel;
import discord4j.core.spec.EmbedCreateSpec;
import discord4j.rest.util.Color;

public class Ahorcado {

    public static void main(String[] args) {

        final String token = "TOKEN";
        final DiscordClient client = DiscordClient.create(token);
        final GatewayDiscordClient gateway = client.login().block();

        Scanner sc = new Scanner(System.in);
        String ahorcado [] = new String[6];
        int estado = 0;



        ahorcado[5] =
                " ________  \n" +
                " |/    |   \n" +
                " |    |X|  \n" +
                " |     H   \n" +
                " |    | |  \n" +
                "_|_________        ";

        ahorcado[4] =
                " ________  \n" +
                " |/    |   \n" +
                " |    |O|  \n" +
                " |     H   \n" +
                " |    | |  \n" +
                "_|_________        ";

        ahorcado[3] =
                " ________  \n" +
                " |/    |   \n" +
                " |     O   \n" +
                " |     X   \n" +
                " |         \n" +
                "_|_________        ";

        ahorcado[2] =
                " ________  \n" +
                " |/    |   \n" +
                " |         \n" +
                " |         \n" +
                " |         \n" +
                "_|_________        ";

        ahorcado[1] =
                "           \n" +
                " |         \n" +
                " |         \n" +
                " |         \n" +
                " |         \n" +
                "_|_________        ";

        ahorcado[0] =
                "           \n" +
                "           \n" +
                "           \n" +
                "           \n" +
                "           \n" +
                "___________        ";


        String [] palabras =  {"caracol", "piedra", "ordenador", "kamehameha", "rasengan", "pizza", "hamburguesa"};

        int palabraRandom = (int) (Math.random()* palabras.length);
        String palabra = palabras[palabraRandom];

        char[] palabraCadena = palabra.toCharArray();
        char[] unknowchain = new char[palabraCadena.length];


        for (int i = 0; i< palabraCadena.length; i++){
            unknowchain[i] = 45;
        }

        for (int j = 0; j< ahorcado.length; j++) {

            boolean acierta = false;

            System.out.print(ahorcado[estado]);

            for (int i = 0; i < palabraCadena.length; i++) {
                System.out.print(unknowchain[i]);
            }

            System.out.println("\n|| INTRODUCE UNA LETRA ||");
            String letraJugador = sc.nextLine();
            char letraCheck = letraJugador.charAt(0);

            for (int i = 0; i < palabraCadena.length; i++) {
                if (palabraCadena[i] == letraCheck) {
                    unknowchain[i] = letraCheck;
                    acierta = true;
                }
            }
            if (acierta == false) {
                estado++;
            }
        }


    }
}
