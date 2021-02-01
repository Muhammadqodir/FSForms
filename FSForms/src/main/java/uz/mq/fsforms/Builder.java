package uz.mq.fsforms;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class Builder {
    Context context;
    LayoutInflater layoutInflater;
    LinearLayout root;
    public Builder(Context context, LinearLayout root) {
        this.context = context;
        layoutInflater = ((Activity) context).getLayoutInflater();
        this.root = root;
    }

    

}
