package net.creativelift.textfun;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

public class TextFun extends Activity {
    private static final String TAG = "Text Fun";

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        htmlify((TextView) findViewById(R.id.tv_style));
        htmlify((TextView) findViewById(R.id.tv_color_map));
        htmlify((TextView) findViewById(R.id.tv_formating));
        htmlify((TextView) findViewById(R.id.tv_styling));
        htmlify((TextView) findViewById(R.id.tv_headings));
        
    }
    
    private void htmlify(TextView tv) {
    	String styledText = tv.getText().toString();
    	tv.setText(Html.fromHtml(styledText), TextView.BufferType.SPANNABLE);
    }
}