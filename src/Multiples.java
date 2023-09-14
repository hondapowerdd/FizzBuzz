public class Multiples {
    public static void main(String[] args) {
        int total_num = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0){
                total_num++;
                continue;
            } else if (i % 5 == 0) {
                total_num++;
            }
        }
        System.out.println(total_num);
    }
}
