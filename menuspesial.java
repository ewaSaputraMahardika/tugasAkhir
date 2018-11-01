package com.example.smkm2p.waroengdiggers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class menuspesial extends AppCompatActivity {


    //int[] IMAGES = {R.drawable}

    String[] nama = {"spesial1","spesial2","spesial3","spesial4","dst"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuspesial);

        ListView listView = (ListView) findViewById(R.id.listspesial);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0; //return IMAGES
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout3, null);

            //ImageView imageView = (ImageView) findViewById(R.id.gambarspesial);
            TextView    textView = (TextView) findViewById(R.id.namaspesial);

            //imageView.setImageResource(IMAGES[i]);
            textView.setText(nama[i]);
            return null;
        }
    }
}
