package com.example.medview.onboarding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.medview.R;
import com.example.medview.models.SliderScreenItem;

import java.util.List;

public class SliderViewPagerAdapter extends PagerAdapter {
    Context context;
    List<SliderScreenItem> screenItemList;
    LayoutInflater layoutInflater;

    public SliderViewPagerAdapter(Context context, List<SliderScreenItem> screenItemList) {
        this.context = context;
        this.screenItemList = screenItemList;
    }

    @Override
    public int getCount() {

        return screenItemList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.intro_slide_layout,container, false);


        ImageView imageView = view.findViewById(R.id.introImgView);
        TextView title = view.findViewById(R.id.introtitle);
        TextView description = view.findViewById(R.id.introdesc);

//        title.setText(slide_headings[position]);
//        description.setText(slide_desc[position]);
//        imageView.setImageResource(slide_images[position]);
        title.setText(screenItemList.get(position).getTitle());
        description.setText(screenItemList.get(position).getDescription());
        imageView.setImageResource(screenItemList.get(position).getScreenImg());

        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
    }
}
