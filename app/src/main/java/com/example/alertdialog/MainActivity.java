package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Abd 1.
     */
    AlertDialog.Builder abd1, /**
     * The Abd 2.
     */
    abd2, /**
     * The Abd 3.
     */
    abd3, /**
     * The Abd 4.
     */
    abd4, /**
     * The Abd 5.
     */
    abd5;
    /**
     * The Linear layout.
     */
    LinearLayout linearLayout;
    /**
     * The Red.
     */
    int red, /**
     * The Green.
     */
    green, /**
     * The Blue.
     */
    blue;
    /**
     * The Rnd.
     */
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abd1 = new AlertDialog.Builder(this);
        abd2 = new AlertDialog.Builder(this);
        abd3 = new AlertDialog.Builder(this);
        abd4 = new AlertDialog.Builder(this);
        abd5 = new AlertDialog.Builder(this);
        rnd = new Random();
        linearLayout = (LinearLayout) findViewById(R.id.bc);
    }

    /**
     * First.
     *
     * @param view the view
     */
    public void first(View view) {
        abd1.setTitle("Congratulations!");
        abd1.setMessage("You have successfully pressed the button");
        AlertDialog ad = abd1.create();
        ad.show();
    }

    /**
     * Second.
     *
     * @param view the view
     */
    public void second(View view) {
        abd2.setTitle("Congratulations!");
        abd2.setMessage("You have successfully pressed the button");
        abd2.setIcon(R.drawable.good);
        AlertDialog ad = abd2.create();
        ad.show();
    }

    /**
     * Third.
     *
     * @param view the view
     */
    public void Third(View view) {
        abd3.setTitle("Congratulations!");
        abd3.setMessage("You can close this one");
        abd3.setIcon(R.drawable.good);
        abd3.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog ad = abd3.create();
        ad.show();
    }

    /**
     * Fourth.
     *
     * @param view the view
     */
    public void Fourth(View view) {
        abd4.setTitle("Congratulations!");
        abd4.setMessage("You can choose random colors now!");
        abd4.setPositiveButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                red = rnd.nextInt(256);
                green = rnd.nextInt(256);
                blue = rnd.nextInt(256);
                linearLayout.setBackgroundColor(Color.rgb(red,green,blue));
            }
        });
        abd4.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog ad = abd4.create();
        ad.show();
    }

    /**
     * Fifth.
     *
     * @param view the view
     */
    public void fifth(View view) {
        System.out.println("orly");
        abd5.setTitle("Congratulations!");
        abd5.setMessage("You can choose random colors now!");
        abd5.setPositiveButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                red = rnd.nextInt(256);
                green = rnd.nextInt(256);
                blue = rnd.nextInt(256);
                linearLayout.setBackgroundColor(Color.rgb(red,green,blue));
            }
        });
        abd5.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        abd5.setNeutralButton("Back to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                linearLayout.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad = abd5.create();
        ad.show();
    }
}