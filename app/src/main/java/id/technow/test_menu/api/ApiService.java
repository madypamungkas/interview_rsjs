package id.technow.test_menu.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {
    // base url sudah sesuai
    //pastikan model response sesuai, dan data yng didapat bisa di panggil dan di gunakan
    @GET("11b551d9-827c-458b-8be2-4760fea8cd1c")
    Call<ResponseBody> getMenu(
            @Header("Accept") String accept
    );
}
