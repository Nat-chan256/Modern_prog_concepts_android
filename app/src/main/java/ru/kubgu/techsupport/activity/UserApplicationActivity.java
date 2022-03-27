package ru.kubgu.techsupport.activity;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.Arrays;
import ru.kubgu.techsupport.databinding.ActivityUserApplicationBinding;

public class UserApplicationActivity extends androidx.appcompat.app.AppCompatActivity {
    ActivityUserApplicationBinding binding;
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserApplicationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //Пока что так...
        ArrayList reqList = new ArrayList(Arrays.asList("Заявка 1 (готово)", "Заявка 2 (в процессе)", "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)",
                                                        "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)",
                                                        "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)",
                                                        "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)",
                                                        "Заявка 1 (готово)", "Заявка 1 (готово)", "Заявка 1 (готово)"));
        binding.requestsListView.setAdapter(new ListAdapter(UserApplicationActivity.this, reqList));
        binding.requestsListView.setClickable(true);
        binding.requestsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                android.content.Intent intent = new android.content.Intent(UserApplicationActivity.this, ShowApplicationActivity.class);
                intent.putExtra("name", (String)reqList.get(position));
                startActivity(intent); //открытие окна нажатой заявки
            }
        });
        findViewById(ru.kubgu.techsupport.R.id.bellImageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //по идее, должно открываться окно с уведомлениями, но среди макетов от нашего UI дизайнера его нет,
                // так что, надо это обсудить
            }
        });
        findViewById(ru.kubgu.techsupport.R.id.createRequestButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new android.content.Intent(UserApplicationActivity.this, CreateApplicationActivity.class)); //открытие окна создания заявки
            }
        });
    }
}