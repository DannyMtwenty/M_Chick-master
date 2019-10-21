package com.dan.M_chick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Symptoms extends AppCompatActivity {
    TextView display;
    Button diagonize;
    ArrayList<String> selection = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        diagonize = (Button) findViewById(R.id.diagonize);
        display = (TextView) findViewById(R.id.display);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public void SelectSymptoms(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.Palebeak:
                if (checked) {
                    selection.add("Pale beak");
                    display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                            "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
                } else {
                    selection.remove("Pale beak");
                }
                break;

            case R.id.bloodyd:
                if (checked) {
                    selection.add("Bloody droppings");
                    display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                            "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
                } else {
                    selection.remove("Bloody droppings");
                }
                break;
            case R.id.ygdiarrhoea:
                if (checked) {
                    selection.add("Yellowish/Greenish diarrhoea");
                    display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
                } else {
                    selection.remove("Yellowish/Greenish diarrhoea");
                }
                break;


            case R.id.sleepy:
                if (checked) {
                    selection.add("Sleepy");
                    display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
                } else {
                    selection.remove("Sleepy");
                }
                break;

            case R.id.coughing:
                if (checked) {
                    selection.add("Coughing and Sneezing");
                    display.setText("Disease: New Castle \n \n Causes: virus that infects respiratory and nervous system  \n \n Control: Vaccinate chicks at 3 to 4 weeks of age. Repeat at 16 weeks of age and at the 24th week. ");
                } else {
                    selection.remove("Coughing and Sneezing");
                }
                break;

            case R.id.feathers:
                if (checked) {
                    selection.add("Ruffled feathers");
                    display.setText("Disease: Fowl Typhoid \n \n Causes: caused by microorganism called salomonella gallinarum or shigella gallinarum  \n \n Control: Vaccinate the birds at 7 weeks of age, Destroy all dead birds by burning, House should be thoroughly cleaned and disinfectedDo not allow visitors to enter into the poultry unit without being disinfected  ");
                } else {
                    selection.remove("Ruffled feathers");
                }
                break;

            case R.id.drowsyruffle:
                if (checked) {
                    selection.add("Drowsy and Ruffle");
                    display.setText("Disease: Pullurum \n \n Causes: caused by a microorganism called Salomonella Pullurum  \n \n Control: Destroy all confirmed carriers of the disease,Clean and disinfect all the premises and incubators, Get chicks from hatcheries with good disease control programme  ");
                } else {
                    selection.remove("Drowsy and Ruffle");
                }
                break;

            case R.id.lesions:
                if (checked) {
                    selection.add("Pox lesions on face");
                    display.setText("Disease: Fowl Pox \n \n Causes: highly infectious skin disease  \n \n Control: Provide footbath with disinfectant, Limit visitors to the unit, Workers should move from young to old flock in the units,Clean and disinfect the house and equipments ");
                } else {
                    selection.remove("Pox lesions on face");
                }
                break;

            case R.id.feverishsleepy:
                if (checked) {
                    selection.add("Feverish and Sleepy");
                    display.setText("Disease: Fowl Cholera \n \n Causes:caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
                } else {
                    selection.remove("Feverish and Sleepy");
                }
                break;
            case R.id.droopy:
                if (checked) {
                    selection.add("Droopy");
                    display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                            "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
                } else {
                    selection.remove("Droopy");
                }
                break;
            case R.id.dullness:
                if (checked) {
                    selection.add("Dullness");
                    display.setText("Disease: Fowl Typhoid \n \n Causes: caused by microorganism called salomonella gallinarum or shigella gallinarum  \n \n Control: Vaccinate the birds at 7 weeks of age, Destroy all dead birds by burning, House should be thoroughly cleaned and disinfectedDo not allow visitors to enter into the poultry unit without being disinfected  ");
                } else {
                    selection.remove("Dullness");
                }
                break;
            case R.id.squeakychirps:
                if (checked) {
                    selection.add("Utter Squeaky chirps");
                    display.setText("Disease: Pullurum \n \n Causes: caused by a microorganism called Salomonella Pullurum  \n \n Control: Destroy all confirmed carriers of the disease,Clean and disinfect all the premises and incubators, Get chicks from hatcheries with good disease control programme  ");
                } else {
                    selection.remove("Utter Squeaky chirps");
                }
                break;
            case R.id.lethargic:
                if (checked) {
                    selection.add("Lethargic");
                    display.setText("Disease: Avian Influenza \n \n Causes: Any bird can carry it and transmit it\n" +
                            "across species  \n \n Control:proper nutrition and keeping\n" +
                            "your chicks healthy at all times will help,culling infected chicks ");
                } else {
                    selection.remove("Lethargic");
                }
                break;
            case R.id.runnystool:
                if (checked) {
                    selection.add("Runny Stool");
                    display.setText("Disease: Avian Influenza \n \n Causes: Any bird can carry it and transmit it\n" +
                            "across species  \n \n Control:proper nutrition and keeping\n" +
                            "your chicks healthy at all times will help,culling infected chicks ");
                } else {
                    selection.remove("Runny Stool");
                }
                break;
            case R.id.swolleneyes:
                if (checked) {
                    selection.add("Swollen eyes");
                    display.setText("Disease: Infectious Sinusitis \n \n Causes: caused by micro-organism Mycoplasma Gallisepticu  \n \n Control:Use of available antibiotics ");
                } else {
                    selection.remove("Swollen eyes");
                }
                break;
            case R.id.watereye:
                if (checked) {
                    selection.add("Watery eye");
                    display.setText("Disease: Infectious Bronchitis \n \n Causes: caused by avian infectious bronchitis virus,IBV  \n \n Control: keep chicks' immune system as healthy as possible, Use of Vaccines, Isolation of the chicks from the infected ones ");
                } else {
                    selection.remove("Watery eye");
                }
            case R.id.discharge:
                if (checked) {
                    selection.add("discharge from the eyes and nose");
                    display.setText("Disease: Infectious Bronchitis \n \n Causes: caused by avian infectious bronchitis virus,IBV  \n \n Control: keep chicks' immune system as healthy as possible, Use of Vaccines, Isolation of the chicks from the infected ones ");
                }else {
                    selection.remove("discharge from the eyes and nose");
                }
            case R.id.gasping:
                if (checked) {
                    selection.add("Gasping");
                    display.setText("Disease: Infectious Bronchitis \n \n Causes: caused by avian infectious bronchitis virus,IBV  \n \n Control: keep chicks' immune system as healthy as possible, Use of Vaccines, Isolation of the chicks from the infected ones ");
                }else {
                    selection.remove("Gasping");
                }
            case R.id.raspysound:
                if (checked) {
                    selection.add("raspy breath sounds");
                    display.setText("Disease: Infectious Bronchitis \n \n Causes: caused by avian infectious bronchitis virus,IBV  \n \n Control: keep chicks' immune system as healthy as possible, Use of Vaccines, Isolation of the chicks from the infected ones ");
                }else {
                    selection.remove("raspy breath sounds");
                }
            case R.id.inflamations:
                if (checked) {
                    selection.add("local inflammations");
                    display.setText("Disease: Fowl Cholera \n \n Causes:caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
                } else {
                    selection.remove("local inflammations");
                }
        }
    }
    public void symptomsaction(View view) {
        String final_symptoms = "";
        //for coccidiosis
        if (selection.contains("Pale beak")) {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }

        if (selection.contains("Bloody droppings")) {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }
        if (selection.contains("Ruffled feathers") && selection.contains("Pale beak")) {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }


        if (selection.contains("Droopy") && selection.contains("Pale beak") && selection.contains("Ruffled feathers")) {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }
        if (selection.contains("Droopy") && selection.contains("Pale beak") && selection.contains("Ruffled feathers") && selection.contains("Bloody droppings")) {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }
        //for Fowl Cholera
        if (selection.contains("local inflammations")){
            display.setText("Disease: Fowl Cholera \n \n Causes:caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        if (selection.contains("Yellowish/Greenish diarrhoea")) {
            display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        if (selection.contains("Feverish and Sleepy")) {
            display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        if (selection.contains("Droopy") && selection.contains("Feverish and Sleepy")) {
            display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        if (selection.contains("Yellow/Greenish diarrhoea") && selection.contains("Feverish and Sleepy")) {
            display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        if (selection.contains("Droopy") && selection.contains("Yellowish/Greenish diarrhoea") && selection.contains("Feverish and Sleepy")) {
            display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        //for pullurum
        if (selection.contains("Utter Squeaky chirps")) {
            display.setText("Disease: Pullurum \n \n Causes: caused by a microorganism called Salomonella Pullurum  \n \n Control: Destroy all confirmed carriers of the disease,Clean and disinfect all the premises and incubators, Get chicks from hatcheries with good disease control programme  ");
        }
        if (selection.contains("Utter Squeaky chirps") && selection.contains("Ruffled feathers")) {
            display.setText("Disease: Pullurum \n \n Causes: caused by a microorganism called Salomonella Pullurum  \n \n Control: Destroy all confirmed carriers of the disease,Clean and disinfect all the premises and incubators, Get chicks from hatcheries with good disease control programme  ");
        }
        if (selection.contains("Drowsy and Ruffle")) {
            display.setText("Disease: Pullurum \n \n Causes: caused by a microorganism called Salomonella Pullurum  \n \n Control: Destroy all confirmed carriers of the disease,Clean and disinfect all the premises and incubators, Get chicks from hatcheries with good disease control programme  ");
        }
        //for Avian Influenza
        if (selection.contains("Lethargic")) {
            display.setText("Disease: Avian Influenza \n \n Causes: Any bird can carry it and transmit it\n" +
                    "across species  \n \n Control:proper nutrition and keeping\n" +
                    "your chicks healthy at all times will help,culling infected chicks ");
        }
        if (selection.contains("Lethargic") && selection.contains("Runny Stool")) {
            display.setText("Disease: Avian Influenza \n \n Causes: Any bird can carry it and transmit it\n" +
                    "across species  \n \n Control:proper nutrition and keeping\n" +
                    "your chicks healthy at all times will help,culling infected chicks ");
        }
        if (selection.contains("Lethargic") && selection.contains("Runny Stool") && selection.contains("discharge from eyes and nose")) {
            display.setText("Disease: Avian Influenza \n \n Causes: Any bird can carry it and transmit it\n" +
                    "across species  \n \n Control:proper nutrition and keeping\n" +
                    "your chicks healthy at all times will help,culling infected chicks ");
        }
        if (selection.contains("Lethargic") && selection.contains("Runny Stool") && selection.contains("discharge from eyes and nose") && selection.contains("Coughing and Sneezing")) {
            display.setText("Disease: Avian Influenza \n \n Causes: Any bird can carry it and transmit it\n" +
                    "across species  \n \n Control:proper nutrition and keeping\n" +
                    "your chicks healthy at all times will help,culling infected chicks ");
        }
        if (selection.contains("Runny Stool")) {
            display.setText("Disease: Avian Influenza \n \n Causes: Any bird can carry it and transmit it\n" +
                    "across species  \n \n Control:proper nutrition and keeping\n" +
                    "your chicks healthy at all times will help,culling infected chicks ");
        }
        //for Infectious sinusitis
        if (selection.contains("Swollen eyes")) {
            display.setText("Disease: Infectious Sinusitis \n \n Causes: caused by micro-organism Mycoplasma Gallisepticu  \n \n Control:Use of available antibiotics ");
        }
        if (selection.contains("Coughing and Sneezing") && selection.contains("raspy breath sounds")) {
            display.setText("Disease: Infectious Sinusitis \n \n Causes: caused by micro-organism Mycoplasma Gallisepticu  \n \n Control:Use of available antibiotics ");
        }
        //for  Infectious Coryza
        if (selection.contains("Coughing and Sneezing") && selection.contains("discharge from the eyes and nose")) {
            display.setText("Disease: Infectious Coryza \n \n Causes: Due to use of GMOs  \n \n Control:Use of available antibiotics ");
        }
        if (selection.contains("Coughing and Sneezing") && selection.contains("raspy breath sounds")) {
            display.setText("Disease: Infectious Coryza \n \n Causes: Due to use of GMOs  \n \n Control:Use of available antibiotics ");
        }
        if (selection.contains("Coughing and Sneezing") && selection.contains("raspy breath sounds") && selection.contains("discharge from the eyes and nose")) {
            display.setText("Disease: Infectious Coryza \n \n Causes: Due to use of GMOs  \n \n Control:Use of available antibiotics ");
        }
        //for Newcastle
        if (selection.contains("Coughing and Sneezing") && selection.contains("Gasping")) {
            display.setText("Disease: New Castle \n \n Causes: virus that infects respiratory and nervous system  \n \n Control: Vaccinate chicks at 3 to 4 weeks of age. Repeat at 16 weeks of age and at the 24th week. ");
        }
        //fowl Typhoid
        if (selection.contains("Ruffled feathers") && selection.contains("Dullness")) {
            display.setText("Disease: Fowl Typhoid \n \n Causes: caused by microorganism called salomonella gallinarum or shigella gallinarum  \n \n Control: Vaccinate the birds at 7 weeks of age, Destroy all dead birds by burning, House should be thoroughly cleaned and disinfectedDo not allow visitors to enter into the poultry unit without being disinfected  ");
        }
        //for fowl pox
        if (selection.contains("Pox lesions on face")) {
            display.setText("Disease: Fowl Pox \n \n Causes: highly infectious skin disease  \n \n Control: Provide footbath with disinfectant, Limit visitors to the unit, Workers should move from young to old flock in the units,Clean and disinfect the house and equipments ");
        }
//for infectious bronchitis
        if (selection.contains("discharge from the eyes and nose") && selection.contains("Gasping")) {
            display.setText("Disease: Infectious Bronchitis \n \n Causes: caused by avian infectious bronchitis virus,IBV  \n \n Control: keep chicks' immune system as healthy as possible, Use of Vaccines, Isolation of the chicks from the infected ones ");
        }
        if (selection.contains("discharge from the eyes and nose") && selection.contains("Gasping") && selection.contains("Coughing and Sneezing")) {
            display.setText("Disease: Infectious Bronchitis \n \n Causes: caused by avian infectious bronchitis virus,IBV  \n \n Control: keep chicks' immune system as healthy as possible, Use of Vaccines, Isolation of the chicks from the infected ones ");
        }
        if (selection.contains("discharge from the eyes and nose") && selection.contains("Gasping") && selection.contains("Coughing and Sneezing") && selection.contains("raspy breath sounds")) {
            display.setText("Disease: Infectious Bronchitis \n \n Causes: caused by avian infectious bronchitis virus,IBV  \n \n Control: keep chicks' immune system as healthy as possible, Use of Vaccines, Isolation of the chicks from the infected ones ");
        }
        if (selection.contains("Gasping") && selection.contains("raspy breath sounds")) {
            display.setText("Disease: Infectious Bronchitis \n \n Causes: caused by avian infectious bronchitis virus,IBV  \n \n Control: keep chicks' immune system as healthy as possible, Use of Vaccines, Isolation of the chicks from the infected ones ");
        }
        //for fowl typhoid
        if(selection.contains("Dullness") && selection.contains("Ruffled feathers")){
            display.setText("Disease: Fowl Typhoid \n \n Causes: caused by microorganism called salomonella gallinarum or shigella gallinarum  \n \n Control: Vaccinate the birds at 7 weeks of age, Destroy all dead birds by burning, House should be thoroughly cleaned and disinfectedDo not allow visitors to enter into the poultry unit without being disinfected  ");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
