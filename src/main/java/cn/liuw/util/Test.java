package cn.liuw.util;

import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

import java.util.Arrays;

/**
 * Created by liuw on 2017/3/22.
 */
public class Test {

    public static void main(String[] args){
        try {
            String pinyin = PinyinHelper.getShortPinyin("你好");
            System.out.print(pinyin);

            String[] arr = { "刘伟", "胡壮壮", "张力伟", "衣峻松" ,"怡情"};
            Arrays.sort(arr, new PinyinComparator());
            for(String str: arr){
                System.out.print(str + ",");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
