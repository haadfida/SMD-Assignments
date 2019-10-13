package com.haad.cv.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.haad.cv.base.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class EducationAdapter extends RecyclerView.Adapter<EducationAdapter.EducationViewHolder> {

    private ArrayList<String> CollegeListNames =new ArrayList<>();
    private ArrayList<String> IntermediateListNames =new ArrayList<>();
    private ArrayList<String> DurationListNames =new ArrayList<>();
    private Context context;
    private ArrayList<Integer> ImageNames= new ArrayList<>();
    public EducationAdapter(ArrayList<String> CollegeListNames,ArrayList<String> IntermediateListNames,ArrayList<String> DurationListNames, ArrayList<Integer> ImageNames, Context context){
        this.CollegeListNames = CollegeListNames;
        this.IntermediateListNames = IntermediateListNames;
        this.DurationListNames = DurationListNames;
        this.context=context;
        this.ImageNames=ImageNames;
    }

    @NonNull
    @Override
    public EducationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.list_item,parent,false);
        return new EducationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EducationViewHolder holder, int position) {
        String title= CollegeListNames.get(position);
        holder.txtTitle.setText(title);

        title = IntermediateListNames.get(position);
        holder.intermediate.setText(title);

        title = DurationListNames.get(position);
        holder.duration.setText(title);

        Glide.with(context).load(ImageNames.get(position)).asBitmap().into(holder.imgIcon);
        //holder.imgIcon.getResources().getDrawable(R.drawable.fastlogo);

    }

    @Override
    public int getItemCount() {
        return CollegeListNames.size();
    }

    public class EducationViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtTitle, intermediate, duration;
        public EducationViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imageIcon);
            intermediate =itemView.findViewById(R.id.intermediate);
            txtTitle = itemView.findViewById(R.id.collegeName);
            duration = itemView.findViewById(R.id.collegeYear);

        }
    }

}

/*  private List<DemoItem> demoItems;
    private Context        context;
    private ImageView education_publication_link;

    public EducationAdapter(List<DemoItem> demoItems, Context context) {
        this.demoItems   = demoItems;
        this.context     = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View           row      = inflater.inflate(R.layout.education, parent, false);
        education_publication_link  = row.findViewById(R.id.education_publication_link);
        education_publication_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(context.getString(R.string.ieee_link)));
                    context.startActivity(intent);
                }
        });
        return new DemoItemHolder(row);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }

    @Override
    public int getItemCount() {
        return demoItems.size();
    }
    public class DemoItemHolder extends RecyclerView.ViewHolder {
        DemoItemHolder(View itemView) {
            super(itemView);
        }
    }*/
