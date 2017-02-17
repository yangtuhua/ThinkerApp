package com.tuhua.thinker.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Application
 * Created by yangtufa on 2017/2/17.
 */
@DefaultLifeCycle(
        application = "com.tuhua.thinker.Application",
        flags = ShareConstants.TINKER_ENABLE_ALL
)
public class TApplication extends DefaultApplicationLike{

    public TApplication(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }

    @Override
    public void onBaseContextAttached(Context base) {
        super.onBaseContextAttached(base);


    }
}
