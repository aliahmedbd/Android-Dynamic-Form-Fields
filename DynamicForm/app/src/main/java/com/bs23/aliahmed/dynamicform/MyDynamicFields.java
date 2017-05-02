package com.bs23.aliahmed.dynamicform;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.weiwangcn.betterspinner.library.BetterSpinner;


/**
 * Created by Name : Ali Ahmed
 * Email: aliahmedaiub@gmail.com
 * on 4/24/2017.
 */

public class MyDynamicFields {

    public static EditText setEditText(LinearLayout formLayout, Context context, String hint) {
        EditText myEditText = new EditText(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        myEditText.setLayoutParams(layoutParams);
        myEditText.setHint(hint);
        layoutParams.setMargins(0, dpToPx(16), 0, 0);
        myEditText.setTextSize(14);
        myEditText.getBackground().setColorFilter(context.getResources().getColor(R.color.fourth_black), PorterDuff.Mode.SRC_ATOP);
        formLayout.addView(myEditText);
        return myEditText;
    }

    public static BetterSpinner setSpinner(LinearLayout formLayout, Context context, String hint) {
        BetterSpinner mySpinner = new BetterSpinner(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        mySpinner.getBackground().setColorFilter(context.getResources().getColor(R.color.fourth_black), PorterDuff.Mode.SRC_ATOP);
        mySpinner.setHint(hint);
        mySpinner.setLayoutParams(layoutParams);
        mySpinner.setTextSize(14);
        mySpinner.setTextColor(ContextCompat.getColor(context, R.color.first_black));
        layoutParams.setMargins(0, dpToPx(16), 0, 0);
        formLayout.addView(mySpinner);
        return mySpinner;
    }

    public static TextView setTextView(LinearLayout formLayout, Context context, String text) {
        TextView myTextView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        myTextView.setLayoutParams(layoutParams);
        myTextView.setText(text);
        myTextView.setTextSize(14);
        layoutParams.setMargins(0, dpToPx(16), 0, 0);
        formLayout.addView(myTextView);
        return myTextView;
    }

    public static Button setButton(LinearLayout formLayout, Context context,String name) {
        Button myButton = new Button(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.END;
        myButton.setLayoutParams(layoutParams);
        formLayout.addView(myButton);
        myButton.setTextSize(14);
        myButton.setBackgroundResource(R.drawable.round_rectangle);
        layoutParams.setMargins(0, dpToPx(32), 0, dpToPx(32));
        myButton.getBackground().setColorFilter(context.getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);
        myButton.setTextColor(Color.WHITE);
        myButton.setText(name);
        return myButton;
    }

    public static int pxToDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

}
