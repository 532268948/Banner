package yzsci.cn.yth;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : yetianhua
 * @project: Banner
 * @date : 2020/8/20
 * @time : 10:47 AM
 * @note :
 */
public abstract class AbstractBannerAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    private int increaseCount = 2;
    private List<T> data = new ArrayList<>();

    public AbstractBannerAdapter(List<T> datas) {
        setDatas(datas);
    }

    public void setDatas(List<T> datas) {
        if (datas == null) {
            datas = new ArrayList<>();
        }
        data = datas;
    }

    public T getData(int position) {
        return data.get(position);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return onCreateHolder(parent,viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        int real = getRealPosition(position);
        onBindView(holder, data.get(real), real, getRealCount());
    }

    @Override
    public int getItemCount() {
        return getRealCount() > 1 ? getRealCount() + increaseCount : getRealCount();
    }

    public int getRealPosition(int position) {
        return BannerUtils.getRealPosition(increaseCount == 2, position, getRealCount());
    }

    public int getRealCount() {
        return data == null ? 0 : data.size();
    }

    public void setIncreaseCount(int increaseCount) {
        this.increaseCount = increaseCount;
    }

    /**
     * 创建ViewHolder
     *
     * @return XViewHolder
     */
    public abstract VH onCreateHolder(ViewGroup parent, int viewType);

    /**
     * 绑定布局数据
     *
     * @param holder   XViewHolder
     * @param data     数据实体
     * @param position 当前位置
     * @param size     总数
     */
    public abstract void onBindView(VH holder, T data, int position, int size);


}
