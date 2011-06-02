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
        
        TextView text_view = (TextView) findViewById(R.id.text_view);
        String styledText = text_view.getText().toString();
        text_view.setText(Html.fromHtml(styledText),TextView.BufferType.SPANNABLE);
        
    }
}