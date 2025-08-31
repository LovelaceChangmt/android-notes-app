package com.example.endoftermhomework;

public class GoodsBean {

    private static GoodsBean goodsBean;

    public static GoodsBean getInstance(){

        if (goodsBean == null){
            goodsBean = new GoodsBean();
        }

        return goodsBean;
    }

    private final String[]titles={"零食","餐饮","餐饮","旅行","交通","购物","美容",
            "零食","餐饮","餐饮","旅行","交通","购物","美容",
            "零食","餐饮","餐饮","旅行","交通","购物","美容",};
    private final String[]prices={"-55.00","-122.00","+50.00","-500.00","-200.00","-600.00","-500.00",
            "-55.00","-122.00","+50.00","-500.00","-200.00","-600.00","-500.00",
            "-55.00","-122.00","+50.00","-500.00","-200.00","-600.00","-500.00",};
    private final int[] icons={R.drawable.lingshi,R.drawable.canyin, R.drawable.canyin,R.drawable.feiji,R.drawable.gongjiao,R.drawable.gouwu,R.drawable.meirong,
            R.drawable.lingshi,R.drawable.canyin, R.drawable.canyin,R.drawable.feiji,R.drawable.gongjiao,R.drawable.gouwu,R.drawable.meirong,
            R.drawable.lingshi,R.drawable.canyin, R.drawable.canyin,R.drawable.feiji,R.drawable.gongjiao,R.drawable.gouwu,R.drawable.meirong,};

    public String[] getTitles() {
        return titles;
    }

    public String[] getPrices() {
        return prices;
    }

    public int[] getIcons() {
        return icons;
    }
}

