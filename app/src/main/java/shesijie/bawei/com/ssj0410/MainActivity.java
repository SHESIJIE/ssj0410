package shesijie.bawei.com.ssj0410;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        Log.e ( "佘思杰——新建" , "onCreate" );
    }

    @Override
    protected void onStart() {
        super.onStart ();
        Log.e ( "佘思杰——开始" , "onStart" );
    }

    @Override
    protected void onResume() {
        super.onResume ();
        Log.e ( "佘思杰——得到焦点" , "onResume" );
    }

    @Override
    protected void onPause() {
        super.onPause ();
        Log.e ( "佘思杰——失去焦点" , "onPause" );
    }

    @Override
    protected void onRestart() {
        super.onRestart ();
        Log.e ( "佘思杰——重启" , "onRestart" );
    }

    @Override
    protected void onStop() {
        super.onStop ();
        Log.e ( "佘思杰——停止" , "onStop" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy ();
        Log.e ( "佘思杰——销毁" , "onDestory" );
    }
}
