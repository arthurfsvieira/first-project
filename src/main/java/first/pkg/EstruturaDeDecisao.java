package first.pkg;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        String dia = "Sábado";

        if(dia.contains("Segunda")){
            System.out.println("Segunda de novo, toda semana é isso? Aff");
        } else if (dia.contains("Sexta") || (dia.contains("Sábado"))){
            System.out.println("Dia de forró e desmantelo!");
        } else {
            System.out.println("Um dia qualquer...");
        }
    }
}
