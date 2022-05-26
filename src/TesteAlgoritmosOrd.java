public class TesteAlgoritmosOrd {

    public static void main(String[] args) {
        //int[] vetor = {60,50,95,80,70};
        //int[] vetor = {60,80,95,50,70};
        int[] vetor = {80,70,60,50,95};

        //AlgoritmoSimplesOrd.bubbleSort(vetor);
        //AlgoritmoSimplesOrd.selectionSort(vetor);
        AlgoritmoSimplesOrd.insertionSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ",");
        }
    }
}
