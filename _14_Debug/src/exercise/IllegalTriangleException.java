package exercise;

public class IllegalTriangleException extends IndexOutOfBoundsException{
    public IllegalTriangleException(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || c <= 0 || b <= 0 || a + b <= c || b + c <= a || c + a <= b){
            throw this;
        }
        else {
            System.out.println("This is a Triangle.");
        }
    }
    @Override
    public String getMessage(){
        return " by Phi Long";
    }
}
