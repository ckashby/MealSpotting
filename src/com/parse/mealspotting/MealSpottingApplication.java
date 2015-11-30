package com.parse.mealspotting;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class MealSpottingApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		/*
		 * In this tutorial, we'll subclass ParseObject for convenience to create and modify Meal objects
		 */
		ParseObject.registerSubclass(Meal.class);

		Parse.initialize(this, "6TqeI5Ecr5EDsI90kj3aFMQw2HDW3lTg7l5Jay4Y", "E2B3QaN60JxJZ7MOcokL1IrK55uGforKvLnyq4CV");

		/*

		 * 
		 * After logging out, an anonymous user is abandoned, and its data is no
		 * longer accessible. In your own app, you can convert anonymous users
		 * to regular users so that data persists.
		 * 
		 * Learn more about the ParseUser class:
		 * https://www.parse.com/docs/android_guide#users
		 */
		ParseUser.enableAutomaticUser();

		/*
		 * For more information on app security and Parse ACL:
		 * https://www.parse.com/docs/android_guide#security-recommendations
		 */
		ParseACL defaultACL = new ParseACL();

		/*
		 * If you would like all objects to be private by default, remove this
		 * line
		 */
		defaultACL.setPublicReadAccess(true);

		ParseACL.setDefaultACL(defaultACL, true);
	}

}
