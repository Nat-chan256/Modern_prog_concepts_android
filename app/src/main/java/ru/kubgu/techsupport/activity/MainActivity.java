package ru.kubgu.techsupport.activity;

public class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.appcompat.widget.AppCompatButton loginBtn;

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivity tmp = this;
        setContentView(ru.kubgu.techsupport.R.layout.activity_main);
        loginBtn = findViewById(ru.kubgu.techsupport.R.id.loginButton);
        loginBtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new android.content.Intent(tmp,UserApplicationActivity.class));
            }
        });
    }
}