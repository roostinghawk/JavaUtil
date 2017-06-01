package cn.liuw.util;

import cn.liuw.util.comparator.PinyinComparator;
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
                System.out.println(str + ",");
            }

            // 检查身份证合法
            String id = "411303198606165977";
            System.out.println("是否合法:" + IdCardUtil.validateCard(id));
            System.out.println("省份：" + IdCardUtil.getProvince(id));
            System.out.println("性别：" + IdCardUtil.getGenderByIdCard(id));
            System.out.println("生日：" + IdCardUtil.getBirthByIdCard(id));
            System.out.println("年龄：" + IdCardUtil.getAgeByIdCard(id));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
