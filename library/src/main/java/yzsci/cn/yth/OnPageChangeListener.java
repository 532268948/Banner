package yzsci.cn.yth;

import androidx.annotation.Px;
import androidx.viewpager2.widget.ViewPager2;

/**
 * @author : yetianhua
 * @project: Banner
 * @date : 2020/8/20
 * @time : 11:21 AM
 * @note :
 */
public interface OnPageChangeListener {
    void onPageScrolled(int position, float positionOffset, @Px int positionOffsetPixels);
    void onPageSelected(int position);
    void onPageScrollStateChanged(@ViewPager2.ScrollState int state);
}
