package mx.edu.cetys.arellano.ivannia.myapplicationsegundointento;

import android.app.DownloadManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    private Gson gson;
    private EditText Telefono;
    private EditText Direccion;
    private EditText Nombre;
    Button getButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = (EditText) findViewById(R.id.nombre);
        Telefono= (EditText) findViewById(R.id.telefono);
        Direccion = (EditText) findViewById(R.id.direccion);
        getButton = (Button) findViewById(R.id.guardar);

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassConnection connection = new ClassConnection();

                try {
                    String response = connection.execute("http://138.68.231.116:5000/empresa").get();

                    JSONArray jsonArray = new JSONArray(response);
                    JSONObject jsonObject = jsonArray.getJSONObject(1);

                    String firstName = jsonObject.getString("Nombre");
                    String Telephone = jsonObject.getString("Telefono");
                    String Direction = jsonObject.getString("Direccion");

                    Nombre.setText(firstName);
                    Telefono.setText(Telephone);
                    Direccion.setText(Direction);

                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "NO HAY FALLAS", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    
    public void volleyRequest2(){
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://138.68.231.116:5000/perfil";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest (Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        List<ClassPerfil> miPerfil = Arrays.asList(gson.fromJson(response, ClassPerfil[].class));
                        ClassPerfil miClassPerfil = findClassPerfil(misClassPerfil, matricula, contrase);
                        for (ClassPerfil perfil: miPerfil) {
                            if (perfil.getUsername().trim().toLowerCase().equals("t020947")){
                                Toast.makeText(getApplicationContext(),
                                        perfil.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(
                        getApplicationContext(),
                        error.getMessage(),
                        Toast.LENGTH_SHORT
                ).show();
            }

        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
    private ClassPerfil findClassPerfil(List<ClassPerfil> classPerfil, String matricula, String contraseña){
        for(ClassPerfil classPerfil: classPerfil){
            if(classPerfil.getNombre().equals(matricula) && classPerfil.getId().equals(contraseña)){
                return classPerfil;
            }
        }
        return null;
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
