/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class Aplicacion extends javax.swing.JFrame {

    
    
    public Aplicacion() throws Exception {
        initComponents();   
    
    }
    /*
    public void actualizarRegistros() throws Exception{
    
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel(); 
        
            for(int i = jTable2.getRowCount()-1; i>=0; i--)
            {
                model.removeRow(i); 
            }
            
            ArrayList<ArrayList<String>> registros = (ArrayList<ArrayList<String>>) Main.getRegistros();
            int filas = registros.size();
            
            DefaultTableModel modelo=(DefaultTableModel) jTable2.getModel(); 
            
            //Cuerpo de la tabla

                for (int j = 0; j<filas-1; j++){
                    Object [] fila=new Object[4]; 
                    fila[0] = registros.get(j+1).get(0);
                    fila[1] = registros.get(j+1).get(1);
                    modelo.addRow(fila); 
                }
            
    }    
      */  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JPanel();
        b2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblCambiosCoont1 = new javax.swing.JLabel();
        nombreUsuario4 = new javax.swing.JLabel();
        correoUsuario4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnIniciar1 = new javax.swing.JButton();
        comboAnip = new javax.swing.JComboBox<>();
        comboMes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboOrigen = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox<>();
        totalRetrasos = new javax.swing.JLabel();
        correoUsuario6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tipoRetraso = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        nombreUsuario8 = new javax.swing.JLabel();
        lblCambiosCoont2 = new javax.swing.JLabel();
        btnIniciar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setBackground(new java.awt.Color(102, 0, 0));

        org.jdesktop.layout.GroupLayout b1Layout = new org.jdesktop.layout.GroupLayout(b1);
        b1.setLayout(b1Layout);
        b1Layout.setHorizontalGroup(
            b1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 46, Short.MAX_VALUE)
        );
        b1Layout.setVerticalGroup(
            b1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 630, Short.MAX_VALUE)
        );

        b2.setBackground(new java.awt.Color(102, 0, 0));

        org.jdesktop.layout.GroupLayout b2Layout = new org.jdesktop.layout.GroupLayout(b2);
        b2.setLayout(b2Layout);
        b2Layout.setHorizontalGroup(
            b2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 46, Short.MAX_VALUE)
        );
        b2Layout.setVerticalGroup(
            b2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REPORTE AEROPORTUARIO");

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel7Layout.createSequentialGroup()
                .add(0, 38, Short.MAX_VALUE)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 576, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 556, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jLabel6.setText("AÑO");

        lblCambiosCoont1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lblCambiosCoont1.setForeground(new java.awt.Color(102, 0, 0));
        lblCambiosCoont1.setText("Numero total de retrasos de los vuelos realizados en esta ruta:");

        nombreUsuario4.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        nombreUsuario4.setText("Reporte de retrasos especifico");

        correoUsuario4.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        correoUsuario4.setText("Parametros de entrada");

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jLabel15.setText("MES");

        btnIniciar1.setBackground(new java.awt.Color(190, 65, 65));
        btnIniciar1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnIniciar1.setText("CONSULTAR");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        comboAnip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2005", "2006", "2007" }));

        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jLabel8.setText("AEROPUERTO ORIGEN");

        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O46", "O47", "O48", "O52", "O53", "O54", "O57", "O59", "O60", "O61", "O65", "O68", "O69", "O70", "O81", "O85", "O86", "O88", "O89", "OAJ", "OAK", "OAR", "OBE", "OBU", "OCF", "OCH", "OCQ", "OCW", "ODO", "ODX", "OEB", "OEL", "OEO", "OFK", "OFP", "OGA", "OGB", "OGD", "OGG", "OGM", "OGS", "OH17", "OH21", "OH30", "OIC", "OIN", "OJC", "OKB", "OKC", "OKK", "OKM", "OKS", "OKV", "OKZ", "OLD", "OLE", "OLF", "OLM", "OLS", "OLU", "OLV", "OLY", "OLZ", "OMA", "OME", "OMH", "OMK", "OMN", "ONA", "ONL", "ONM", "ONO", "ONP", "ONT", "ONY", "ONZ", "OOA", "OOH", "OOK", "OPF", "OPL", "OPN", "OQU", "OQW", "OR33", "ORB", "ORC", "ORD", "ORE", "ORF", "ORG", "ORH", "ORI", "ORL", "ORS", "ORT", "ORV", "OSC", "OSH", "OSU", "OSX", "OTG", "OTH", "OTM", "OTZ", "OUN", "OVE", "OVO", "OVS", "OWA", "OWB", "OWD", "OWI", "OWK", "OWX", "OXB", "OXC", "OXD", "OXI", "OXR", "OXV", "OYM", "OZA", "OZW", "P01", "P04", "P08", "P13", "P14", "P20", "P32", "P33", "P45", "P52", "P53", "PAE", "PAH", "PAK", "PAN", "PAO", "PAQ", "PBF", "PBH", "PBI", "PBV", "PCK", "PCM", "PCW", "PCZ", "PDC", "PDK", "PDT", "PDX", "PEA", "PEC", "PEO", "PEQ", "PEZ", "PFN", "PGA", "PGD", "PGM", "PGR", "PGV", "PHD", "PHF", "PHG", "PHH", "PHK", "PHL", "PHN", "PHO", "PHP", "PHT", "PHX", "PIA", "PIB", "PIE", "PIH", "PIL", "PIM", "PIR", "PIT", "PIZ", "PJY", "PKA", "PKB", "PKD", "PKF", "PLB", "PLD", "PLN", "PLR", "PMB", "PMD", "PMH", "PMP", "PMV", "PMX", "PMZ", "PNA", "PNC", "PNE", "PNM", "PNN", "PNP", "PNS", "POC", "POF", "POH", "POU", "POY", "PPA", "PPC", "PPF", "PPG", "PPO", "PPQ", "PQI", "PQL", "PQN", "PR03", "PRB", "PRC", "PRG", "PRN", "PRO", "PRX", "PSB", "PSC", "PSE", "PSF", "PSG", "PSK", "PSM", "PSN", "PSP", "PSX", "PTB", "PTD", "PTH", "PTK", "PTN", "PTS", "PTT", "PTU", "PTV", "PTW", "PUB", "PUC", "PUW", "PVB", "PVC", "PVD", "PVF", "PVG", "PVJ", "PVU", "PVW", "PWA", "PWC", "PWD", "PWG", "PWK", "PWM", "PWT", "PXE", "PYG", "PYM", "PYX", "PZQ", "Q00", "Q06", "Q14", "Q16", "Q17", "Q21", "Q24", "Q25", "Q26", "Q31", "Q34", "Q35", "Q37", "Q41", "Q42", "Q44", "Q49", "Q53", "Q55", "Q58", "Q61", "Q68", "Q72", "Q84", "Q88", "Q94", "Q95", "Q99", "RAC", "RAL", "RAP", "RBD", "RBE", "RBG", "RBL", "RBW", "RBY", "RCA", "RCR", "RCX", "RDD", "RDG", "RDK", "RDM", "RDR", "RDU", "RDV", "RED", "RFD", "RFG", "RGK", "RHI", "RHV", "RIC", "RID", "RIF", "RIL", "RIU", "RIV", "RIW", "RKD", "RKP", "RKR", "RKS", "RKW", "RLD", "RME", "RMG", "RMP", "RMY", "RNC", "RNH", "RNM", "RNO", "RNT", "RNV", "ROA", "ROC", "ROG", "ROP", "ROR", "ROS", "ROW", "ROX", "RPB", "RPD", "RPX", "RQB", "RQE", "RRL", "RRT", "RSH", "RSL", "RSN", "RST", "RSV", "RSW", "RTN", "RUE", "RUG", "RUQ", "RUT", "RVJ", "RVL", "RVN", "RVS", "RWF", "RWI", "RWL", "RWN", "RXE", "RYN", "RYV", "RYY", "RZL", "RZN", "RZT", "RZZ", "S01", "S03", "S05", "S07", "S10", "S12", "S18", "S21", "S23", "S24", "S25", "S27", "S28", "S30", "S31", "S32", "S33", "S34", "S39", "S40", "S43", "S45", "S47", "S50", "S52", "S59", "S60", "S64", "S66", "S67", "S68", "S69", "S70", "S71", "S72", "S73", "S80", "S83", "S85", "S87", "S89", "S93", "S94", "S97", "SAA", "SAC", "SAD", "SAF", "SAN", "SAR", "SAT", "SAV", "SAW", "SAZ", "SBA", "SBD", "SBM", "SBN", "SBO", "SBP", "SBS", "SBU", "SBX", "SBY", "SCB", "SCC", "SCD", "SCE", "SCH", "SCK", "SCM", "SCX", "SD07", "SD10", "SD12", "SD16", "SD18", "SD22", "SD28", "SD32", "SD33", "SD34", "SDA", "SDF", "SDL", "SDM", "SDP", "SDY", "SEA", "SEE", "SEF", "SEG", "SEM", "SEP", "SER", "SET", "SEZ", "SFB", "SFD", "SFF", "SFM", "SFO", "SFQ", "SFY", "SFZ", "SGF", "SGH", "SGJ", "SGR", "SGS", "SGT", "SGU", "SGY", "SHD", "SHG", "SHH", "SHL", "SHN", "SHR", "SHV", "SHX", "SIG", "SIK", "SIT", "SIV", "SIY", "SJC", "SJN", "SJT", "SJU", "SJX", "SKA", "SKI", "SKW", "SKX", "SLB", "SLC", "SLE", "SLG", "SLK", "SLN", "SLO", "SLQ", "SLR", "SMD", "SME", "SMF", "SMN", "SMO", "SMQ", "SMS", "SMX", "SNA", "SNH", "SNK", "SNL", "SNP", "SNS", "SNY", "SOP", "SOV", "SOW", "SPA", "SPB", "SPF", "SPG", "SPH", "SPI", "SPN", "SPS", "SPW", "SPX", "SQI", "SQL", "SRB", "SRC", "SRQ", "SRR", "SRV", "SSF", "SSI", "SSQ", "STC", "STE", "STF", "STJ", "STK", "STL", "STP", "STS", "STT", "STX", "SUA", "SUD", "SUE", "SUN", "SUS", "SUT", "SUW", "SUX", "SVA", "SVC", "SVE", "SVH", "SVS", "SWD", "SWF", "SWO", "SWT", "SWW", "SXL", "SXP", "SXQ", "SYF", "SYI", "SYR", "SYV", "SZP", "SZT", "SZY", "T00", "T03", "T08", "T18", "T28", "T35", "T36", "T41", "T44", "T47", "T49", "T53", "T56", "T57", "T60", "T65", "T69", "T71", "T72", "T74", "T78", "T80", "T82", "T89", "T90", "T97", "TAD", "TAL", "TAN", "TAZ", "TBN", "TBR", "TCC", "TCL", "TCS", "TCT", "TCY", "TDF", "TDO", "TDZ", "TEB", "TEL", "TEW", "TEX", "TGC", "TGI", "THA", "THM", "THP", "THV", "TIW", "TIX", "TKA", "TKE", "TKI", "TKX", "TLH", "TLR", "TLT", "TMA", "TMB", "TNI", "TNP", "TNT", "TNU", "TOA", "TOB", "TOC", "TOG", "TOI", "TOL", "TOP", "TOR", "TPA", "TPF", "TPH", "TPL", "TPO", "TQE", "TQH", "TQK", "TRI", "TRK", "TRL", "TRM", "TRX", "TSO", "TSP", "TT01", "TTA", "TTD", "TTF", "TTN", "TUL", "TUP", "TUS", "TVB", "TVC", "TVF", "TVI", "TVK", "TVL", "TVR", "TVY", "TWF", "TWM", "TXK", "TYL", "TYQ", "TYR", "TYS", "TZR", "TZT", "TZV", "U02", "U03", "U05", "U08", "U10", "U14", "U25", "U30", "U34", "U36", "U42", "U43", "U52", "U55", "U59", "U68", "U69", "U70", "U76", "U77", "U82", "U96", "UAO", "UBE", "UBS", "UBX", "UCA", "UCP", "UCY", "UDD", "UDG", "UES", "UGN", "UIL", "UIN", "UIZ", "UKF", "UKI", "UKL", "UKT", "ULM", "ULS", "UMP", "UNI", "UNK", "UNO", "UNU", "UNV", "UOS", "UOX", "UPP", "USE", "UTS", "UUO", "UUU", "UUV", "UVA", "UWL", "UYF", "UZA", "VAK", "VAY", "VBT", "VCB", "VCT", "VCV", "VDI", "VDZ", "VEE", "VEL", "VER", "VES", "VGT", "VHN", "VIH", "VIQ", "VIS", "VJI", "VLA", "VLD", "VMR", "VNC", "VNW", "VNY", "VPC", "VPS", "VPZ", "VQQ", "VQS", "VRB", "VSF", "VTA", "VTI", "VTN", "VUJ", "VUO", "VVV", "VYS", "W04", "W05", "W11", "W22", "W29", "W31", "W33", "W40", "W41", "W44", "W45", "W66", "W78", "W95", "W96", "W97", "W99", "WA10", "WA21", "WA31", "WA43", "WAY", "WBB", "WBQ", "WBW", "WCR", "WDG", "WDR", "WHP", "WJF", "WLD", "WLK", "WLW", "WMC", "WMO", "WNA", "WRG", "WRL", "WSM", "WSN", "WST", "WTK", "WVI", "WVL", "WWD", "WWR", "WYS", "X01", "X06", "X07", "X10", "X14", "X16", "X21", "X23", "X26", "X35", "X40", "X44", "X46", "X47", "X51", "X59", "X60", "X63", "X66", "X67", "X95", "X96", "XNA", "XVG", "Y03", "Y14", "Y15", "Y19", "Y27", "Y31", "Y37", "Y47", "Y50", "Y51", "Y55", "Y63", "Y66", "Y68", "Y70", "Y74", "Y83", "Y93", "YAK", "YAP", "YIP", "YKM", "YKN", "YNG", "YUM", "Z08", "Z09", "Z13", "Z17", "Z40", "Z55", "Z73", "Z84", "Z91", "Z95", "ZEF", "ZER", "ZPH", "ZUN", "ZZV" }));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jLabel9.setText("AEROPUERTO DESTINO");

        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O46", "O47", "O48", "O52", "O53", "O54", "O57", "O59", "O60", "O61", "O65", "O68", "O69", "O70", "O81", "O85", "O86", "O88", "O89", "OAJ", "OAK", "OAR", "OBE", "OBU", "OCF", "OCH", "OCQ", "OCW", "ODO", "ODX", "OEB", "OEL", "OEO", "OFK", "OFP", "OGA", "OGB", "OGD", "OGG", "OGM", "OGS", "OH17", "OH21", "OH30", "OIC", "OIN", "OJC", "OKB", "OKC", "OKK", "OKM", "OKS", "OKV", "OKZ", "OLD", "OLE", "OLF", "OLM", "OLS", "OLU", "OLV", "OLY", "OLZ", "OMA", "OME", "OMH", "OMK", "OMN", "ONA", "ONL", "ONM", "ONO", "ONP", "ONT", "ONY", "ONZ", "OOA", "OOH", "OOK", "OPF", "OPL", "OPN", "OQU", "OQW", "OR33", "ORB", "ORC", "ORD", "ORE", "ORF", "ORG", "ORH", "ORI", "ORL", "ORS", "ORT", "ORV", "OSC", "OSH", "OSU", "OSX", "OTG", "OTH", "OTM", "OTZ", "OUN", "OVE", "OVO", "OVS", "OWA", "OWB", "OWD", "OWI", "OWK", "OWX", "OXB", "OXC", "OXD", "OXI", "OXR", "OXV", "OYM", "OZA", "OZW", "P01", "P04", "P08", "P13", "P14", "P20", "P32", "P33", "P45", "P52", "P53", "PAE", "PAH", "PAK", "PAN", "PAO", "PAQ", "PBF", "PBH", "PBI", "PBV", "PCK", "PCM", "PCW", "PCZ", "PDC", "PDK", "PDT", "PDX", "PEA", "PEC", "PEO", "PEQ", "PEZ", "PFN", "PGA", "PGD", "PGM", "PGR", "PGV", "PHD", "PHF", "PHG", "PHH", "PHK", "PHL", "PHN", "PHO", "PHP", "PHT", "PHX", "PIA", "PIB", "PIE", "PIH", "PIL", "PIM", "PIR", "PIT", "PIZ", "PJY", "PKA", "PKB", "PKD", "PKF", "PLB", "PLD", "PLN", "PLR", "PMB", "PMD", "PMH", "PMP", "PMV", "PMX", "PMZ", "PNA", "PNC", "PNE", "PNM", "PNN", "PNP", "PNS", "POC", "POF", "POH", "POU", "POY", "PPA", "PPC", "PPF", "PPG", "PPO", "PPQ", "PQI", "PQL", "PQN", "PR03", "PRB", "PRC", "PRG", "PRN", "PRO", "PRX", "PSB", "PSC", "PSE", "PSF", "PSG", "PSK", "PSM", "PSN", "PSP", "PSX", "PTB", "PTD", "PTH", "PTK", "PTN", "PTS", "PTT", "PTU", "PTV", "PTW", "PUB", "PUC", "PUW", "PVB", "PVC", "PVD", "PVF", "PVG", "PVJ", "PVU", "PVW", "PWA", "PWC", "PWD", "PWG", "PWK", "PWM", "PWT", "PXE", "PYG", "PYM", "PYX", "PZQ", "Q00", "Q06", "Q14", "Q16", "Q17", "Q21", "Q24", "Q25", "Q26", "Q31", "Q34", "Q35", "Q37", "Q41", "Q42", "Q44", "Q49", "Q53", "Q55", "Q58", "Q61", "Q68", "Q72", "Q84", "Q88", "Q94", "Q95", "Q99", "RAC", "RAL", "RAP", "RBD", "RBE", "RBG", "RBL", "RBW", "RBY", "RCA", "RCR", "RCX", "RDD", "RDG", "RDK", "RDM", "RDR", "RDU", "RDV", "RED", "RFD", "RFG", "RGK", "RHI", "RHV", "RIC", "RID", "RIF", "RIL", "RIU", "RIV", "RIW", "RKD", "RKP", "RKR", "RKS", "RKW", "RLD", "RME", "RMG", "RMP", "RMY", "RNC", "RNH", "RNM", "RNO", "RNT", "RNV", "ROA", "ROC", "ROG", "ROP", "ROR", "ROS", "ROW", "ROX", "RPB", "RPD", "RPX", "RQB", "RQE", "RRL", "RRT", "RSH", "RSL", "RSN", "RST", "RSV", "RSW", "RTN", "RUE", "RUG", "RUQ", "RUT", "RVJ", "RVL", "RVN", "RVS", "RWF", "RWI", "RWL", "RWN", "RXE", "RYN", "RYV", "RYY", "RZL", "RZN", "RZT", "RZZ", "S01", "S03", "S05", "S07", "S10", "S12", "S18", "S21", "S23", "S24", "S25", "S27", "S28", "S30", "S31", "S32", "S33", "S34", "S39", "S40", "S43", "S45", "S47", "S50", "S52", "S59", "S60", "S64", "S66", "S67", "S68", "S69", "S70", "S71", "S72", "S73", "S80", "S83", "S85", "S87", "S89", "S93", "S94", "S97", "SAA", "SAC", "SAD", "SAF", "SAN", "SAR", "SAT", "SAV", "SAW", "SAZ", "SBA", "SBD", "SBM", "SBN", "SBO", "SBP", "SBS", "SBU", "SBX", "SBY", "SCB", "SCC", "SCD", "SCE", "SCH", "SCK", "SCM", "SCX", "SD07", "SD10", "SD12", "SD16", "SD18", "SD22", "SD28", "SD32", "SD33", "SD34", "SDA", "SDF", "SDL", "SDM", "SDP", "SDY", "SEA", "SEE", "SEF", "SEG", "SEM", "SEP", "SER", "SET", "SEZ", "SFB", "SFD", "SFF", "SFM", "SFO", "SFQ", "SFY", "SFZ", "SGF", "SGH", "SGJ", "SGR", "SGS", "SGT", "SGU", "SGY", "SHD", "SHG", "SHH", "SHL", "SHN", "SHR", "SHV", "SHX", "SIG", "SIK", "SIT", "SIV", "SIY", "SJC", "SJN", "SJT", "SJU", "SJX", "SKA", "SKI", "SKW", "SKX", "SLB", "SLC", "SLE", "SLG", "SLK", "SLN", "SLO", "SLQ", "SLR", "SMD", "SME", "SMF", "SMN", "SMO", "SMQ", "SMS", "SMX", "SNA", "SNH", "SNK", "SNL", "SNP", "SNS", "SNY", "SOP", "SOV", "SOW", "SPA", "SPB", "SPF", "SPG", "SPH", "SPI", "SPN", "SPS", "SPW", "SPX", "SQI", "SQL", "SRB", "SRC", "SRQ", "SRR", "SRV", "SSF", "SSI", "SSQ", "STC", "STE", "STF", "STJ", "STK", "STL", "STP", "STS", "STT", "STX", "SUA", "SUD", "SUE", "SUN", "SUS", "SUT", "SUW", "SUX", "SVA", "SVC", "SVE", "SVH", "SVS", "SWD", "SWF", "SWO", "SWT", "SWW", "SXL", "SXP", "SXQ", "SYF", "SYI", "SYR", "SYV", "SZP", "SZT", "SZY", "T00", "T03", "T08", "T18", "T28", "T35", "T36", "T41", "T44", "T47", "T49", "T53", "T56", "T57", "T60", "T65", "T69", "T71", "T72", "T74", "T78", "T80", "T82", "T89", "T90", "T97", "TAD", "TAL", "TAN", "TAZ", "TBN", "TBR", "TCC", "TCL", "TCS", "TCT", "TCY", "TDF", "TDO", "TDZ", "TEB", "TEL", "TEW", "TEX", "TGC", "TGI", "THA", "THM", "THP", "THV", "TIW", "TIX", "TKA", "TKE", "TKI", "TKX", "TLH", "TLR", "TLT", "TMA", "TMB", "TNI", "TNP", "TNT", "TNU", "TOA", "TOB", "TOC", "TOG", "TOI", "TOL", "TOP", "TOR", "TPA", "TPF", "TPH", "TPL", "TPO", "TQE", "TQH", "TQK", "TRI", "TRK", "TRL", "TRM", "TRX", "TSO", "TSP", "TT01", "TTA", "TTD", "TTF", "TTN", "TUL", "TUP", "TUS", "TVB", "TVC", "TVF", "TVI", "TVK", "TVL", "TVR", "TVY", "TWF", "TWM", "TXK", "TYL", "TYQ", "TYR", "TYS", "TZR", "TZT", "TZV", "U02", "U03", "U05", "U08", "U10", "U14", "U25", "U30", "U34", "U36", "U42", "U43", "U52", "U55", "U59", "U68", "U69", "U70", "U76", "U77", "U82", "U96", "UAO", "UBE", "UBS", "UBX", "UCA", "UCP", "UCY", "UDD", "UDG", "UES", "UGN", "UIL", "UIN", "UIZ", "UKF", "UKI", "UKL", "UKT", "ULM", "ULS", "UMP", "UNI", "UNK", "UNO", "UNU", "UNV", "UOS", "UOX", "UPP", "USE", "UTS", "UUO", "UUU", "UUV", "UVA", "UWL", "UYF", "UZA", "VAK", "VAY", "VBT", "VCB", "VCT", "VCV", "VDI", "VDZ", "VEE", "VEL", "VER", "VES", "VGT", "VHN", "VIH", "VIQ", "VIS", "VJI", "VLA", "VLD", "VMR", "VNC", "VNW", "VNY", "VPC", "VPS", "VPZ", "VQQ", "VQS", "VRB", "VSF", "VTA", "VTI", "VTN", "VUJ", "VUO", "VVV", "VYS", "W04", "W05", "W11", "W22", "W29", "W31", "W33", "W40", "W41", "W44", "W45", "W66", "W78", "W95", "W96", "W97", "W99", "WA10", "WA21", "WA31", "WA43", "WAY", "WBB", "WBQ", "WBW", "WCR", "WDG", "WDR", "WHP", "WJF", "WLD", "WLK", "WLW", "WMC", "WMO", "WNA", "WRG", "WRL", "WSM", "WSN", "WST", "WTK", "WVI", "WVL", "WWD", "WWR", "WYS", "X01", "X06", "X07", "X10", "X14", "X16", "X21", "X23", "X26", "X35", "X40", "X44", "X46", "X47", "X51", "X59", "X60", "X63", "X66", "X67", "X95", "X96", "XNA", "XVG", "Y03", "Y14", "Y15", "Y19", "Y27", "Y31", "Y37", "Y47", "Y50", "Y51", "Y55", "Y63", "Y66", "Y68", "Y70", "Y74", "Y83", "Y93", "YAK", "YAP", "YIP", "YKM", "YKN", "YNG", "YUM", "Z08", "Z09", "Z13", "Z17", "Z40", "Z55", "Z73", "Z84", "Z91", "Z95", "ZEF", "ZER", "ZPH", "ZUN", "ZZV" }));

        totalRetrasos.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        totalRetrasos.setText("0");

        correoUsuario6.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        correoUsuario6.setText("Parametros de salida");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jLabel10.setText("TIPO DE RETRASO");

        tipoRetraso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Despego", "Arribo" }));

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(correoUsuario4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(totalRetrasos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnIniciar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblCambiosCoont1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(comboOrigen, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(comboMes, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(nombreUsuario4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                            .add(comboAnip, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(comboDestino, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jPanel5Layout.createSequentialGroup()
                                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel6)
                                    .add(jLabel15)
                                    .add(jLabel8)
                                    .add(jLabel9))
                                .add(0, 0, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, correoUsuario6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(jLabel10)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(tipoRetraso, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(nombreUsuario4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(correoUsuario4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(comboAnip, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel15)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(comboMes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(comboOrigen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(comboDestino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(correoUsuario6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tipoRetraso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnIniciar1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblCambiosCoont1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(totalRetrasos)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nombreUsuario8.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        nombreUsuario8.setText("Reporte de retrasos general");

        lblCambiosCoont2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lblCambiosCoont2.setForeground(new java.awt.Color(102, 0, 0));
        lblCambiosCoont2.setText("Listado de retrasos por ruta de vuelos (Entre origen y destino)");

        btnIniciar3.setBackground(new java.awt.Color(190, 65, 65));
        btnIniciar3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnIniciar3.setText("CONSULTAR RUTAS");
        btnIniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nombreUsuario8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .add(btnIniciar3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblCambiosCoont2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(nombreUsuario8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnIniciar3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblCambiosCoont2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(0, 11, Short.MAX_VALUE)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 47, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(13, 13, 13)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(b1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(b2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(b1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(b2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
        
        String anio = (String) this.comboAnip.getSelectedItem();
        String mes = (String) this.comboMes.getSelectedItem();
        String origen = (String) this.comboOrigen.getSelectedItem();
        String destino = (String) this.comboDestino.getSelectedItem();
        
        if(origen.equals(destino)){
            JOptionPane.showMessageDialog(null, "Error, el destino es el mismo que el origen. ");
            return;
        }
        
        if(this.tipoRetraso.getSelectedItem().equals("Despego")){
            System.out.println("Consulta despego");
            Datos.Datos.consultarRetrasoSalida(anio, mes, origen, destino);
        }
        else{
            System.out.println("Consulta arribo");
            Datos.Datos.consultarRetrasoArribo(anio, mes, origen, destino);
        }
    }//GEN-LAST:event_btnIniciar1ActionPerformed

    private void btnIniciar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar3ActionPerformed
        try {
            new Reporte().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIniciar3ActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Aplicacion().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JButton btnIniciar3;
    private javax.swing.JComboBox<String> comboAnip;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox<String> comboOrigen;
    private javax.swing.JLabel correoUsuario4;
    private javax.swing.JLabel correoUsuario6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblCambiosCoont1;
    private javax.swing.JLabel lblCambiosCoont2;
    private javax.swing.JLabel nombreUsuario4;
    private javax.swing.JLabel nombreUsuario8;
    private javax.swing.JComboBox<String> tipoRetraso;
    private javax.swing.JLabel totalRetrasos;
    // End of variables declaration//GEN-END:variables
}
