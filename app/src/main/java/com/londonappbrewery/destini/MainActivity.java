package com.londonappbrewery.destini;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private int mStoryIndex=1;
private TextView Story;
    private Button Option_1st,Option_2nd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
Story=(TextView) findViewById(R.id.storyTextView);
Option_1st=(Button) findViewById(R.id.buttonTop);
        Option_2nd=(Button) findViewById(R.id.buttonBottom);




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
Option_1st.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mStoryIndex=(mStoryIndex+1);
        if((Option_1st.getText()== getResources().getString(R.string.T1_Ans1)) && (mStoryIndex==2)){
            Story.setText(R.string.T3_Story);
            Option_1st.setText(R.string.T3_Ans1);
            Option_2nd.setText(R.string.T3_Ans2);
        }
        else if((Option_1st.getText()==getResources().getString(R.string.T3_Ans1))&&((mStoryIndex==3)||(mStoryIndex==4))){
            Story.setText(R.string.T6_End);
            Option_1st.setVisibility(View.INVISIBLE);
            Option_2nd.setVisibility(View.INVISIBLE);
        }
        else if((Option_1st.getText()==getResources().getString(R.string.T2_Ans1))&&(mStoryIndex==3)){
            Story.setText(R.string.T3_Story);
            Option_1st.setText(R.string.T3_Ans1);
            Option_2nd.setText(R.string.T3_Ans2);
        }

    }
});


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
Option_2nd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mStoryIndex=(mStoryIndex+1);
        if((Option_2nd.getText()== getResources().getString(R.string.T1_Ans2))&&(mStoryIndex==2)){
            Story.setText(R.string.T2_Story);
            Option_1st.setText(R.string.T2_Ans1);
            Option_2nd.setText(R.string.T2_Ans2);
        }
        else if((Option_2nd.getText()==getResources().getString(R.string.T3_Ans2))&&(mStoryIndex==4)){
            Story.setText(R.string.T5_End);
            Option_1st.setVisibility(View.INVISIBLE);
            Option_2nd.setVisibility(View.INVISIBLE);
        }
        else if((Option_2nd.getText()==getResources().getString(R.string.T2_Ans2))&&(mStoryIndex==3)){
            Story.setText(R.string.T4_End);
            Option_1st.setVisibility(View.INVISIBLE);
            Option_2nd.setVisibility(View.INVISIBLE);
        }
    }
});


    }
}
