package Try_Catch.IllegalTriangleException;

public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        return "Cạnh hư cấu";
    }
}
