package ru.smallmazila.russianarmy.photo.gallery.adapter;

import java.util.List;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

public class PhotoPagerAdapter extends PagerAdapter {
	List<View> pages = null;
	
	public PhotoPagerAdapter(List<View> pages){
		this.pages = pages;
	}
	
	@Override
	public Object instantiateItem(View collection, int position){
		View v = pages.get(position);
		((ViewPager)collection).addView(v,0);
		return v;
	}
	
	@Override
	public void destroyItem(View collection, int position, Object view){
		((ViewPager)collection).removeView((View)view);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return pages.size();
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		// TODO Auto-generated method stub
		return view.equals(object);
	}
	
	@Override
	public void finishUpdate(View v){
		
	}
	
	@Override
	public void restoreState(Parcelable arg0, ClassLoader arg1){
		
	}
	
	@Override
	public Parcelable saveState(){
		return null;
	}
	
	@Override
	public void startUpdate(View arg0){
	}
}
