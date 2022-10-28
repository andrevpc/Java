package projetojava2022;
import java.util.*;

//public class Lista3 {
//    //Exercício 1 - FOR
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        int Num;
//        for(Num=1;Num<=10;Num++)
//            System.out.println("Número: "+Num);
//        ler.close();
//    }
//}

//public class Lista3 {
//    //Exercício 1 - WHILE
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        int Num;
//        Num = 1;
//        while(Num<=10){
//            System.out.println("Número: "+Num);
//            Num++;
//        }
//        ler.close();
//    }
//}

//public class Lista3 {;
//    //Exercício 2
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        int Num;
//        for(Num=10;Num>=0;Num--)
//            System.out.println("Número: "+Num);
//        ler.close();
//    }
//}

//public class Lista3 {;
//    //Exercício 3
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        int Num, N;
//        System.out.println("Informe um número: ");
//        N = ler.nextInt();
//        for(Num=0;Num<=N;Num++)
//            System.out.println("Número: "+Num);
//        ler.close();
//    }
//}

public class Lista3 {;
    //Exercício 4
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int Num,N;
        System.out.println("Informe um número: ");
        N = ler.nextInt();
        for(Num=0;Num<=10;Num++)
            System.out.println(Num+"X"+N+"="+Num*N);
        ler.close();
    }
}
