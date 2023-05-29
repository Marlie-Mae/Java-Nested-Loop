import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = 1;
        int c = b;

        for (int i = 1; i <= a; i++) {
            System.out.print(i);
            if (--c == 0) {
                c = ++b;
                System.out.println();
            }
        }

       
  }
}