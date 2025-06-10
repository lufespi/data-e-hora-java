/*

Você trabalha no setor administrativo de uma empresa e precisa de um sistema para acompanhar os horários de entrada e saída dos funcionários.
O sistema deve calcular o horário de saída com base na hora de entrada e na carga horária diária.

Além disso, para controle de banco de horas, o sistema deve calcular quantas horas um funcionário trabalhou a mais ou a menos,
caso o expediente tenha durado mais ou menos que o previsto.

O programa deve:

Capturar o horário de entrada.
Adicionar a carga horária diária para calcular o horário de saída previsto.
Capturar o horário real de saída
Calcular a diferença entre o tempo trabalhado e a carga horária.
Exibir as informações formatadas corretamente.
Dica:

Para tornar o sistema mais interativo, utilize a classe Scanner para capturar a entrada do usuário,
permitindo que ele informe os horários diretamente. Neste caso, primeiro, crie um objeto Scanner para ler os dados digitados.
Depois, defina um DateTimeFormatter para garantir que os horários sejam inseridos no formato correto, ou seja, com duas casas para horas e minutos,
separados por dois pontos (HH:mm), como "08:05". Isso evita erros ao converter o valor digitado em um objeto LocalTime.
 Em seguida, solicite a entrada do usuário com System.out.print() e utilize LocalTime.parse() para interpretar a string informada e transformá-la em um horário válido.
 */

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Entrada do usuário
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), formatter);

        scanner.close();

        // Cálculo da saída prevista
        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        // Cálculo da diferença entre saída real e prevista
        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        // Exibição dos resultados formatados
        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saidaReal.format(formatter));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}
