package au.com.jtribe.dagger2experiment.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import au.com.jtribe.dagger2experiment.ApplicationComponent;
import au.com.jtribe.dagger2experiment.ExperimentApplication;
import javax.inject.Inject;

/**
 * Created by matthewpotter on 9/12/2016.
 */

public abstract class BaseActivity extends AppCompatActivity {

  protected ActivityComponent activityComponent;

  @Inject SharedPreferences prefs;
  @Inject @PerActivity Context context;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(provideLayoutId());

    ApplicationComponent applicationComponent =
        ((ExperimentApplication) getApplication()).getComponent();

    activityComponent = DaggerActivityComponent.builder()
        .applicationComponent(applicationComponent)
        .activityModule(new ActivityModule(this))
        .build();

    activityComponent.inject(this);

    if (prefs == null) {
      throw new IllegalStateException();
    }

    if (context == null) {
      throw new IllegalStateException();
    }
  }

  protected abstract int provideLayoutId();
}
