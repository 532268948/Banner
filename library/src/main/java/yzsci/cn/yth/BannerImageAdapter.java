package yzsci.cn.yth;

/**
 * @author : yetianhua
 * @project: Banner
 * @date : 2020/8/20
 * @time : 2:31 PM
 * @note :
 */

import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * 默认实现的图片适配器，图片加载需要自己实现
 */
public abstract class BannerImageAdapter<T> extends AbstractBannerAdapter<T, BannerImageHolder> {

    public BannerImageAdapter(List<T> mData) {
        super(mData);
    }

    @Override
    public BannerImageHolder onCreateHolder(ViewGroup parent, int viewType) {
        ImageView imageView = new ImageView(parent.getContext());
        //注意，必须设置为match_parent，这个是viewpager2强制要求的
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        imageView.setLayoutParams(params);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return new BannerImageHolder(imageView);
    }

}
