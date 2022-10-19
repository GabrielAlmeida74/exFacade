public class Combo {

    private int combo;
    Burguer burguer;
    Sobremesa sobremesa;
    Bebida bebida;
    public void CriarCombo(int combo) {
        switch(combo) {
            case 1:
                burguer = new Burguer("Hamburguer de Frango", 200,12);
                sobremesa = new Sobremesa("Sunday de Chocolate", "Médio",10);
                bebida = new Bebida("Refrigerante ou Suco",300,7);
                break;
            case 2:
                burguer = new Burguer("Hamburguer de Salsicha", 200,12);
                sobremesa = new Sobremesa("Torta", "Médio",10);
                bebida = new Bebida("Açai",300,7);
                break;
            case 3:
                burguer = new Burguer("Hamburguer de Feijão", 200,12);
                sobremesa = new Sobremesa("Cookie", "Médio",10);
                bebida = new Bebida("Milkshake",300,7);
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }

    public void MostrarCombo(){
        System.out.println(burguer.getInfo() + ", " + sobremesa.getInfo() + ", e um " + bebida.getInfo());
    }

}
