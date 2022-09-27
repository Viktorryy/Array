public class Main {
    public static void main(String[] args){

        //  Задание 2


        int [] mass1 = new int[] {1, 2, 3};
        for (int i = 0; i < mass1.length; i++) {
            if (i < mass1.length - 1) {
                System.out.print(mass1[i] + ", "); }
            else
            {
                System.out.print(mass1[i]);
            }
        }
            System.out.println();


        float [] mass2 = {1.57F, 7.654F, 9.986F};
        for (int i = 0; i < mass2.length; i++) {
            if (i < mass2.length - 1) {
                System.out.print(mass2[i] + ", "); }
            else {
                System.out.print(mass2[i]);
            }
        }
        System.out.println();

        int [] mass3 = new int[3];
        mass3 [0] = 5;
        mass3 [1] = 15;
        mass3 [2] = 25;

        for (int i = 0; i < mass3.length; i++) {
            if (i < mass2.length - 1) {
                System.out.print(mass3[i] + ", "); }
            else {
                System.out.print(mass3[i]);
            }
        }
    }
}