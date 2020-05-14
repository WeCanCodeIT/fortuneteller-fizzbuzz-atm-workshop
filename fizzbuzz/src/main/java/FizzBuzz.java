public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(12);
    }

    public static void fizzBuzz(int numberRange){

        for(int i = 1; i <= numberRange; i++) {
            if(((i % 3) == 0 ) && ((i % 5) == 0)){
                System.out.println("FizzBuzz");
            }
            else if ((i % 7) == 0){
                continue;
            }
            else if((i % 3) == 0) {
                System.out.println("Fizz");
            }
            else if((i % 5) == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

// There will be a range of numbers
// Print each number in the range
// If the number is a multiple of 3 print fizz instead
// If number is a multiple of 5 print buzz instead
// If number is both print fizzbuzz
