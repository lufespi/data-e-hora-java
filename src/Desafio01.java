/*

Você está desenvolvendo um sistema de
log para um aplicativo de gerenciamento de tarefas.
Sempre que uma nova tarefa é criada, o sistema deve registrar a data e a hora exatas do momento da criação.

Para isso, implemente um programa que:

Simule a criação de uma tarefa através de uma variável simples, por exemplo String tarefa = "Enviar relatório semanal";.
Registre a data e a hora exatas da criação.
Exiba essas informações no formato adequado.

*/

import java.time.LocalDate;
import java.time.LocalTime;

public class Desafio01 {
    public static void main(String[] args) {
        String tarefa = "Enviar Relatório Semanal";

        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        System.out.println("Tarefa: " + tarefa);
        System.out.println(dataAtual);
        System.out.println(horaAtual);
    }
}
