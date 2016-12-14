package au.com.jtribe.dagger2experiment.activity;

import android.content.Context;
import android.content.SharedPreferences;
import au.com.jtribe.dagger2experiment.ApplicationComponent;
import dagger.Component;

/**
 * Created by matthewpotter on 9/12/2016.
 */
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
@PerActivity
public interface ActivityComponent {
  void inject(BaseActivity activity);

  SharedPreferences prefs();
  Context context();
}
