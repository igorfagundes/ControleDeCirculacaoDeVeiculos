package controledeveiculosleves;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Principal{
    static Date dataAtual = new Date();
    static Veiculo veiculo = new Veiculo();
    static ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
    public static void main(String[] args){

        int op = -1;
        int e = op;
        while(op != 0){
            op = menu();
            if(op == 1){
                marcarSaida();
            }else if(op == 2){
                marcarEntrada();
            }else{
                System.out.println("Obrigado por usar meu sistema");
                System.out.println("fim do programa");
            }
        }
    }//main
//menu
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opcao ");
        System.out.println("[1] marcar saida");
        System.out.println("[2] marcar entrada");
        System.out.println("[0] sair");
        System.out.print("Opcao: ");
        return scan.nextInt();
    }//fim menu
//metodo para registrar saida
    public static void marcarSaida(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o horario de saida");
        System.out.print("Opcao: ");
        veiculo.setHoraDeSaida(scan.nextInt());
        scan.nextLine();
        System.out.println("Informe a placa do veiculo");
        System.out.print("Opcao: ");
        veiculo.setPlaca(scan.nextLine());
        System.out.println("Informe o motorista");
        System.out.print("opcao: ");
        veiculo.setMotorista(scan.nextLine());
        System.out.println("Informe o veículo(area atuante)");
        System.out.print("Opcao: ");
        veiculo.setVeiculo(scan.nextLine());
        System.out.println("Informe a atividade(oque foi fazer)");
        System.out.print("Opcao: ");
        veiculo.setAtividade(scan.nextLine());
        listaVeiculo.add(veiculo);
    }
//metodo para registrar entrada
    public static void marcarEntrada(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o horario de entrada");
        System.out.print("Opcao: ");
        veiculo.setHoraDeSaida(scan.nextInt());
        scan.nextLine();
        System.out.println("Informe a placa do veiculo");
        System.out.print("Opcao: ");
        veiculo.setPlaca(scan.nextLine());
        System.out.println("Informe o motorista");
        System.out.print("opcao: ");
        veiculo.setMotorista(scan.nextLine());
        System.out.println("Informe o veículo(area atuante)");
        System.out.print("Opcao: ");
        veiculo.setVeiculo(scan.nextLine());
        System.out.println("Informe a atividade(oque foi fazer)");
        System.out.print("Opcao: ");
        veiculo.setAtividade(scan.nextLine());
        listaVeiculo.add(veiculo);
    }
    public static ArrayList<Veiculo> imprimirSaida(Veiculo veic){
        System.out.println("Data e Hora de Saída" + dataAtual);
        System.out.println("Nome do Motorista: " + veic.getMotorista());
        System.out.println("Veículo: " + veic.getVeiculo());
        System.out.println("Placa: " + veic.getHoraDeSaida());
        System.out.println("Ativiade: " + veic.getAtividade());
        return listaVeiculo;
    }
    public static void imprimirTodos(){

    }
    public static ArrayList<Veiculo> imprimirPorPlaca(){

        return listaVeiculo;
    }
}//global