package com.clbm.it.clbm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.btton28);
        Button CLB1 = (Button)findViewById(R.id.CLB1);
        Button CLB2 = (Button)findViewById(R.id.CLB2);
        Button CLB3 = (Button)findViewById(R.id.CLB3);
        Button CLB4 = (Button)findViewById(R.id.CLB4);
        Button CLB5 = (Button)findViewById(R.id.CLB5);
        Button CLB6 = (Button)findViewById(R.id.CLB6);
        Button CLB7 = (Button)findViewById(R.id.CLB7);
        Button CLB8 = (Button)findViewById(R.id.CLB8);
        Button CLB9 = (Button)findViewById(R.id.CLB9);
        Button CLB10 = (Button)findViewById(R.id.CLB10);
        Button CLB11= (Button)findViewById(R.id.CLB11);
        Button CLB12= (Button)findViewById(R.id.CLB12);

        CLB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CLB1.class);
                startActivity(i);
                mp.start();
            }
        });
        CLB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getApplicationContext(),CLB2.class);
                startActivity(j);
                mp.start();

            }
        });
        CLB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(),CLB3.class);
                startActivity(k);
                mp.start();

            }
        });
        CLB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(getApplicationContext(),CLB4.class);
                startActivity(l);
                mp.start();

            }
        });
        CLB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(getApplicationContext(),CLB5.class);
                startActivity(m);
                mp.start();

            }
        });
        CLB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(),CLB6.class);
                startActivity(n);
                mp.start();

            }
        });
        CLB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(getApplicationContext(),CLB7.class);
                startActivity(o);
                mp.start();

            }
        });
        CLB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(),CLB8.class);
                startActivity(p);
                mp.start();

            }
        });
        CLB9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),CLB9.class);
                startActivity(q);
                mp.start();

            }
        });
        CLB10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(getApplicationContext(),CLB10.class);
                startActivity(r);
                mp.start();

            }
        });
        CLB11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(getApplicationContext(),CLB11.class);
                startActivity(s);
                mp.start();

            }
        });
        CLB12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(getApplicationContext(),CLB12.class);
                startActivity(t);
                mp.start();

            }
        });
    }

    public static class CLB1 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb1);
        }
    }

    public static class CLB2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb2);
        }
    }

    public static class CLB3 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb3);
        }
    }

    public static class CLB4 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb4);
        }
    }

    public static class CLB5 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb5);
        }
    }

    public static class CLB6 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb6);
        }
    }

    public static class CLB7 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb7);
        }
    }

    public static class CLB8 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb8);
        }
    }

    public static class CLB9 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb9);
        }
    }

    public static class CLB10 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb10);
        }
    }

    public static class CLB11 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb11);
        }
    }

    public static class CLB12 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clb12);
        }
    }
}
