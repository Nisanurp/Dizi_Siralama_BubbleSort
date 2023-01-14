package org.example;
import java.util.Scanner;
import java.util.*;
class BubbleSort {
    void BubbleSort(int dizi[]) {
        int temp;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] < dizi[j]) {
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
    }
        void printArray ( int dizi[])
        {
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i] + " ");
            }
            System.out.println();
        }

}
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int elemanSayısı;
        System.out.println("Dizinizin eleman sayısını giriniz..");
        elemanSayısı= input.nextInt();
        int dizi[]=new int[elemanSayısı];
        System.out.println("Dizinin elemanlarını giriniz");
        for(int i=0; i<dizi.length; i++)
        {
            System.out.print("dizi["+i+"]=");
            dizi[i]=input.nextInt();
        }
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali:");
        BubbleSort ob=new BubbleSort();
        ob.BubbleSort(dizi);
        ob.printArray(dizi);
        System.out.println("Dizinin 12.elemanı:"+dizi[12]);


    }
}