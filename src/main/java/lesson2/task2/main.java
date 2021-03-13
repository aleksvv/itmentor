package task2;

import java.util.Random;

public class main {
    public static void main(String [] args) throws underZero {
        System.out.println("Starting calculate...");
        try {
            generator(10000);
        }
        catch(underZero e){
            System.out.println("Generated number below zero");   
        }
    }
    
    static void myExcepter() throws underZero {
 
        throw new underZero();
    }

    public static void generator (int amount) throws underZero {
        int i;
        float[] listK = new float[amount];
        Random random = new Random();

            for (i = 0; i < amount; i++) {

                listK[i] = random.nextInt();
                if (listK[i] < 0 ) {
                    myExcepter();
                }
                double q = Math.sqrt(listK[i]);
                int k = (int) Math.round(q);
                if (k*k == listK[i]) {
                    System.out.println(listK[i]);   
                }
            }   
            System.out.println("end");   
    }


}

