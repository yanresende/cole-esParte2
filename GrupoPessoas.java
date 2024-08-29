import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome da pessoa ou 'sair' para finalizar: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Insira 'M' para Masculino ou 'F' para Feminino.");
            }
        }

        scanner.close();

        System.out.println("\nGrupo Masculino:");
        for (String pessoa : grupoMasculino) {
            System.out.println(pessoa);
        }

        System.out.println("\nGrupo Feminino:");
        for (String pessoa : grupoFeminino) {
            System.out.println(pessoa);
        }
    }
}
