package au.com.jtribe.dagger2experiment.activity.main;

import au.com.jtribe.dagger2experiment.activity.ActivityComponent;
import dagger.Component;

/**
 * Created by matthewpotter on 12/12/2016.
 */
@Component(dependencies = ActivityComponent.class)
@Main
abstract class MainActivityComponent {
  public abstract void inject(MainActivity mainActivity);
}
