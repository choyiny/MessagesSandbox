package in.choy.messagessandbox;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import in.choy.message.Message;

import static android.view.View.inflate;

/**
 * Created by choyin on 28/7/2017.
 */

public class MessagesListAdapter extends ArrayAdapter<Message> {

    private Context context;
    private int layout;
    private List<Message> messagesList;

    public MessagesListAdapter(Context context, int layout, List<Message> messagesList) {
        super(context, layout, messagesList);
        this.messagesList = messagesList;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View messageView = convertView;

        if (messageView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            messageView = inflater.inflate(layout, parent, false);

            Message currentMessage = this.messagesList.get(position);

            // message title set
            TextView messageTitle = messageView.findViewById(R.id.message_title);
            messageTitle.setText(currentMessage.getTitle());

            // message content set
            TextView messageContent = messageView.findViewById(R.id.message_overview);
            messageContent.setText(currentMessage.getOverview());

            // message sender set
            TextView messageSender = messageView.findViewById(R.id.message_sender);
            messageSender.setText(currentMessage.getSender());
        }

        return messageView;
    }
}
