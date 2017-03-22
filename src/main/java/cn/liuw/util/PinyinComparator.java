package cn.liuw.util;

import com.github.stuxuhai.jpinyin.PinyinHelper;

import java.util.Comparator;

/**
 * Created by liuw on 2017/3/22.
 */
public class PinyinComparator implements Comparator<String> {
    public int compare(String o1, String o2){
        try {
            return PinyinHelper.getShortPinyin(o1).compareTo(PinyinHelper.getShortPinyin(o2));
        } catch (Exception ex){
            return 0;
        }
    }
    private String concatPinyinStringArray(String[] pinyinArray) {
        StringBuffer pinyinSbf = new StringBuffer();
        if ((pinyinArray != null) && (pinyinArray.length > 0)) {
            for (int i = 0; i < pinyinArray.length; i++) {
                pinyinSbf.append(pinyinArray[i]);
            }
        }
        return pinyinSbf.toString();
    }
}