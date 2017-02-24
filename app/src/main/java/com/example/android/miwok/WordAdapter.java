package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Awesome-Tbee on 1/25/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    ArrayList<Word> words;
    int backgroundResourceId;
    MediaPlayer mediaPlayer;

    public WordAdapter(Context context, ArrayList<Word> words, int backgroundResourceId) {
        super(context, 0, words);
        this.backgroundResourceId = backgroundResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;

        if(itemView == null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.words_list, parent, false);
        }


        Word currentWord = getItem(position);



        RelativeLayout rLayout = (RelativeLayout) itemView.findViewById(R.id.rLayout);
        rLayout.setBackgroundColor(backgroundResourceId);

        TextView defaultTranslation = (TextView)itemView.findViewById(R.id.default_txtView);
        defaultTranslation.setText(currentWord.getmDefaultText());

        TextView miwokTranslation = (TextView)itemView.findViewById(R.id.miwok_txtView);
        miwokTranslation.setText(currentWord.getmMiwokText());


        ImageView wordImage = (ImageView) itemView.findViewById(R.id.wordImage);

        if(currentWord.hasImage()) {
            wordImage.setImageResource(currentWord.getmImageResourceId());
            wordImage.setVisibility(View.VISIBLE);
        }
        else{
            wordImage.setVisibility(View.GONE);
        }




        return itemView;
    }
}
