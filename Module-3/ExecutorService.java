import java.util.concurrent.*;
import java.util.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> "Task 1 result");
        tasks.add(() -> "Task 2 result");
        tasks.add(() -> "Task 3 result");

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            System.out.println("Result: " + future.get());
        }

        executor.shutdown();
    }
}
