/*

Você trabalha em uma empresa de viagens internacionais e precisa de um sistema que exiba o horário atual em diferentes países.
Como a empresa tem clientes no Japão, o sistema deve ser capaz de mostrar o horário atual na cidade de Tóquio, independente do fuso horário
do computador onde o programa está rodando.

Crie um programa que exiba o horário atual no fuso horário de Tóquio (Asia/Tokyo).
Utilize a classe ZonedDateTime para realizar a tarefa. Lembre-se de formatar a saída para exibir apenas horas, minutos e segundos.
*/

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Desafio07 {
    public static void main(String[] args) {
        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioFormatado = horarioTokyo.format(formatter);

        System.out.println("Horário atual em Tóquio: " + horarioFormatado);
    }
}
