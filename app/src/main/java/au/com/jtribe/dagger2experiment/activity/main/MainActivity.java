package au.com.jtribe.dagger2experiment.activity.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import au.com.jtribe.dagger2experiment.R;
import au.com.jtribe.dagger2experiment.activity.BaseActivity;

public class MainActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    MainActivityComponent component = DaggerMainActivityComponent.builder().activityComponent(activityComponent).build();

    component.inject(this);
  }

  @Override
  protected int provideLayoutId() {
    return R.layout.activity_main;
  }
}
