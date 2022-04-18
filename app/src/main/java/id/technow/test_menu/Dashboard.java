package id.technow.test_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Dashboard extends AppCompatActivity {
    RecyclerView rvMain;
    MenuAdapter adapter;
    TextView txtMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }

    //saat aplikasi dibuka maka aplikasi harus mengambil data dari api & data lokal menu terakhir yang di akses
    // menu di tampilkan dalam bentuk recycler view dan adapter yang sudah ditentukan
    // menu yang di akses disimpan dalam memori lokal dan ditampilkan kembali


    private void getDataMenu() {

     /*   Call<ResponseBody> call = Client
                .getInstance()
                .getApi();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    */
    }
}