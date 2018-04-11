public class Recursion {

    public int factorial(int n) {
        if(n<1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public int fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);



    }

    public int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        if((int)(Math.log10(n)+1)==1){
            return n;
        }
        return sumDigits(n%10)+sumDigits(n/10);
    }

    public int count7(int n) {
        if(n == 0){
            return 0;
        }
        if((int)(Math.log10(n)+1)==1){
            if(n == 7){
                return 1;
            }
            else{
                return 0;
            }
        }

        return count7(n%10) + count7(n/10);
    }




}
