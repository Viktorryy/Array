public class Main {
    public static void main(String[] args){

        //  Задание 4


        int [] mass1 = new int[] {1, 2, 3};
        for (int i = 0; i < mass1.length; i++) {
           int chet = mass1 [i] % 2;
            if (chet != 0) {
                mass1[i] = mass1[i] + 1;
            }

            if (i < mass1.length - 1) {
                System.out.print(mass1[i] + ", "); }
            else
            {
                System.out.print(mass1[i]);
            }
        }

    }
}