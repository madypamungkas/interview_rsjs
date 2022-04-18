package id.technow.test_menu.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.technow.test_menu.R;
import id.technow.test_menu.model.ModelMenu;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuVH> {
    ArrayList<ModelMenu> model;
    Context mCtx;
    //pastikan data yang digunakan sesuai dengan return value api, serta terdapat konstruktor

    @NonNull
    @Override
    public MenuVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // gunakan layout yang sudah di sediakan
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new MenuVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuVH holder, int position) {

     // isi dengan aksi saat item di klik
        // untuk penggunaan icon dan warna, dapat dilakukan dengan harcode tanpa mengambil data dari api
        // pastikan nama, dan icon sesuai dengan contoh
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MenuVH extends RecyclerView.ViewHolder {
        TextView titleMenu;

        public MenuVH(@NonNull View itemView) {
            super(itemView);
            // isi dengan inisiasi item layout

        }
    }
}
