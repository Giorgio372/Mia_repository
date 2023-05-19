package javaesercizi.esercizio_10;

public class forEach {
    public static void main(String[] args){
    int[] numeri = {1,2,3,4,5,6,7,8,9,10};
    for (int num : numeri){

        int lunghezza = numeri.length; // la classe array ha un metodo che descrive la quantità totale degli elementi 
        System.out.println("numero " +num + " di "+lunghezza +" elementi" );
    }
    }
}
