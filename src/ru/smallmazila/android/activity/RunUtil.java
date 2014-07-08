package ru.smallmazila.android.activity;

import ru.smallmazila.android.activity.animation.FlipActivities;
import android.app.Activity;
import android.content.Intent;

public class RunUtil {
	protected static FlipActivities mFliper = null;
	
	public static void runEmptyActivity(Activity activity, Class<? extends Activity> toActivity){
		Intent intent = new Intent();
		intent.setClass(activity, toActivity);
		activity.startActivity(intent);
	}

	public static void flipEmptyActivity(Activity activity, Class<? extends Activity> toActivity){
		Intent intent = new Intent();
		intent.setClass(activity, toActivity);
		createFliper(activity);
		mFliper.toIntent = intent;
		mFliper.flip();
		mFliper.activityStatus = FlipActivities.ACTIVITYSTATUS.NONE;
	}

	public static void runArgsActivity(Activity activity, Class<? extends Activity> toActivity, Intent intent){
		intent.setClass(activity, toActivity);
		activity.startActivity(intent);
	}

	public static void flipArgsActivity(Activity activity, Class<? extends Activity> toActivity, Intent intent){
		intent.setClass(activity, toActivity);
		createFliper(activity);
		mFliper.toIntent = intent;
		mFliper.flip();
		mFliper.activityStatus = FlipActivities.ACTIVITYSTATUS.NONE;
	}
	
	public static FlipActivities createFliper(Activity activity){
		if(mFliper!=null){
			mFliper.setFromActivity(activity);
		}else
			mFliper = new FlipActivities(activity);
		return mFliper;
	}
}
