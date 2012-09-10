package com.mobilemoney.config;

import android.content.Context;
import android.content.Intent;

import com.mobilemoney.activity.AboutActivity;
import com.mobilemoney.activity.HomeActivity;
import com.mobilemoney.activity.MobileActivity;
import com.mobilemoney.activity.MoneyActivity;
import com.mobilemoney.activity.SettingActivity;

public class UIRoute {
	public static void goHome(Context context) {
		final Intent intent = new Intent(context, HomeActivity.class);
		context.startActivity(intent);
	}

	public static void goMobile(Context context) {
		final Intent intent = new Intent(context, MobileActivity.class);
		context.startActivity(intent);

	}

	public static void goMoney(Context context) {
		final Intent intent = new Intent(context, MoneyActivity.class);
		context.startActivity(intent);
	}

	public static void goAbout(Context context) {
		final Intent intent = new Intent(context, AboutActivity.class);
		context.startActivity(intent);
	}

	public static void goSetting(Context context) {
		final Intent intent = new Intent(context, SettingActivity.class);
		context.startActivity(intent);
	}
}
