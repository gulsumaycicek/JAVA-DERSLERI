package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {

        // bır listede ortalamanın ustunde olan element sayısını bulunuz


        List<Double> sayılar = new ArrayList<>();
        sayılar.add(1.0);
        sayılar.add(.0);
        sayılar.add(5.0);
        sayılar.add(3.0);
        sayılar.add(5.0);
        sayılar.add(6.0);
        sayılar.add(1.0);
        sayılar.add(7.0);

        //ortalama bul
        //ortalamanın ustunde olanları,bır lıste at

        Double ortalama=0.0;
        Double toplam=0.0;
        for (int i = 0; i <sayılar.size() ; i++) {
            toplam+=sayılar.get(i);
        }
        ortalama= toplam / sayılar.size();
        System.out.println(ortalama); // 3.875

        
        // ortalamanin ustunde olanlari, bir liste at
        List<Double> ortalamaninUstundekiler=new ArrayList<>();
        for (int i = 0; i < sayılar.size() ; i++) {
            if (sayılar.get(i)>ortalama){
                ortalamaninUstundekiler.add(sayılar.get(i));
            }
        }
        System.out.println(ortalamaninUstundekiler);


    }

    }

