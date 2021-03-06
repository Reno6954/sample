package com.ex.helloworld;

import java.net.HttpURLConnection;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
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
		
		Button button3 = (Button)findViewById(R.id.button3);
		button3.setOnClickListener(this);
		
		new PostMessageTask().execute();		
	}

	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
		
		//Toast.makeText(this,"onStart", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onRestart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onRestart();
		
		//Toast.makeText(this,"onRestart", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		
		//Toast.makeText(this,"onResume", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
		
		//Toast.makeText(this,"onPause", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
		
		//Toast.makeText(this,"onStop", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onDestroy() {
		// TODO 自動生成されたメソッド・スタブ
		super.onDestroy();
		
		//Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show();
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
		case R.id.button3:
			EditText editText1 = (EditText)findViewById(R.id.editText1);
			EditText editText2 = (EditText)findViewById(R.id.editText2);
			EditText editText3 = (EditText)findViewById(R.id.editText3);
			String text1 = editText1.getText().toString();
			String text2 = editText2.getText().toString();
			String text3 = editText3.getText().toString();
			Intent intent = new Intent(this,NewActivity.class);
			intent.putExtra("val_1", text1);
			intent.putExtra("val_2", text2);
			intent.putExtra("val_3", text3);
			startActivity(intent);
			break;
		default:
			break;
		}
		
	}
	
	//アシンクタスクローダーを継承したクラスを作成
	public class PostMessageTask extends AsyncTask<String, Integer, String> {
		String html;
	    @Override
	    protected String doInBackground(String... contents) {
	    	HttpClient c = new DefaultHttpClient();
	        HttpGet g = new HttpGet("http://www.google.co.jp/");
	        byte[] result = null;
	        
	        try{
	            HttpResponse response = c.execute(g);
	            StatusLine statusLine = response.getStatusLine();
	            if(statusLine.getStatusCode() != HttpURLConnection.HTTP_OK){
	                Log.e("Connection.download", "download failed");
	            }
	            else{
	                result = EntityUtils.toByteArray(response.getEntity());
	            }
	            html =  new String(result, "Shift-JIS");
	            Log.d("log", new String(result, "Shift-JIS"));
	        }
	        catch(Exception e){
	        }
	    	return html;
	    }

		@Override
		protected void onPostExecute(String result) {
			// TODO 自動生成されたメソッド・スタブ
			super.onPostExecute(result);
			Log.e("google", "asdf"+result);
			text2.setText(result);
		}
	 
	}

}
