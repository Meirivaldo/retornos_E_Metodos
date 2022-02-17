package one.dio.com;


/**
 *
 * Classe de exemplo para o exercicio da Aula 3 de métodos.
 */
public class Quadrilatero {

    public static double area(double lado){
        return lado * lado;
    }
    public static double area(double lado1, double lado2){

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior*baseMenor)*altura) / 2;
    }

/*
  O tipo de retorno tem que está compativel com a criação da sua definição, se não for compativel da erro
  de compilação!

  Ex.:
  Não se pode pedir um retorno de um long para um double!

  public static long exemplo1(){
      return 1.6;
  }

  Para se corrigir o erro de compilação deve trocar o *metodo* long para double!

  public static double exemplo2(){
      return 1.6;
    }
   *

 */

}
