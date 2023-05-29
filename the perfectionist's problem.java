class Main{
    public static void main(String args[]){

        int a = 1000, b;

        for (int num1 = 2; num1 <= a / 2; num1++) {
            b = 1;
            for (int num2 = 2; num2 <= num1 / 2; num2++) {
                if (num1 % num2 == 0) {
                    b += num2;
                }
            }
            if (b == num1) {
                System.out.print(num1+" ");
            }
        }
        System.out.println();
  }
}