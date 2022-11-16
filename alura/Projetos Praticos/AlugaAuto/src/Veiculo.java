public class Veiculo {
    private static int qtd_disp = 10;
    private double vlr = 1000;


    public Veiculo(){
        qtd_disp--;
    }
    public static int getQtd_disp() {
        return Veiculo.qtd_disp;
    }
    public static void setQtd_disp(int qtd_disp) {
        Veiculo.qtd_disp = qtd_disp;
    }
    public double getVlr() {
        return vlr;
    }
    public void setVlr(double vlr) {
        this.vlr = vlr;
    }

    


}
