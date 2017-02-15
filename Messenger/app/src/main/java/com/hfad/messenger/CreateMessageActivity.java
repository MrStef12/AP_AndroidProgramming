package com.hfad.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    private static int ACTIVITY_REQUEST_ID_SEND_MESSAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        //startActivity(intent);
        startActivityForResult(intent, ACTIVITY_REQUEST_ID_SEND_MESSAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == ACTIVITY_REQUEST_ID_SEND_MESSAGE){
            Log.v("app","onActivityResult got a result: "+resultCode);
            if(resultCode != -1)
                Log.v("app", "Got error: "+data.getStringExtra("error"));
        }
    }
}
