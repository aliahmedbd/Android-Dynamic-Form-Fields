# Android-Dynamic-Form-Fields-
We can handle lots of forms in a single Activity using Dynamic forms like : TextView, EditText , Spinner etc. Normally we add view(fields) from XML layout but we can also add these programatically. This repository have a sample project which contains some sample dynnamic forms and views.


#### Sample Dynamic form:

```java 

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
```

This way we can add Dynamic Forms in an Activity without XML.
