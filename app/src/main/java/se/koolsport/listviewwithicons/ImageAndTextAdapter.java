package se.koolsport.listviewwithicons;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hinnenberg on 2017-11-27.
 */

public class ImageAndTextAdapter extends ArrayAdapter {

    private LayoutInflater mInflater;

    private String[] mStrings;
    private TypedArray mIcons;

    private int mViewResourceId;

    public ImageAndTextAdapter(Context ctx, int viewResourceId,
                               String[] strings, TypedArray icons) {
        super(ctx, viewResourceId, strings);

        mInflater = (LayoutInflater)ctx.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        mStrings = strings;
        mIcons = icons;

        mViewResourceId = viewResourceId;
    }

    @Override
    public int getCount() {
        return mStrings.length;
    }

    @Override
    public String getItem(int position) {
        return mStrings[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        ImageView iv = (ImageView)convertView.findViewById(R.id.imageView);
        iv.setImageDrawable(mIcons.getDrawable(position));

        TextView tv = (TextView)convertView.findViewById(R.id.textView);
        tv.setText(mStrings[position]);

        return convertView;
    }

}
