import java.util.Scanner;

public class Estalviar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sou, dies;
        int preu;
        //I was here
        preu = keyboard.nextInt();
        sou = keyboard.nextInt();

        dies = Estalviar.quantsDies(preu, sou);

        System.out.println("En Pere ha d'estalviar durant " + dies + " dies");
    }

    public static int quantsDies(int preu, int sou){
        int dies = 0, preuaarribar = 0, souxdia = sou/30; // souxdia es per el white


        while (preuaarribar < preu){
            preuaarribar += souxdia;
            dies++; // calcula el nombre de dies que tardara en asolir el preu
        }

        return dies;
    }
}
