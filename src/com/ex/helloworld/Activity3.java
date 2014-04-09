package com.ex.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity3 extends Activity implements OnItemClickListener {
	
	String[] lists = new String[]{
			"a","b","c","d","e","f","g","h","i","j"
		};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity3);
		
		//アダプタを用意して配列wordsを紐付け
		ArrayAdapter<String> la = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lists);
		
		ListView lv = (ListView)findViewById(R.id.listView1);
		
		lv.setAdapter(la);
		
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO 自動生成されたメソッド・スタブ
		
		
	}

}
