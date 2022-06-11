import java.util.Arrays;
import java.util.Random;

public class TesteTempoExecucao {

    public static void main(String[] args) {

        int tamanho = 100000;

        int[] vetorDesordenado = new int[tamanho];
        Random rand = new Random();

        for (int i = 0; i < vetorDesordenado.length; i++) {
            vetorDesordenado[i] = rand.nextInt(tamanho);
        }

        //copia o vetor de elementos desordenados para um outro vetor
        int[] vetorBolha = Arrays.stream(vetorDesordenado).toArray();
        //pega o tempo que algoritmo inicia
        long tempoInicialBolha = System.currentTimeMillis();
        AlgoritmoSimplesOrd.bubbleSort(vetorBolha);
        //pega o tempo que algoritmo termina
        long tempoFinalBolha = System.currentTimeMillis();

        long tempoExecucaoBolha = tempoFinalBolha - tempoInicialBolha;

        System.out.printf("Tempo de execução do algoritmo Bolha: %.3f ms%n\n",tempoExecucaoBolha/1000d);
        /*System.out.println("Vetor do Algoritmo bolha");
        for (int valor : vetorBolha) {
            System.out.print(valor + ",");
        }*/

        int[] vetorQuickSort = Arrays.stream(vetorDesordenado).toArray();
        long tempoInicialQuickSort = System.currentTimeMillis();
        AlgoritmosSofisticadosOrd.quicksort(vetorQuickSort);
        long tempoFinalQuickSort = System.currentTimeMillis();

        long tempoExecucaoQuickSort = tempoFinalQuickSort - tempoInicialQuickSort;

        System.out.printf("Tempo de execução do algoritmo quickSort: %.3f ms%n\n",tempoExecucaoQuickSort/1000d);
        /*System.out.println("Vetor do Algoritmo QuickSort");
        for (int valor : vetorBolha) {
            System.out.print(valor + ",");
        }*/

    }
}
