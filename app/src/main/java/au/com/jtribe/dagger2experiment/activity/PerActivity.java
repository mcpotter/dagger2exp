package au.com.jtribe.dagger2experiment.activity;

import dagger.releasablereferences.CanReleaseReferences;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

/**
 * Created by matthewotter on 9/12/2016.
 */
@Scope
@CanReleaseReferences
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
