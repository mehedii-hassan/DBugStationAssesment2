package com.example.dbugstationassesment2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbugstationassesment2.databinding.RowDesignBinding;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViwHolder> {

    private int[] images;

    public ImageAdapter(int[] images) {
        this.images = images;
    }

    @NonNull
    @Override
    public ImageViwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowDesignBinding binding = RowDesignBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false);
        return new ImageViwHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViwHolder holder, int position) {
        holder.binding.ivRowItem.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class ImageViwHolder extends RecyclerView.ViewHolder {
        private RowDesignBinding binding;

        public ImageViwHolder(RowDesignBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
