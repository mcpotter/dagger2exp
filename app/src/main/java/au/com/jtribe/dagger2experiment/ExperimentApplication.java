package au.com.jtribe.dagger2experiment;

import android.app.Application;
import android.content.SharedPreferences;
import javax.inject.Inject;

/**
 * Created by matthewpotter on 9/12/2016.
 */

public class ExperimentApplication extends Application {

  @Inject SharedPreferences preferences;
  private ApplicationComponent component;

  @Override
  public void onCreate() {
    super.onCreate();

    component = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))
        .build();

    component.inject(this);

    if (preferences == null) {
      throw new IllegalStateException();
    }
  }

  public ApplicationComponent getComponent() {
    return component;
  }
}
