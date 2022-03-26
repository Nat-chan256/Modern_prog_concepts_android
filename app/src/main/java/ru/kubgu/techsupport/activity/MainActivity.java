package ru.kubgu.techsupport.activity;

public class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.appcompat.widget.AppCompatButton loginBtn;

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ru.kubgu.techsupport.R.layout.activity_main);
        loginBtn = findViewById(ru.kubgu.techsupport.R.id.loginButton);
        loginBtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                //отправка логина и пароля контроллеру, если:
                //в базе есть такие данные, то открываем новый активити
                //в противном случае, информируем о некорректных данных
            }
        });
    }
}