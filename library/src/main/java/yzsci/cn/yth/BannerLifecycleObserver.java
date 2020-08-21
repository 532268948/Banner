package yzsci.cn.yth;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * @author : yetianhua
 * @project: Banner
 * @date : 2020/8/20
 * @time : 11:18 AM
 * @note :
 */
public interface BannerLifecycleObserver extends LifecycleObserver {

    void onStop(LifecycleOwner owner);

    void onStart(LifecycleOwner owner);

    void onDestroy(LifecycleOwner owner);
}
