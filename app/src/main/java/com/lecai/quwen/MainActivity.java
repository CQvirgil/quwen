package com.lecai.quwen;


import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private RadioButton mRadioButtonHome;
    private Fragment mfragments[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfragments = new Fragment[4];
        mfragments[0] = homepageFragment.newInstance();
        mfragments[1] = DiscoveryFragment.newInstance();
        mfragments[2] = FollowFragment.newInstance();
        mfragments[3] = MineFragment.newInstance();
        initView();
    }

    private void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.radio_group_button);
        mRadioButtonHome = (RadioButton) findViewById(R.id.radio_button_home);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            Fragment mFragment = null;
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.radio_button_home:
                        mFragment = mfragments[0];
                        break;
                    case R.id.radio_button_discovery:
                        mFragment = mfragments[1];
                        break;
                    case R.id.radio_button_attention:
                        mFragment = mfragments[2];
                        break;
                    case R.id.radio_button_profile:
                        mFragment = mfragments[3];
                        break;
                }
                if(mFragment!=null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.home_container,mFragment).commitNow();
                }
            }
        });
        // 保证第一次会回调OnCheckedChangeListener
        mRadioButtonHome.setChecked(true);
    }

}
