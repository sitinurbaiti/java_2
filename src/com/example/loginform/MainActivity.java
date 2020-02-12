package com.example.loginform;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


 public class MainActivity extends Activity {
  //Deklarasi Tombol
  Button btnFacebook,btnTwitter,btnInstagram;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);

   //Get ID tombol & Event Tombol facebook
   btnFacebook= (Button) findViewById(R.id.btn_facebook);
   btnFacebook.setOnClickListener(new OnClickListener() {
    public void onClick(View v) {
     Intent intent = new Intent();
           intent.setAction(Intent.ACTION_VIEW);
           intent.addCategory(Intent.CATEGORY_BROWSABLE);
           intent.setData(Uri.parse("https://www.facebook.com"));
           startActivity(intent);
   } 
    });
   
   //Get ID tombol & Event Tombol Twitter
   btnTwitter= (Button) findViewById(R.id.btn_twitter);
   btnTwitter.setOnClickListener(new OnClickListener() {
    public void onClick(View v) {
     Intent intent = new Intent();
           intent.setAction(Intent.ACTION_VIEW);
           intent.addCategory(Intent.CATEGORY_BROWSABLE);
           intent.setData(Uri.parse("https://www.twitter.com"));
           startActivity(intent);
   } 
    });
   
   //Get ID tombol & Event Tombol Instagram
   btnInstagram= (Button) findViewById(R.id.btn_instagram);
   btnInstagram.setOnClickListener(new OnClickListener() {
    public void onClick(View v) {
     Intent intent = new Intent();
           intent.setAction(Intent.ACTION_VIEW);
           intent.addCategory(Intent.CATEGORY_BROWSABLE);
           intent.setData(Uri.parse("https://www.instagram.com"));
           startActivity(intent);
   } 
    });
   
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
   // Inflate the menu; this adds items to the action bar if it is present.
   getMenuInflater().inflate(R.menu.main, menu);
   return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
   int id = item.getItemId();
   if (id == R.id.action_settings) {
    return true;
   }
   return super.onOptionsItemSelected(item);
  }
 }