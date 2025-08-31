import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyOne {

    public static void main(String[] args){

        try( var scope = new StructuredTaskScope<String>()){
            var process1 = new LongProcess(3, "result 1");
            var process2 = new LongProcess(3, "result 1");

            StructuredTaskScope.Subtask<String> res1 = scope.fork(process1);
            StructuredTaskScope.Subtask<String> res2 = scope.fork(process1);


            scope.join();

            if(res1.state() == StructuredTaskScope.Subtask.State.SUCCESS)
                System.out.println(res1.get());

            if(res2.state() == StructuredTaskScope.Subtask.State.SUCCESS)
                System.out.println(res2.get());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
