public class Primes {
    public static void main(String[] args){  //Внутри мейна описал работу алгоритма который быстро проверяет на простоту числа
        int[] a = new int[100];
        int size = a.length;
        for (int i = 0; i < size; i++){
            a[i] = i;
        }
        for (int i = 2; i < size; i++){
            if (a[i] != 0){
                for (int j = 2*i; j < size; j+=i){
                    a[j] = 0;
                }
            }
        }
        for (int i = 0; i < size; i++){
            if (a[i] != 0){
                String tmp = Integer.toString(a[i]) + " ";
                System.out.print(tmp);
            }
        }
    }
    public static boolean isPrime(int n){   //Проверка конкретного числа на простоту
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
