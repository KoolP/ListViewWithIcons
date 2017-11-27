package se.koolsport.listviewwithicons;

import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        Resources resources = context.getResources();

        String[] ninja = {"Lager", "Ipa", "Ale", "Stout", "Non-Low Alcohol"};

        TypedArray ninja_icons = resources.obtainTypedArray(R.array.ninja_icons);

        //Adapts list
        setListAdapter(new ImageAndTextAdapter (context, R.layout.secondary_layout, ninja, ninja_icons));

    }
}
