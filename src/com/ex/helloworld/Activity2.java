package com.ex.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity implements OnClickListener{

	Button button3;
	TextView text3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		
		button3 = (Button)findViewById(R.id.button3);
		button3.setOnClickListener(this);
		
		text3 = (TextView)findViewById(R.id.textView3);
		text3.setText("テキスト③");;
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch (v.getId()) {
		case R.id.button3:
			text3.setText("ボタン3が押されたよ");
			startActivity(new Intent(this, MainActivity.class));
			break;

		default:
			break;
		}
		
	}

}
