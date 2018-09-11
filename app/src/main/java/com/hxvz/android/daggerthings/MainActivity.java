package com.hxvz.android.daggerthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnPlay;
    private Button btnLearn;
    private Button btnWork;
    private Button btnSkillSet;
    private EditText editTxtBook;
    private Person person;

    private TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Profession programmer = new Programmer();
        BookFormatter bookFormatter = new HyphenBookFormatter();
        Knowledge knowledge = new Knowledge(bookFormatter);
        person = new Person(programmer, knowledge);

        editTxtBook = (EditText) findViewById(R.id.edit_txt_book_title);


        btnPlay = findViewById(R.id.btn_play);
        btnPlay.setOnClickListener(onPlayBtnClicked());

        btnLearn = findViewById(R.id.btn_learn);
        btnLearn.setOnClickListener(onLearnBtnClicked());

        btnWork = findViewById(R.id.btn_work);
        btnWork.setOnClickListener(onWorkBtnClicked());

        btnSkillSet = findViewById(R.id.btn_skill_set);
        btnSkillSet.setOnClickListener(onSkillSetBtnClicked());

        screen = findViewById(R.id.txtViewScreen);
        screen.setHorizontallyScrolling(true);
    }

    private View.OnClickListener onPlayBtnClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(person.play());
            }
        };
    }

    private View.OnClickListener onLearnBtnClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = editTxtBook.getText().toString();
                Book book = new Book();
                book.setTitle(title);
                person.learn(book);
                String updateScreen = "Added " + title + " to your skill set.";
                screen.setText(updateScreen);
                editTxtBook.setText("");
                editTxtBook.clearFocus();
            }
        };
    }

    private View.OnClickListener onWorkBtnClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(person.work());
            }
        };
    }

    private View.OnClickListener onSkillSetBtnClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(person.getSkillSet());
            }
        };
    }
}
