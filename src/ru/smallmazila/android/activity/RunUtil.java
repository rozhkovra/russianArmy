package ru.smallmazila.android.activity;

import android.app.Activity;
import android.content.Intent;

public class RunUtil {
	public static void runEmptyActivity(Activity activity, Class<? extends Activity> toActivity){
		Intent intent = new Intent();
//		intent.setClass(LogoActivity.this, TypesActivity.class);
		intent.setClass(activity, toActivity);
		activity.startActivity(intent);
	}

	public static void runArgsActivity(Activity activity, Class<? extends Activity> toActivity, Intent intent){
		intent.setClass(activity, toActivity);
		activity.startActivity(intent);
	}
}
