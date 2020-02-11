package com.example.springboot.springbootdemo.test;

import java.util.*;

public class TestFirstSet {
    public static void main(String[] args) {

        TestFirstSet tfs = new TestFirstSet();
        int[] nums = new int[]{2, 2, 1, 3, 3};
        //int m = tfs.singleNumber(nums);
        //System.out.println(m);
        int a = 1;
        int b = 2;
        int d = 2;
        a = a^b;
        b = b^a;
        a = a^b;
        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs2 = new String[]{"dog","racecar","car"};
        String[] strs3 = new String[]{"abc","abc"};
        String res = "anugnxshgonmqydttcvmtsoaprxnhpmpovdolbidqiyqubirkvhwppcdyeouvgedccipsvnobrccbndzjdbgxkzdbcjsjjovnhpnbkurxqfupiprpbiwqdnwaqvjbqoaqzkqgdxkfczdkznqxvupdmnyiidqpnbvgjraszbvvztpapxmomnghfaywkzlrupvjpcvascgvstqmvuveiiixjmdofdwyvhgkydrnfuojhzulhobyhtsxmcovwmamjwljioevhafdlpjpmqstguqhrhvsdvinphejfbdvrvabthpyyphyqharjvzriosrdnwmaxtgriivdqlmugtagvsoylqfwhjpmjxcysfujdvcqovxabjdbvyvembfpahvyoybdhweikcgnzrdqlzusgoobysfmlzifwjzlazuepimhbgkrfimmemhayxeqxynewcnynmgyjcwrpqnayvxoebgyjusppfpsfeonfwnbsdonucaipoafavmlrrlplnnbsaghbawooabsjndqnvruuwvllpvvhuepmqtprgktnwxmflmmbifbbsfthbeafseqrgwnwjxkkcqgbucwusjdipxuekanzwimuizqynaxrvicyzjhulqjshtsqswehnozehmbsdmacciflcgsrlyhjukpvosptmsjfteoimtewkrivdllqiotvtrubgkfcacvgqzxjmhmmqlikrtfrurltgtcreafcgisjpvasiwmhcofqkcteudgjoqqmtucnwcocsoiqtfuoazxdayricnmwcg";
        String res1 = "ukxidnpsdfwieixhjnannbmtppviyppjgbsludrzdleeiydzawnfmiiztsjqqqnthwinsqnrhfjxtklvbozkaeetmblqbxbugxycrlzizthtuwxlmgfjokhqjyukrftvfwikxlptydybmmzdhworzlaeztwsjyqnshggxdsjrzazphugckgykzhqkdrleaueuajjdpgagwtueoyybzanrvrgevolwssvqimgzpkxehnunycmlnetfaflhusauopyizbcpntywntadciopanyjoamoyexaxulzrktneytynmheigspgyhkelxgwplizyszcwdixzgxzgxiawstbnpjezxinyowmqsysazgwxpthloegxvezsxcvorzquzdtfcvckjpewowazuaynfpxsxrihsfswrmuvluwbdazmcealapulnahgdxxycizeqelesvshkgpavihywwlhdfopmmbwegibxhluantulnccqieyrbjjqtlgkpfezpxmlwpyohdyftzgbeoioquxpnrwrgzlhtlgyfwxtqcgkzcuuwagmlvgiwrhnredtulxudrmepbunyamssrfwyvgabbcfzzjayccvvwxzbfgeglqmuogqmhkjebehtwnmxotjwjszvrvpfpafwomlyqsgnysydfdlbbltlwugtapwgfnsiqxcnmdlrxoodkhaaaiioqglgeyuxqefdxbqbgbltrxcnihfwnzevvtkkvtejtecqyhqwjnnwfrzptzhdnmvsjnnsnixovnotugpzuymkjplctzqbfkdbeinvtgdpcbvzrmxdqthgorpaimpsaenmnyuyoqjqqrtcwiejutafyqmfauufwripmpcoknzyphratopyuadgsfrsrqkfwkdlvuzyepsiolpxkbijqw";
        String res2 = "abbaddcdedc";
        String res3 = "abcdefgh";
        String res4="ac";
        String res5= "daapmphpyyphd";
        int i=298;
        int j= 304;
        int m = j-i;
        char[] arr3 = res.toCharArray();
        System.out.println(res.substring(i,j));
        if(m %2 == 0){
            for(int k=0;k<(m/2);k++){
                if(arr3[i+k]==arr3[j-1-k]){
                    System.out.println(arr3[i+k]+"||"+arr3[j-1-k]);
                }
            }
           /* if(res3.charAt(i+m/2 -1) != res3.charAt(i+m/2))
                System.out.println(res3.charAt(i+m/2 -1));
                System.out.println(res3.charAt(i+m/2));*/
        }else{
            for(int k=0;k < (m-1)/2;k++){
                System.out.println(arr3[i+k]+"||"+arr3[j-1-k]);
            }
            if(res3.charAt(i+(m-1)/2-1) != res3.charAt(i+(m-1)/2+1))
                System.out.println(res3.charAt(i+(m-1)/2-1));
                System.out.println(res3.charAt(i+(m-1)/2+1));
                System.out.println(res3.substring(i,j));
        }
        //String str4 = res.substring(1,5); i=0;j=6;m=6;i+m/2 -1,i+m/2;(m-1)/2=2,i+(m-1)/2-1;i+(m-1)+1
       // System.out.println(res3.substring(1,6)+"||"+res3.charAt(2)+"||"+res3.charAt(4));
        long t1 = System.currentTimeMillis();
         System.out.println("最长回长字符串："+tfs.longestPalindrome4(res1));
        long t2 = System.currentTimeMillis();
        System.out.println("耗时："+(t2-t1));
       // String result="";
       // result.substring(0,result.length()-1);
        //String result = tfs.longestCommonPrefix(strs3);
        //System.out.println("结果："+result);
    }
    public String longestPalindrome4(String s) {
        String result = "";
        int[] limit = {0, 0};
        char[] ch = s.toCharArray();
        int i = 0;
        while (i < ch.length) {
            i = indexOf(ch, i, limit);
        }
        result = s.substring(limit[0], limit[1]);
        return result;
    }

