import java.util.*;

//public class Lista4 {
//    public static void main(String[] args){
//        //Exercício 1
//        Scanner ler = new Scanner (System.in);
//        int PMaior, PMenor, Maior, Menor;
//        int Q[] = new int[10];
//        for (int i=0;i<10;i++){
//            System.out.println("Informe o número "+(i+1)+": ");
//            Q[i] = ler.nextInt();
//            if(Q[i]<0)
//                i--;
//        }
//        Maior = Q[0];
//        Menor = Q[0];
//        PMaior = 0;
//        PMenor = 0;
//        for(int i=1;i<10;i++){
//            if(Q[i]>Maior){
//                Maior = Q[i];
//                PMaior = i;
//            }
//            if(Q[i]<Menor){
//                Menor = Q[i];
//                PMenor = i;
//            }
//        }
//        System.out.println("Maior número do vetor: "+Maior);
//        System.out.println("Posição do maior número: "+(PMaior+1));
//        System.out.println("Menor número do vetor: "+Menor);
//        System.out.println("Posição do menor número do vetor: "+(PMenor+1));
//}
//}

//public class Lista4 {
//    public static void main(String[] args){
//        //Exercício 2
//        Scanner ler = new Scanner (System.in);
//        int X;
//        int A[] = new int[10];
//        int Q[] = new int[10];
//        for (int i=0;i<10;i++){
//            System.out.println("Informe o número "+(i+1)+": ");
//            A[i] = ler.nextInt();
//        }
//        System.out.println("Informe o número a ser multiplicado: ");
//        X = ler.nextInt();
//        for(int i=0;i<10;i++)
//        {
//            Q[i] = A[i] * X;
//            System.out.println("O valor "+(i+1)+" do vetor é: "+Q[i]);
//        }
//    }
//}

//public class Lista4 {;
//    public static void main(String[] args){
//        //Exercício 3
//        Scanner ler = new Scanner (System.in);
//        int X, aux;
//        int A[] = new int[15];
//        for (int i=0;i<15;i++){
//            System.out.println("Informe o número "+(i+1)+": ");
//            A[i] = ler.nextInt();
//        }
//        System.out.println("Informe o número a ser encontrado: ");
//        X = ler.nextInt();
//        aux = 0;nt i=0;i<15;i++
//        for(i)
//        {
//            if(A[i]==X)
//            {
//                System.out.println("O valor se encontra na posição: "+(i+1));
//                aux = 1;
//            }
//        }
//        if (aux == 0)
//        {
//            System.out.println("O valor não foi encontrado");
//        }
//    }
//}

public class Lista4 {
    public static void main(String[] args){
        //Exercício 4
        Scanner ler = new Scanner (System.in);
        int X;
        int A[] = new int[5];
        int Q[] = new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Informe o número "+(i+1)+": ");
            A[i] = ler.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            Q[i] = A[i] * A[i];
            System.out.println("O valor "+(i+1)+" do vetor é: "+Q[i]);
        }
    }
}
