public class Combo {

    public int getCombo() {
        return combo;
    }

    public void setCombo(int combo) {
        this.combo = combo;
    }

    private int combo;
    Burguer burguer = new Burguer();
    Sobremesa sobremesa = new Sobremesa();
    Bebida bebida = new Bebida();
    public void CriarCombo(int combo) {
        switch(combo) {
            case 1:
                burguer.setInfo("Hamburguer de Frango", 200,12);
                sobremesa.setInfo("Sunday de Chocolate", "Médio",10);
                bebida.setInfo("Refrigerante ou Suco",300,7);
                break;
            case 2:
                burguer.setInfo("Hamburguer de Salsicha", 200,12);
                sobremesa.setInfo("Torta", "Médio",10);
                bebida.setInfo("Açai",300,7);
                break;
            case 3:
                burguer.setInfo("Hamburguer de Feijão", 200,12);
                sobremesa.setInfo("Cookie", "Médio",10);
                bebida.setInfo("Milkshake",300,7);
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
