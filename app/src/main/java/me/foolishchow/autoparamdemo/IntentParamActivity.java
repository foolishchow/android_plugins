package me.foolishchow.autoparamdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;
import java.util.List;

import me.foolishchow.android.annotation.IntentParam;

public class IntentParamActivity extends AppCompatActivity {
    public static class UserInfo implements Serializable {

    }
    @IntentParam
    String userName;

    @IntentParam
    int userAge;

    @IntentParam
    String[] selectedHabits;

    @IntentParam
    List<String> followerNames;

    @IntentParam
    List<UserInfo> userInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_param);
    }
}