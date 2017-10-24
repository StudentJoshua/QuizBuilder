package w0303446.quizbuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeBase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homebase);

    }

    /** Called when the user taps the Send button */
    public void gotoQuizScreen(View view) {
        Intent intent = new Intent(this, QuizScreen.class);
        startActivity(intent);
    }
}
