package com.example.flipkart;

import java.util.ArrayList;

import net.simonvt.menudrawer.MenuDrawer;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.SyncStateContract.Constants;
import android.support.v4.util.LruCache;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.haarman.listviewanimations.ArrayAdapter;
import com.haarman.listviewanimations.itemmanipulation.OnDismissCallback;
import com.haarman.listviewanimations.itemmanipulation.SwipeDismissAdapter;
import com.haarman.listviewanimations.swinginadapters.prepared.SwingBottomInAnimationAdapter;

public class clp extends SherlockActivity implements OnDismissCallback{
	ArrayList<ListDetails> al;
	int lifestyle=0;
	private MenuDrawer menuDrawer;
	private GoogleCardsAdapter mGoogleCardsAdapter;
	CustomListAdapter cl ;
	private int[] mImages = new int[] {
			R.drawable.toswipe,
			R.drawable.background1,
			R.drawable.background2,

			R.drawable.ic_launcher
	};
	ImageView clpBannerimage;
	ActionBar ab ;
	private int clpBannerImageNo=0;
	public void onCreate(Bundle b){
		super.onCreate(b);
		
		//setContentView(R.layout.clp);
		al=new ArrayList<ListDetails>();
		ab= getSupportActionBar();
		ab.setIcon(R.drawable.category_icon);
		ab.setCustomView(R.layout.action_bar_logo_view);
		ab.setDisplayShowTitleEnabled(false);
		ab.setDisplayShowCustomEnabled(true);
		ab.setHomeButtonEnabled(true);		
		Intent temp=getIntent();
		String source=temp.getStringExtra("source");
		if(source!=null && source.equalsIgnoreCase("lifestyle"))
			lifestyle=1;
		// this is for the menudrawer
		menuDrawer = MenuDrawer.attach(this, MenuDrawer.MENU_DRAG_WINDOW);
		menuDrawer.setContentView(R.layout.clp);
		menuDrawer.setMenuView(R.layout.shopbycategory);
		menuDrawer.setTouchMode(MenuDrawer.TOUCH_MODE_NONE);		
		ListView lv=(ListView)findViewById(R.id.clp_lv);		
		LayoutInflater lf=this.getLayoutInflater();
		View view=(View)lf.inflate(R.layout.header,null,false);
		lv.addHeaderView(view,null,false);
		//lv.setAdapter(cl);	
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		al.add(new ListDetails(R.drawable.clplv1));
		al.add(new ListDetails(R.drawable.clplv2));
		mGoogleCardsAdapter = new GoogleCardsAdapter(this);
		SwingBottomInAnimationAdapter swingBottomInAnimationAdapter = new SwingBottomInAnimationAdapter(new SwipeDismissAdapter(mGoogleCardsAdapter, this));
		swingBottomInAnimationAdapter.setListView(lv);
		//lv.setAdapter(swingBottomInAnimationAdapter);
		lv.setAdapter(new CustomListAdapter(this,R.layout.clp_lv, al));
		mGoogleCardsAdapter.addAll(getItems());
		//clpBannerimage=(ImageView)findViewById(R.id.clpbannerimage);	
		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager2);
		ImagePagerAdapter adapter = new ImagePagerAdapter();
		viewPager.setAdapter(adapter);
		
		ImageView logo=(ImageView)findViewById(R.id.actionBarLogo);
		logo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            		goToHomePage(v);
            }
        });
		System.out.println("in clp");
		
	}
	private class ImagePagerAdapter extends PagerAdapter {
		private int[] mImages = new int[] {
				R.drawable.banner_2,
				R.drawable.banner_1
		};

		@Override
		public int getCount() {
			return mImages.length;
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == ((ImageView) object);
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			Context context = clp.this;
			final ImageView imageView = new ImageView(context);
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setImageResource(mImages[position]);
			((ViewPager) container).addView(imageView, 0);
			imageView.setOnClickListener(new OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                	browsePage(imageView);
                }
            });
			return imageView;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			((ViewPager) container).removeView((ImageView) object);
		}
	}
	public void goToHomePage(View v){
		startActivity(new Intent(this,MainActivity.class));
		overridePendingTransition  ( R.anim.in_from_left,R.anim.out_to_right);
	}
	private ArrayList<Integer> getItems() {
		ArrayList<Integer> items = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			items.add(i);
		}
		return items;
	}
	@Override
	public void onDismiss(ListView listView, int[] reverseSortedPositions) {
		for (int position : reverseSortedPositions) {
			//mGoogleCardsAdapter.remove(position);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
		// Handle item selection		
		switch (item.getItemId()) {
		case android.R.id.home:
			menuDrawer.toggleMenu();
			return true;
		case R.id.menu_search:
			//openSearch();
			startActivity(new Intent(this,SearchPage.class));			
			overridePendingTransition  (R.anim.in_from_right, R.anim.out_to_left);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	public void nextClpBanner(View v){
		
		if(clpBannerImageNo==mImages.length-1)
			return;
		clpBannerimage.setImageResource(mImages[++clpBannerImageNo]);
	}
	public void previousClpBanner(View v){
		if(clpBannerImageNo==0)
			return;
		Log.d("error","hereddd");
		clpBannerimage.setImageResource(mImages[--clpBannerImageNo]);		
	}
	public void browsePage(View v){
		Intent intent=new Intent(this,BrowsePage.class);
		if(lifestyle==1)
			intent.putExtra("source","lifestyle");
		startActivity(intent);
		overridePendingTransition  (R.anim.in_from_right, R.anim.out_to_left);
	}
	public void clpActivity(View v){
		//startActivity(new Intent(this,clp.class));
	}
	private static class GoogleCardsAdapter extends ArrayAdapter<Integer> {

		private Context mContext;
		private LruCache<Integer, Bitmap> mMemoryCache;

		public GoogleCardsAdapter(Context context) {
			mContext = context;

			final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);

			// Use 1/8th of the available memory for this memory cache.
			final int cacheSize = maxMemory;
			mMemoryCache = new LruCache<Integer, Bitmap>(cacheSize) {
				@Override
				protected int sizeOf(Integer key, Bitmap bitmap) {
					// The cache size will be measured in kilobytes rather than
					// number of items.
					return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
				}
			};
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {			
			View view = convertView;
			if (view == null) {
				view = LayoutInflater.from(mContext).inflate(R.layout.clp_lv, parent, false);
			}
			ImageView iv=(ImageView)view.findViewById(R.id.imageitem);			
			setImageView(iv, position);
			return view;
		}
		private void setImageView(ImageView v, int position) {
			int imageResId;
			switch (getItem(position) % 2) {
				case 0:
					imageResId = R.drawable.clplv1;
					break;
				case 1:
					imageResId = R.drawable.clplv2;
					break;				
				default:
					imageResId = R.drawable.lumia3;
			}
			v.setImageResource(imageResId);		
		}
	}
	public void onBackPressed(){
		if(menuDrawer.isMenuVisible()){
			menuDrawer.toggleMenu();
			return;
		}
		super.onBackPressed();
		overridePendingTransition  (R.anim.in_from_left, R.anim.out_to_right);
	}
	public void goBack(View v){		
		onBackPressed();
	}
	
	public void goToProductPage(View v){
		startActivity(new Intent(this,ProductPageFragment.class));
		overridePendingTransition  (R.anim.in_from_right, R.anim.out_to_left);		
	}

	public void clpActivityNew(View v){
		menuDrawer.toggleMenu();
	}
}
