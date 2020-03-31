package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Log.d("kotlintest", "ログへの出力テスト")

        var taro = Human("taro", 20, "cartoon");
        var hanako = Human("hanako", 21, "game");

        taro.say();
        taro.think();
        hanako.say();
        hanako.think();

    }
}
