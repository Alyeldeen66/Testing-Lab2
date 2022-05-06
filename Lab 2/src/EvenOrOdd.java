public class EvenOrOdd {
    public String check(int n){
        if( n < 0){
            throw new IllegalArgumentException("Number must be positive");
        }
        if(n%2 ==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
