package br.com.bezerra.diego.cittalanches.gui.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import br.com.bezerra.diego.cittalanches.R;
import br.com.bezerra.diego.cittalanches.data.CittaLanchesData;
import br.com.bezerra.diego.cittalanches.data.PurchaseDay;
import br.com.bezerra.diego.cittalanches.data.StoreItem;
import br.com.bezerra.diego.cittalanches.data.User;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        setTitle(R.string.title_activity_main);

        CittaLanchesData data = new CittaLanchesData();
        data.getUsers().put("diego_bsz", new User("diego_bsz", "Diego Bezerra de Souza"));
        HashMap<String, Boolean> user1 = new HashMap<String, Boolean>();
        user1.put("diego_bsz", true);
        data.getUsers().put("mmm", new User("mmm", "Mario Melo Melanozo"));
        HashMap<String, Boolean> user2 = new HashMap<String, Boolean>();
        user2.put("mmm", true);

        data.getStoreItems().put("Bolo", new StoreItem("Bolo", "Bolo lindo e delicioso", 2));
        HashMap<String, String> item1 = new HashMap<>();
        item1.put("diego_bsz", "Bolo");
        data.getStoreItems().put("Brigadeiro", new StoreItem("Brigadeiro", "Brigadeiro brilhante", 1));
        HashMap<String, String> item2 = new HashMap<>();
        item1.put("mmm", "Brigadeiro");
        @SuppressLint("SimpleDateFormat") DateFormat df = new SimpleDateFormat("ddMMyyyy");
        data.getPurchases().put(df.format(new Date().getTime())
                , new PurchaseDay(new Date().getTime()
                        , item1));
        data.getPurchases().put(df.format(new Date().getTime())
                , new PurchaseDay(new Date().getTime()
                        , item2));
        FirebaseDatabase.getInstance().getReference().setValue(data);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_add_cart) {
            // Handle the camera action
        } else if (id == R.id.nav_cart) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
