//F9 compila e shift + F6 roda, ctrl + / comenta
////Exercício 1
//package aula.pkg1;
//import java.util.*;
//public class Aula1{
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        int Num, Ante, Suce;
//        System.out.println("Favor informar um número: ");
//        Num = ler.nextInt();
//        Ante = Num - 1;
//        Suce = Num + 1;
//        System.out.println("Antecessor: "+Ante);
//        System.out.println("Sucessor: "+ Suce);
//        ler.close();
//    }
//}

////Exercício 2
//package aula.pkg1;
//import java.util.*;
//public class Aula1{
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float Base, Altura, Area;
//        System.out.println("Favor informar a base: ");
//        Base = ler.nextFloat();
//        System.out.println("Favor informar a altura: ");
//        Altura = ler.nextFloat();
//        Area = Base * Altura;
//        System.out.println("Área: "+ Area);
//        ler.close();
//    }
//}

////Exercício 3
//package aula.pkg1;
//import java.util.*;
//public class Aula1{
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float Num1, Num2, Soma, Sub, Mult, Div;
//        System.out.println("Favor informar um número: ");
//        Num1 = ler.nextFloat();
//        System.out.println("Favor informar outro número: ");
//        Num2 = ler.nextFloat();
//        Soma = Num1 + Num2;
//        Sub = Num1 - Num2;
//        Div = Num1 / Num2;
//        System.out.println("Soma: "+ Soma);
//        System.out.println("Subtração: "+ Sub);
//        System.out.println("Divisão: "+ Div);
//        ler.close();
//    }
//}

////Exercício 4
//package aula.pkg1;
//import java.util.*;
//public class Aula1{
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float SalarioM, Reajuste, NovoSal;
//        System.out.println("Favor informar o salario atual: ");
//        SalarioM = ler.nextFloat();
//        System.out.println("Favor informar o reajuste: ");
//        Reajuste = ler.nextFloat();
//        NovoSal = SalarioM + SalarioM*Reajuste/ (float)100.0;
//        System.out.println("Novo salario: "+ NovoSal);
//        ler.close();
//    }
//}

////Exercício 5
//package aula.pkg1;
//import java.util.*;
//public class Aula1{
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float Distancia, Combustivel, Consumo;
//        System.out.println("Favor informar a distância: ");
//        Distancia = ler.nextFloat();
//        System.out.println("Favor informar qtde. combustível: ");
//        Combustivel = ler.nextFloat();
//        Consumo = Distancia/Combustivel;
//        System.out.println("Consumo médio é: "+Consumo+"Km/l");
//        ler.close();
//    }
//}

////Exercício 6
//package aula.pkg1;
//import java.util.*;
//public class Aula1{
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        String Aluno;
//        float N1, N2, N3, Media;
//        System.out.println("Favor informar nome do aluno: ");
//        Aluno = ler.nextLine();
//        System.out.println("Favor informar a N1: ");
//        N1 = ler.nextFloat();
//        System.out.println("Favor informar a N2: ");
//        N2 = ler.nextFloat();
//        System.out.println("Favor informar a N3: ");
//        N3 = ler.nextFloat();
//        Media = (N1 + N2 + N3) / (float) 3.0;
//        System.out.println("Aluno: "+Aluno+"\nMédia: "+Media);
//        ler.close();
//    }
//}

////Exercício 7
//package aula.pkg1;
//import java.util.*;
//public class Aula1{
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float F, C;
//        System.out.println("Informar temperatura em Celsius: ");
//        C = ler.nextFloat();
//        F = ((float)9.0 * C + (float)160.0) / (float) 5.0;
//        System.out.println("Fahrenheit: "+F);
//        ler.close();
//    }
//}

////Exercício 8
//package aula.pkg1;
//import java.util.*;
//public class Aula1{
//    public static void main(String[] args){
//        Scanner ler = new Scanner (System.in);
//        float CustoF, CustoD, CustoC;
//        System.out.println("Informar custo de fabrica: ");
//        CustoF = ler.nextFloat();
//        CustoD = CustoF + CustoF * (float) (45.0 / 100.0);
//        CustoC = CustoD + CustoD * (float) (28.0 / 100.0);
//        System.out.println("Custo do consumidor: "+CustoC);
//        ler.close();
//    }
//}
