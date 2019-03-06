package com.vamsi.malneedi.vehicle_selection;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Vehicle_selection extends Activity {

    private Button button;
    private TextView description;
    private Spinner vehicleType_Sp;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_vehicle_selection);
        description = (TextView) findViewById(R.id.description_tv);
        vehicleType_Sp = (Spinner) findViewById(R.id.vehicle_type);
        button = (Button) findViewById(R.id.find_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                description.setText("");
                String str = String.valueOf(vehicleType_Sp.getSelectedItem());
                switch (str) {

                    case "Lorry":
                        ArrayList<String> Vehicles = new ArrayList<>();
                        Vehicles.add("TATA");
                        Vehicles.add("Ashok Leyland");
                        Vehicles.add("Bharath Benz");
                        description.setText(Vehicles.toString());
                        break;
                    case "Bus":
                        ArrayList<String> Vehicles1 = new ArrayList<>();
                        Vehicles1.add("Metro Express");
                        Vehicles1.add("Super Luxury NonAC");
                        Vehicles1.add("Sleeper AC");
                        description.setText(Vehicles1.toString());
                        break;
                    case "Car":
                        ArrayList<String> Vehicles2 = new ArrayList<>();
                        Vehicles2.add("Maruthi");
                        Vehicles2.add("Honda");
                        Vehicles2.add("BMW");
                        Vehicles2.add("Audi");
                        Vehicles2.add("Renault");
                        description.setText(Vehicles2.toString());
                        break;
                    case "Bike":
                        ArrayList<String> Vehicles3 = new ArrayList<>();
                        Vehicles3.add("Yamaha");
                        Vehicles3.add("Honda");
                        Vehicles3.add("Royal Enfield");
                        description.setText(Vehicles3.toString());
                        break;
                    case "Bicycle":
                        ArrayList<String> Vehicles4 = new ArrayList<>();
                        Vehicles4.add("Not Available");
                        description.setText(Vehicles4.toString());
                        break;
                }
            }
        });
    }
}
