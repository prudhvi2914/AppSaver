package com.example.appsaver.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.appsaver.R;
import com.example.appsaver.model.Consultants;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private final String JSON_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=43.778654,-79.65345&radius=7500&type=financial%20consultants&keyword=financial%20consultants&key=AIzaSyBmEX_q5Lq1h7oE4hA6FYcHJqhdFOxQSeg" ;
    private JsonArrayRequest request ;
    private RequestQueue requestQueue ;
    private List<Consultants> listOfConsultants;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerviewid);
        jsonrequest();
    }


    private void jsonrequest(){

        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {




                for (int i = 0; i<response.length();i++){



                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

    }
}
