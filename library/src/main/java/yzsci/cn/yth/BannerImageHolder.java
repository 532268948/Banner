package yzsci.cn.yth;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author : yetianhua
 * @project: Banner
 * @date : 2020/8/20
 * @time : 2:31 PM
 * @note :
 */
public class BannerImageHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;

    public BannerImageHolder(@NonNull View view) {
        super(view);
        this.imageView = (ImageView) view;
    }
}
