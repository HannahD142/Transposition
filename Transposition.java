
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 630190
 */
public class Transposition extends javax.swing.JFrame {

    /**
     * Creates new form Transposition
     */
    public Transposition() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        transposeButton = new javax.swing.JButton();
        answerField = new javax.swing.JTextField();
        note = new javax.swing.JTextField();
        interval = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        songResponse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        transposeSong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        transposeUpOrDown = new javax.swing.JTextField();

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setText("New Note:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Transposing Made Easy!");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Notes:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Number of Half Steps:");

        transposeButton.setBackground(new java.awt.Color(255, 153, 102));
        transposeButton.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        transposeButton.setForeground(new java.awt.Color(102, 0, 0));
        transposeButton.setText("Transpose!");
        transposeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transposeButtonActionPerformed(evt);
            }
        });

        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("Song:");

        songResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songResponseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setText("Would you like to transpose a preexisting song? (Yes or No)");

        transposeSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transposeSongActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setText("OR");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setText("Transpose Up or Down:");

        transposeUpOrDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transposeUpOrDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(23, 23, 23)
                                .addComponent(songResponse))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(note)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(interval)
                                    .addComponent(transposeUpOrDown, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(transposeSong, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(transposeButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transposeSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songResponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(transposeUpOrDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(transposeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transposeButtonActionPerformed
        // TODO add your handling code here:
        String songOrNote = transposeSong.getText();
        String upOrDown = transposeUpOrDown.getText();
        int numOfHalfSteps = Integer.parseInt(interval.getText());
        if ("Yes".equals(songOrNote) || "yes".equals(songOrNote) || "YES".equals(songOrNote)){
            String song = songResponse.getText();
            String songSelection = pickSong(song);
            if("up".equals(upOrDown) || "UP".equals(upOrDown) || "Up".equals(upOrDown)){
            try {
                File file = new File(songSelection);
                Scanner sc = new Scanner(file);
                String songNotes = sc.nextLine();
                System.out.println(songNotes);
                songTransposeUp(songNotes, numOfHalfSteps);
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                }
            }
            if("down".equals(upOrDown) || "Down".equals(upOrDown) || "DOWN".equals(upOrDown)){
            try {
                File file = new File(songSelection);
                Scanner sc = new Scanner(file);
                String songNotes = sc.nextLine();
                System.out.println(songNotes);
                songTransposeDown(songNotes, numOfHalfSteps);
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                }    
            }
            
        }
        if ("No".equals(songOrNote) || "no".equals(songOrNote) || "NO".equals(songOrNote)){
            if("up".equals(upOrDown) || "UP".equals(upOrDown) || "Up".equals(upOrDown)){
                String originalNote = note.getText();
                String letter = toLetter(originalNote);
                int number = toNumber(letter);
                int transposedUp = transposeUp(number, numOfHalfSteps);
                char transposedLetter = toTransposedLetter(transposedUp);
                String transposedNote = toNote(transposedLetter);
                answerField.setText(transposedNote);       
            }
            if("down".equals(upOrDown) || "Down".equals(upOrDown) || "DOWN".equals(upOrDown)){
                String originalNote = note.getText();
                String letter = toLetter(originalNote);
                int number = toNumber(letter);
                int transposedDown = transposeDown(number, numOfHalfSteps);
                char transposedLetter = toTransposedLetter(transposedDown);
                String transposedNote = toNote(transposedLetter);
                answerField.setText(transposedNote);
            }

         
        }


        
    }//GEN-LAST:event_transposeButtonActionPerformed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldActionPerformed

    private void noteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteActionPerformed

    private void songResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songResponseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songResponseActionPerformed

    private void transposeSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transposeSongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transposeSongActionPerformed

    private void transposeUpOrDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transposeUpOrDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transposeUpOrDownActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transposition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transposition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transposition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transposition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transposition().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JTextField interval;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField note;
    private javax.swing.JTextField songResponse;
    private javax.swing.JButton transposeButton;
    private javax.swing.JTextField transposeSong;
    private javax.swing.JTextField transposeUpOrDown;
    // End of variables declaration//GEN-END:variables

    public static String toLetter(String note){
   // int seriesLength = noteSeries.length();
    
        
    String aFlat = "Af";
    String a = "A";
    String aSharp = "A#";
    String bFlat = "Bf";
    String b = "B";
    String bSharp = "B#";
    String cFlat = "Cf";
    String c = "C";
    String cSharp = "C#";
    String dFlat = "Df";
    String d = "D";
    String dSharp = "D#";
    String eFlat = "Ef";
    String e = "E";
    String eSharp = "E#";
    String fFlat = "Ff";
    String f = "F";
    String fSharp = "F#";
    String gFlat = "Gf";
    String g = "G";
    String gSharp = "G#";    
    
    String aFlatGSharpLetter = "A";
    String aLetter = "B";
    String aSharpBFlatLetter = "C";
    String bCFlatLetter = "D";
    String bSharpCNatualLetter = "E";
    String cSharpDFlatLetter = "F";
    String dLetter = "G";
    String dSharpEFlatLetter = "H";
    String eFFlatLetter = "I";
    String eSharpFLetter = "J";
    String fSharpGFlatLetter = "K";
    String gLetter = "L";
   
    if(note.equals(aFlat)){
        String letter = aFlatGSharpLetter;
        return letter;
    }
    if(note.equals(a)){
        String letter = aLetter;
    return letter;
    }
    if(note.equals(aSharp)){
        String letter = aSharpBFlatLetter;
        return letter;
    }
    if(note.equals(bFlat)){
        String letter = aSharpBFlatLetter;
        return letter;
    }
    if(note.equals(b)){
        String letter = bCFlatLetter;
        return letter;
    }
    if(note.equals(bSharp)){
        String letter = bSharpCNatualLetter;
        return letter;
    }
    if(note.equals(cFlat)){
        String letter = bCFlatLetter;
        return letter;
    }
    if(note.equals(c)){
        String letter = bSharpCNatualLetter;
        return letter;
    }
    if(note.equals(cSharp)){
        String letter = cSharpDFlatLetter;
        return letter;
    }
    if(note.equals(dFlat)){
        String letter = cSharpDFlatLetter;
        return letter;
    }
    if(note.equals(d)){
        String letter = dLetter;
        return letter;
    }
    if(note.equals(dSharp)){
        String letter = dSharpEFlatLetter;
        return letter;
    }
    if(note.equals(eFlat)){
        String letter = dSharpEFlatLetter;
        return letter;
    }
    if(note.equals(e)){
        String letter = eFFlatLetter;
        return letter;
    }
    if(note.equals(eSharp)){
        String letter = eSharpFLetter;
        return letter;
    }
    if(note.equals(fFlat)){
        String letter = eFFlatLetter;
        return letter;
    }
    if(note.equals(f)){
        String letter = eSharpFLetter;
        return letter;
    }
    if(note.equals(fSharp)){
        String letter = eSharpFLetter;
        return letter;
    }
    if(note.equals(gFlat)){
        String letter = fSharpGFlatLetter;
        return letter;
    }
    if(note.equals(g)){
        String letter = gLetter;
        return letter;
    }
    if(note.equals(gSharp)){
        String letter = aFlatGSharpLetter;
        return letter;
    }
    else{
        return ("error");
    }
        
    
    }
    public static int toNumber(String letter){
        int noteNumber = (int) letter.charAt(0);
        return noteNumber;
    }
    public static int transposeUp(int number, int numberOfHalfSteps){
        int transposedUp = number + numberOfHalfSteps;
        if (transposedUp >= 77){
            transposedUp -= 12;
        }
        return transposedUp;
    }
    public static int transposeDown(int number, int numberOfHalfSteps){
        int transposedDown = number - numberOfHalfSteps;
        if (transposedDown <= 64){
            transposedDown += 12;
        }
        return transposedDown;
    }
    public static char toTransposedLetter(int transposed){
       char transposedNote = (char) transposed;
       return transposedNote;
    }
    public static String toNote(char charLetter){
      String letter = Character.toString(charLetter);
      
      if(letter.equals("A")){
          String note = "G#/Af";
          return note;
      } 
      if(letter.equals("B")){
          String note = "A";
          return note;
      } 
      if(letter.equals("C")){
          String note = "A#/Bf";
          return note;
      } 
      if(letter.equals("D")){
          String note = "B/Cf";
          return note;
      } 
      if(letter.equals("E")){
          String note = "B#/C";
          return note;
      } 
      if(letter.equals("F")){
          String note = "C#/Df";
          return note;
      } 
      if(letter.equals("G")){
          String note = "D";
          return note;
      } 
      if(letter.equals("H")){
          String note = "D#/Ef";
          return note;
      } 
      if(letter.equals("I")){
          String note = "E/Ff";
          return note;
      } 
      if(letter.equals("J")){
          String note = "E#/F";
          return note;
      } 
      if(letter.equals("K")){
          String note = "F#/Gf";
          return note;
      } 
      if(letter.equals("L")){
          String note = "G";
          return note;
      } 
      else{
          return("error");
      }
    }

    public String pickSong(String songNumber){
        String odeToJoy = "OdeToJoy.txt";
        String maryHadALittleLamb = "MaryHadALittleLamb.txt";
        String jingleBells = "JingleBells.txt";
        String hotCrossBuns = "HotCrossBuns.txt";
        String fuzzyWuzzy = "FuzzyWuzzy.txt";
        String theCatCameBack = "TheCatCameBack.txt";
        String twinkleTwinkleLittleStar = "TwinkleTwinkleLittleStar.txt";
        if(songNumber.equals("1")){
            String songSelection = odeToJoy;
            return songSelection;
        }
        if(songNumber.equals("2")){
            String songSelection = maryHadALittleLamb;
            return songSelection;
        }
        if(songNumber.equals("3")){
            String songSelection = jingleBells;
            return songSelection;
        }
        if(songNumber.equals("4")){
            String songSelection = hotCrossBuns;
            return songSelection;
        }
        if(songNumber.equals("5")){
            String songSelection = fuzzyWuzzy;
            return songSelection;
        }
        if(songNumber.equals("6")){
            String songSelection = theCatCameBack;
            return songSelection;
        }
        if(songNumber.equals("7")){
            String songSelection = twinkleTwinkleLittleStar;
            return songSelection;
        }
        
        else{
            return("Please select a different song.");
        }
    }
    public void songTransposeUp(String song, int numberOfHalfSteps){
        char [] songChars = song.toCharArray();
             System.out.println(song.length());
            for(int i = 0; i<song.length(); i++){
                int noteNumber = (int)(songChars [i]);
                int transposedNumber = noteNumber + numberOfHalfSteps;
                     if (transposedNumber >= 77){
                        transposedNumber -= 12;
                     }
                char transposedChar = (char) transposedNumber;
                String transposedNote = Character.toString(transposedChar);
                String [] transposedSong;
                transposedSong = new String [song.length()+1];
      if(transposedNote.equals("A")){
          String noteTransposed = "G#/Af";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
          answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("B")){
          String noteTransposed = "A";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
          answerField.setText(answerField.getText() + " " + transposedSong[i]);

      } 
      if(transposedNote.equals("C")){
          String noteTransposed = "A#/Bf";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("D")){
          String noteTransposed = "B/Cf";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("E")){
          String noteTransposed = "B#/C";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("F")){
          String noteTransposed = "C#/Df";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("G")){
          String noteTransposed = "D";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("H")){
          String noteTransposed = "D#/Ef";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("I")){
          String noteTransposed = "E/Ff";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("J")){
          String noteTransposed = "E#/F";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("K")){
          String noteTransposed = "F#/Gf";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("L")){
          String noteTransposed = "G";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      }
            } 
    }
        public void songTransposeDown(String song, int numberOfHalfSteps){
        char [] songChars = song.toCharArray();
             System.out.println(song.length());
            for(int i = 0; i<song.length(); i++){
                int noteNumber = (int)(songChars [i]);
                int transposedNumber = noteNumber + numberOfHalfSteps;
                     if (transposedNumber <= 64){
                         transposedNumber += 12;
                    }
                char transposedChar = (char) transposedNumber;
                String transposedNote = Character.toString(transposedChar);
                String [] transposedSong;
                transposedSong = new String [song.length()+1];
      if(transposedNote.equals("A")){
          String noteTransposed = "G#/Af";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
          answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("B")){
          String noteTransposed = "A";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
          answerField.setText(answerField.getText() + " " + transposedSong[i]);

      } 
      if(transposedNote.equals("C")){
          String noteTransposed = "A#/Bf";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("D")){
          String noteTransposed = "B/Cf";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("E")){
          String noteTransposed = "B#/C";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("F")){
          String noteTransposed = "C#/Df";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("G")){
          String noteTransposed = "D";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("H")){
          String noteTransposed = "D#/Ef";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("I")){
          String noteTransposed = "E/Ff";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("J")){
          String noteTransposed = "E#/F";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("K")){
          String noteTransposed = "F#/Gf";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      } 
      if(transposedNote.equals("L")){
          String noteTransposed = "G";
          System.out.println(noteTransposed);
          transposedSong [i] = noteTransposed;
           answerField.setText(answerField.getText() + " " + transposedSong[i]);
      }
            } 
    }

}

