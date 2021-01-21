package com;

import com.atcz.bean.Car;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.HierarchicalMessageSource;
import org.springframework.context.annotation.ComponentScan;

import javax.print.attribute.standard.NumberUp;
import java.util.*;

/**
 * @Author kuxiong
 * @Date:2020/12/28 17:09
 */

@SpringBootApplication(scanBasePackages = "com.atcz")
@ComponentScan("com.atcz")
public class onemain {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(onemain.class, args);
        Object car =(Car) run.getBean(Car.class);
        System.out.println(car);
    }


    @Test
    public void test(){
//        String s1=new String("aabb");
//        String s2=new String("aabb");
//        String s3="aabb";
//        String s4="aabb";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s3==s4);

          Solution sl=new Solution();
          int[] nums={1,2,3,4};
//        sl.sortColors(nums);
//        System.out.println(Arrays.toString(nums));
        List<List<Integer>> res=sl.subsets(nums);

        System.out.println(res.toString());
    }
}

class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        //添加一个空集
        res.add(new ArrayList<>());
        for (int i=0;i<nums.length;i++){
            dfs(nums,new ArrayList<>(),i);

        }
        return res;
    }
    void dfs(int[] nums, List<Integer>temp, int i){
        if (i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        //做选择
        temp.add(nums[i]);
        res.add(new ArrayList<>(temp));
        //递归
        dfs(nums,temp,i+1);
        //撤销选择
        temp.remove(temp.size()-1);
        dfs(nums,temp,i+1);
    }
}
