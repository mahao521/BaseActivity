package com.lee.baseactivity.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity管理
 */
public class ActivityCollector {
    //创建Activity管理列表
    public static List<Activity> activities = new ArrayList<>();
    //添加
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    //删除
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    //关闭所有页面
    public static void finishAll(){
        for (Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
