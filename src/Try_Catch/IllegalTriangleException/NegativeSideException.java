package Try_Catch.IllegalTriangleException;

public class NegativeSideException extends Exception{
    @Override
    public String getMessage() {
        return "Cạnh nhỏ hơn 0";
    }
}
