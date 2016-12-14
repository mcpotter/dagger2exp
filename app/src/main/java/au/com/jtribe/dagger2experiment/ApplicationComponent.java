package au.com.jtribe.dagger2experiment;

import android.content.SharedPreferences;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by matthewpotter on 9/12/2016.
 */

@Component(modules = ApplicationModule.class)
public abstract class ApplicationComponent {
  abstract void inject(ExperimentApplication application);

  public abstract SharedPreferences prefs();
}
