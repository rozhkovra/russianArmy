package ru.smallmazila.russianarmy.photo.gallery;

import java.util.ArrayList;
import java.util.List;

import ru.smallmazila.russianarmy.R;
import ru.smallmazila.russianarmy.photo.gallery.adapter.PhotoPagerAdapter;
import ru.smallmazila.russianarmy.util.Util;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;

public class PhotoActivity extends Activity {
	private int imageId = 0;
	private int mCurrentImagePos = 0;
	private int mGalleryPos = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		//getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);;
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
				, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);

		LayoutInflater inflater = LayoutInflater.from(this);
		List<View> pages = new ArrayList<View>();
		String unitNum = getIntent().getStringExtra("unitNum");
		String unitName = getIntent().getStringExtra("unitName");
//		imageId = getIntent().getExtras().getInt("imageId");
//		mCurrentImagePos = getIntent().getExtras().getInt("currentImagePos");
//		mGalleryPos = getIntent().getExtras().getInt("galleryPos");
		setTitle("Фотогалерея "+unitName);
		
	
		View page;
		ImageView image;
		String folder = Util.convertNum2Path(unitNum);
		try{
			for(String iPath : getAssets().list(folder)){
				page = inflater.inflate(R.layout.activity_photo, null);
				image = (ImageView)page.findViewById(R.id.photoImage);
				Bitmap bmp = BitmapFactory.decodeStream(getAssets().open(folder+"/"+iPath));
				image.setImageBitmap(bmp);
				pages.add(page);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		PhotoPagerAdapter pagerAdapter = new PhotoPagerAdapter(pages);
		ViewPager viewPager = new ViewPager(this);
		viewPager.setAdapter(pagerAdapter);
		
		viewPager.setCurrentItem(mCurrentImagePos);
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				mCurrentImagePos = arg0;
				
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});

		setContentView(viewPager);
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.photo, menu);
		return true;
	}

}
