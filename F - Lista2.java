package projetojava2022;
import java.util.*;
//public class Lista2 {;
//    //Exercício 1
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        int Num;
//        System.out.println("Informar um número: ");
//        Num = ler.nextInt();
//        if(Num >= 0)
//            System.out.println("Número é positivo.");
//        else
//            System.out.println("Número é negativo.");
//        ler.close();
//    }
//}

//public class Lista2 {
//    //Exercício 2
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float N1, N2, Media;
//        System.out.println("Informar a nota N1: ");
//        N1 = ler.nextFloat();
//        System.out.println("Informar a nota N2: ");
//        N2 = ler.nextFloat();
//        Media = (N1 + N2) / (float) 2.0;
//        if(Media >= 6.0)
//            System.out.println("Aluno está aprovado.");
//        else
//            System.out.println("Aluno não está aprovado.");
//        System.out.println("Média do Aluno: "+Media);
//        ler.close();
//    }
//}

//public class Lista2 {
//    //Exercício 3
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float N1, N2, Media;
//        System.out.println("Informar o número 1: ");
//        N1 = ler.nextFloat();
//        System.out.println("Informar o número 2: ");
//        N2 = ler.nextFloat();
//        if(N1 > N2)
//            System.out.println("O número 1 é maior: "+N1);
//        else
//            System.out.println("O número 2 é maior: "+N2);
//        ler.close();
//    }
//}

//public class Lista2 {
//    //Exercício 4
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float N1, N2;
//        System.out.println("Informar o número 1: ");
//        N1 = ler.nextFloat();
//        System.out.println("Informar o número 2: ");
//        N2 = ler.nextFloat();
//        if(N1 > N2)
//            System.out.println("1: "+N2+"\n2: "+N1);
//        else
//            System.out.println("1: "+N1+"\n2: "+N2);
//        ler.close();
//    }
//}

//public class Lista2 {
//    //Exercício 5
////     Triângulo Equilátero: possui os 3 lados iguais.;
////     Triângulo Isóscele: possui 2 lados iguais.
////     Triângulo Escaleno: possui 3 lados diferentes.
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float L1, L2, L3;
//        System.out.println("Informar o lado 1: ");
//        L1 = ler.nextFloat();
//        System.out.println("Informar o lado 2: ");
//        L2 = ler.nextFloat();
//        System.out.println("Informar o lado 3: ");
//        L3 = ler.nextFloat();
//        if(L1 == L2 && L2 == L3)
//            System.out.println("Equilatero");
//        else if(L1 == L2 || L2 == L3)
//            System.out.println("Isósceles");
//        else
//            System.out.println("Escaleno");
//        ler.close();
//    }
//}

public class Lista2 {
    //Exercício 6
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int NLados, Medida;
        System.out.println("Informar o número de lados: ");
        NLados = ler.nextInt();
        Medida = 0;
        if (NLados == 4){
            System.out.println("Informar medidas do lado: ");
            Medida = ler.nextInt();
        }
        if(NLados == 3)
            System.out.println("Triângulo");
        else if (NLados == 4){
            Medida = Medida * Medida;
            System.out.println("Quadrado.");
            System.out.println("Área: "+Medida);
        }
        else if (NLados == 5){
            System.out.println("Pentagono.");
    }
        else if (NLados == 6){
            System.out.println("Hexágono.");
    }
        else
            System.out.println("Poligono não identificado");
        ler.close();
    }
}
