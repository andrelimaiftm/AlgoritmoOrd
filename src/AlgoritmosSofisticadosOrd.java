public class AlgoritmosSofisticadosOrd {

    public static void quicksort(int[] vetor, int menor, int maior){

        if(menor > maior){
            return;
        }

        int i = menor;
        int j = maior;
        //threshold
        int pivo = vetor[menor];
        while(i < j){
            //Encontrar a primeira posição menor que do pivo da direita para esquerda
            while(i < j && vetor[j] > pivo){
                j--;
            }
            //substituir o menor por um número menor que o pivo
            if(i < j){
                vetor[i] = vetor[j];
                i++;
            }

            //Encontrar a primeira posição maior que o pivo da
            // esquerda para a direita
            while(i < j && vetor[i] <= pivo){
                i++;
            }

            //Subtituir o maior por um número maior que o pivo
            if(i < j){
                vetor[j] = vetor[i];
                j--;
            }
            vetor[i] = pivo;

            quicksort(vetor, menor, i-1);
            quicksort(vetor, i+1, maior);
        }

    }
}
