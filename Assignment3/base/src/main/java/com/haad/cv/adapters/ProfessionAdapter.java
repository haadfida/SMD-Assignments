package com.haad.cv.adapters;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.haad.cv.model.DemoItem;
import com.haad.cv.base.R;
import com.squareup.picasso.Picasso;

import java.util.List;
public class ProfessionAdapter extends RecyclerView.Adapter {
    private List<DemoItem> demoItems;
    private Context        context;
    public ProfessionAdapter(List<DemoItem> demoItems, Context context) {
        this.demoItems = demoItems;
        this.context = context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
          View row = inflater.inflate(R.layout.profession, parent, false);
        return new DemoItemHolder2(row);
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        ProfessionAdapter.DemoItemHolder2 demoItemHolder = (ProfessionAdapter.DemoItemHolder2) holder;

        Picasso.get().load(R.drawable.openlink).into(demoItemHolder.githubproject1);
        Picasso.get().load(R.drawable.openlink).into(demoItemHolder.githubproject2);
        Picasso.get().load(R.drawable.openlink).into(demoItemHolder.githubproject3);

        demoItemHolder.githubproject1.setOnClickListener(view -> {
            Intent  intent = new Intent(Intent.ACTION_VIEW, Uri.parse(context.getString(R.string.Github_ProjectLink)));
            context.startActivity(intent);
        });

        demoItemHolder.githubproject2.setOnClickListener(view -> {
            Intent  intent = new Intent(Intent.ACTION_VIEW, Uri.parse(context.getString(R.string.Github_ProjectLink1)));
            context.startActivity(intent);
        });

        demoItemHolder.githubproject3.setOnClickListener(view -> {
            Intent  intent = new Intent(Intent.ACTION_VIEW, Uri.parse(context.getString(R.string.Github_ProjectLink2)));
            context.startActivity(intent);
        });
    }
    @Override
    public int getItemCount() {
        return demoItems.size();
    }
    public class DemoItemHolder2 extends RecyclerView.ViewHolder {
        ImageView githubproject1, githubproject2, githubproject3;
        DemoItemHolder2(View itemView) {
            super(itemView);
            githubproject1 =itemView.findViewById(R.id.githubCopyLink);
            githubproject2 =itemView.findViewById(R.id.githubCopyLink2);
            githubproject3 =itemView.findViewById(R.id.githubCopyLink3);
        }
    }

}
