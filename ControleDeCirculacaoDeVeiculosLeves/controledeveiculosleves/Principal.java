package controledeveiculosleves;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Principal{
    static Date dataAtual = new Date();
    static Veiculo veiculo = new Veiculo();
    static ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
    public static void main(String[] args){

        int op = -1;
        int e = op;
        while(op != 0){
            op = menu();
            if(op == 1){
                marcarSaida();
            }else if(op == 2){
                marcarEntrada();
            }else if(op == 3){
                imprimirTodosSaida();
            }else if(op == 4){
                imprimirTodosEntrada();
            }else if(op == 5){
                Scanner scan = new Scanner(System.in);
                System.out.println("Digite a placa que deseja procurar");
                System.out.print("Opcao: ");
                String veic = scan.nextLine();
                imprimirPorPlaca(veiculo);
                
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
        System.out.println("[3] mostrar saidas");
        System.out.println("[4] mostrar entradas");
        System.out.println("[5] Procurar Placa");
        System.out.println("[0] sair");
        System.out.print("Opcao: ");
        return scan.nextInt();
    }//fim menu
//metodo para registrar saida
    public static void marcarSaida(){
        Scanner scan = new Scanner(System.in);
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
        imprimirSaida(veiculo);
    }
//metodo para registrar entrada
    public static void marcarEntrada(){
        Scanner scan = new Scanner(System.in);
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
        imprimirEntrada(veiculo);
    }
    public static ArrayList<Veiculo> imprimirSaida(Veiculo veic){
        System.out.println("Data e Hora de Saída" + dataAtual);
        System.out.println("Nome do Motorista: " + veic.getMotorista());
        System.out.println("Veículo: " + veic.getVeiculo());
        System.out.println("Placa: " + veic.getPlaca());
        System.out.println("Atividade: " + veic.getAtividade());
        return listaVeiculo;
    }
    public static ArrayList<Veiculo> imprimirEntrada(Veiculo veic){
        System.out.println("Data e Hora de Entrada" + dataAtual);
        System.out.println("Nome do Motorista: " + veic.getMotorista());
        System.out.println("Veículo: " + veic.getVeiculo());
        System.out.println("Placa: " + veic.getPlaca());
        System.out.println("Atividade: " + veic.getAtividade());
        return listaVeiculo;
    }
    public static void imprimirTodosSaida(){
        ArrayList<Veiculo> listaVeiculos = listaVeiculo;
        for(int i = 0; i < listaVeiculos.size();i++){
            listaVeiculo.get(i);
            imprimirSaida(veiculo);
        }
    }
    public static void imprimirTodosEntrada(){
        ArrayList<Veiculo> listaVeiculos = listaVeiculo;
        for(int i = 0; i < listaVeiculos.size();i++){
            listaVeiculo.get(i);
            imprimirEntrada(veiculo);
        }
    }
    public static ArrayList<Veiculo> imprimirPorPlaca(Veiculo veic){
        for(int i = 0;i < listaVeiculo.size();i++){
            veiculo = listaVeiculo.get(i);
            if(listaVeiculo.get(i).equals(veic)){
                veiculo = veic;
            }
        }
        imprimirEntrada(veic);
        imprimirSaida(veic);
        return listaVeiculo;
    }
}//global