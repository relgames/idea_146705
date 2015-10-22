package idea.issue;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = TestModule.class)
@Singleton
public interface TestComponent {
    Service service();
}
