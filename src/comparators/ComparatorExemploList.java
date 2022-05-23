package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExemploList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 18));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- ordem de inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("--- Ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("-- Ordem reversa dos números - idade --");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- ordem natural dos números - idade - (method reference) --- ");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed()); //comparingInt: comparação de inteiros
        System.out.println(estudantes);

        System.out.println(" --- Ordem reversa dos números - idade (method reference) --- ");
        System.out.println(estudantes);

        Collections.sort(estudantes); //esse método só permite passar uma lista que implementa comparable

        System.out.println("--- Ordem natural dos numeros - idade (interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        //Collections.sort - passamos lista, java util list, através de uma classe de objeto que implementa comparable.
        //executa o algoritmo de comparacao atraves da class

        System.out.println(" --- Ordem reversa dos números - idade - (interface Comparator) --- ");
        System.out.println(estudantes);

        //Resumo: Comparators e Comparable são interfaces auxiliares das collections para trabalhar com ordenação.
        //implementação possível tbm para Maps e Sets.

    }
}
