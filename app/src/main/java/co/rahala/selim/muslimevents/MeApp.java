package co.rahala.selim.muslimevents;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by aselims on 19/06/15.
 */
public class MeApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "KRtJ3jtsj9oEO5GfV1uSfBF2Hd19FU3mRorRGX2b", "kydoM6rZPaY7YHwGSbq9jnJu8nWDH4b6soXkCerr");


    }
}
