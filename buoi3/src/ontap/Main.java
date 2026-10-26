package ontap;

import ontap.oop;

public class Main{
    public static void main(String[] args) {

        hinhtron ht1 = new hinhtron(4,5,5);
        hinhtron ht2 = new hinhtron();

        System.out.println(ht1.dientichhinhtron());
        if(ht1.dientichhinhtron() > ht2.dientichhinhtron()){
            System.out.println("hinh tron 1 lon hon hinh tron 2");
        }else{
            System.out.printf("hinh tron 1 be hon hinh tron 2");
        }
//        System.out.printf(ht2);
    }
}

