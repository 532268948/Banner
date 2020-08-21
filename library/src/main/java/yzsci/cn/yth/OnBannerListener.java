package yzsci.cn.yth;

/**
 * @author : yetianhua
 * @project: Banner
 * @date : 2020/8/20
 * @time : 11:01 AM
 * @note :
 */
public interface OnBannerListener<T> {

    /**
     * 点击事件
     *
     * @param data     数据实体
     * @param position 当前位置
     */
    void onBannerClick(T data, int position);

}
