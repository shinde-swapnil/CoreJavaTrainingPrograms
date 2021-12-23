package exceptionHandlingDemo;

class MyException extends Exception {
    public MyException(String s){
        super(s);
    }
}
class CustomExceptions {
    public static void main(String args[]) throws MyException{
        try {
            throw new MyException("Custom Exception has occurred");
        }
        catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
