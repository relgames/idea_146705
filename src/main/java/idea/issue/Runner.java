package idea.issue;

public class Runner {
    public static void main(String[] args) {
        TestComponent testComponent = DaggerTestComponent.create();
        testComponent.service().hello();
    }
}
