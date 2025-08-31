package com.example.endoftermhomework;

import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GoodsAdapter  extends BaseAdapter {
    private  GoodsBean goods;
    private Context context;
    public  GoodsAdapter(Context context,GoodsBean goods){
        this.goods=goods;
        this.context=context;
    }
    public  GoodsAdapter(TurnFragment turnFragment,GoodsBean instance){
    }
    @Override
    public  int getCount(){
        return goods.getIcons().length;
    }
    @Override 
    public Object getItem(int position){
        return goods.getIcons()[position];
    }
    @Override
    public  long getItemId(int position){
        return position;
    }
    @Override
    public View getView (int position,View convertView,ViewGroup parent){
        viewHolder viewHolder;
        if(convertView==null){
            viewHolder=new viewHolder();
            convertView=View.inflate(context,R.layout.activity_record3,null);
            viewHolder.image=convertView.findViewById(R.id.iv_item);
            viewHolder.price=convertView.findViewById(R.id.price);
            viewHolder.title=convertView.findViewById(R.id.title);
            convertView.setTag(viewHolder);
        }else {
            viewHolder=((viewHolder) convertView.getTag());
        }
        //加载数据
        viewHolder.image.setImageResource(goods.getIcons()[position]);
        viewHolder.price.setText(goods.getPrices()[position]);
        viewHolder.title.setText(goods.getTitles()[position]);
                    return  convertView;
        }
        private  class  viewHolder{
        private ImageView image;
        private  TextView price;
        private TextView title;
    }
}