    public int indexOf(char[] ch, int low, int[] limit) {
        int high = low + 1;
        while (high < ch.length && ch[high] == ch[low]) {
            high++;
        }
        int result = high;
        while (low > 0 && high < ch.length && ch[low - 1] == ch[high]) {
            low--;
            high++;
        }

        if (high - low > limit[1] - limit[0]) {
            limit[0] = low;
            limit[1] = high;
        }
        return result;
    }
    public String longestPalindrome3(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
//         保存起始位置，测试了用数组似乎能比全局变量稍快一点
        int[] range = new int[2];
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
//             把回文看成中间的部分全是同一字符，左右部分相对称
//             找到下一个与当前字符不同的字符
            i = findLongest(str, i, range);
        }
        return s.substring(range[0], range[1] + 1);
    }

    public static int findLongest(char[] str, int low, int[] range) {
//         查找中间部分
        int high = low;
        while (high < str.length - 1 && str[high + 1] == str[low]) {
            high++;
        }
//         定位中间部分的最后一个字符
        int ans = high;
//         从中间向左右扩散
        while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
            low--;
            high++;
        }
//         记录最大长度
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }

    public String longestPalindrome(String s) {
        String result = "";
        int maxSize = 0;
        boolean flag;
        int length = s.length();
        char[] arr= s.toCharArray();
        if(length>0){
           if(length>1){
               for(int i = 0;i< length;i++){
                   if(maxSize >=(length - i))
                       break;
                   for(int j = length;j>1;j--){
                       int m = j-i;
                       if(j<=i)
                           break;
                       if(m > maxSize){
                           flag =true;
                           if(s.charAt(i) == s.charAt(j-1)){
                               if(m > 3){
                                   if(s.charAt(i+1) != s.charAt(j-2)){
                                       continue;
                                   }
                                   if(m > 5){
                                       if(s.charAt(i+2) != s.charAt(j-3)){
                                           continue;
                                       }
                                   }
                                    if(m %2 == 0){
                                        if(s.charAt(i+m/2 -1) != s.charAt(i+m/2)){
                                            continue;
                                        }
                                        for(int k=0;k<(m/2);k++){
                                            if(arr[i+k]!=arr[j-1-k]){
                                                flag = false;
                                                break;
                                            }
                                        }
                                    }else{
                                         if(s.charAt(i+(m-1)/2-1) != s.charAt(i+(m-1)/2+1)){
                                             continue;
                                         }
                                        for(int k=0;k < (m-1)/2;k++){
                                            if(arr[i+k]!=arr[j-1-k]){
                                                flag = false;
                                                break;
                                            }
                                        }
                                     }
                               }
                               if(flag){
                                   String str = s.substring(i,j);
                                   result = str;
                                   maxSize = m;
                                   break;
                               }
                           }
                       }
                   }
               }
           }else{
               return s;
           }
        }
        return result;
    }

    public String reverseStr(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public int singleNumber(int[] nums){
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            result ^=nums[i];
        }
        return result;
    }
    public String longestCommonPrefix(String[] strs){
        /*String str = strs[0];
        String result="";
        boolean flag = true;
        for(int j=0;j<str.length();j++){
            if(flag) {
                String prefix = str.substring(0,j+1);
                for(int i = 0;i<strs.length;i++){
                    if(!strs[i].startsWith(prefix)){
                        result = prefix;
                        flag = false;
                        break;
                    }
                }
            }else {
                break;
            }
        }
         return result.substring(0,result.length()-1);*/
        String result = "";
        if(strs.length>0){
            List<String> list = Arrays.asList(strs);
            String str = strs[0];
            for (int i = 0;i<str.length();i++){
                String prefix = str.substring(0,i+1);
                if(!list.parallelStream().allMatch(s ->s.startsWith(prefix))){
                    result = prefix.substring(0,prefix.length()-1);
                    break;
                }else{
                    result = prefix;
                }
            }
        }
        return result;
    }

    public String longestPalindrome2(String s) {
        String result = "";
        int maxValue = 0;
        int print = 0;
        int length = s.length();
        if(length > 0){
            if(length > 1){
                for(int i = 0;i< length;i++){
                    if(maxValue >=(length - i))
                        break;
                    for(int j = length;j>1;j--){
                        int m = j-i;
                        if(j<=i)
                            break;
                        if(m > maxValue){
                            if(s.charAt(i) == s.charAt(j-1)){
                                if(m > 3){
                                    if(s.charAt(i+1) != s.charAt(j-2)){
                                        continue;
                                    }
                                    if(m > 5){
                                        if(s.charAt(i+2) != s.charAt(j-3)){
                                            continue;
                                        }
                                    }
                                    if(m %2 == 0){
                                        if(s.charAt(i+m/2 -1) != s.charAt(i+m/2))
                                            continue;
                                    }else{
                                        if(s.charAt(i+(m-1)/2-1) != s.charAt(i+(m-1)/2+1))
                                            continue;
                                    }
                                }
                                String str = s.substring(i,j);
                                print++;
                                System.out.println("截取字符串"+str+"||"+i+"||"+j+"||"+m+"||"+print);
                                if(str.equals(reverseStr(str))){
                                    result = str;
                                    maxValue = str.length();
                                    break;
                                }
                            }
                        }
                    }
                }
            }else{
                return s;
            }
        }
        return result;
    }
}
