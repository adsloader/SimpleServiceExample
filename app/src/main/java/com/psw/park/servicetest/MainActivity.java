package com.psw.park.servicetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. startService로 서비스를 실행합니다.
        Intent Service = new Intent(this, MainService.class);
        startService(Service);
    }
}
