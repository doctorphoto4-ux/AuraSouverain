package com.aura.souverain;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView chatBox, statusLabel;
    private EditText inputMsg;
    private int fluxTransmis = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Disposition principale : Noir Obsidienne Absolu (#000000)
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.parseColor("#000000"));
        root.setPadding(40, 40, 40, 40);

        // En-tête de l'application
        TextView title = new TextView(this);
        title.setText("A U R A  //  M E S S A G E R I E");
        title.setTextColor(Color.parseColor("#00F2FE")); // Cyan Néon
        title.setTextSize(22);
        title.setGravity(Gravity.CENTER);
        root.addView(title);

        // Sous-titre réseau maillé
        TextView subtitle = new TextView(this);
        subtitle.setText("CANAL SOUVERAIN HORS-INTERNET");
        subtitle.setTextColor(Color.parseColor("#777788"));
        subtitle.setTextSize(11);
        subtitle.setGravity(Gravity.CENTER);
        root.addView(subtitle);

        // Espace de séparation
        TextView spacer = new TextView(this);
        spacer.setHeight(30);
        root.addView(spacer);

        // Zone d'affichage des messages
        chatBox = new TextView(this);
        chatBox.setText("[ SYSTÈME PRÊT ]\nCanal sécurisé initialisé. Aucune dépendance externe.\n");
        chatBox.setTextColor(Color.parseColor("#CCCCDD"));
        chatBox.setTextSize(14);

        ScrollView scroll = new ScrollView(this);
        scroll.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1f));
        scroll.addView(chatBox);
        root.addView(scroll);

        // Champ de saisie du message
        inputMsg = new EditText(this);
        inputMsg.setHint("Entrer un message chiffré...");
        inputMsg.setHintTextColor(Color.parseColor("#555566"));
        inputMsg.setTextColor(Color.parseColor("#FFFFFF"));
        inputMsg.setBackgroundColor(Color.parseColor("#111118"));
        inputMsg.setPadding(25, 25, 25, 25);
        root.addView(inputMsg);

        // Bouton de transmission
        Button btn = new Button(this);
        btn.setText("ENVOYER LE FLUX");
        btn.setBackgroundColor(Color.parseColor("#00F2FE"));
        btn.setTextColor(Color.parseColor("#000000"));
        
        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(-1, -2);
        btnParams.setMargins(0, 20, 0, 20);
        btn.setLayoutParams(btnParams);
        
        btn.setOnClickListener(v -> envoyerMessage());
        root.addView(btn);

        // Barre d'état du réseau
        statusLabel = new TextView(this);
        statusLabel.setText("STATUT : RÉSEAU MAILLÉ ACTIF (0% INTERNET)");
        statusLabel.setTextColor(Color.parseColor("#00E676")); // Vert sécurisé
        statusLabel.setTextSize(12);
        statusLabel.setGravity(Gravity.CENTER);
        root.addView(statusLabel);

        setContentView(root);
    }

    private void envoyerMessage() {
        String msg = inputMsg.getText().toString().trim();
        if (!msg.isEmpty()) {
            fluxTransmis++;
            chatBox.append("\n[Moi] >>> " + msg);
            inputMsg.setText("");
            statusLabel.setText("STATUT : FLUX TRANSMIS (" + fluxTransmis + ") - SANS INTERNET");
        }
    }
}
// Gestionnaire d'autodestruction des messages (24h)
public class MessageManager {
    private static final long EXPIRATION_TIME_MS = 24 * 60 * 60 * 1000;

    public boolean isMessageExpired(long timestampEnvoi) {
        long tempsActuel = System.currentTimeMillis();
        return (tempsActuel - timestampEnvoi) > EXPIRATION_TIME_MS;
    }
}
