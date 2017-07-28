package in.choy.messagessandbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import in.choy.message.Message;
import in.choy.message.MyAwesomeMessages;


public class ReadActivity extends AppCompatActivity {

    ListView listView;
    private List<Message> myMessages = MyAwesomeMessages.getInstance().getAllMessages();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        showMessages();
    }

    private void showMessages() {
        MyAwesomeMessages.getInstance().sendMessage("Big Title", "Small stuff hello world");
        MyAwesomeMessages.getInstance().sendMessage("Big Tasdasditle", "Small stuff helsasdasdlo world");

        ArrayAdapter<Message> adapter = new MessagesListAdapter(this, R.layout.message_item_advanced, myMessages);
        ListView list = (ListView) findViewById(R.id.messages_list_view);
        list.setAdapter(adapter);
    }

}
