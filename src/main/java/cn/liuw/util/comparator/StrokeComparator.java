package cn.liuw.util.comparator;

import java.util.Comparator;

/**
 * @author Jeff
 *
 * Copyright (c) 复制或转载本文，请保留该注释。
 */
public class StrokeComparator implements Comparator<String> {

    public int compare(String o1, String o2) {

//        Chinese chinese = new Chinese();
//
//        for (int i = 0; i < o1.length() && i < o2.length(); i++) {
//            int codePoint1 = o1.codePointAt(i);
//            int codePoint2 = o2.codePointAt(i);
//            if (codePoint1 == codePoint2)
//                continue;
//
//            int stroke1 = chinese.stroke(codePoint1);
//            int stroke2 = chinese.stroke(codePoint2);
//
//            if (stroke1 < 0 || stroke2 < 0) {
//                return codePoint1 - codePoint2;
//            }
//
//            if (stroke1 != stroke2) {
//                return stroke1 - stroke2;
//            }
//        }

        return o1.length() - o2.length();
    }
}