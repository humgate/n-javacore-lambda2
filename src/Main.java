public class Main {
    public static void main(String[] args) {
        //то же самое что OnTaskDoneListener listener = s -> System.out.println(s);
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
