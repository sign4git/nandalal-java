public class RunnableUsingLambda
{
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Runnable using lambda");
        new Thread(runnable).start();
    }
}