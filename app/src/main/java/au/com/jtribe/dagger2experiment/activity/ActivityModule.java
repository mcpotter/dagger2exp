package au.com.jtribe.dagger2experiment.activity;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Inject;

/**
 * Created by matthewpotter on 9/12/2016.
 */
@Module
@PerActivity
public class ActivityModule {

  private final BaseActivity activity;

  ActivityModule(BaseActivity activity) {
    this.activity = activity;
  }

  @Provides
  Context context() {
    return activity;
  }
}
