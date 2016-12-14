package au.com.jtribe.dagger2experiment;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by matthewpotter on 9/12/2016.
 */
@Module
public class ApplicationModule {

  public final static String PREFS_KEY = "experimentPrefs";

  private final Application application;

  ApplicationModule(Application application) {
    this.application = application;
  }

  @Provides
  public SharedPreferences prefs() {
    return application.getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE);
  }

  @Provides
  public Application app() {
    return application;
  }
}
