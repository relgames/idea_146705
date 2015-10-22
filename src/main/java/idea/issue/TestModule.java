package idea.issue;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    @Provides
    public Service service() {
        return new Service();
    }

}
