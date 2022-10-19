import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu compo");
        System.out.println("1. Combo Master Frango");
        System.out.println("2. Super Combo Salsicha");
        System.out.println("3. Ultra Combo Feijão");
        System.out.print("Sua escolha: ");
        Scanner input = new Scanner(System.in);
        int tipo = input.nextInt();
        Combo combo = new Combo();
        combo.CriarCombo(tipo);
        combo.MostrarCombo();
    }
}
