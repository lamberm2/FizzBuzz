public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 1000){
            if (i%3 == 0 || i%5 == 0){
                sum += 1;

            }
            i += 1;
        }
        System.out.println(sum);
    }
}
