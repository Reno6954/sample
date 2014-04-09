package com.ex.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	TextView text2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Toast.makeText(this,"onCreate", Toast.LENGTH_LONG).show();
		TextView hello = (TextView)findViewById(R.id.textView1);
		hello.setText("wawawaawawa");
		
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(this);
		
		text2 = (TextView)findViewById(R.id.textView2);
		
		Button button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(this);
	}

	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
		
		Toast.makeText(this,"onStart", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onRestart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onRestart();
		
		Toast.makeText(this,"onRestart", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		
		Toast.makeText(this,"onResume", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
		
		Toast.makeText(this,"onPause", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
		
		Toast.makeText(this,"onStop", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onDestroy() {
		// TODO 自動生成されたメソッド・スタブ
		super.onDestroy();
		
		Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch (v.getId()) {
		case R.id.button1:
			text2.setText("ボタン1が押されたよ");
			startActivity(new Intent(this, Activity2.class));
			break;
		case R.id.button2:
			text2.setText("ボタン2が押されたよ");
			startActivity(new Intent(this, Activity3.class));
			break;
		default:
			break;
		}
		
	}

}
