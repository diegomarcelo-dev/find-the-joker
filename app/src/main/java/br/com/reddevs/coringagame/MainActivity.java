package br.com.reddevs.coringagame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView left, middle, right;
    ImageView left02, middle02, right02;

    private Button btn_game;
    TextView text_coringa;

    LinearLayout l01, l02;

    List<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (ImageView) findViewById(R.id.im_left01);
        middle = (ImageView) findViewById(R.id.im_middle01);
        right = (ImageView) findViewById(R.id.im_right01);

        left02 = (ImageView) findViewById(R.id.im_left02);
        middle02 = (ImageView) findViewById(R.id.im_middle02);
        right02 = (ImageView) findViewById(R.id.im_right02);

        l01 = (LinearLayout) findViewById(R.id.linear01);
        l02 = (LinearLayout) findViewById(R.id.linear02);

        btn_game = (Button) findViewById(R.id.button_game);

        text_coringa = (TextView) findViewById(R.id.textCoringa);

        String montserratFont = "fonts/montserrat.otf";
        Typeface enFont = Typeface.createFromAsset(getAssets(), montserratFont);

        text_coringa.setTypeface(enFont);

        cards = new ArrayList<>();
        cards.add(107);
        cards.add(207);
        cards.add(307);
        cards.add(407);
        cards.add(507);
        cards.add(607);

        //Shuffe the cards
        Collections.shuffle(cards);

        btn_game.setTypeface(enFont);
        btn_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(cards);

                left.setImageResource(R.drawable.ic_baralho);
                middle.setImageResource(R.drawable.ic_baralho);
                right.setImageResource(R.drawable.ic_baralho);

                left02.setImageResource(R.drawable.ic_baralho);
                middle02.setImageResource(R.drawable.ic_baralho);
                right02.setImageResource(R.drawable.ic_baralho);

                Animation anim_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                Animation anim_middle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                Animation anim_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);

                Animation anim_l01 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.up);
                Animation anim_l02 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.up);

                Animation anim_l01a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.down);
                Animation anim_l02a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.down);

                left.startAnimation(anim_left);
                middle.startAnimation(anim_middle);
                right.startAnimation(anim_right);

                left02.startAnimation(anim_left);
                middle02.startAnimation(anim_middle);
                right02.startAnimation(anim_right);

                l01.startAnimation(anim_l01);
                l02.startAnimation(anim_l02);

                //l01.startAnimation(anim_l01a);
                //l02.startAnimation(anim_l02a);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(0) == 107){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.ic_coringa);
                    Toast.makeText(MainActivity.this, "Final Game!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(0) == 307){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 407){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 507){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 607){
                    left.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(1) == 107){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(1) == 307){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 407){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 507){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 607){
                    middle.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(2) == 107){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(2) == 307){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 407){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 507){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 607){
                    right.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(3) == 107){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 207){
                    left02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(3) == 307){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 407){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 507){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 607){
                    left02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(4) == 107){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 207){
                    middle02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(4) == 307){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 407){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 507){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 607){
                    middle02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(5) == 107){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 207){
                    right02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(5) == 307){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 407){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 507){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 607){
                    right02.setImageResource(R.drawable.ic_as);
                }
            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(1) == 107){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.ic_coringa);
                    Toast.makeText(MainActivity.this, "Final Game!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(1) == 307){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 407){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 507){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 607){
                    middle.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(0) == 107){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(0) == 307){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 407){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 507){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 607){
                    left.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(2) == 107){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(2) == 307){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 407){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 507){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 607){
                    right.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(3) == 107){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 207){
                    left02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(3) == 307){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 407){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 507){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 607){
                    left02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(4) == 107){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 207){
                    middle02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(4) == 307){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 407){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 507){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 607){
                    middle02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(5) == 107){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 207){
                    right02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(5) == 307){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 407){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 507){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 607){
                    right02.setImageResource(R.drawable.ic_as);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(2) == 107){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.ic_coringa);
                    Toast.makeText(MainActivity.this, "Final Game!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(2) == 307){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 407){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 507){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 607){
                    right.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(1) == 107){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(1) == 307){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 407){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 507){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 607){
                    middle.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(0) == 107){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(0) == 307){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 407){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 507){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 607){
                    left.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(3) == 107){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 207){
                    left02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(3) == 307){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 407){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 507){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 607){
                    left02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(4) == 107){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 207){
                    middle02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(4) == 307){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 407){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 507){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 607){
                    middle02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(5) == 107){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 207){
                    right02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(5) == 307){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 407){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 507){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 607){
                    right02.setImageResource(R.drawable.ic_as);
                }
            }
        });

        left02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(3) == 107){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 207){
                    left02.setImageResource(R.drawable.ic_coringa);
                    Toast.makeText(MainActivity.this, "Final Game!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(3) == 307){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 407){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 507){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 607){
                    left02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(4) == 107){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 207){
                    middle02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(4) == 307){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 407){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 507){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 607){
                    middle02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(5) == 107){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 207){
                    right02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(5) == 307){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 407){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 507){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 607){
                    right02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(0) == 107){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(0) == 307){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 407){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 507){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 607){
                    left.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(1) == 107){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(1) == 307){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 407){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 507){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 607){
                    middle.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(2) == 107){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(2) == 307){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 407){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 507){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 607){
                    right.setImageResource(R.drawable.ic_as);
                }
            }
        });

        middle02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(4) == 107){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 207){
                    middle02.setImageResource(R.drawable.ic_coringa);
                    Toast.makeText(MainActivity.this, "Final Game!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(4) == 307){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 407){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 507){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 607){
                    middle02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(3) == 107){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 207){
                    left02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(3) == 307){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 407){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 507){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 607){
                    left02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(5) == 107){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 207){
                    right02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(5) == 307){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 407){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 507){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 607){
                    right02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(0) == 107){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(0) == 307){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 407){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 507){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 607){
                    left.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(1) == 107){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(1) == 307){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 407){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 507){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 607){
                    middle.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(2) == 107){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(2) == 307){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 407){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 507){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 607){
                    right.setImageResource(R.drawable.ic_as);
                }
            }
        });

        right02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(5) == 107){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 207){
                    right02.setImageResource(R.drawable.ic_coringa);
                    Toast.makeText(MainActivity.this, "Final Game!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(5) == 307){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 407){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 507){
                    right02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(5) == 607){
                    right02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(4) == 107){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 207){
                    middle02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(4) == 307){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 407){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 507){
                    middle02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(4) == 607){
                    middle02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(3) == 107){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 207){
                    left02.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(3) == 307){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 407){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 507){
                    left02.setImageResource(R.drawable.ic_as);
                } else if(cards.get(3) == 607){
                    left02.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(0) == 107){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(0) == 307){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 407){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 507){
                    left.setImageResource(R.drawable.ic_as);
                } else if(cards.get(0) == 607){
                    left.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(1) == 107){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(1) == 307){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 407){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 507){
                    middle.setImageResource(R.drawable.ic_as);
                } else if(cards.get(1) == 607){
                    middle.setImageResource(R.drawable.ic_as);
                }

                if(cards.get(2) == 107){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.ic_coringa);
                } else if(cards.get(2) == 307){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 407){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 507){
                    right.setImageResource(R.drawable.ic_as);
                } else if(cards.get(2) == 607){
                    right.setImageResource(R.drawable.ic_as);
                }
            }
        });
    }
}