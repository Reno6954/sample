package com.ex.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends Activity{

	String val1 = "",val2 = "",val3 = "";
	
	
	TextView text1,text2,text3;
	
	//@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newactivity);
		
		text1 = (TextView)findViewById(R.id.textView1);
		text2 = (TextView)findViewById(R.id.textView2);
		text3 = (TextView)findViewById(R.id.textView3);
		
		//MainActivityからの値を取り出す
		//取り出しの際には、MainActivityで設定したキー文字列を指定することで取得する。
		Bundle extras;
		extras = getIntent().getExtras();
		if (extras != null){
			val1 = extras.getString("val_1");
			val2 = extras.getString("val_2");
			val3 = extras.getString("val_3");
		}
		
		text1.setText(val1);
		text2.setText(val2);
		text3.setText(val3);
	}
}
