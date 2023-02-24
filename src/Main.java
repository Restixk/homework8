import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] massiv = new int[3];// Задача 1
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        float[] massivN = new float[3];
        massivN[0] = 1.57f;
        massivN[1] = 7.654f;
        massivN[2] = 9.954f;
        int[] massivS = new int[10];
        for (int i = 0 ; i < 10; i= i+1){
            massivS[i]=i;
        }
        System.out.print(massiv[0] + ", ");// задача 2
        System.out.print(massiv[1] + ", ");
        System.out.println(massiv[2] + ", ");
        System.out.print(massivN[0] + ", ");
        System.out.print(massivN[1] + ", ");
        System.out.print(massivN[2] + ", ");
        System.out.println();
        for(int i = 0; i < 10; i = i + 1){
            System.out.print(i +  ", ");
        }
        System.out.println();
        System.out.print(massiv[2] + ", ");// задача 3
        System.out.print(massiv[1] + ", ");
        System.out.println(massiv[0] + ", ");
        System.out.print(massivN[2] + ", ");
        System.out.print(massivN[1] + ", ");
        System.out.print(massivN[0] + ", ");
        System.out.println();
        for(int i = 9; i >= 0; i = i - 1){
            System.out.print(i +  ", ");
        }
        System.out.println();
       for (int i = 0; i < 3 ; i = i + 1){//задача 4
           if (massiv[i] % 2 != 0 ){
               massiv[i] = massiv[i] + 1;
           }
       }

        System.out.println(Arrays.toString(massiv));




    }
}